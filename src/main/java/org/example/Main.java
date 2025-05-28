package org.example;

import auth.Account;
import auth.AccountManager;
import database.DatabaseConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        testZadanie1();

        testZadanie2();
    }

    private static void testZadanie2() {
        AccountManager krzysioAM =  new AccountManager();
//stworyc DatabaseConnection myDatabaseConnection = ....
//        krzysioAM.setDb(myDatabaseConnection);

        //1 dodaj nowy account
        Account lukasz = new Account(1, "Lukasz", "tyhf3");
        krzysioAM.register(lukasz);

        //2. sprawdz czy z zlym haslem zwroci false
        Boolean result = krzysioAM.authenticate("Lukasz", "1111");

        //3. sprawdz czy z dobrym haslem zwroci true

        //4. pobierze Account poprawnie po name
        krzysioAM.getAccount("Lukasz");
    }

    private static void testZadanie1() {
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