package software2;

import java.util.Scanner;

public class homework10heartrate {
    public static void main(String[] args){
        double Intensity=55,TargetHeartRate;
        int Age,RestingHR;
        System.out.println("RestingHR:");
        Scanner R = new Scanner(System.in);
        RestingHR = R.nextInt();
        System.out.println("Age:");
        Scanner A = new Scanner(System.in);
        Age = A.nextInt();
        System.out.println("Intensity|TargetHeartRate");
        System.out.println("---------|---------------");
        for(Intensity=55;Intensity<=95;Intensity+=5){
            TargetHeartRate = Math.round((((220 - Age) - RestingHR) * Intensity/100) + RestingHR);
            System.out.printf("%d%%      |%dbpm         \n",(int)Intensity,(int)TargetHeartRate);
        }
    }
}
