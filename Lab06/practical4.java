package com.mycompany.practical_4;
public class Practical_4 {

    public static void main(String[] args) {
        Employee e1 = new Employee();   // this object created for Mr.Bogdan 
        Employee e2 = new Employee();   // this object created for Ms.Bird
        
        e1.setempName("Bogdan");    //setname for Ms.Bogdan
        System.out.println("Employee name: "+ e1.getempName());  //setname for Ms.Bogdan
        
        e1.setempID(232324);    //set id for Ms.Bogdan
        System.out.println("Employee ID: "+ e1.getempID());   //get id for Ms.Bodgan
        
        e1.setempDesignation("null");   // set employee designation for Ms.Bodgan
        System.out.println("Employee Designation: "+ e1.getempDesignation());   // get employee designation for Ms.Bodgan
        
        e2.setempName("Bird");    //setname for Ms.Bird
        System.out.println("Employee name: "+ e1.getempName());  //setname for Ms.Bird
        
        e2.setempID(232325);    //set id for Ms.Bird
        System.out.println("Employee ID: "+ e1.getempID());   //get id for Ms.Bird
        
        e2.setempDesignation("null");   // set employee designation for Ms.Bird
        System.out.println("Employee Designation: "+ e1.getempDesignation());   // get employee designation for Ms.Bird
    }
}
