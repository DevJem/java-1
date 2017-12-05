package AvgSalary;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Steven Hickey
 * @Assignment Name: AvgSalary
 * @Date: Nov 13, 2014
 * @Description: A simple program to determine the average of 5 salaries entered
 * @by a user.
 */
//Imports
import java.util.Scanner;

//Begin Class SalAvg
public class SalAvg {

    //Begin Main Method
    public static void main(String[] args) {

        //Declarations
        int salCnt = 0;
        int howMany;         // New variable
        double salary = 0;
        double tot = 0;
        double salAvg = 0;

        //New Scanner object
        Scanner sc = new Scanner(System.in);
        
        /* Prompt user for number of times to run the loop. */
        System.out.print("How many salaries would you like to enter? ");
        howMany = sc.nextInt();

        /* Modify While loop to last as long as user entered */
        //While loop to find average
        while (salCnt < howMany) {
            System.out.printf("Enter the salary/hr amount %d: $", salCnt + 1);
            salary = sc.nextDouble();
            tot += salary;                  //Add entry to running total
            salCnt += 1;                    //Increment the counter
        }

        //Determine the average
        salAvg = tot / salCnt;

        //Output the average
        System.out.printf("The average of the %d salaries is: $%.2f\n", salCnt, salAvg);
    }
} //End Class SalAvg
