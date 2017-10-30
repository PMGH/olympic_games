package com.example.peter.theolympics;

/**
 * Created by Peter on 30/10/2017.
 */

public class Boxer extends Athlete{

        private int hitsGiven;
        private int hitsTaken;

        public Boxer(String name, int hitsGiven, int hitsTaken) {
            super(name, EventType.BOXING);
            this.hitsGiven = hitsGiven;
            this.hitsTaken = hitsTaken;
        }

        public int calculatePoints(){
            points = hitsGiven - hitsTaken;
            setPoints(points);
            return points;
        }

        public String compete(){
            return "Swinging punches, ducking and diving, got him on the ropes";
        }

}
// this