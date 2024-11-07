package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // [퀴즈3]
        // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오
        // [참고]
        // - 주민등록번호는 13자리의 숫자로 구성
        // - 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
        // - 입력데이터는 -을 포함한 14자리의 문자열 형태

        String registrationNumber = "901231-1234567";
        System.out.println(registrationNumber.substring(0,8)); // 문자열의 인덱스 정보를 통해 출력
        // 문자열의 인덱스 정보를 indexOf를 통해 직접 세보지 않고 끝나는 지점을 지정할 수 있다!
        System.out.println(registrationNumber.substring(0,registrationNumber.indexOf("-")+2));
    }
}
