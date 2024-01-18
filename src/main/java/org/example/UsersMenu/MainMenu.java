package org.example.UsersMenu;

import org.example.Enum.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMenu implements StandardMenu{
    static Scanner myObj = new Scanner(System.in);
    @Override
    public int menu() {
        Map<Integer, String> userType = new HashMap<>();
        userType.put(1, Users.ADMIN.toString());
        userType.put(2, Users.BUYER.toString());
        System.out.println("Please select user Type");
        userType.forEach((key, value) -> System.out.println(key + ":" + value));
        return myObj.nextInt();
    }
}
