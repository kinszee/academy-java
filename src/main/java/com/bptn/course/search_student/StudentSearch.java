package com.bptn.course.search_student;

//Define StudentSearch class
public class StudentSearch {
 //Define the searchStudent method that takes an array of Student objects (students) and an integer rollNumber as parameters
 public static Student searchStudent(Student[] students, int rollNumber) {
     //Iterate through each Student object
     for(Student student : students) {
         // If the roll number of the current student matches the rollNumber parameter, 
         // then return the current student object
         if (student.getRollNumber() == rollNumber) {
             return student;
         }            
     }
     // If no student is found with the target roll number then return null
     return null;
 }

 
 public static void main(String[] args) {
     //Create an array of five students
     Student[] students = new Student[5];
     students[0] = new Student("John", 101);
     students[1] = new Student("Alice", 102);
     students[2] = new Student("Bob", 103);
     students[3] = new Student("Emily", 104);
     students[4] = new Student("Mike", 105);         

     // Declares an integer variable targetRollNumber and assigns it a value
     int targetRollNumber = 103;

     //Call the searchStudent method, passing the students array and targetRollNumber as arguments
     // and save the return value to the targetStudent variable
     Student targetStudent = searchStudent(students, targetRollNumber);

     // Check if student is found or not. If found print name and roll number and if not then print a message which says student not found
     if (targetStudent != null) {
         System.out.println("Student found:");
         System.out.println("Roll Number: " + targetStudent.getRollNumber());
         System.out.println("Name: " + targetStudent.getName());
     } else {
         System.out.println("Student not found!");
     }
 }
}

