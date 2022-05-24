package Programmers;

public class NumberAdd {
    public static void main(String[] args) {
        NumberAdd numberAdd = new NumberAdd();
        int[] number = {1,2,3,4,6,7,8,0};
        numberAdd.solution(number);
    }

    public int solution(int[] numbers) {
        int answer = 0;
        // 1 ~ 9 더하기
        for (int i = 1; i < 10; i++) {
           answer = answer + i;
        }

        for (int i = 0; i < numbers.length; i++) {
            answer = answer - numbers[i];
        }

        System.out.println(answer);
       return answer;
   }
}
