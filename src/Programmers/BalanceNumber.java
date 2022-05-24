package Programmers;

public class BalanceNumber {
    public static void main(String[] args) {
        BalanceNumber balanceNumber = new BalanceNumber();

        int [] absolutes = {4, 7, 12};
        boolean [] signs = {true, false, true};

        balanceNumber.solution(absolutes, signs);
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        int index = 0;
        for (int i : absolutes) {
            if (signs[index])
                answer = answer + i;
            else
                answer = answer - i;

            index++;
        }

//        int answer = 0;
//        for (int i=0; i<signs.length; i++)
//            answer += absolutes[i] * (signs[i]? 1: -1);

        return answer;
    }
}
