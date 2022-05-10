package exceptions.custom_exceptions;

public class Permission {
    public static void ageCheck(int age){
        if (age > 16){
            System.out.println("it is allowed to have driver licence");
        }else throw new RuntimeException("Age of " + age + " is not allowed to have driver licence");
    }

    public static void checkIn(int day){
        if (day >= 1 && day <= 7){
            if (day == 1 || day == 7) System.out.println("You may check in from 10 AM to 3 PM");
            else System.out.println("You may check in from 10 AM to 5 PM");
        }else throw new RuntimeException("The input does not represent any day");
    }


}
