
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
public class ArrayOperations {
    
    
    public static double average(int a[], int n)
    {

        int sum = 0;
         
        for (int i = 0; i < n; i++)
            sum += a[i];
     
        return (double)sum / n;
    }
    
    
    public static double getTotal (int a[], int n) {
        
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        
        return (double)sum;
    }
    
    public static int getHigh(int a[] ){
        
        int highestNum = a[0];
        
        for (int arrayIndex = 0; arrayIndex < a.length; arrayIndex++) {
            
            if (a [arrayIndex] > highestNum ) {
                highestNum = a[arrayIndex];
            }
        }
        
        return highestNum;
    }
    
    public static int getLow(int a[] ){
        
        int lowestNum = a[0];
        
        for (int arrayIndex = 0; arrayIndex < a.length; arrayIndex++) {
            
            if (a [arrayIndex] < lowestNum ) {
                lowestNum = a[arrayIndex];
            }
        }
        
        return lowestNum;
    }
    
    

    public static void main (String[] args)
    {
         
        int array[] = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
     
        System.out.println("The average is: " + average(array, n));
        System.out.println("The total is: " + getTotal(array, n));
        System.out.println("The highest number is: " + getHigh(array));
        System.out.println("The lowest number is: " + getLow(array));
    }
        
        

        
   
    
}
