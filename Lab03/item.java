package com.mycompany.practical_02;

public class Item {
    private int location;
    private String description;
    
    public Item(int location, String description){
        this.location = location;
        this.description = description;
    }
    
    //get location
    public int getlocation(){
        return location;
    }
    
    //set location
    public void setlocation(int location){
        this.location = location;
    }
    
    //get description
    public String getdescription(){
        return description;
    }
    
    //set description
    public void setdescription(String description){
        this.description = description;
    }
}