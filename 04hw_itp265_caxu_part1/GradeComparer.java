import java.util.*; //import util
/**
 * GradeCompare class (compare your grades with friend grades)
 *
 * @author Connie Xu
 * ITP 265, Spring 2021, Coffee Section
 * Assignment 04 Part 1
 * Email: caxu@usc.edu
 */
public class GradeComparer
{
    // instance variables - replace the example below with your own
    private AssignmentGrades myGrades;
    private AssignmentGrades friendGrades;

    /**
     * Constructor for objects of class GradeComparer
     */
    public GradeComparer()
    {
        // initialize instance variables and call inputGrades
        myGrades = new AssignmentGrades();
        //myGrades.inputGrades();
        System.out.println("");
        System.out.println("YOUR GRADES");
        myGrades.runAssignmentGrades();

        friendGrades = new AssignmentGrades();
        //friendGrades.inputGrades();
        System.out.println("");
        System.out.println("FRIEND GRADES");
        friendGrades.runAssignmentGrades();

        pairWiseMax();
        showAllStats();
    }

    /**
     * access grades and hold vals for each
     */
    public double[] pairWiseMax()
    {
        double[] myGradesArray = myGrades.getGrades();
        double[] friendGradesArray = friendGrades.getGrades();

        double[] maxValueArray = new double[myGradesArray.length];

        for (int i = 0; i < maxValueArray.length; i++){
            if (myGradesArray[i] > friendGradesArray[i]) {
                maxValueArray[i] = myGradesArray[i];
            }
            else {
                maxValueArray[i] = friendGradesArray[i];
            }
        }

        return maxValueArray;
    }

    public void showAllStats() {
        System.out.println("");
        System.out.println("GRADES: ALL STATS");
        System.out.println("YOUR GRADES");
        AssignmentGrades.showStats(myGrades.getGrades());

        System.out.println("");
        System.out.println("FRIEND GRADES");
        AssignmentGrades.showStats(friendGrades.getGrades());

        System.out.println("");
        System.out.println("BEST OF GRADES");
        AssignmentGrades.showStats(pairWiseMax());
    }
}