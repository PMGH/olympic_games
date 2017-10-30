package com.example.peter.theolympics;

/**
 * Created by Peter on 30/10/2017.
 */

public class Gymnast extends Athlete {

    private int difficultyPoints;
    private int executionPoints;

    public Gymnast(String name, int difficultyPoints, int executionPoints) {
        super(name, EventType.GYMNASTICS);
        this.difficultyPoints = difficultyPoints;
        this.executionPoints = executionPoints;
    }

    public int calculatePoints(){
        points = difficultyPoints + executionPoints;
        setPoints(points);
        return points;
    }

    public String compete(){
        return "A hop, skip and a jump....ooft magestic";
    }

}
// this