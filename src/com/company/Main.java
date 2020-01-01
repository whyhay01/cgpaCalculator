package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of courses offering:");
        int numOfCourses = input.nextInt();
        String[] namesOfCourses = new String[numOfCourses];
        double [] scores = new double[numOfCourses];
        int [] units = new int[numOfCourses];
        int point;
        int gp = 0;
        int totalUnit = 0;
        double cgpa;

        System.out.println("Enter the courses:");
        for (int i =0 ; i < namesOfCourses.length; i++ ){
            namesOfCourses[i]= input.nextLine();
        }
        System.out.println("Enter your Score in the same order:");
        for (int i =0 ; i < numOfCourses; i++ ){
            scores[i] = input.nextDouble();
        }
        System.out.println("Enter your unit in the same order:");
        for (int i =0 ; i < numOfCourses; i++ ) {
            units[i] = input.nextInt();
            totalUnit += units[i];
        }
        for (int i =0; i < numOfCourses; i++){
            if (scores[i] > 69){
                point = 7;
                gp += point *units[i];
            } else if (scores[i]> 64 & scores[i]<70){
                point = 6;
                gp += point *units[i];
            }else if (scores[i]> 59 & scores[i]<65){
                point = 5;
                gp += point *units[i];
            }else if (scores[i]> 54 & scores[i]<60) {
                point = 4;
                gp += point * units[i];
            }else if (scores[i]> 49 & scores[i]<55) {
                point = 3;
                gp += point * units[i];
            }else if (scores[i]> 44 & scores[i]<50) {
                point = 2;
                gp += point * units[i];
            }else if (scores[i]> 39 & scores[i]<45) {
                point = 1;
                gp += point * units[i];
            }else if (scores[i]< 40){
                point = 0;
                gp += point * units[i];
            }

        }
        cgpa = (double) gp/totalUnit;

        for (int i = 0; i < numOfCourses; i++){
            System.out.println( "Course: "+namesOfCourses[i] +" Score:  " +scores[i]+" Unit "+units[i]);
        }
        System.out.println("Your CGPA is: " + cgpa );
    }
}