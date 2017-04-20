import java.util.Scanner;

/**
 * Java program to calculate and print Fibonacci number using both recursion and Iteration.
 * Enter the # up to how many Fibonacci #'s to print. 
 * Ex: input 12 and it will print the first 12 Fibonacci #'s:  1 1 2 3 5 8 13 21 34 55 89 144
 * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
 * @author Hai Mai
 */
public class FibonacciCalculator {

    public static void main(String args[]) {
          /*input to print Fibonacci series up to how many numbers*/

    	//set the number up to the Fibonacci sequence
        int number = 11;
     
        System.out.println("Fibonacci series up to " + number +" numbers: ");
        for(int i=1; i<=number; i++){
        	//System.out.print(fibonacci(i) +", ");
        	System.out.print(fibonacci2(i) +", ");
            
        }  
        
        
    } 

    
    /*
     * Method uses recursion to calculate Fibonacci numbers up to the given number
     * @return Fibonacci number
     */
    public static int fibonacci(long number){
        if(number == 1 || number == 2){
            return 1;
        }
     
        return fibonacci(number-1) + fibonacci(number -2); 
    }    
    
    /*
     * Method to calculate Fibonacci number using loop / iteration.
     * @return Fibonacci number
     */
    public static long fibonacci2(long number){
        if(number == 1 || number == 2){
            return 1;
        }
        long fibo1=1, fibo2=1, fibonacci=1;
        for(long i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci # is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
         
        }
        return fibonacci;    
    }     
    
}
