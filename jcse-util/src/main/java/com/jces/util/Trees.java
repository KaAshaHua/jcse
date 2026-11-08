package com.jces.util;

public class Trees {
    private static int counter = 1;
    
    private Trees() {}

    public static int generateNodeID() { return counter++; }
}
