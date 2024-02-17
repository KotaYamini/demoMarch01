package com.example.demofeb17;

public class LoginService {
    Database db = new Database();

    void doSomething(){
        db.createQuery("Select * from DB");
    }
}
