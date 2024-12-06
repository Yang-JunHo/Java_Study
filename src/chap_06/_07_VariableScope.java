package chap_06;

public class _07_VariableScope {
    public static void methodA(){
        // System.out.println(number);
        // System.out.println(result);
    }
    public static void methodB(){
        int result = 1; // 지역 변수 -> 변수가 선언된 구역에서만 사용 가능
    }
    public static void main(String[] args) {
        int number = 3; // 선언된 변수를 둘러싸고있는 중괄호 안에서만 사용가능

        // System.out.println(result);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i); // 중괄호 내에서만 사용가능

        {
            int j = 0;
            System.out.println(j);
        }
        // System.out.println(j); // 중괄화 내에서만 사용가능
    }
}
