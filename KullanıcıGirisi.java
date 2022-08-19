package java101;

import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        String userName, password, newpassword, answer;
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter your username : ");
        userName = inp.nextLine();

        System.out.println("Enter your password : ");
        password = inp.nextLine();

        if (userName.equals("yigit") && (password.equals("muz123"))){
            System.out.println("Welcome back");
        }
        else {
            System.out.println("Username or password is wrong");
            System.out.println("Forget your password ?");
        }

        answer = inp.nextLine();
        if (answer.equals("yes"))
            System.out.println("Please enter your new password : ");
            newpassword = inp.nextLine();

        if (newpassword.equals("muz123")){
                System.out.println("Your new password cannot be the same your old password");
            }
        else{
            System.out.println("Your password has been changed successfully");
        }




    }
}
