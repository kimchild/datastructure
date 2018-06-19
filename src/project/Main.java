package project;

import project.refund.Refund;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //모양찍기 : 입력된 수 만큼 주어진 형태로 '*'를 출력하는 프로그램을 작성 (25점)
        /**/
        try(Scanner scanner = new Scanner(System.in)) {
            if(scanner.hasNextInt()) {
                int count = scanner.nextInt();
                //좌측정렬 삼각별
                /**/
                for(int i = 0; i < count; i++) {
                    for(int j = 0; j < i+1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i = 0; i < count; i++) {
                    for(int j = count; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                /**/

                //우측정렬 삼각별
                /**/
                String aster;
                for(int i = 0; i < count; i++) {
                    aster = new String();
                    for(int j = 0; j < i+1; j++) {
                        aster += "*";
                    }
                    System.out.println( String.format("%"+count+"s",aster) );
                }
                for(int i = 0; i < count; i++) {
                    aster = new String();
                    for(int j = count; j > i; j--) {
                        aster += "*";
                    }
                    System.out.println( String.format("%"+count+"s",aster) );
                }
                /**/

                List<String> list;
                //피라미드
                /**/
                list = new ArrayList<>();
                for(int i = 0; i < count-1; i++) {
                    aster = new String();
                    for(int j = 0; j < i+1; j++) {
                        aster += "*";
                    }
                    list.add(String.format("%"+count+"s",aster));
                }

                boolean isFirstAster = true;
                for(String s : list) {
                    if(isFirstAster) {
                        isFirstAster = false;
                        System.out.println(String.format("%"+count+"s","*"));
                    }
                    System.out.println(s + s.replaceAll("\\s", ""));
                }
                /**/


                //역 피라미드
                /**/
                list = new ArrayList<>();
                for(int i = 0; i < count-1; i++) {
                    aster = new String();
                    for(int j = 0; j < i+1; j++) {
                        aster += "*";
                    }
                    list.add(String.format("%"+count+"s",aster));
                }

                Collections.reverse(list);
                for(String s : list) {
                    System.out.println(s + s.replaceAll("\\s", ""));
                }
                System.out.println(String.format("%"+count+"s","*"));
                /**/


                //다이아몬드
                /**/
                list = new ArrayList<>();
                for(int i = 0; i < count-1; i++) {
                    aster = new String();
                    for(int j = 0; j < i+1; j++) {
                        aster += "*";
                    }
                    list.add(String.format("%"+count+"s",aster));
                }

                isFirstAster = true;
                for(String s : list) {
                    if(isFirstAster) {
                        isFirstAster = false;
                        System.out.println(String.format("%"+count+"s","*"));
                    }
                    System.out.println(s + s.replaceAll("\\s", ""));
                }
                Collections.reverse(list);
                for(String s : list) {
                    System.out.println(s + s.replaceAll("\\s", ""));
                }
                System.out.println(String.format("%"+count+"s","*"));
                /**/

                //모래시계
                /**/
                list = new ArrayList<>();
                for(int i = 0; i < count-1; i++) {
                    aster = new String();
                    for(int j = 0; j < i+1; j++) {
                        aster += "*";
                    }
                    list.add(String.format("%"+count+"s",aster));
                }

                Collections.reverse(list);
                for(String s : list) {
                    System.out.println(s + s.replaceAll("\\s", ""));
                }
                System.out.println(String.format("%"+count+"s","*"));

                Collections.sort(list);
                isFirstAster = true;
                for(String s : list) {
                    if(isFirstAster) {
                        isFirstAster = false;
                        System.out.println(String.format("%"+count+"s","*"));
                    }
                    System.out.println(s + s.replaceAll("\\s", ""));
                }
                /**/

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
                List<String> list = Arrays.asList(flipStr.split(" "));
                //전체 위치를 뒤집을 경우 reverse
                //Collections.reverse(list);

                for(String s : list) {
                    System.out.print(new StringBuilder(s).reverse() + " ");
                }

            } else {
                System.out.println("뒤집을 텍스트를 입력하세요.");
            }
        }
        /**/

        //환급액 & 환급일 구하기 : 배달앱에 입점한 식당의 환급액 & 환급일을 계산하는 문제 (50점)
        //수수료 = 5% / 환급액 = 주문금액 - 수수료
        /**/
        Refund refund = new Refund(5);
        refund.setCustomer("김치찌개전문점");
        refund.setOrderPrice(1000);
        System.out.println(refund.getCustomer() + " 이번주 환급액&환급일");
        System.out.println("환급기간 : " + refund.getStartDate() + " ~ " + refund.getEndDate());
        System.out.println(refund.getRefundAmount());
        System.out.println(refund.getRefundDate());
        /**/



        System.out.println("Hello goorm!");
    }



}
