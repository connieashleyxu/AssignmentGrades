import java.util.*; //import util
/**
 * AssignmentGrades class (display assignment grades)
 *
 * @author Connie Xu
 * ITP 265, Spring 2021, Coffee Section
 * Assignment 04 Part 1
 * Email: caxu@usc.edu
 */
public class AssignmentGrades
{
    // instance variables
    private int gradeNum;
    private double[] assignmentGrade;
    private ITPHelper bff;
    //Scanner scnr = new Scanner(System.in);

    /**
     * Constructor for objects of class AssignmentGrades
     */
    public AssignmentGrades()
    {
        // initialize instance variables
        bff = new ITPHelper();
    }

    //run
    public void runAssignmentGrades()
    {
        inputGrades();
        System.out.println("");
        showAssignments(assignmentGrade);
        System.out.println("");
        showStats(assignmentGrade);
    }

    //accessor for array of grades
    public double[] getGrades(){
        return assignmentGrade;
    }

    /**
     * method to let user put in their grades
     */
    public void inputGrades()
    {
        //ask for num grades user wants to enter
        bff.print("Please enter grades");
        gradeNum = bff.inputInt("How many grades would you like to enter?", 3, 100);

        //ask to enter grades
        assignmentGrade = new double[gradeNum];
        for (int i = 0; i < gradeNum; i++) {
            assignmentGrade[i] = bff.inputDouble("Please enter grade #" + (i+1) + ":", 0, 100);
        }
    }

    /**
     * method to display assignments
     */
    public static void showAssignments (double[] arrayOfGrades)
    {
        for (int i = 0; i < arrayOfGrades.length; i++) {
            System.out.println((i+1) + " grade: " + arrayOfGrades[i]);
        }
    }

    /**
     * method to display stats of grades
     */
    public static void showStats(double[] arrayOfGrades)
    {
        System.out.println("GRADES");

        //find min
        double min = arrayOfGrades[0];
        for (int i = 0; i < arrayOfGrades.length; i++) {
            if(arrayOfGrades[i] < min){ 
                min = arrayOfGrades[i]; 
            } 
        }

        //find max
        double max = arrayOfGrades[0];
        for (int j = 0; j < arrayOfGrades.length; j++) {
            if(arrayOfGrades[j] > max){ 
                max = arrayOfGrades[j]; 
            } 
        }

        //find average
        double average;
        double sum = 0;
        for (int m = 0; m < arrayOfGrades.length; m++) {
            sum += arrayOfGrades[m];
        }
        average = sum/arrayOfGrades.length;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }
}
