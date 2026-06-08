//Write a program to calculate sum of the digits of a given number.

public class Question04 {
    public static void main(String []args){
       /* int x=235,y,z;
          y=x%10; // here y contains 5 after applying modulus;
          x=x/10; // here x contain 23 after applying divide;
          z=x%10; // here z contains 3 after applying modulus;
          x=x/10; // here x contains 2 after applying divide;
             // allover:- x=2,y=3,z=5;
          x=x+y+z;*/
         int x=234;
         x=(x/100)+(x%10)+(x/10)%10;   //updated;

         System.out.print("sum of digit is "+x); // summation
    }
}
