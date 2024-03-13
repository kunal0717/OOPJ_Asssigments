import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();
        int bmi = weight/(height*height);
        if(bmi > 25){
            System.out.println("Over Weight");
        }else if(bmi>18.5 && bmi<24.9){
            System.out.println("Normal weight");
        }else{
            System.out.println("Under weight");
        }

        sc.close();
    }
}
