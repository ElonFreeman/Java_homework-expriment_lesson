import static java.lang.Math.*;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class timemath{

    public static void main(String args[])
    {
        System.out.println("Absolute value abs(-9.8) = " + abs(-9.8));
        System.out.println("Random number random() [0,1) = " + random());
        System.out.println("Round round(2.68) = " + round(2.68));
        System.out.println("Maximum max(10,20) = " + max(10, 20));
        System.out.println("2 to the power of 3 pow(2,3) = " + pow(2, 3));
        
        System.out.println();

        System.out.println("Current date: " + LocalDate.now());
        System.out.println("Current time: " + LocalTime.now());
        System.out.println("Current date+time: " + LocalDateTime.now());

        LocalDate currentdate = LocalDate.now();
        System.out.println("Year: " + currentdate.getYear());
        System.out.println("Month: " + currentdate.getMonthValue());
        System.out.println("Day: " + currentdate.getDayOfMonth());

        System.out.println();

        long startTime = System.currentTimeMillis();
        
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken for one million accumulations (milliseconds): " + (endTime - startTime));
    }
}