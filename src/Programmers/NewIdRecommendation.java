package Programmers;

public class NewIdRecommendation {

    public static void main(String[] args) {
        NewIdRecommendation result = new NewIdRecommendation();
         result.solution("=.=");
    }

    public String solution(String new_id) {
        String answer = "";
        // 1. 대문자 -> 소문자
        answer = new_id.toLowerCase();
        System.out.println("1 => " + answer);

        // 2. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        answer = answer.replaceAll("[^\\w\\-_.]*", "");

        // 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        answer = answer.replaceAll("[.]{2,}",".");
        System.out.println("3 => " + answer);

        // 4. 마침표(.)가 처음이나 끝에 위치한다면 제거
        if (answer.indexOf(".") == 0) {
            answer = answer.substring(1, answer.length());
        }

        if (answer.lastIndexOf(".") == answer.length()-1 && !answer.isEmpty()) {
            answer = answer.substring(0,answer.lastIndexOf("."));
        }
        System.out.println("4 => " + answer);

        // 5. 빈 문자열이라면, new_id에 "a"를 대입합니다.
        answer = answer.replaceAll(" ", "a");
        System.out.println("5 => " + answer);

        // 6-1. 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0,15);
        }

        // 6-2. 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if (answer.lastIndexOf(".") == answer.length()-1 && !answer.isEmpty()) {
            answer = answer.substring(0,answer.lastIndexOf("."));
        }
        System.out.println("6 => " + answer);

        // 7. new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙인다.
        if (answer.length() <= 2 && !answer.isEmpty()) {
            String lastIdChar = answer.substring(answer.length()-1);

            for (int i = 0; i < 4 - answer.length() ; i++) {
                answer += lastIdChar;
            }
        }

        if (answer.isEmpty()) {
            for (int i = 0; i < 3 ; i++) {
                answer += "a";
            }
        }
        System.out.println("7 => " + answer);


        return answer;
    }
}
