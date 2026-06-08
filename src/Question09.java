//9. Write a program to reverse a three digit number.

public class Question09 {
    public static void main(String []args){
        int x=243;
        x=(x/100)+((x%10)*100)+(((x/10)%10)*10);
        System.out.print("reversing after three digit is "+x);
    }

}
