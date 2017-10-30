package com.example.peter.theolympics;

import org.junit.Before;
import org.junit.Test;

import static com.example.peter.theolympics.Medal.GOLD;
import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 30/10/2017.
 */

public class BoxerTest {

    Boxer boxer;

    @Before
    public void before(){
        boxer = new Boxer("AJ", 100, 20);
    }

    @Test
    public void canPrepare(){
        assertEquals("Training...", boxer.prepare());
    }

    @Test
    public void canCompete(){
        assertEquals("Swinging punches, ducking and diving, got him on the ropes", boxer.compete());
    }

    @Test
    public void canCalculatePoints(){
        assertEquals(80, boxer.calculatePoints());
    }

    @Test
    public void canAwardMedal(){
        boxer.calculatePoints();
        assertEquals(Medal.GOLD, boxer.awardMedal());
    }

    @Test
    public void canParticipate(){
        assertEquals("AJ won Gold", boxer.participate());
    }

    @Test
    public void canAddSession(){
        boxer.addSession(7);
        assertEquals(1, boxer.sessionCount());
    }

    @Test
    public void hasTotalDistance(){
        boxer.addSession(5);
        boxer.addSession(8);
        assertEquals(13, boxer.totalDistance());
    }

    @Test
    public void canGetSessionDistance(){
        boxer.addSession(5);
        boxer.addSession(8);
        assertEquals(5, boxer.getDistance(0));
        assertEquals(8, boxer.getDistance(1));
    }
}
// this