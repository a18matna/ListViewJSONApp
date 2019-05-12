package com.example.brom.listviewjsonapp;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(String mName, String mLocation, int mHeight ){
        name=mName;
        location=mLocation;
        height=mHeight;
    }

    public Mountain(String mName){
        name=mName;
        location="";
        height=-1;
    }

    public void setLocation(String l) {
        this.location = l;
    }

    public String getLocation() {
        String l = "Position: "+location;
        return l;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public String getHeight() {
        String hojd = "Höjd: "+String.valueOf(height)+" meter över havet";
        return hojd;
    }

    public String info(){
        String info = new String();
        info+= ""+name+" is part of the "+location+" mountain range and is "+height+"m high";
        return info;
    }

    @Override
    public String toString() {
        return name;
    }

}