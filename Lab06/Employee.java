package com.mycompany.practical_4;

public class Employee {
    private int empID;
    private String empName, empDesignation;
    
    public int getempID(){
        return empID;
    }
    
    public void setempID(int empID){
        this.empID = empID;
    }
    
    public String getempName(){
        return empName;
    }
    
    public void setempName(String empName){
        this.empName = empName;
    }
    
    public String getempDesignation(){
        return empDesignation;
    }
    
    public void setempDesignation(String empDesignation){
        this.empDesignation = empDesignation;
    }
}
