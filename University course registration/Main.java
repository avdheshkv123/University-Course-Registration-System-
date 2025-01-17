import java.util.*;
public class Main {
    public static void main(String[] args) throws InvalidLoginException {
        System.out.println("----------- Welcome to the University Course Registration System -----------");
        ArrayList<course> courses = new ArrayList<>();
        courses.add(new course("Introduction to Programming","B.N Jain","CSE101","NILL","9:30 AM - 11:00 AM",1,4,"C01",100));
        courses.add(new course("Digital Circuits","Pravesh Biyani","ECE101","NILL","12:00 AM - 1:00 PM",1,4,"C101",100));
        courses.add(new course("Communication skills","Payal C Mukherjee","COM101","NILL","2:30 PM - 3:30 PM",1,4,"A507",100));
        courses.add(new course("Linear Algebra","Samresh Chatterjee","MTH100","NILL","3:30 PM - 4:30 PM",1,4,"C102",100));
        courses.add(new course("Introduction to HCI","Rajiv Ratn Shah","DEC101","NILL","5:00 PM - 6:00 PM",1,4,"C201",100));


        student s1 = new student("stud@2024","12345");
        student s2 = new student("stud@2023","12345");
        student s3 = new student("stud@2021","12345");
        professor p = new professor("prof@2024","12345");
        admin ad = new admin("admin@2024","12345");


        course c1 = new course("Advance programming","XYZ","CSE201","IP","3:00-4:00",3,4,"C101",2);
        course c2 = new course("Operating Systems","Vivek Kumar","CSE210","NULL","8:30-10:00",3,4,"C201",2);



//        //exception handling for drop course
//
//        course java = new course("Java programming",28,6,2023); //add a new course to check
//        int currentdate = 30;
//        int currentmonth = 12;
//        int currentyear = 2024;
//
//        try{
//            java.dropcourse(currentdate,currentmonth,currentyear);
//        } catch (DropDeadlinePassedException e){
//            System.out.println(e.getMessage());
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Select User type:\n 1)Student\n 2)Professor\n 3)Admin");
        int usertype = sc.nextInt();
        switch (usertype){
            case 1:
                System.out.println("Enter out of 3 students which one are you: ");
                String stu_choice = sc.next();
                System.out.println("Ok, then enter credentials for login");
                break;
        }
        System.out.println("Enter Username: ");
        String username = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();

        //Login page for users
        switch (usertype){

            case 1:
                    if(s1.check_credentials(username,password)){
                        // exception handling for login
                        try{
                            s1.check_credentials("stud@2024","wrongpassword");
                        } catch (InvalidLoginException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    int stu_choice;
                    do{
                        s1.display();
                        System.out.println("Enter your choice: ");
                        stu_choice = sc.nextInt();
                        System.out.println("\n");
                        switch (stu_choice) {
                            case 1:
                                s1.viewcourse(courses);
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("Enter the course code to register: ");
                                String coursecode = sc.next();
                                course selectcourse = null;
                                for(course c: courses){
                                    if(c.getCoursecode().equals(coursecode)){
                                        selectcourse = c;
                                        break;
                                    }
                                }
                                if(selectcourse!=null){
                                    s1.course_registration(selectcourse);
                                }
                                else {
                                    System.out.println("course not found");
                                }
                                System.out.println("\n");
                                //exception handling for course registration
                                try{
                                    c1.registerstudent();
                                    c1.registerstudent();
                                    c1.registerstudent(); // this will throw an error
                                    c2.registerstudent();
                                } catch (CourseFullException e){
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case 3:
                                s1.display_schedule(courses);
                                System.out.println("\n");
                                break;
                            case 4:
                                s1.Track_Progress();
                                System.out.println("\n");
                                break;
                            case 5:
                                System.out.println("Enter the course code to drop");
                                String coursetodrop = sc.next();
                                s1.drop_course(coursetodrop);
                                System.out.println("\n");
                                break;
                            case 6:
                                s1.drop_complaint();
                                System.out.println("\n");
                                break;
                            case 7:
                                s1.viewcomplaint();
                                System.out.println("\n");
                                break;
                            case 8:
                                System.out.println("Select course to give feedback: ");
                                s1.viewcourse(courses);
                                sc.nextInt();
                                System.out.println("Give rating(1-5): ");
                                s1.numbericfeedback(sc.nextInt());
                                System.out.println("Enter any other comments you want and if not simply just write NA");
                                s1.textfeedback(sc.next());
                                System.out.println("Your response submitted");
                                System.out.println("Want to give feedback of another course (Y/N): ");
                                String response = sc.next();
                                System.out.println("Your response submitted");
                                System.out.println("see your feedback you submitted: ");
                                s1.seefeedback();
                                if(response == "Y" || response == "y"){
                                    System.out.println("select course: ");
                                    s1.viewcourse(courses);
                                    sc.nextInt();
                                    System.out.println("Give rating(1-5): ");
                                    s1.numbericfeedback(sc.nextInt());
                                    System.out.println("Enter any other comments you want and if not simply just write NA");
                                    s1.textfeedback(sc.next());
                                }
                                else{
                                    System.out.println("No problem");
                                }

                                break;
                            case 9:
                                System.out.println("Exiting...");
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    } while (stu_choice!=9);


            case 2:
                    if(p.check_credentials(username,password)){
                        try{
                            p.check_credentials("prof@2024","wrongpassword");
                        } catch (InvalidLoginException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    int prof_choice;
                    do{
                        p.display();
                        System.out.println("Enter your choice: ");
                        prof_choice = sc.nextInt();
                        System.out.println("\n");
                        switch (prof_choice){
                            case 1:
                                p.courselist();
                                break;
                            case 2:
                                p.managecourse(courses);
                                break;
                            case 3:
                                p.display_enrolled_students();
                                break;
                            case 4:
                                p.viewfeedback(s1.getfeedlist());
                            case 5:
                                System.out.println("Exiting...");
                                break;
                            default:
                                System.out.println("Invalid choice");

                        }
                    } while (prof_choice!=5);


            case 3:
                    if (ad.check_credentials(username,password)){
                        try{
                    s1.check_credentials("admin@2024","wrong");
                } catch (InvalidLoginException e){
                    System.out.println(e.getMessage());
                }
            }
                    int admin_choice;
                    do {
                        ad.display();
                        System.out.println("Enter your choice: ");
                        admin_choice = sc.nextInt();
                        switch (admin_choice) {
                            case 1:
                                ad.addcourse();
                                break;
                            case 2:
                                ad.deletecourse();
                                break;
                            case 3:
                                ad.listcourse();
                                System.out.println("\n");;
                                break;
                            case 4:
                                System.out.println("Enter response against complaint: ");
                                String response = sc.next();
                                ad.handle_complaints();
                                break;
                            case 5:
                                System.out.println("Exiting...");
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    } while (admin_choice!=5);

            default:
                System.out.println("Invalid details. Can't login");
        }

    }
}