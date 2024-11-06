package chap_02;

public class _01_Operater1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2 몫
        System.out.println(5 / 2); // 2 몫
        System.out.println(5 % 2); // 1 나머지
        System.out.println(2 % 5); // 2 나머지

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6 곱하기,나누기 먼저
        System.out.println((2 + 2) * 2); // 8 () 먼저

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 변수에 +1을 먼저 진행 후, 해당 코드 진행
        System.out.println(val++); // 11 해당 코드를 먼저 진행 후, 변수에 +1을 진행
        System.out.println(val); //12

        System.out.println(--val); // 11 변수에 -1을 먼저 진행 후, 해당 코드 진행
        System.out.println(val--); // 11 해당 코드를 먼저 진행 후, 변수에 -1을 진행
        System.out.println(val); // 10

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3
    }
}
