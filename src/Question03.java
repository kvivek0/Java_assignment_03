/* Write a program to make the last digit of a number stored in a
     variable as zero. (Example - if x=2345 then make it x=2340) */

public class Question03 {
    public static void main(String []args){
        int x=2345;
        int y=x/10; // Divisible operator removes last digit;
         y=y*10;
         System.out.print(y);

    }
}
