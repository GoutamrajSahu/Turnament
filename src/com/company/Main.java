package com.company;
import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input Number of total persons: ");
        int numberOfPersons = Sc.nextInt();
        System.out.println("Input time in hr: ");
        float givenHrs = Sc.nextFloat();
        float minutes = givenHrs*60;
        int count = 0;
        int minPossibleMatches = 0;
        int temp = 1;
        for(int i = 1; i<=numberOfPersons; i=temp){
            count++;
            temp = temp*2;
            if(numberOfPersons<=temp){
                minPossibleMatches = count;
                break;
            }
        }
//      System.out.println(minPossibleMatches);
        float timeRequired = minPossibleMatches*30;
//      System.out.println("Time required in min: "+ timeRequired);
//      System.out.println("Time Given in min: "+ minutes);
        if(timeRequired <= minutes){
            System.out.println("Possible.");
        }else{
            System.out.println("Not Possible.");
        }
    }
}
