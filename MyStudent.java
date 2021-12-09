package com.mycompany.hwtwo;

/*
   Author: Luis Reynoso Perez
 
   Date: 03/03/21
 */

public class MyStudent extends Student{
    
    private String major;
    
    /*
        Purpose: To pass the inputs from main method.
        Parameters: Their purpose is to pass especific data to this method.
        Return: Nothing is returned.
    */
    
    public MyStudent(String firstName, String lastName, int[] grades, String major) {
        super(firstName, lastName, grades);
        this.major = major;
    }
    
    /*
        Purpose: To generate a copy of the input parameter and add an additional parameter.
        Parameter: c
        Return: Nothing is returned.
    */
    
    public MyStudent(String firstName, String lastName, int[] grades) {
        this(firstName, lastName, grades, "Economics");
    }
    
    /*
        Purpose: To access the specific input parameter from constructor.
        Parameter: No parameter used.
        Return: Helps to pass the input parameter from constructor into main method.
    */
    
    public String getMajor() {
        return major;
    }
    
    /*
        Purpose: To set the input parameter equal to the instance variable to pass data to main method.
        Parameter: Its purpose is to pass specific data to this method.
        Return: Nothing is returned.
    */
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    /*
        Purpose: Decides whether the parameter o is a MyStudent object with the same name, highest grade, and major as the current object.
        Parameter: Its purpose is to pass data of object created into method.
        Return: It helps to pass the true or false data output into main method.
    */
    
    @Override
    public boolean equals(Object o) {
        boolean flag = false;
        
        if (o != null && getClass() == o.getClass()) {
            if (this == o) {
                flag = true;
            }
            else{
                MyStudent s = (MyStudent) o;
                flag = super.equals(o) && major.equals(s.major);
            }
        }
        return flag;
    }
    
    /*
        Purpose: To return a String that constains the firstName, lastName, average grade, and major.
        Parameter: No parameter used.
        Return: Helps to pass the String into main method.
    */
    
    @Override
    public String toString() {
        String s = super.toString();
        return s + " Major: " + major;
    }
     
    
}

            
    

