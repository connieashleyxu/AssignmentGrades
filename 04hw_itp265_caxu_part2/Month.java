import java.util.*; //import util
/**
 * Calendar class (display calendar months)
 *
 * @author Connie Xu
 * ITP 265, Spring 2021, Coffee Section
 * Assignment 04 Part 2
 * Email: caxu@usc.edu
 */
public class Month
{
    // instance variables
    private String month;
    private int days;

    /**
     * Constructor for objects of class Month
     */
    public Month(String month, int days)
    {
        // initialize instance variables
        this.month = month;
        this.days = days;
    }

    public Month(String month)
    {
        // initialise instance variables
        this.month = month;
    }

    public Month(int days)
    {
        // initialise instance variables
        this.days = days;
    }

    public String getMonth() { //create accessor for month
        return month;
    }

    public int getDays() { //create accessor for days
        return days;
    }

    //toString to return days in month info
    public String toString(){
        return month + " has " + days + " days.";
    }

    //equals method for month
    public boolean equals(Month other){ 
        return (
            this.getMonth().equalsIgnoreCase(other.month) 
            && this.getDays() == other.days);
    }
}
