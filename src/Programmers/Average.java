package Programmers;

// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성하기
public class Average {
    public static void main(String[] args) {
        Average average = new Average();
        int [] arr = {1, 2, 3, 4};
        average.solution(arr);
    }
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer = answer / arr.length;
        
        return answer;
    }

//    public int getMean(int[] array) {
//        return (int) Arrays.stream(array).average().orElse(0);
//    }
}
