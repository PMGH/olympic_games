package com.example.peter.theolympics;

import java.io.IOException;

/**
 * Created by Peter on 30/10/2017.
 */

public class Runner {

    public static void main(String[] args) throws IOException {
        Boxer boxer;

        boxer = new Boxer("AJ", 100, 20);

        boxer.addSession(12);
        boxer.addSession(17);
        boxer.addSession(5);

        boxer.writeToLog();
    }
}
// this