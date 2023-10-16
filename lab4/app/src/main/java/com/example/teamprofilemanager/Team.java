package com.example.teamprofilemanager;

import java.io.Serializable;

public class Team implements Serializable {

    private String name;

    private String postalCode;

    private String drawableName;



    public Team(String name, String postalCode, String drawableName) {
        this.name = name;
        this.postalCode = postalCode;
        this.drawableName = drawableName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setDrawableName(String drawableName) {
        this.drawableName = drawableName;
    }

    public String getName() {
        return name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getDrawableName() {
        return drawableName;
    }
}
