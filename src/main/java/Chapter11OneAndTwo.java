
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */


// Was not able to figure this one out 
public class Chapter11OneAndTwo {
    
    
    
    private double[] scoresArray;
    
    public Chapter11OneAndTwo(double[] test){
        
        scoresArray = new double [test.length];
        
        for (int i=0; i < test.length; i++) {
            if (test[i] < 0 || test [i] > 100)
                
               System.out.println("Test scores must be greater than 0 and less than 100,");
            
            else 
                scoresArray[i] = test[i];
        }
     
    }
    
    public double getAverage() {
        double total = 0;
        
        for (int i = 0; i < scoresArray.length; i++) 
            total += scoresArray[i];
        
        return (total/scoresArray.length);
    }
    
    
    
    public static void main(String[] args) {
        int score = 0;
        int scores = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many test score you have: ");
        score = input.nextInt();
        
        double[] scoresArray = new double[score];
        
        for (int i = 0; i <= score - 1; i++) {
            System.out.println("Enter test score " + (i+1) + ":");
            scoresArray[scores] = input.nextDouble();
        }
        
        Chapter11OneAndTwo TestScore = new Chapter11OneAndTwo(scoresArray);
        System.out.println(TestScore);
        getAverage(scores);
    }
    
}
