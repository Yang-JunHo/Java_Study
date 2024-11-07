package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); // 대소문자도 비교가 가능하다(false)
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 내용만 비교한다(true)

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2); // true (참조 비교)

        s1 = new String("1234"); // (참조 하는 곳 : 1번)
        s2 = new String("1234"); // (참조 하는 곳 : 2번)
        System.out.println(s1.equals(s2)); // true(내용 비교)
        System.out.println(s1 == s2); // false(서로 다른 메모리공간을 참조하므로 -> s1과 s2의 메모리 공간이 다름)
    }
}
