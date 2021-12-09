package com.mycompany.hwtwo;

/*
   Author: Luis Reynoso Perez
 
   Date: 03/03/21
 */

public class Student {
    
    private String firstName;
    private String lastName;
    private int[] grades;
    
    /*
        Purpose: To pass the inputs from main method.
        Parameters: Their purpose is to pass especific data to this method.
        Return: Nothing is returned.
    */
    
    public Student(String firstName, String lastName, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new int[grades.length];
        
        System.arraycopy(grades, 0, this.grades, 0, grades.length);
    }
    
    /*
        Purpose: To generate a copy of the input parameter
        Parameter: Its purpose is to pass especific data to this method from creation of an object from main method.
        Return: Nothing is returned.
    */
    
    public Student(Student student) {
        this.firstName = student.firstName;
        this.lastName = student.lastName;
        this.grades = new int[student.grades.length];
       
        System.arraycopy(student.grades, 0, this.grades, 0, grades.length);
       //this(firstName, lastName, grades); ???
    }
    
    /*
        Purpose: To access the specific input parameter from constructor.
        Parameter: No parameter used.
        Return: Helps to pass the input parameter from constructor into main method.
    */
    
    public String getFirstName() {
        return firstName;
    }
    
    /*
        Purpose: To set input parameter equal to instance variable to pass data to main method.
        Parameter: Its purpose is to pass specific data to this method.
        Return: Nothing is returned.
    */
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /*
        Purpose: To access the specific input parameter from constructor.
        Parameter: No parameter used.
        Return: Helps to pass the input parameter from constructor into main method.
    */
    
    public String getLastName() {
        return lastName;
    }
    
    /*
        Purpose: To set the input parameter equal to the instance variable to pass data to main method.
        Parameter: Its purpose is to pass specific data to this method.
        Return: Nothing is returned.
    */
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /*
        Purpose: To access the specific input parameter from constructor.
        Parameter: No parameter used.
        Return: Helps to pass the input parameter from constructor into main method.
    */
    
    public int[] getGrades() {
        int[] temp = new int[grades.length];
        System.arraycopy(grades, 0, temp, 0, grades.length);
        return temp;
    }
    
    /*
        Purpose: To set the input parameter equal to the instance variable to pass data to main method.
        Parameter: Its purpose is to pass specific data to this method.
        Return: Nothing is returned.
    */
    
    public void setGrades(int[] grades) {
        this.grades = new int[grades.length];
        
        System.arraycopy(grades, 0, this.grades, 0, grades.length);

        
        
    }
    
    /*
        Purpose: To return a String that contains the firstName, lastName, and average grade.
        Parameter: No parameter used.
        Return: Helps to pass the String into main method.
    */
    
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "  " + "Average Grade: " + String.format("%1.2f", getAverageGrade());
    }
    
    /*
        Purpose: Decides whether the parameter o is a Student object with the same name and highest grade as the current object.
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
                Student s = (Student) o;
                flag = getHighestGrade() == s.getHighestGrade() && firstName.equals(s.firstName) &&
                        lastName.equals(s.lastName);
            }
        }
        return flag;
    }
    
    /*
        Purpose: To iterate through the arrays passed from main method into this method and return the highest grade.
        Parameter: No parameter used.
        Return: Helps to pass the highest value into main method.
    */
    
    public int getHighestGrade() {
        int greatest = 0;
        for (int x: grades) {
            if (x > greatest) {
                greatest = x;
            }
        }
        return greatest;
    }
    
    /*
        Purpose: To iterate through the arrays passed from the main method into this method and return the average of the grades.
        Parameter: No parameter used.
        Return: Helps to pass the average value into main method.
    */
    
    public double getAverageGrade() {
        double sum = 0;
        double average = 0;
        for (int x: grades) {
             sum += x;
             
        }
        average = (sum / grades.length);
        return average;
    }
    
    /*
        Purpose: To increment the grades of the arrays passed from main method by 1.
        Parameter: No parameter used.
        Return: Nothing is returned.
    */
    
    public void incrementAllGradesByOne() {
        for (int i = 0; i < grades.length; i++) {
            grades[i] += 1;
        }
    }
}
