package task1.calc;

public class Division {
    public final void Divide(double n1, double n2){
        double result = 0;
            try{
                result = n1/n2; 
                System.out.printf("The remainder is  %.2f%n", result);
             }
            
            catch(ArithmeticException e){
                System.out.println("sorry : A number can't be divided by 0");
            }
            catch(Exception e){
                System.out.println("something went wrong");
            }
             

    }
}
