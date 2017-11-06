package com.codurance;

import com.codurance.Console;

public class App {
    private final Console console;

    public App(Console console) {
        this.console = console;
    }

    public void greet() {
        console.print("Hello!");
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}
