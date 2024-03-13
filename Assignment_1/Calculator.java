import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();

        switch (c){
            case "+":
                System.out.println(a+b);
                break;
            
            case "-":
                System.out.println(a-b);
                break;

            case "*" :
                System.out.println(a*b);
                break;
            
            
            case "/" :
            try{
                System.out.println(a/b);
                break;
            }
            catch(Exception e){
                System.out.println("Handled the arithmetic exception");
                break;
            }

            default :
                System.out.println("Invalid Input");


        }


        sc.close();
    }
}
