public class student_marks_manager {
    public static void main(String [] args) {
        String[] names={"Ali", "Sara", "Usman", "Hina", "Bilal"};
        int[] marks={78, 92, 45, 67, 88};
        // print all 
        printAll(names, marks);
        // average of all marks 
        System.out.println("The avg of all marks is"+ avg(marks));
        // Highest marks student
        System.out.println(topStudent(names, marks));
        // count pass
        System.out.println("passed students are:"+countPass(marks));
        // get grade
        System.out.println(getGrade(92));   
        System.out.println(getGrade(60));   
        System.out.println(getGrade(45));   
        // report
        displayAll(names, marks);
    }
    public static void printAll(String[] s , int[] m){
        for(int i=0 ; i<s.length ; i++ ){
            System.out.println(s[i]+":"+m[i]);
        }
    }
    public static double avg(int[] m){
        double average=0 , sum=0;
        for(int i=0 ; i<m.length ; i++){
            sum=sum+m[i];
        }
        average=sum/m.length;
        return average;
    }
    public static String topStudent(String[] s , int[] m){

        int maxMarks = 0;
        for (int i = 1; i < m.length; i++) {
            if(m[i]>m[maxMarks]){
                maxMarks=i;
            }
        }
        return s[maxMarks];
    }
    public static int countPass(int[] m){
        int count=0;
        for (int i = 0; i < m.length; i++) {
            if (m[i]>=50) {
                count++;
            }
        }
            return count;
    }
   public static String getGrade(int marks) {
    if (marks >= 90) {
        return "A";
    } else if (marks >= 80) {
        return "B";
    } else if (marks >= 70) {
        return "C";
    } else if (marks >= 60) {
        return "D";
    } else {
        return "Fail";
    }
}   
public static void displayAll(String names[] , int marks[]){
    for (int i = 0; i < names.length; i++) {
        System.out.println("name : " + names[i] + "marks: " + marks[i] + "grade is" + getGrade(marks[i]));
    }
}
    }


