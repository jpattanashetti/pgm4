

public class StudentCourse {

    String studentName;
    String courseName;
    int sem;
    String[] courses;
    int[] marks;
    public StudentCourse(String studentName, String courseName, int sem, String[] courses, int[] marks) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.sem = sem;
        this.courses = courses;
        this.marks = marks;
    }

    public void display(){
        System.out.println("Student Name: "+studentName);
        System.out.println("Course Name: "+courseName);
        System.out.println("semester "+sem);
        System.out.println("courses");
        for(int i=0;i<courses.length;i++){
            System.out.println(courses[i]);
        }
    }
    public void showLowMarks(){
        System.out.println("course with marks < 0 ");
        for(int i=0;i<marks.length;i++){
            if(marks[i]<=0){
                System.out.println(courses[i]+" "+marks[i]);
            }
        }
        
    }
    public static void main(String[] args) {
        String[] courseList={"OS","BDA","C++"};
        int[] marksList={90,80,70};
        StudentCourse s=new StudentCourse("shubh","BE", 4, courseList, marksList);
        s.display();
        s.showLowMarks();
    }
}
