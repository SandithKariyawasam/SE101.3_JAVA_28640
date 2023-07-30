package com.mycompany.practical3_exercise3_1;
public class Employee {
    
    //decalring variables
    private int age;    //private variables cannot access from other classes
    private String name;
    private float salary;
    
    //this is parameterized constructor
    public Employee(String name, int age, float salary){
        this.age = age; 
        this.name = name;   //this keyword is used to replace variable value
        this.salary = salary;
    }   
    
    public int getage(){
        return age;
    }   
    public void setage(int a){
        age = a;
    }
    
    //this is getter method for name varible
    public String getname(){
        return name;//this will return Name variable value
    }
    
    //this is setter method for name variable
    public void setname(String n){
        name = n;
    }
    
    public float getsalary(){
        return salary;
    }
    public void setsalary(float s){
        salary = s;
    }
    
    public void test(){
        System.out.println("Emplyee name: "+ name);
        System.out.println("Employee age: "+ age);
        System.out.println("Employee salary: "+salary);
    }
    
