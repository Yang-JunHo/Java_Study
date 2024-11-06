package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        //int score = 93 + 98.8; 정수형과 실수형의 연산은 불가능하다!!

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println(score_f); // 93.3
        System.out.println((int) score_f); // 93
        System.out.println(score_d); // 98.8
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = (double) 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d); // 191.8

        // 변수에 형 변환된 데이터 집어 넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환)

        //int convertedScoreInt = score_d; //192.8 -> 191 자동 형변환이 불가능
        int convertedScoreInt = (int) score_d; //192.8 -> 191
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93); // 93이라는 정수를 문자열로 형변환
        System.out.println(s1); // 93
        s1 = Integer.toString(99); // 99이라는 정수를 문자열로 형변환
        System.out.println(s1); // 99

        String s2 = String.valueOf(98.8); // 98.8이라는 실수를 문자열로 형변환
        System.out.println(s2); // 98.8
        s2 = Double.toString(98.3); // 98.3이라는 실수를 문자열로 형변환
        System.out.println(s2); // 98.3

        // 문자열을 숫자로
        int i = Integer.parseInt("93"); // "93"이라는 문자열을 정수로 형변환
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8"); // "98.8"이라는 문자열을 실수로 형변환
        System.out.println(d); // 98.8

        int error = Integer.parseInt("자바");
        System.out.println(error); // 에러가 나온다!
    }
}
