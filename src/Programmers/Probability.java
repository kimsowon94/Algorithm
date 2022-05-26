package Programmers;

public class Probability {
    public static void main(String[] args) {
        Probability probability = new Probability();
        probability.solution();
    }
    public String solution() {
        String result = "";
        int randomValue;

        // 랜덤 숫자 뽑기 (1 ~ 100)
        // 1. Random 사용
        //Random rm = new Random();
        //rm.setSeed(System.currentTimeMillis());
        //randomValue = rm.nextInt(100) + 1;

        // Math.random 사용
        randomValue = (int)(Math.random() * 100) + 1;

        if (randomValue <= 80) {
            System.out.println("randomValue => " + randomValue);
            System.out.println("10% coupon");
        }

        if (80 < randomValue &&  randomValue <= 95) {
            System.out.println("randomValue => " + randomValue);
            System.out.println("25% coupon");
        }

        if (95 < randomValue) {
            System.out.println("randomValue => " + randomValue);
            System.out.println("25% coupon");
        }
        return result;
    }
}
