import java.util.*;

public class student extends user {
    private int semester;
    private ArrayList<String> enrolled_course;
    private HashMap<String,String> grades;
    private HashMap<String,String> complaints;
    private ArrayList<feedback<?>> feedbackList;

    student(String username, String password) {
        super(username, password);
        this.semester = 1;
        this.enrolled_course = new ArrayList<>();
        this.complaints = new HashMap<>();
        this.grades = new HashMap<>();
        this.feedbackList = new ArrayList<>();

    }

    //view courses
    public void viewcourse(ArrayList<course> courses){
        System.out.println("Available courses: ");
        for (course c: courses){
            System.out.println(c.getCoursename()+" | "+c.getCoursecode()+" | "+c.getProfname()+" | "+c.getCredits()+" | "+c.getPrerequisites()+" | "+c.getTimings());
        }
    }

    //register for course
    public void course_registration(course courses){
        if(courses.getSemester() == this.semester && !enrolled_course.contains(courses.getCoursecode())){
            this.enrolled_course.add(courses.getCoursecode());
            System.out.println("Successfully enrolled for "+courses.getCoursename());
        }
        else if(enrolled_course.contains(courses.getCoursecode())) System.out.println("You have already registered for this course");
        else System.out.println("Sorry!, cannot register for this course");
    }


    //View Schedule
    public void display_schedule(ArrayList<course> courses){
        for(course c: courses){
            System.out.println(c);
        }
    }

    //Track Academic Progress
    public void Track_Progress(){
        if(grades.isEmpty()) System.out.println("No grades assigned yet");
        else System.out.println("Grades: "+grades);
    }

    //Drop course
    public void drop_course(String coursecode){
        if(enrolled_course.remove(coursecode)) System.out.println("You dropped course "+coursecode);
        else System.out.println("Course not found");

    }

    //submit complaints
    public void drop_complaint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your complaint: ");
        String complaint = sc.nextLine();
        complaints.put(complaint,"Pending");
        System.out.println("Your complaint has been recorded successfully!");

    }

    //view complaint
    public void viewcomplaint(){
        System.out.println("Complaints: ");
        for(Map.Entry<String,String> entry: complaints.entrySet()){
            System.out.println("Complaint: "+entry.getKey()+" | "+"Status: "+entry.getValue());
        }
    }

    public void numbericfeedback(int rating){
        feedback<Integer> numfeedback = new feedback<>(rating);
        feedbackList.add(numfeedback);
    }

    public void textfeedback(String comment){
        feedback<String> strfeedback = new feedback<>(comment);
        feedbackList.add(strfeedback);
    }

    public void seefeedback(){
        for(feedback<?> feedback: feedbackList){
            System.out.println(feedback.toString());
        }
    }
    public List<feedback<?>> getfeedlist(){
        return feedbackList;
    }

    public void display() {
        System.out.println("Student Menu: \n1. View courses\n2. Register for courses\n3. View schedule\n"+
                "4. Track Progress\n5. Drop course\n6. Drop complaint\n7. view complaint\n8. give feedback\n9. Logout");
    }
}