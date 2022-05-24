package Programmers;

public class InternalNumber {
    public static void main(String[] args) {
        InternalNumber internalNumber = new InternalNumber();

        int [] a = {1, 2, 3, 4};
        int [] b = {-3, -1, 0, 2};

        internalNumber.solution(a, b);
    }

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
