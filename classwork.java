import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("please enter your name >>>    ");
        name = inputDevice.nextLine();
        System.out.print("please enter your age  >>>>   ");
        age = inputDevice.nextInt();


        System.out.print("your name is "      + name +   "     and you are  " + age +           "years old");

    }

    

    }

}
