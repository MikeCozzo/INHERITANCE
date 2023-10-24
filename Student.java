/**
   A student is represented by the name, birth year, and major.
   You must enter the class name, instance variable(s), and constructor below
*/



   /**
      Returns the string representation of the object.
      @return a string representation of the object
   */


public class Student{

	private String major;
	

public Student(String name, int birth, String major)
{

	super(name,birth);
	this.major = major;
}

	   public String toString()
	   {
	      return super.toString() + ",major=" + major + "]";
   }}