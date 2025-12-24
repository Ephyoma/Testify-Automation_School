package com.graham;

public class JavaDataType {
    public static void main(String[] args) {
// Declaring variables of different data types
        // byte from -128 to 127
        // short from -32,768 to 32,767
        // int from -2,147,483,648 to 2,147,483,647
        // long from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float from 6 to 7 decimal digits
        // double from 15 decimal digits
        //Char  single letters 'a', 'b'
        // boolean = true, false

        byte HouseNumber = -126;

        short Amount = 32_767;

        long soMuchMoney = 2147483649l;
        int Value = -2147483648;
        float area = 123456.888888f;
        double height = 5.6;
        char option = 'm';
        boolean select = true;
        System.out.println(HouseNumber);
        System.out.println(Amount);
        System.out.println(soMuchMoney);
        System.out.println(area);
        System.out.println(height);

    }
}
