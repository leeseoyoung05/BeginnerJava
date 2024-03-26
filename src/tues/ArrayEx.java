package tues;

public class ArrayEx {
    public static void main(String[] args) {
        int[] score = new int[5];

        score[0] = 50;
        score[1] = 60;
        score[2] = 70;
        score[3] = 80;
        score[4] = 90;

        for (int i = 0; i < 5; i++) {
            System.out.println("score[" + i + "]: " + score[i]);
        }

        for(int j = 0; j < score.length; j++) {
            System.out.println("score[" + j + "]: " + score[j]);
        }
    }
}
