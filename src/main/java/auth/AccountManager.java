package auth;

import database.DatabaseConnection;

public class AccountManager {
    DatabaseConnection db;

    public void setDb(DatabaseConnection db) {
        this.db = db;
    }

    public void register(Account newUser){
//todo implemetacja

        db.save(newUser);

    }

    public Boolean authenticate(String name, String password){
//todo implemetacja
        return false;
    }

    public Account getAccount(int id){
//todo implemetacja

        return null;
    }
    public Account getAccount(String name){
//todo implemetacja

        return null;
    }


    public static void main(String[] args) {

    }
}
