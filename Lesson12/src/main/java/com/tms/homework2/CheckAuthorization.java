package com.tms.homework2;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
class CheckAuthorization implements Authorization {

    private String login;
    private String password;
    private String confirmPassword;
    private static final String MESSAGE = "Поле не соответствует требованиям: поле должно содержать:\n" +
            "- только латинские буквы, цифры и знак подчеркивания.\n" +
            "- длина login должна быть от 8 до 20 символов.";
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
        if (login.matches("\\w{8,20}")) {
            System.out.println("");
        } else {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                System.out.println(MESSAGE);
            }
        }
    }

    @Override
    public void enterPassword() {
        System.out.println("Enter password :");
        password = scanner.nextLine();
        if ((password.matches("\\w{8,20}"))) {
            setPassword(password);
            System.out.println("");
        } else {
            System.out.println(MESSAGE);
        }
    }


    @Override
    public void confirmPassword() {

        System.out.println("ConfirmPassword: ");
        confirmPassword = scanner.nextLine();
        if (/*(confirmPassword.matches("\\w{8,20}")) && */confirmPassword.equals(getPassword())) {
            System.out.println("Пароли совпадают, введены корректно");
        } else {
            try {
                throw new WrongPasswordException();
            } catch (WrongPasswordException e) {
                e.printStackTrace();
            }
        }
    }
}
