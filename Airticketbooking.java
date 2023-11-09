
 import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Airticketbooking {    
    public static void main(String[] args) {
       
        LocalDate mbday=LocalDate.of(2024, Month.MAY, 3);
        LocalDate fbday=LocalDate.of(2024, Month.NOVEMBER,6 );
        LocalDate sbday=LocalDate.of(2024, Month.AUGUST, 16);
        LocalDate holiday1=LocalDate.of(2024, Month.JANUARY, 26);
         LocalDate holiday2=LocalDate.of(2024, Month.AUGUST, 15);
          LocalDate holiday3=LocalDate.of(2024, Month.OCTOBER, 2);
         DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern("E,dd-MMM-yyyy");
        LocalDate arrm=mbday.minusDays(1);
       
        LocalDate depm=mbday.plusDays(1);
        LocalDate arrf=fbday.minusDays(1);
        LocalDate depf=fbday.plusDays(1);
        LocalDate deps=sbday.plusDays(2);
        
        LocalTime t1=LocalTime.of(5,0 , 0);
        LocalTime t2=LocalTime.of(9, 0, 0);
        String c1="BOMBAY";
        String c2="IXE";
       
      
        DayOfWeek arrday=DayOfWeek.from(arrm);
        DayOfWeek depday=DayOfWeek.from(depm);
         
        DayOfWeek arrday2=DayOfWeek.from(arrf);
        DayOfWeek depday2=DayOfWeek.from(depf);
        
         DayOfWeek arrday3=DayOfWeek.from(sbday);
        DayOfWeek depday3=DayOfWeek.from(deps);
        
        
        System.out.println(arrday);
       
        System.out.println(depday);
        if(depday.getValue()==7 || depm.isEqual(holiday1) ||depm.isEqual(holiday2) || depm.isEqual(holiday3)){
            depm=depm.plusDays(1);
        }
        if(depday2.getValue()==7 || depf.isEqual(holiday1) ||depf.isEqual(holiday2) || depf.isEqual(holiday3)){
            depf=depf.plusDays(1);
        }
         if(depday3.getValue()==7 || deps.isEqual(holiday1) ||deps.isEqual(holiday2) || deps.isEqual(holiday3)){
            depf=depf.plusDays(1);
        }
        String m1="Please book a ticket for Akash Rao as per details below"+"\n "+c1+" "+"to"+" "+c2+" "+"on"+" "+arrm.format(dtf1)+" "+"at"+" "+t1+"am";
        String m2="Please book a ticket for Akash Rao as per details below"+"\n "+c2+" "+"to"+" "+c1+" "+"on"+" "+depm.format(dtf1)+" "+"at"+" "+t2+"am";
        String f1="Please book a ticket for Akash Rao as per details below"+"\n "+c1+" "+"to"+" "+c2+" "+"on"+" "+arrf.format(dtf1)+" "+"at"+" "+t1+"am";
        String f2="Please book a ticket for Akash Rao as per details below"+"\n "+c2+" "+"to"+" "+c1+" "+"on"+" "+depf.format(dtf1)+" "+"at"+" "+t2+"am";
        String s1="Please book a ticket for Akash Rao as per details below"+"\n "+c1+" "+"to"+" "+c2+" "+"on"+" "+sbday.format(dtf1)+" "+"at"+" "+t1+"pm";
       String s2="Please book a ticket for Akash Rao as per details below"+"\n "+c2+" "+"to"+" "+c1+" "+"on"+" "+depm.format(dtf1)+" "+"at"+" "+t2+"am";
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(f1);
        System.out.println(f2); 
        System.out.println(s1);
        System.out.println(s2);
        
// TODO code application logic here
        
    }
    
}

    

