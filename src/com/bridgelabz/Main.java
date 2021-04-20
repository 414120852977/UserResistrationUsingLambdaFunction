package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        UserValidation userValidation = new UserValidation();
        userValidation.checkFirstName();
        userValidation.checkLastName();
        userValidation.checkEmail();
        userValidation.checkPhoneNo();
        userValidation.checkPassword();

        System.out.println("***thank you for joining us***");
    }
}
