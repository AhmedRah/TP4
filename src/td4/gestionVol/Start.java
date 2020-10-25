package td4.gestionVol;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Start {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("GMT+2");

        List<ZonedDateTime> time1 = new ArrayList<>();
        time1.add(ZonedDateTime.of(2020,10,13,12,00,00,00,zoneId));
        time1.add(ZonedDateTime.of(2020,10,13,14,15,00,00,zoneId));

        List<ZonedDateTime> time2 = new ArrayList<>();
        time2.add(ZonedDateTime.of(2020,11,15,12,00,00,00,zoneId));
        time2.add(ZonedDateTime.of(2020,11,15,15,55,00,00,zoneId));

//        List<ZonedDateTime> time3 = new ArrayList<>();
//        time3.add(ZonedDateTime.of(2020,10,7,12,00,00,00,zoneId));
//        time3.add(ZonedDateTime.of(2020,10,7,17,25,00,00,zoneId));
//
//        List<ZonedDateTime> time4 = new ArrayList<>();
//        time4.add(ZonedDateTime.of(2020,12,13,8,45,00,00,zoneId));
//        time4.add(ZonedDateTime.of(2020,12,13,14,15,00,00,zoneId));
//
//        List<ZonedDateTime> time5 = new ArrayList<>();
//        time5.add(ZonedDateTime.of(2020,4,13,18,00,00,00,zoneId));
//        time5.add(ZonedDateTime.of(2020,4,13,23,15,00,00,zoneId));
//
//        List<ZonedDateTime> time6 = new ArrayList<>();
//        time6.add(ZonedDateTime.of(2020,7,13,11,35,00,00,zoneId));
//        time6.add(ZonedDateTime.of(2020,7,13,21,15,00,00,zoneId));
//
//
//
//        Company comp1 = new Company("Easyjet");
//        Company comp2 = new Company("Royal Air Maroc");
//        Company comp3 = new Company("Fly-Emirates");
//
//        NumVol num1 = new NumVol("24XC12");
//        NumVol num2 = new NumVol("32XC13");
//        NumVol num3 = new NumVol("10BJ12");
//        NumVol num4 = new NumVol("03DZ11");
//        NumVol num5 = new NumVol("11AB91");
//        NumVol num6 = new NumVol("25GN17");
//
//
//        comp1.propose(num1,time6.get(0),time6.get(1));
//        comp1.propose(num2,time2_1,time2_2);
//        comp1.propose(num3,time3_1,time3_2);
//        comp1.propose(num4,time4_1,time4_2);
//
//        comp1.info();
//        System.out.println(time1.get(1).compareTo(time1.get(0)));


    }
}
