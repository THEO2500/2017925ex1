import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int a,b,c,x,y;
         System.out.print("PLZ PRESS a:");
         a=input.nextInt();
        System.out.print("PLZ PRESS b:");
        b=input.nextInt();
        System.out.print("PLZ PRESS c:");
        c=input.nextInt();
        x=10;
        y=a*x*x+b*x+c;
        System.out.printf("y=%d",y);


    }
}
