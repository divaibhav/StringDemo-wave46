import java.util.Scanner;

public class DemoString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter user name");
        String userName = scanner.next();
        System.out.println("enter password");
        String password = scanner.next();
        //task 1
        if(password.length() < 15 ){
            System.out.println("less then 15 characters");
        }else {
            System.out.println("more than 15  characters");
        }
        //task2
        if(userName.equals("James") && password.equals("password@123")){
            String upperCaseName = userName.toUpperCase();
            System.out.println("Welcome " + upperCaseName);
        }else{
            System.out.println("incorrect user name or password");
        }
    }
}
