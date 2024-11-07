package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i < 51; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (i == noShow){
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 밑에 코드가 실행되지 않고 for 문의 다음회차로 넘어가게 된다!
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("-----------------------------------");

        //While 문
        sold = 0;
        int index = 1; // 손님 번호
        //while (index < 51){
        while (true) { // break 를 통해 반복문을 탈출 할 수 있기 때문에 조건에 true 만 적어도 된다!
            System.out.println(index + "번 손님, 주문하신 치킨 나왓습니다.");
            index++;

            if(index == noShow){
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 밑에 코드가 실행되지 않고 while 문의 다음회차로 넘어가게 된다!
            }

            sold++; // 판매 처리
            if(sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
