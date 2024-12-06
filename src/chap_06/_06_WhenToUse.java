package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number){
        // int result = number * number;
        // return result;
        // return number * number;
        return getPower(number, 2); // 메소드 내에 또 다른 메소드 호출 가능
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유
        // 1. 코드의 간결화
        // 2. 유지보수에 용이

        // 2의 2승을 구하기
//        int result = 1;
//        for (int i = 0; i < 2; i++) {
//            result = result * 2;
//        }
//        System.out.println(result); // 2 * 2
        System.out.println(getPower(2,2));

        // 3의 3승을 구하기
//        result = 1;
//        for (int i = 0; i < 3; i++) {
//            result = result * 3;
//        }
//        System.out.println(result); // 3 * 3
        System.out.println(getPower(3,3));

        // 4의 2승을 구하기
//        result = 1;
//        for (int i = 0; i < 2; i++) {
//            result = result * 4;
//        }
//        System.out.println(result); // 4 * 4
        System.out.println(getPower(4,2));
    }
}
