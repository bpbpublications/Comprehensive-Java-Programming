/* A program that uses the Student class
call this file StudentDemo.java */
class Student
{
int rollno;
int marks1;
int marks2;
int marks3;
//Display total marks of a Student
void totalMarks()
{
System.out.println(" Total marks obtained by Roll no :"+rollno);
System.out.println(marks1+marks2+marks3);
}
}
//This class declares an object of type Student
class StudentDemo
{
public static void main(String arg[])
{
Student std1=new Student();
Student std2=new Student();

//assign values to std1's instance variables
std1.rollno=1;
std1.marks1=56;
std1.marks2=74;
std1.marks3=65;

//assign values to std2's instance variables
std2.rollno=2;
std2.marks1=66;
std2.marks2=54;
std2.marks3=57;
//display total marks of student1
std1.totalMarks();

//display total marks of student2
std2.totalMarks();

}
}
