import java.util.*; //import util
/**
 * Calendar class (display calendar months)
 *
 * @author Connie Xu
 * ITP 265, Spring 2021, Coffee Section
 * Assignment 04 Part 2
 * Email: caxu@usc.edu
 */
public class MyCalendar
{
    // instance variables
    private Month[] myMonths;
    private ITPHelper bff;

    /**
     * Constructor for objects of class MyCalendar
     */
    public MyCalendar()
    {
        // initialize instance variables
        bff = new ITPHelper();
        myMonths = new Month[]{new Month("January", 31), new Month("February", 28), new Month ("March", 31), new Month ("April", 30), new Month ("May", 31), new Month ("June", 30), new Month ("July", 31), new Month ("August", 31), new Month ("September", 30), new Month ("October", 31), new Month ("November", 30), new Month ("December", 31)};
        
        runCalendar();
        /*
        myMonths = new Month[][]{
            {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"},
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        };
        */
    }
    
    /**
     * run method
     */
    public void runCalendar(){
        printCalendar();
        checkCalendar();
    }

    /**
     * print calendar
     */
    public void printCalendar()
    {
        for (int i = 0; i < myMonths.length; i++){
            System.out.println(i+1 + ": " + myMonths[i]);
            //myMonths[i].toString();
        }
    }
    
    /**
     * check calendar
     */
    public void checkCalendar()
    {
        int num = bff.inputInt("Enter a month number: ", 1, 12);
        System.out.println(myMonths[num - 1].toString());
    }
}

