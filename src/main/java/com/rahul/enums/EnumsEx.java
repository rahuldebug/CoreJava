package com.rahul.enums;

public class EnumsEx {
    public static void main(String[] args) {
        System.out.println(Weekdays.valueOf("FRIDAY"));
        for (Weekdays weekdays:Weekdays.values()){
            System.out.println(weekdays.ordinal());
            System.out.println(weekdays.name());

           // System.out.println(weekdays);
        }
    }
}
