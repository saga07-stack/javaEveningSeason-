package TokyoItSchoolSection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateC {
public static void main (String[] args){
LocalDate timesrc = LocalDate.now();
LocalDateTime dNt = LocalDateTime.now();
DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
String formattedDate = dNt.format(timeFormat);
System.out.println("After formatted " + formattedDate);
System.out.println(dNt);
System.out.println(timesrc);
}    
}
