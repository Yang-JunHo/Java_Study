package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // [퀴즈2]
        // 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
        // [조건]
        // - 키가 120cm 이상인 경우에만 탑승 가능
        // - 삼항연산자 이용

        int tall = 120;
        String conditions = (tall >= 120) ? "가능" : "불가능";

        System.out.println("키가 " + tall + "cm 이므로 탑승 " + conditions + "합니다.");
    }
}
