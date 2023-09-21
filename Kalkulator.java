package com.example.kalkulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("Podaj pierwszą liczbę:");
        Scanner obj1 = new Scanner(System.in);
        int x = obj1.nextInt();
        System.out.println("Podaj drugą liczbe:");
        Scanner obj2 = new Scanner(System.in);
        int y = obj2.nextInt();
        System.out.println("Jaką operacje chcesz wykonac" +
                "1+ " +
                "2- " +
                "3* " +
                "4/ " +
                "5% ");
        Scanner operacja = new Scanner(System.in);
        int op = operacja.nextInt();
        switch (op) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x * y);
                break;
            case 4:
                System.out.println(x / y);
                break;
            case 5:
                System.out.println(x % y);
                break;
        }
    }
}
