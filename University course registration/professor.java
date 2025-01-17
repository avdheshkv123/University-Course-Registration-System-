import java.util.*;

public class professor extends user{
    private ArrayList<course> courseTaught;
    professor(String username,String password){
        super(username,password);
        this.courseTaught = new ArrayList<>();
    }

    //courses taught by prof
    public void courselist(){
        for(int i= 0;i<courseTaught.size();i++){
            if(courseTaught.isEmpty()) System.out.println("You are not enrolled to teach any course");
            else{
                System.out.println("Courses you are teaching: ");
                for(i = 0;i<courseTaught.size();i++){
                    System.out.println((i+1)+". "+courseTaught.get(i).getCoursename());
                }
            }
        }
    }

    //manage course
    public void managecourse(ArrayList<course> courseTaught){
        if (courseTaught.isEmpty()) {
            System.out.println("No courses available");
            return;
        }
        Scanner sc = new Scanner(System.in);
        courselist();
        int choose = sc.nextInt();
        if (choose > 0 && choose <= courseTaught.size()) {
            course selection = courseTaught.get(choose - 1);

            System.out.println("Choose what you want: \n1.Update Syllabus\n2.Update Class Timings\n3.Update credits" +
                    "\n4.Update Prerequisites\n5.Update Office hours\n6.Update enrollment limits");
            int updatechoice = sc.nextInt();
            sc.nextLine();
            switch (updatechoice) {

                case 1:
                    System.out.println("Enter new Syllabus: ");
                    String syllabus = sc.next();
                    selection.setSyllabus(syllabus);
                    System.out.println("Syllabus updated");
                    break;
                case 2:
                    System.out.println("Enter Class Timing: ");
                    String timing = sc.next();
                    selection.setTimings(timing);
                    System.out.println("Course timings updated");
                    break;
                case 3:
                    System.out.println("Enter new credits: ");
                    int credits = sc.nextInt();
                    selection.setCredits(credits);
                    System.out.println("course credits updated");
                    break;
                case 4:
                    System.out.println("Enter updated pre-requisites: ");
                    String pre = sc.next();
                    selection.setPrerequisites(pre);
                    System.out.println("updated successfully");
                    break;
                case 5:
                    System.out.println("Enter updated office hours: ");
                    String officehours = sc.next();
                    selection.setOfficehours(officehours);
                    System.out.println("office hours updated");
                    break;
                case 6:
                    System.out.println("Enter enrollment limit you want to put in this course: ");
                    int enroll_limit = sc.nextInt();
                    selection.setEnrollmentlimit(enroll_limit);
                    System.out.println("enrollment limit updated");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        else{
            System.out.println("Invalid course selection");
        }
    }

    public void viewfeedback(List<feedback<?>> feedbackList){
        if(feedbackList.isEmpty()){
            System.out.println("No feedback yet");
        }
        else{
            for(feedback<?> feedback: feedbackList){
                System.out.println(feedback.toString());
            }
        }
    }


    //enrolled students
    public void display_enrolled_students(){
        System.out.println("Student A");
        System.out.println("Student B");
    }
    public void display(){
        System.out.println("Professor Menu: \n1. View Enrolled courses\n2.Manage Courses\n3. Enrolled Students\n4. view Feedback\n5. Logout");
    }

}