package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // [퀴즈4]
        // 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오
        // [조건]
        // - 주차요금은 시간당 4000원(일일 최대 요금은 30000원)
        // - 경차 또는 장애인 차량은 최종 요금에서 50%할인(직접 운전 또는 탑승 모두 포함)
        // [예시]
        // - 일반차량 5시간 주차 시 20000원
        // - 경차 5시간 주차 시 10000원
        // - 장애인 차량 10시간 주차 시 15000원

        String car = "경차";
        int hour = 5;
        int hourCost = 4000;
        if (car == "일반차량"){
            System.out.println("주차 요금은 " + (hour * hourCost) + "원 입니다.");
        } else {
            System.out.println("주차 요금은 " + ((hour * hourCost) / 2) + "원 입니다.");
        }
    }
}
