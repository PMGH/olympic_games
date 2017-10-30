package com.example.peter.theolympics;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.R.attr.lines;
import static com.example.peter.theolympics.Medal.BRONZE;
import static com.example.peter.theolympics.Medal.GOLD;
import static com.example.peter.theolympics.Medal.SILVER;
import static java.nio.file.Paths.get;

/**
 * Created by Peter on 30/10/2017.
 */

public abstract class Athlete {

    protected String name;
    protected EventType event;
    protected Medal medal;
    protected int points;
    protected ArrayList<Integer> sessions;

    public Athlete(String name, EventType event) {
        this.medal = null;
        this.name = name;
        this.event = event;
        this.sessions = new ArrayList<>();
    }

    public String prepare(){
        return "Training...";
    }

    public String compete(){
        return "Competing...";
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int calculatePoints(){
        return points;
    }

    public Medal awardMedal(){
        if (this.points >= 5 && this.points < 10){
            this.medal = BRONZE;
            return BRONZE;
        }
        else if (this.points >= 10 && this.points < 15){
            this.medal = SILVER;
            return SILVER;
        }
        else if (this.points >= 15){
            this.medal = GOLD;
            return GOLD;
        }
        else {
            return null;
        }

    }

    //    allow enter an event
    public String participate(){
        prepare();
        compete();
        calculatePoints();
        awardMedal();
        if (this.medal != null){
            return this.name + " won " + medal.getMedalName();
        }
        else {
            return this.name + " failed to win a medal.";
        }
    }

    public void addSession(int session){
        this.sessions.add(session);
    }

    public int sessionCount(){
        return this.sessions.size();
    }

    public int totalDistance(){
        int total = 0;
        for (int session : sessions){
            total += session;
        }
        return total;
    }

    public int getDistance(int index){
        return this.sessions.get(index);
    }

    public void writeToLog() throws IOException {
//        PrintWriter writer = new PrintWriter(new FileWriter("/Users/Peter/codeclan_work/week_07/day_1/TheOlympics/app/src/main/java/com/example/peter/theolympics/AthleteLog.txt", true));
//        for (int session : this.sessions) {
//            String sessionStr = Integer.toString(session);
//            writer.println(sessionStr);
//        }
//
//        int session = sessions.get(0);
//        String sessionStr = "7";
//        writer.write(sessionStr);
//        writer.close();
//    }

        PrintWriter pW = null;

        try {
            pW = new PrintWriter(new File("/Users/Peter/codeclan_work/week_07/day_1/TheOlympics/app/src/main/java/com/example/peter/theolympics/AthleteLog.txt"));
            pW.write("Hello");
            pW.println();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pW != null) {
                pW.close();
            }
        }
    }


    public ArrayList<Integer> getSessions() {
        return sessions;
    }
}
// this