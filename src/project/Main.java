package project;

import project.refund.Refund;
import project.star.Star;
import project.star.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //모양찍기 : 입력된 수 만큼 주어진 형태로 '*'를 출력하는 프로그램을 작성 (25점)
        /**/
        try(Scanner scanner = new Scanner(System.in)) {
            if(scanner.hasNextInt()) {
                Star star = new Triangle();
                star.draw(scanner.nextInt());
            } else {
                System.out.println("숫자만 입력 가능합니다.");
            }
        }
        /**/


        //문자뒤집기: 입력되는 문자값에서 띄워쓰기를 기준 블럭단위로 문자열 순서를 뒤집는 문제 (25점)
        /**/
        try(Scanner scanner = new Scanner(System.in)) {
            if(scanner.hasNextLine()) {
                String flipStr = scanner.nextLine();
                StringBuilder outFlipStr = new StringBuilder();
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < flipStr.length(); i++) {
                    sb.append(flipStr.charAt(i));
                    if(flipStr.charAt(i) == ' '
                            || flipStr.length()-1 == i) {

                        sb.reverse();
                        outFlipStr.append(sb);
                        sb = new StringBuilder();
                    }
                }

                System.out.println(outFlipStr);

            } else {
                System.out.println("뒤집을 텍스트를 입력하세요.");
            }
        }
        /**/

        //환급액 & 환급일 구하기 : 요기요앱에 입점한 레스토랑의 환급액 & 환급일을 계산하는 문제 (50점)
        //수수료 = 5% / 환급액 = 주문금액 - 수수료
        /**/
        Refund refund = new Refund();
        refund.setCustomer("레스토랑");
        refund.setRefund(1000);
        System.out.println(refund.getCustomer() + "이번주 환급액&환급일");
        System.out.println(refund.getRefund());
        System.out.println(refund.getRefundDate());
        /**/



        System.out.println("Hello goorm!");
    }



}
