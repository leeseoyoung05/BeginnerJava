package tues;

public class CastingEx {
    public static void main(String[] args) {
        double d = 90.5;
        int score = (int) d;
        double s = (double) score;

        System.out.println("score: " + score);
        System.out.println(d);
        System.out.println(s);
    }
}
