package td4.gestionVol;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("GMT+2");
        ZonedDateTime time1_1 = ZonedDateTime.of(2020,10,13,12,00,00,00,zoneId);
        ZonedDateTime time1_2 = ZonedDateTime.of(2020,10,13,14,15,00,00,zoneId);;

        ZonedDateTime time2_1 = ZonedDateTime.of(2020,10,11,5,20,00,00,zoneId);
        ZonedDateTime time2_2 = ZonedDateTime.of(2020,10,11,9,15,00,00,zoneId);;

        ZonedDateTime time3_1 = ZonedDateTime.of(2020,10,13,22,00,00,00,zoneId);
        ZonedDateTime time3_2 = ZonedDateTime.of(2020,10,13,22,45,00,00,zoneId);;

        ZonedDateTime time4_1 = ZonedDateTime.of(2020,10,13,12,00,00,00,zoneId);
        ZonedDateTime time4_2 = ZonedDateTime.of(2020,10,13,14,15,00,00,zoneId);;

        Company comp1 = new Company("easyjet");

        NumVol num1 = new NumVol("24XC12");
        NumVol num2 = new NumVol("32XC13");
        NumVol num3 = new NumVol("10BJ12");
        NumVol num4 = new NumVol("03DZ11");


        comp1.propose(num1,time1_1,time1_2);
        System.out.println("");
        comp1.propose(num2,time2_1,time2_2);
        System.out.println("");
        comp1.propose(num3,time3_1,time3_2);
        System.out.println("");
        comp1.propose(num4,time4_1,time4_2);
        System.out.println("");

        comp1.info();
    }
}
