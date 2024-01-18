package org.example.UsersMenu;

import org.example.Enum.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Admin implements StandardMenu{
    Scanner myObj = new Scanner(System.in);
    @Override
    public int menu() {

        System.out.println("Select action");
        Map<Integer, String> actionAdmin = new HashMap<>();
        actionAdmin.put(1, UsersActions.SETUP.toString());
        actionAdmin.put(2, UsersActions.VIEW.toString());
        actionAdmin.forEach((key, value) -> System.out.println(key + ":" + value));
        return myObj.nextInt();
    }
}
