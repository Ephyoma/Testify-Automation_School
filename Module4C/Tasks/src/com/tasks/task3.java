package com.tasks;

public class task3 {
    public static void main(String[] args) {

        //Create a variable and store your age in it.
        // concatenate your age with a string and
        // print it out on the console using the two methods of conacatenation youwere taught


        String birthdayWish = "Wishing You A Happy ";
        int age =  50;

        String celebration = (birthdayWish + age + " Birthday Celebration");

        System.out.println(celebration);

        // string and primitive concat
        String name = "Ifeoma's ";
        boolean isTodayYourBirthday = true;
        int HowOld = 50 ;
        String Event = " Birthday";

        //System.out.println(""+ IsTodayYourBirthday);

        //.concat() Method
        System.out.println(name.concat( HowOld +  Event));
    }
}
