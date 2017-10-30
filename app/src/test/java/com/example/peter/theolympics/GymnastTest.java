package com.example.peter.theolympics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 30/10/2017.
 */

public class GymnastTest {

    Gymnast gymnast;

    @Before
    public void before(){
        gymnast = new Gymnast("Louis Smith", 5, 8);
    }

    @Test
    public void canCompete(){
        assertEquals("A hop, skip and a jump....ooft magestic", gymnast.compete());
    }

    @Test
    public void canCalculatePoints(){
        assertEquals(13, gymnast.calculatePoints());
    }

    @Test
    public void canAwardMedal(){
        gymnast.calculatePoints();
        assertEquals(Medal.SILVER, gymnast.awardMedal());
    }

    @Test
    public void canParticipate(){
        assertEquals("Louis Smith won Silver", gymnast.participate());
    }

    @Test
    public void canAddSession(){
        gymnast.addSession(10);
        assertEquals(1, gymnast.sessionCount());
    }

    @Test
    public void hasTotalDistance(){
        gymnast.addSession(10);
        gymnast.addSession(17);
        assertEquals(27, gymnast.totalDistance());
    }

    @Test
    public void canGetSessionDistance(){
        gymnast.addSession(9);
        gymnast.addSession(24);
        assertEquals(9, gymnast.getDistance(0));
        assertEquals(24, gymnast.getDistance(1));
    }

}
// this