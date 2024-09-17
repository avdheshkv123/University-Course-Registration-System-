import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class admin extends user{
    private ArrayList<course> coursescatalog;
    admin(String username,String password){
        super(username,password);
        this.coursescatalog = new ArrayList<>();

    }

    public void addcourse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the course: ");
        String coursename = sc.nextLine();
        System.out.println("Enter the Professor name: ");
        String p_name = sc.nextLine();
        System.out.println("Enter the course code: ");
        String c_code = sc.nextLine();
        System.out.println("Enter Pre-requisites: ");
        String pre_req = sc.nextLine();
        System.out.println("Enter class timings: ");
        String time = sc.nextLine();
        System.out.println("Enter the credits of course: ");
        int credits = sc.nextInt();
        System.out.println("Enter Semester: ");
        int sem = sc.nextInt();

        course newcourse = new course(coursename,p_name,c_code,pre_req,time,sem,credits);
        coursescatalog.add(newcourse);
        System.out.println("Course added Successfully!!!");

    }

    public void deletecourse(){
        if(coursescatalog.isEmpty()) System.out.println("No courses available to delete");
        Scanner sc = new Scanner(System.in);
        System.out.println("Select which course to delete");
        listcourse();
        int select = sc.nextInt();
        if(select>0 && select<=coursescatalog.size()){
            coursescatalog.remove(select-1);
            System.out.println("Course deleted Successfully!!!");
        }
        else{
            System.out.println("Invalid choice");
        }

    }

    public void listcourse(){
        if(coursescatalog.isEmpty()){
            System.out.println("No courses available");
        }
        else{
            for(int i = 0;i< coursescatalog.size();i++){
                System.out.println((i+1)+"."+ coursescatalog.get(i).getCoursename());
            }
        }

    }
    public void handle_complaints(){
//        if(complaints.containsKey(complaint)){
//            complaints.put(complaint,"Resolved");
//            System.out.println("Complaint resolved");
//        }
//        else System.out.println("Complaint not found");
        System.out.println("Complaint resolved");
    }



    public void display(){

        System.out.println("Admin Menu: \n1. Add course\n2. Delete course\n" +
                "3. list course\n4. Handle complaint\n5. Logout");
    }

}