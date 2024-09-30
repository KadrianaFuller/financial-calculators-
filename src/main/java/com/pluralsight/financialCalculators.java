package com.pluralsight;

import java.util.Scanner;
public class financialCalculators {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*
            It would accept the:
            Principal
            Interest Rate
            Loan Length
         */

        System.out.print("Enter principal amount: ");
        double principal= in.nextDouble();

        System.out.print("Enter Interest rate amount: ");
        double interest= in.nextDouble();

        System.out.print("Enter Length of Loan: ");
        double loanLength = in.nextDouble();
        /*
        It would display the expected monthly payment
        and total interest paid
         */

        double monthlyInterest = interest / 12;
        double numOfPayments = loanLength / 12;

        double monthlyPayment= principal * (monthlyInterest * Math.pow(1 + monthlyInterest, loanLength))  /
                (Math.pow(1+ monthlyInterest, loanLength)-1);

        System.out.printf("Monthly Payment: $%.2f ", monthlyPayment );

        /*
            It would accept the:
            Deposit amount
            Interest rate
            Number of Years
         */


        System.out.print(" Enter Deposit Amount: ");
        double depositAmt= in.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double interestRate= in.nextDouble() / (100*2);

        System.out.print("Enter Number of Years: ");
        double numberOfYears = in.nextDouble()* -12;

        /*
            It would display the future value and
            the total interest earned

            A=P* ( 1+r)^n
         */
            double interestRateEarned= interestRate/ 100;
            double futureValue = depositAmt * Math.pow(1*interestRate,numberOfYears);



        /*
             It would accept:
              Monthly Payouts
              Expected Interest rate
              Years to pay out from user
         */

        System.out.print("Enter Monthly Payout: ");
        double monthlyPayout = in.nextDouble();

        System.out.print("Enter Expected Interest Rate: ");
        double expInterestRate= in.nextDouble();

        System.out.print("Enter Years To Payout");
        double yearsToPayOut = in.nextDouble();

        /*
            It would display the present value
            of the annuity

             pv= c*[ 1-(1+i)^-n/i]
         */


    }
}
