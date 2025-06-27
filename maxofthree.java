import java.util.Scanner;


public class maxofthree {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter num1");
        int num1= scanner.nextInt();

        System.out.println("enter num2");
        int num2 = scanner.nextInt();

        System.out.println("enter num3");
        int num3 = scanner.nextInt();
        
        if(num1>=num2 && num1>=num3){
            System.out.println("maximum num is"+num1);

        }
        else if(num2>=num1 && num2>=num3){
            System.out.println("maximum num is "+num2);

        }else{
            System.out.println("maximum num is"+num3);
        }



    }

    
}
