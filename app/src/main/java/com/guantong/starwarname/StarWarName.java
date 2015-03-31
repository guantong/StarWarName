package com.guantong.starwarname;

/**
 * Created by Alien on 3/23/2015.
 */
import java.io.Serializable;

public class StarWarName implements Serializable {
    private String fName;
    private String lName;
    private String pName;

    public StarWarName(){
        this.fName = "Unknown";
        this.lName = "Unknown";
        this.pName = "Unknown";
    }

    public StarWarName(String fName, String lName, String pName){
        this.fName = fName;
        this.lName = lName;
        this.pName = pName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getpName() {
        return pName;
    }
}
