package task1;


import java.util.Scanner;

import task1.calc.*;
class Var{
    private double n1;
    private double n2;
    public void setn1(double n1){
        this.n1 = n1;
    }
    public double getn1(){
        return n1;
    }

    public void setn2(double n2){
        this.n2 = n2;
    }
    public double getn2(){
        return n2;
    }
}

 class Final{
     public static void main(String [] args){
// creating objects for each classes
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Var var = new Var();
        Multiplication multiply = new Multiplication();
        Division divide = new Division();


    //taking users choice
    
    int opp_outside;
    do{
        int opp_inside; 
        do{
            for(int i = 0;i<40;i++){
                System.out.print("--");
            }
            System.out.println();
            System.out.println("Select the operation number you want to perform");
            for(int i = 0;i<40;i++){
                System.out.print("--");
            }
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Addition\n2. subtraction\n3. Multiplication\n4. Division\n5. Quit");
            int operation = sc.nextInt();
            opp_inside = operation;
        
            if (opp_inside > 5)
             System.out.println("please select between 1 - 5");
             
        }while(opp_inside > 5);
        if (opp_inside == 5)
            break;
            
    // getting 2 numbers from user
            for(int i = 0;i<40;i++){
                System.out.print("--");
            }
            System.out.println();
            System.out.println("Enter 2 numbers separated by a comma");
            for(int i = 0;i<40;i++){
                System.out.print("--");
            }
            System.out.println();
            Scanner sc = new Scanner(System.in);
            String [] user = sc.nextLine().split(",");
            System.out.println();
            double a = Double.parseDouble(user[0]);
            double b = Double.parseDouble(user[1]);
            var.setn1(a);
            var.setn2(b);
            // Scanner sc = new Scanner(System.in);
            // System.out.println("enter 1st number");
            // double a = sc.nextDouble();
            // System.out.println("enter 2nd number");
            // double b = sc.nextDouble();
            // var.setn1(a);
            // var.setn1(b);
    // result
    
            System.out.println("Result....................................................");        
            switch(opp_inside)
            {
                case 1:
                    add.Add(var.getn1(),var.getn2());
                    break;
                case 2:
                    sub.subtract(var.getn1(),var.getn2());
                    break;
                case 3:
                    multiply.Multiply(var.getn1(),var.getn2());
                    break;
                case 4:
                    divide.Divide(var.getn1(),var.getn2());
                    break;
                default:
                    sc.close();
            }
            opp_outside = opp_inside;
    }while(opp_outside != 5);
    for(int i = 0;i<30;i++){
        System.out.print("__");
    }
    System.out.print("THANK YOU");
    for(int i = 0;i<30;i++){
        System.out.print("__");
    }
        
    }
}


    