package com.example.eniola.hackhealth;
import java.util.ArrayList;

/**
 * Created by Eniola on 9/10/2016.
 */
public class EventManager {
    public static ArrayList<Event> Events = new ArrayList<>();
    public static String lastDate = "";

    public static ArrayList<Event> getEvents()
    {
        return Events;
    }

    public static String getLastDate() {
        return lastDate;
    }
}
