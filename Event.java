package com.example.likev.sbu;

/**
 * Created by likev on 9/10/2016.
 */
import java.util.*;
public class Event {
    private String name, description, host;
    private int start, end;
    private Date date;

    public Event(){
        name = null;
        description = null;
        host = null;
        start = 0;
        end = 0;
        date = null;
    }

    public Event(String name,String host,String description,
                 Date date,int start, int end){
        this.name = name;
        this.host = host;
        this.description = description;
        this.date = date;
        this.start = start;
        this.end = end;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getHost(){
        return host;
    }

    public void setHost(String host){
        this.host = host;
    }

    public Date getDate(){
        return date;
    }

    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }
}
