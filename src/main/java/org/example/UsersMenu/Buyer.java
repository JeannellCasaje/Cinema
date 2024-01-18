package org.example.UsersMenu;

import org.example.Enum.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Buyer implements StandardMenu{
    Scanner myObj = new Scanner(System.in);
    @Override
    public int menu() {
        System.out.println("Select action");
        Map<Integer, String> actionBuyer = new HashMap<>();
        actionBuyer.put(1, UsersActions.AVAILABILITY.toString());
        actionBuyer.put(2, UsersActions.BOOK.toString());
        actionBuyer.put(3, UsersActions.CANCEL.toString());
        actionBuyer.forEach((key, value) -> System.out.println(key + ":" + value));
        return myObj.nextInt();
    }
}
