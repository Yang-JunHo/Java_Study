package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // 해물파전 9000원
        // 김치전  8000원
        // 부추전  8000원
        // \t : 탭 효과
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        // \\(역슬래시) : 경로 설정(\ 한번만 사용하면 안됨)
        System.out.println("C:\\Program Files\\Java");

        // 단비가 "야옹"이라고 했어요
        // \" \" : ""안에 또다른 ""를 사용할때
        System.out.println("단비가 \"야옹\"이라고 했어요");

        // \' : 작은 따옴표
        // 단비가 '뭘 봐?'라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요"); // 이렇게 해도 상관 없음

        char c = 'A';
        c = '\''; // '
        System.out.println(c);
    }
}
