import java.util.ArrayList;
public class course{
    private int semester;
    private String coursename;
    private String profname;
    private String Syllabus;
    private String officehours;
    private String coursecode;
    private int enrollmentlimit;
    private int credits;
    private String prerequisites;
    private String timings;
    private int enrolled_stud;
    private String location;
    private int capacity;
    int dropday;
    int dropyear;
    int dropmonth;

    course(String coursename,String profname,String coursecode,String prerequisites,String timings,int semester,int credits,String location,int capacity){
        this.coursename = coursename;
        this.profname = profname;
        this.coursecode = coursecode;
        this.credits = credits;
        this.prerequisites = prerequisites;
        this.timings = timings;
        this.semester = semester;
        this.location = location;
        this.capacity = capacity;
    }

    course(String coursename,int dropday,int dropmonth, int dropyear){
        this.coursename = coursename;
        this.dropday = dropday;
        this.dropmonth = dropmonth;
        this.dropyear = dropyear;

    }
    public String getCoursename(){

        return coursename;
    }
    public String getProfname(){

        return profname;
    }
    public String getCoursecode(){

        return coursecode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getSyllabus(){
        return Syllabus;
    }
    public String getPrerequisites() {

        return prerequisites;
    }
    public String getTimings(){

        return timings;
    }
    public int getSemester(){
        return semester;
    }
    public int getCredits(){
        return credits;
    }
    public void setSyllabus(String Syllabus){
        this.Syllabus = Syllabus;
    }
    public void setOfficehours(String officehours){
        this.officehours = officehours;
    }

    public void setEnrollmentlimit(int enrollmentlimit) {
        this.enrollmentlimit = enrollmentlimit;
    }

    public int getEnrollmentlimit() {
        return enrollmentlimit;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setPrerequisites(String prerequisites){
        this.prerequisites = prerequisites;
    }
    public void setTimings(String timings){
        this.timings = timings;
    }
    public String getOfficehours(){
        return  officehours;
    }
    public void setCoursecode(String coursecode){
        this.coursecode = coursecode;
    }

    public void setProfname(String profname) {
        this.profname = profname;
    }

    public void registerstudent() throws CourseFullException{
        if(enrolled_stud>=capacity){
            throw new CourseFullException("The course is "+coursename+" full");
        }
        enrolled_stud++;
        System.out.println("Student registered for "+ coursename);
    }

    public void dropcourse(int currentday, int currentmonth, int currentyear) throws DropDeadlinePassedException{
        if((currentday>=dropday) || (currentyear>=dropyear) || (currentmonth>=dropmonth)){
            throw new DropDeadlinePassedException("cannot drop "+coursename+".Deadline for dropping the course is passed.");
        }
        System.out.println("course "+coursename+" dropped successfully");
    }

    public String toString(){
        return "course name: "+coursename+" | course code: "+coursecode+" | Prof: " +
                profname+" | Credit: "+credits+" | Pre-Requisite: "+prerequisites+" | timings: "+timings + " | location: "+location;
    }

}
