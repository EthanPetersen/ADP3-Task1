
import java.util.Scanner;

public class Addition {

    //TODO:Complete
    public void todo(){
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value1,value2,output;

        System.out.println("Addition");
        System.out.println("Please enter the first value:");
        value1 = sc.nextInt();
        System.out.println("Please enter the second value");
        value2 = sc.nextInt();
        output= value1 + value2;

        System.out.println("Answer:" + output);
    }
}
