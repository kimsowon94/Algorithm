package Programmers;

// 1-1. 입력된 수가 짝수라면 2로 나눕니다.
// 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
// 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

// 예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다.
// 위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요.
// 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
public class Collatz {

    public static void main(String[] args) {
        Collatz collatz = new Collatz();

        collatz.solution(1);
    }

    public int solution(long num) {
        int index = 1;
        int result = 0;

        if (num == 1) {
            result = 1;
        } else {
            while (index <= 500) {

               if (num % 2 == 0) {
                   num = num / 2;
               } else {
                   num = (num * 3) + 1;
               }

               if (num == 1) {
                   result = index;
                   break;
               }
               index++;
           }
        }

        if (num != 1) {
            result = -1;
        }

        System.out.println(result);
        return result;
    }
}
