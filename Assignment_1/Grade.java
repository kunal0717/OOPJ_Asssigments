import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a>=85){
            System.err.println("A+");
        }else if(a<85 && a>=70 ){
            System.out.println("A");
        }else if(a<70 && a>=60){
            System.out.println("B");
        }else if(a<60 && a>=45){
            System.out.println("C");
        }else{
            System.out.println("Fail");

        }
        sc.close();
    }
}