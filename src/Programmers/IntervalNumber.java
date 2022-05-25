package Programmers;

// 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
public class IntervalNumber {
    public static void main(String[] args) {
        IntervalNumber intervalNumber = new IntervalNumber();
        intervalNumber.solution(10000000,1000);
    }

    public long[] solution(int x, int n) {

        long[] answer = new long[n] ;
        long num = (long)x;

        for (int i = 0; i < n; i++) {
            answer[i] = x;
            System.out.println(x);
            x += num;
        }
        return answer;
    }
}
