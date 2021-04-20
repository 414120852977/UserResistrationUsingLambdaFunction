package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {

    Lambda lambda = (pattern,input) -> {
        boolean result = Pattern.matches(pattern,input);
        return result;
    };

    String firstNamePattern = "^[A-Z]{1}[a-z]{2}$";
    String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    String emailPattern  ="^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2})*$";
    String phoneNoPattern = "^[0-9]{2}[\\s][0-9]{10}$";
    String passwordPattern = "^[A-Z]{1}[a-z]{3,10}[@,&,$,_]{1}[0-9]{1,10}";

    /**
     * @using lambda function we validate our code in less code
     * and match pattern
     */
    public void  checkFirstName() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a name :");
            String fName = sc.nextLine();

            if (Pattern.matches(firstNamePattern, fName)) {
                System.out.println("pattern match it is correct");
                System.out.println("your name is :"+fName);
            } else {
                throw new InvalidNameEnteredException("enter a valid first name");
            }
        } catch (InvalidNameEnteredException e) {
            System.out.println(e.errorMessage);
            checkFirstName();
        }

    }
    /**
     * @using lambda function we validate last name our code in less code
     * and match pattern
     */
    public void checkLastName() {
        try {
            System.out.println("enter a last name:");
            Scanner sc = new Scanner(System.in);
            String lname = sc.nextLine();

            if (Pattern.matches(lastNamePattern, lname)) {
                System.out.println("pattern match you entered your valid name");
                System.out.println("entered last name is :" + lname);
            } else {
                throw new InvalidNameEnteredException("enter valid last name");

            }
        }catch (InvalidNameEnteredException e) {
            System.out.println(e.errorMessage);
            checkLastName();
        }
    }

    /**
     * @using lambda function we validate emai id our code in less code
     * and match pattern
     */
    public void checkEmail() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your email id :");
            String email = sc.nextLine();

            if (Pattern.matches(emailPattern, email)) {
                System.out.println("pattern match it is correct");

            } else {
                throw new InvalidNameEnteredException("enter a valid email id");
            }
        } catch (InvalidNameEnteredException e) {
            System.out.println(e.errorMessage);
            checkEmail();
        }

    }
    /**
     * @using lambda function we validate our phone no code in less code
     * and match pattern
     */
    public void checkPhoneNo() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your contact no  :");
            String phoneNo = sc.nextLine();

            if (Pattern.matches(phoneNoPattern, phoneNo)) {
                System.out.println("pattern match it is correct");

            } else {
                throw new InvalidNameEnteredException("it should not be 10 digit number or you have to type country code also");
            }
        } catch (InvalidNameEnteredException e) {
            System.out.println(e.errorMessage);
            checkPhoneNo();
        }
    }
    /**
     * @using lambda function we validate password our code in less code
     * and match pattern
     */

    public void checkPassword() {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your password :");
            String password = sc.nextLine();

            if (Pattern.matches(passwordPattern, password)) {
                System.out.println("pattern match it is correct");

            } else {
                throw new InvalidNameEnteredException("it should not be correct password you should missing some numeric or character in it");
            }
        } catch (InvalidNameEnteredException e) {
            System.out.println(e.errorMessage);
            checkPassword();
        }
    }
}



