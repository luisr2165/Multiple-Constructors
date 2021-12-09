package com.mycompany.hwtwo;

/**
 * Use this file to test your code for Assignment 2.
 * 
 */

public class HWTwo {
    
    public static MyStudent createMyStudent(String firstName, String lastName, int[] grades, String major) {
        return new MyStudent(new String(firstName), new String(lastName), grades, new String(major));
    }
    
    public static Student createStudent(String firstName, String lastName, int[] grades) {
        return new Student(new String(firstName), new String(lastName), grades);
    }
    
    public static void main(String[] args) {
        System.out.println("Testing the toString method: ");
        Student[] students = {createMyStudent("Raul", "Zee",
                new int[]{77, 80, 99}, "Engineering"),
                createMyStudent("Gita", "Elle",
                new int[] {15, 82, 77, 16, 100}, "Biology"),
                createMyStudent("Pilar", "Zee",
                new int[]{86, 82, 99, 76}, "Computer Science"),
                new Student("Gillian", "H", new int[]{45, 100, 100})
                };
        
        for (Student s: students) {
            System.out.println(s);     //println(s.toString())
        }
        
        System.out.println("\nTesting the equals method: ");
        Student myStudentOne = createMyStudent("Emma", "Enn",
                new int[]{100, 80, 99}, "Japanese");
        Student myStudentTwo = createMyStudent("Emma", "Enn",
                new int[]{50, 100}, "Japanese");
        Student myStudentThree = createMyStudent("Emma", "Enn",
                new int[]{90, 80, 99}, "Japanese");
        
        Student studentOne = createStudent("Emma", "Enn",
                new int[]{43, 80, 99, 100});
        Student studentTwo = createStudent("Emma", "Enn",
                new int[]{62, 79, 50, 100});
        Student studentThree = createStudent("Emma", "RR",
                new int[]{62, 79, 50, 100});
        Student studentFour = createStudent("Emma", "RR",
                new int[]{92, 99, 99});
        
        System.out.println(myStudentOne.equals(myStudentTwo));  // true
        System.out.println(myStudentOne.equals(myStudentThree));  // false
        System.out.println(myStudentOne.equals(studentOne));  // false
        System.out.println(studentOne.equals(myStudentOne)); // false
        System.out.println(myStudentOne.equals(null));  // false
        System.out.println(studentOne.equals(studentTwo)); // true
        System.out.println(studentOne.equals(studentThree)); // false
        System.out.println(studentThree.equals(studentFour)); // false
        System.out.println(studentOne.equals(null)); // false
        
        System.out.println("\nTesting multiple constructors: ");
        myStudentOne = new MyStudent("Timur", "Why", new int[]{88, 77}, "Education");
        System.out.println(myStudentOne); // major = Mathematics
        studentOne = new Student(myStudentOne);
        System.out.println(studentOne);
        
        System.out.println("\nVerify 2nd Student constructor doesn't "
                + "change grades ");
        // Change grades for studentOne
        studentOne.incrementAllGradesByOne();
        /* The grades of studentOne should change but myStudentOne grades remain
      unchanged. */
        System.out.println("\nDisplay grades for studentOne:");   // display 89 78
        for (int x : studentOne.getGrades()) {
            System.out.print(x + " ");
        }
        System.out.println("\nDisplay grades for myStudentOne:");  // display 88 77
        for (int x : myStudentOne.getGrades()) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println("\nVerify changing data in main method doesn't change the instance variable");
        int[] data = {44, 55, 90};
        studentOne = new Student("James", "Jay", data);
        
        data[0] = 11;  
        System.out.println("\nDisplay grades for studentOne:"); // display 44 55 90
        for (int x : studentOne.getGrades()) {
            System.out.print(x + " ");
        }
        System.out.println("\nDisplay data:");   // display  11 55 90
        for (int x : data) {
            System.out.print(x + " ");
        }
        
        System.out.println("\nVerify changing data in main method doesn't change the instance variable, 2nd test");
        data = studentOne.getGrades();
        data[0] = 30;
        System.out.println("\nDisplay grades for studentOne:"); // display 44 55 90
        for (int x : studentOne.getGrades()) {
            System.out.print(x + " ");
        }
        System.out.println("\nDisplay data:");   // display 30 55 90
        for (int x : data) {
            System.out.print(x + " ");
        }
        
        System.out.println("\nVerify that changing instance variable doesn't change data in main method");
        data = new int[] {85, 87};
        studentOne = new Student("Ava", "Tuesday", data);
        studentOne.incrementAllGradesByOne();
        System.out.println("\nDisplay grades for studentOne:");  // display 86 88
        for (int x : studentOne.getGrades()) {
            System.out.print(x + " ");
        }
        System.out.println("\nDisplay data:");  // display 85 87
        for (int x : data) {
            System.out.print(x + " ");
        }
        
    }
}
