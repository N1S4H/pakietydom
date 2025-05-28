package org.example;

import database.DatabaseConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DatabaseConnection aa = new DatabaseConnection();

        aa.connect("aaa");

        //if (aa.isNotConnected()) {
        //aa.connect()
        // }
        //aa.save(...)
        //aa.read(17)

        aa.disconnect();
    }
}