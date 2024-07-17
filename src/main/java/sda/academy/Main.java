package sda.academy;

import sda.academy.config.DatabaseConfig;
import sda.academy.ui.UserInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        DatabaseConfig.getSessionFactory();
        UserInterface userInterface = new UserInterface();
        userInterface.menuOption(new Scanner(System.in));

    }
}