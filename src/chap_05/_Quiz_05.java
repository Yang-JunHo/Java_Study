package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 퀴즈5
        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오
        // 조건
        // - 신발사이즈는 250 부터 295까지 5단위로 증가
        // - 신발사이즈 수는 총 10가지
//        int[] size = {250, 255, 260, 265, 270, 275, 280, 285, 290, 295};
        int[] size = new int[10];
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (5 * i);
        };

        for (int i = 0; i < size.length; i++) {
            System.out.println("사이즈 " + size[i] + " (재고 있음)");
        }
    }
}
