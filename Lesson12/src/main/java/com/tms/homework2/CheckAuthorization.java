package com.tms.homework2;

import java.util.Scanner;

public class CheckAuthorization implements Authorization {
    private String login;
    private String password;
    private String confirmPassword;
    Scanner scanner = new Scanner(System.in);

    public CheckAuthorization(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public CheckAuthorization() {
    }


    @Override
    public void enterLogin() {
        System.out.println("Enter login :");
        login = scanner.nextLine();


        if ((login.matches("^[_A-z0-9]*((-|\\s)*[_A-z0-9])*$")) && login.length() >= 20) {
            System.out.println("Login correct");
        } else {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                System.out.println("Enter login again");
            }
        }


    }

    @Override
    public void enterPassword() {

    }

    @Override
    public void confirmPassword() {

    }
}
