package java8;

import java.io.File;
import java.lang.reflect.Method;
import java.time.LocalDate;

/**
 * DateTest
 *
 * @author ckkim on 2018-04-27
 */
public class DateTest {

    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.of(2017, 1, 31);
//        LocalDate localDate2 = LocalDate.of(2017, 2, 28);
//        LocalDate localDate3 = LocalDate.of(2018, 4, 26);
//        LocalDate localDate4 = LocalDate.of(2018, 4, 27);
//        LocalDate localDate5 = LocalDate.of(2018, 4, 28);
//        System.out.println(localDate);
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getMonth().getValue());
//        LocalDate nowDate = LocalDate.now();
//        System.out.println(nowDate);
//
//        System.out.println(nowDate.compareTo(localDate));
//        System.out.println(nowDate.compareTo(localDate2));
//        System.out.println(nowDate.compareTo(localDate3));
//        System.out.println(nowDate.compareTo(localDate4));
//        System.out.println(nowDate.compareTo(localDate5));
//
//        LocalTime time = LocalTime.of(10, 5, 40);
//        LocalDateTime dateTime = LocalDateTime.of(localDate, time);
//        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        //파일 또는 파일리스트를 불러옵니다.
        File file = new File("C:\\dev\\log2018-04-26.txt");
        //파일명에서 날짜 정보만 가져옵니다.
        int extLen = file.getName().lastIndexOf(".txt");
        String yyyyMMdd = file.getName().substring(extLen-10, extLen);
        //현재 날짜와 비교해서 작은것들만 찾습니다.
        LocalDate nowDate = LocalDate.now();
        LocalDate compareDate = LocalDate.parse(yyyyMMdd);
        if(nowDate.compareTo(compareDate) > 0) {
            System.out.println("deleted file process");
        }
    }

}
