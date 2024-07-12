package tek.review.week_1;

public class RandomEmail {

    public static void main(String[] args) {
        String emailPrefix = "crystal_a";
        int number = (int) (Math.random() * 10000);
        String randomEmail = emailPrefix + number + "@gmail.com";

        System.out.println(number);
    }
}
