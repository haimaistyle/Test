/**
 * Simple Java program to find factorial of a number using recursion and iteration.
 * Iteration will use for loop while recursion will call method itself
 */
public class Factorial{

    public static void main(String args[]) {
     
      //finding factorial of a number in Java using recursion - Example
      System.out.println("factorial of 5 using recursion in Java is: " + factorial(5));
     
      //finding factorial of a number in Java using Iteration - Example
       System.out.println("factorial of 6 using iteration in Java is: " + fact(6));
    }
 
 
    /*
     * Method to find factorial of a number using recursion
     * @return factorial of number
     */
    public static int factorial(int number){      
        //base case
        if(number == 0){
            return 1;
        }
        return number*factorial(number -1); //is this tail-recursion?
    }
 
    /*
     * Method to find factorial of a number using while loop / iteration
     * @return factorial of number
     */
 
    public static int fact(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }
     
        return result;
    }
    
/* 
Output:
 factorial of 5 using recursion in Java is: 120
 factorial of 6 using iteration in Java is: 720
*/
    
}


