package com.crio.qcalc;

public class StandardCalculator {

protected double result ;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    public void setResult(int a){
        if (a!=0){
            return;
        }
        this.result=a;
    }

    public double getResult(){
        return result;
    }

   public final void add(int a , int b){
    result= a+b; 
   }
   public final void add (double num1 , double num2){
    double result = num1 +num2;
    if (result == Double.MAX_VALUE || result==Double.POSITIVE_INFINITY){
        throw new ArithmeticException("Double overflow");
    }
    this.result =result;
   }
   public final void subtract(int a, int b){
    result= a-b;
   }
   public final void subtract(double a, double b){
    double result =a-b;
    if (result==Double.MIN_VALUE||result==Double.NEGATIVE_INFINITY){
        throw new ArithmeticException("Negative Double overflow");
    }
    this.result= result;
   }
   public final void multiply(int a ,int b){
    double result =a*b;
    if (result==Double.MAX_VALUE||result==Double.NEGATIVE_INFINITY||result==Double.POSITIVE_INFINITY){
        throw new ArithmeticException("Negative Double overflow");
    }
    this.result= result;
   }
   public  final void multiply(double a ,double b){
    double result =a*b;
    if (result==Double.MAX_VALUE||result==Double.NEGATIVE_INFINITY||result==Double.POSITIVE_INFINITY){
        throw new ArithmeticException("Negative Double overflow");
    }
    this.result= result;
   }
   public final void divide (int a , int b){
    if(b==0){
        throw new ArithmeticException("Divided by zero");
    }
    result= a/b;
   }
   public  final void divide (double a , double b){
    result= a/b;
   }

 final public void clearResult(){
    result=0;
}
public void printResult(){
    System.out.println("Standard Calculator Result:"+ result);
}


}
