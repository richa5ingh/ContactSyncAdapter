package com.democontactsyncadapter;

/**
 * Created by richa on 3/7/18.
 */

public class MyContact {
    private String name;
    private String number;

    public String getNumber() {
        return number;
    }

    public MyContact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
}
