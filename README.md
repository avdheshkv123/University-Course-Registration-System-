# University Course Registration System

## Overview:
This application is a University Course Registration System designed to manage student registrations, course assignments, and professor role and admin in managing all the courses like stuff. It supports multiple user types, including students, professors, and administrators, with each having specific functionalities.


## Requirements: <br>
•	Java Development Kit (JDE) <br>
•	An IDE or Text Editor for Java files <br>
•	Command line tools for running and compiling the java files


Note:  Follow the prompts-
The application will prompt you to select a user type (Student, Professor, or Admin). Based on your selection, you will be asked to log in with credentials and perform various actions as per the menu options.


## Assumptions: <br>
•	Each user type (Student, Professor, Administrator) has specific credentials to login. <br>
•	Student can register for courses, view schedule, register for courses, drop courses, and submit complaints etc. <br>
•	Professor can view their courses, manage course details, and view enrolled students. <br>
•	Admin can add or delete courses, handle complaints etc. <br>
•	All necessary class (Student, Professor, Admin) and their methods are defined correctly.



## OOPS Concept Applied:
1. Encapsulation:
•	Each class (Student, Professor, Admin) encapsulates its properties and methods from the User class.
•	Access to the class attributes is controlled via getters and setters.

2.Inheritence:
•	The professor, Student, Admin classes inherit from a common User class to share common attributes and methods such as login credentials.

3.Polymorphism: 
•	Different user types implements their own versions of method such as display(), reflecting different functionalities based on user type.

4. Abstraction: 
•	Abstraction is used in the User class; it interacts with a high-level interface (login page and options/menus).

5.Composition:
•	The admin class, for ex, maintains list of students, professor, and course, demonstrating a relationship.


## Classes and Methods:
•	Main: Entry point of the code, handles user login and interaction based on user choice

### •	Student

Methods:

1.	View course() – Display available courses
2.	Course_registration() – Register the student for a course
3.	Display_schedule() -  Shows the student Timetable
4.	Track_Progress() – Display Grades
5.	Drop_course() – drops a course
6.	Drop_complaint() – submit a complaint
7.	Viewcomplaint() – views complaint

### •	Professor

Methods:

1.	Courselist() – List courses professor is teaching
2.	Managecourse() – manage course details like updating syllabus, class timings, course credits, enrolment limit etc
3.	Display_enrolled_students() – displays the students enrolled in a particular course

### •	Administrator

Methods:

1.	Addcourse() –  adds a new course
2.	Deletecourse() – delete a course
3.	Listcourse() – list all the courses added in course catalog
4.	Handle_complaints() – handles the complaint, basically resolving the student pending complaint, if any   

### •	Course

Attributes:

Coursename, profname, Syallbus, officehours, semester, coursecode, enrollmentlimit, credits, prerequisites, timings, enrolled_stud 

