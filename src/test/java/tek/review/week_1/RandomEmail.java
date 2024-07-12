package tek.review.week_1;

import java.util.Random;

public class RandomEmail {

    public static void main(String[] args) {
        String emailPrefix = "crystal_a";
        int number = (int) (Math.random() * 10000);
        String randomEmail = emailPrefix + number + "@gmail.com";

        System.out.println(number);
    }


    public static String generateRandomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stringBuilder = new StringBuilder(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(characters.charAt(random.nextInt(characters.length())));}
        return stringBuilder.toString();

    }
    public static String generateRandomEmail(){
        String localPart = generateRandomString();
        return localPart + "@gmail.com";
    }
}
