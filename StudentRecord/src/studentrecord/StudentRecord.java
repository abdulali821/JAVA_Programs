/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrecord;
import java.util.Scanner;
import static java.lang.System.exit;
/**
 *
 * @author HP 84 G4
 */
public class StudentRecord {

    /**
     * @param args the command line arguments
     */
    Scanner Sc = new Scanner(System.in);
    String studentName;
    String studentFatherName;
    String studentProgram;
    int studentRollNo;
    int studentSemester;
    void score(){
        int numberOfSubjects;
        int sumOfSubjects = 0;
        char grade=' ';
        float percentage;
        System.out.println("          SCORE CARD           ");
        System.out.print("How Many Subjects do you have :");
        numberOfSubjects = Sc.nextInt();
        numberOfSubjects++;
        int[] subjectMarks = new int[numberOfSubjects];
        String[] subjects = new String[numberOfSubjects];
        System.out.println("Enter your Subject Names");
        for (int i=0;i<numberOfSubjects;i++){
            subjects[i] = Sc.nextLine();
        }
        System.out.println("Enter your Marks");
        for (int i=1;i<numberOfSubjects;i++){
            System.out.print(subjects[i]+" Marks :");
            subjectMarks[i] = Sc.nextInt();
        }
        for (int i = 0;i<numberOfSubjects;i++){
            sumOfSubjects =sumOfSubjects+subjectMarks[i];
        }
        numberOfSubjects--;
        System.out.println("Total Marks :"+sumOfSubjects);
        numberOfSubjects= numberOfSubjects*100;
        percentage = (float)(sumOfSubjects*100)/numberOfSubjects;
        System.out.println("Percentage :"+percentage+"%");
        if(percentage>=90 && percentage<=100){
            grade = 'A';
            System.out.println("Grade :"+grade);
        }
        else if(percentage>=80 && percentage<90){
            grade = 'B';
            System.out.println("Grade :"+grade);
        }
        else if(percentage>=70 && percentage<80){
            grade = 'C';
            System.out.println("Grade :"+grade);
        }
        else if(percentage>=60 && percentage<70){
            grade = 'D';
            System.out.println("Grade :"+grade);
        }
        else if(percentage>=50 && percentage<60){
            grade = 'E';
            System.out.println("Grade :"+grade);
        }
        else if(percentage<50){
            grade = 'F';
            System.out.println("Grade :"+grade);
        }
        System.out.println("----------------------------------------");
        System.out.println(" Name :"+studentName);
        System.out.println(" Roll No :"+studentRollNo);
        System.out.println(" Marks: "+sumOfSubjects+"/"+numberOfSubjects);
        System.out.println(" Percentage: "+percentage);
        System.out.println(" Grade :"+grade);
        System.out.println("----------------------------------------");
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("Press any Key to exit or Press 1 to Continue");
        char c = Sc.next().charAt(0);
        if(c=='1'){
            main(null);
        }
        else{
            exit(0);
        }
    }
    void general(){
        float weight,height;
        int age;
        float bmi;
        String bmiRecord="";
        System.out.println("          GENERAL CARD           ");
        System.out.print("Enter your Age :");
        age = Sc.nextInt();
        System.out.print("Enter your Weight in Pounds:");
        weight = Sc.nextInt();
        System.out.print("Enter your Height in Inches: ");
        height = Sc.nextFloat();
        bmi = (weight*703)/(height*height);
        if(bmi<18.5){
            bmiRecord="The Person is Under-Weighted";
        }
        else if(bmi>25){
            bmiRecord="The Person is Over-Weighted";
        }
        else if(bmi>=18.5 && bmi<25){
            bmiRecord="The Person is Optimal";
        }
        System.out.println("----------------------------------------");
        System.out.println("Name :"+studentName);
        System.out.println("Roll No:"+studentRollNo);
        System.out.println("Age :"+age);
        System.out.println("BMI :"+bmiRecord+"("+bmi+")");
        System.out.println("----------------------------------------");
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("Press any Key to exit or Press 1 to Continue");
        char c = Sc.next().charAt(0);
        if(c=='1'){
            main(null);
        }
        else{
            exit(0);
        }
    }
    void about(){
        int houseNo;
        int streetNo;
        String areaName;
        String cityName;
        System.out.println("          ABOUT CARD           ");
        System.out.print("Enter your House No: ");
        houseNo = Sc.nextInt();
        System.out.print("Enter your Street No: ");
        streetNo = Sc.nextInt();
        System.out.print("Enter your Area: ");
        areaName = Sc.next();
        System.out.print("Enter your City: ");
        cityName = Sc.next();
        System.out.println("----------------------------------------");
        System.out.println("Name :"+studentName);
        System.out.println("Roll No:"+studentRollNo);
        System.out.println("Address : House No #"+houseNo+" Street-"+streetNo+" "+areaName+" "+cityName);
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("Press any Key to exit or Press 1 to Continue");
        char c = Sc.next().charAt(0);
        if(c=='1'){
            main(null);
        }
        else{
            exit(0);
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        StudentRecord std = new StudentRecord();
        System.out.print("Enter your Name: ");
        std.studentName = Sc.nextLine();
        System.out.print("Enter your Father Name: ");
        std.studentFatherName = Sc.nextLine();
        System.out.print("Enter your program: ");
        std.studentProgram = Sc.nextLine();
        System.out.print("Enter your Semester No: ");
        std.studentSemester = Sc.nextInt();
        System.out.print("Enter your Roll No: ");
        std.studentRollNo = Sc.nextInt();
        System.out.println("Enter S for Score Card: ");
        System.out.println("Enter G for General Card: ");
        System.out.println("Enter A for About Card: ");
        char a = Sc.next().charAt(0);
        switch (a) {
            case 'S':
            case 's':
                std.score();
                break;
            case 'G':
            case 'g':
                std.general();
                break;
            case 'A':
            case 'a':
                std.about();
                break;
            default:
                main(null);
                break;
        }
    }
 }
    

