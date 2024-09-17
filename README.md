# University Course Registration System

## Overview:
This application is a University Course Registration System designed to manage student registrations, course assignments, and professor role and admin in managing all the courses like stuff. It supports multiple user types, including students, professors, and administrators, with each having specific functionalities.


## Requirements: <br>
•	Java Development Kit (JDE) <br>
•	An IDE or Text Editor for Java files <br>
•	Command line tools for running and compiling the java files


__Note__:  Follow the prompts- <br>
The application will prompt you to select a user type (Student, Professor, or Admin). Based on your selection, you will be asked to log in with credentials and perform various actions as per the menu options.


## Assumptions: <br>
•	Each user type (Student, Professor, Administrator) has specific credentials to login. <br>
•	Student can register for courses, view schedule, register for courses, drop courses, and submit complaints etc. <br>
•	Professor can view their courses, manage course details, and view enrolled students. <br>
•	Admin can add or delete courses, handle complaints etc. <br>
•	All necessary class (Student, Professor, Admin) and their methods are defined correctly.



## OOPS Concept Applied: 
1. __Encapsulation__: <br>
•	Each class (Student, Professor, Admin) encapsulates its properties and methods from the **User** class. <br>
•	Access to the class attributes is controlled via getters and setters.

2. __Inheritence__: <br>
•	The professor, Student, Admin classes inherit from a common User class to share common attributes and methods such as login credentials.

3. __Polymorphism__: <br>
•	Different user types implement method versions such as display(), reflecting different functionalities based on user type.

4. __Abstraction__: <br>
•	Abstraction is used in the User class; it interacts with a high-level interface (login page and options/menus).

5. __Composition__: <br>
•	The admin class, for ex, maintains a list of students, professors, and courses, demonstrating a relationship.


## Classes and Methods: 
•	__Main__: Entry point of the code, handles user login and interaction based on user choice

### •	Student

**Methods**: <br>

1.	**View course()** – Display available courses <br>
2.	**Course_registration()** – Register the student for a course <br>
3.	**Display_schedule()** -  Shows the student Timetable <br>
4.	**Track_Progress()** – Display Grades <br>
5.	**Drop_course()** – drops a course <br>
6.	**Drop_complaint()** – submit a complaint <br>
7.	**Viewcomplaint()** – views complaint 

### •	Professor

**Methods**: <br>

1.	**Courselist()** – List the courses the professor is teaching <br>
2.	**Managecourse()** – manage course details like updating the syllabus, class timings, course credits, enrolment limit, etc <br>
3.	**Display_enrolled_students()** – displays the students enrolled in a particular course 

### •	Administrator

**Methods**: <br>

1.	**Addcourse()** –  adds a new course <br>
2.	**Deletecourse()** – delete a course <br>
3.	**Listcourse()** – list all the courses added in course catalog <br>
4.	**Handle_complaints()** – handles the complaint, basically resolving the student pending complaint, if any   

### •	Course

**Attributes**: <br>

Coursename, profname, Syallbus, officehours, semester, coursecode, enrollmentlimit, credits, prerequisites, timings, enrolled_stud 

