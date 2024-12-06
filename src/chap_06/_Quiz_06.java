package chap_06;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class _Quiz_06 {
    public static String getHiddenData(String data, int index){
        String hiddenData = data.substring(0, index); // 나코딩 -> 나
        for (int i = 0; i < data.length() - index; i++) { // 나코딩 -> 나**
            hiddenData += "*";
        }
        return hiddenData;
    }


    public static void main(String[] args) {
        // 퀴즈6
        // 개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오
        // 조건
        // 1. 개인정보를 비공개로 전환하는 메소드 작성
        // 2. 하나의 메소드에서 모든 동작 처리
        // 3. 각 정보는 아래 위치부터 비공개 적용

        String name = "나코딩"; // 이름
        String id = "941014-1324567"; // 주민등록번호
        String phone = "010-3070-1111"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name,1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
