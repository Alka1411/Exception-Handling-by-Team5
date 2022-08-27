//Assignment of Exception Handling By Team-5

//ANSHIKA

//Ques.1
//Student Class

public class Student
{
String name;
double marks1;
double marks2;
double marks3;


public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}
public double getMarks1()
{
return marks1;
}
public void setMarks1(double marks1)
{
this.marks1 = marks1;
}
public double getMarks2()
{
return marks2;
}
public void setMarks2(double marks2)
{
this.marks2 = marks2;
}
public double getMarks3()
{
return marks3;
}
public void setMarks3(double marks3)
{
this.marks3 = marks3;
}
}


//TestStudent

import java.util.Scanner;

public class TestStudent
{
static String checkName(String name)
{
if (name.length()==0)
{
throw new NullPointerException("Name can not be blank");
}

return "Name is valid";

}
static boolean checkMarks(double marks1,double marks2,double marks3) throws MarksNotFoundException
{
if (marks1==0 && marks2==0 && marks3==0)
{
throw new MarksNotFoundException();
}
else if(marks1==0 || marks2==0 || marks3==0)
{
return false;
}
return true;
}
static String buildResult(Student s ) throws StudentFailedException
{
double total=s.marks1+s.marks2+s.marks3;
double percentage=total/3;

if (percentage>=90)
{
return "Grade : Outstanding";
}
else if(percentage>=80)
{
return "Grade : Excellent";
}
else if(percentage>=70)
{
return "Grade : Very Good";
}
else if(percentage>=60)
{
return "Grade : Good";
}
else if(percentage>=50)
{
return "Grade : Average";
}
else if(percentage<=50)
{
throw new StudentFailedException();
}
return null;

}

public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Name : ");
String name=sc.nextLine();

System.out.println(checkName(name));

System.out.print("Enter Marks in Maths : ");
double marks1=sc.nextDouble();
System.out.print("Enter Marks in English : ");
double marks2=sc.nextDouble();
System.out.print("Enter Marks in Hindi : ");
double marks3=sc.nextDouble();

System.out.println(checkMarks(marks1,marks2,marks3));

Student s=new Student();
s.name=name;
s.marks1=marks1;
s.marks2=marks2;
s.marks3=marks3;

System.out.println(buildResult(s));
}
catch(NullPointerException e)
{
System.out.println(e.getMessage());
}
catch(Exception e)
{
System.out.println(e);
}
}
}



//Exception class MarksNotFoundException

public class MarksNotFoundException extends Exception
{
public String toString()
{
return "Marks Not Found Exception ";
}
}



//Exception class StudentFailedException

public class StudentFailedException extends Exception
{
public String toString()
{
return "Student Failed Exception";
}
}


//Ques.2

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNameAndPassword
{
static boolean checkName(String name) throws InvalidNameException,InvalidLengthException
{
Pattern pattern=Pattern.compile("^[A-Z]+[a-zA-Z]+[a-zA-z0-9_.]+[a-z]$");
Matcher matcher=pattern.matcher(name);

if(name.length()==0)
{
throw new NullPointerException();
}
else if(name.length()>10)
{
throw new InvalidLengthException();
}
else if(matcher.find()==false)
{
throw new InvalidNameException();
}
return true;
}

static boolean checkPassword(String pass)
{
Pattern pattern=Pattern.compile("^[A-G]+[a-z0-9]+[$]$");
Matcher matcher=pattern.matcher(pass);
if (pass.length()>=5 && pass.length()<=10)
{
if(matcher.find()==true)
{
return true;
}
}
return false;
}

public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter name : ");
String name=sc.nextLine();

System.out.println(checkName(name));

System.out.print("Enter Password : ");
String pass=sc.nextLine();

System.out.println(checkPassword(pass));
}
catch(Exception e)
{
System.out.println(e);
}
}
}

public class InvalidLengthException extends Exception
{
public String toString()
{
return "Invalid Length Exception";
}
}



//AMISHA

//Ques.1

import java.lang.*;
import java.util.*;
 class Student {
	 String name;
	 double marks1;
	 double marks2;
	 double marks3;
	 public void setName(String n) {
		 this.name=n;
	 }
	 public String getName() {
		 return name;
	 }
	 public double setmarks1(double m1) {
		 this.marks1=m1;
	 }
	 public double getmarks1() {
		 return marks1;
	 }
	 public double setmarks2(double m2) {
		 this.marks2=m2;
	 }
	 public double getmarks2() {
		 return marks2;
	 }
	 public double setmarks3(double m3) {
		 this.marks3=m3;
	 }
	 public double getmarks3() {
		 return marks3;
	 }
	 class NullPointerException extends Exception{
		
		 }
		 class MarksNotFoundException extends Exception{
		 }
		 class StudentFailedException extends Exception{
			 
		 }
	 
	 
//TestStudent
	class TestStudent{
		String checkName(String name) {
			try {
				if(name.length()==0) {
					throw  NullPointerException("Name can not be blank");
				}
					else {
						return "Name is Valid";
				}
			}
				catch(NullPointerException e) {
					return e.getMessage();
				}
		}
  Boolean checkMarks(double marks1,double marks2,double marks3) {
	  {try {
		  if(marks1==0 && marks2!=0 && marks3!=0) {
			  return false;
		  }
		  else if(marks1==0 && marks2==0 && marks3!=0) {
			  return false;
		  }
		  else if(marks1==0 && marks2==0 && marks3==0) {
			  throw new MarksNotFoundException();
		  }
		  else if(marks1!=0 && marks2!=0 && marks3!=0) {
			  return true;
		  }
		  else {
			  return false;
		  }
	  }
			catch(MarksNotFoundException a)  {
				return false;
			}
	  }
		  }
	  String buildResult(double marks1,double marks2,double marks3 ) {
		  Double total=marks1+marks2+marks3;
		  Double percent=total/3.0;
		  try {
			  if(percent>=90)
				  return "Grade: Outstanding";
		else if(percent>=80)
			return "Grade: Excellent";
		else if(percent>=70)
			return "Grade: Very good";
		else if(percent>=60)
			return"Grade: Good";
		else if(percent>=50)
			return "Grade: Average";
		else
			throw new StudentFailedException();
		  }
		  catch(StudentFailedException b) {
			  return "Student Failed  " +b;
		  
	  }
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			TestStudent tc=new TestStudent();
			Student s1=new Student();
			Double marks1,marks2,marks3;
			
			System.out.println("Enter your name");
			s1.setName(sc.nextLine());
			System.out.println("Enter marks");
			
			s1.setmarks1(sc.nextDouble());
			s1.setmarks2(sc.nextDouble());
			s1.setmarks3(sc.nextDouble());
			
			String name;
			name=s1.getName();
			System.out.println("Check Name method");
			System.out.println(tc.checkName(name));
			
			marks1=s1.getmarks1();
			marks1=s1.getmarks2();
			marks1=s1.getmarks3();
			
			System.out.println("Check marks method");
			System.out.println(tc.checkMarks(marks1, marks2, marks3));
			
			System.out.println("Build Result Method");
			System.out.println(tc.checkMarks(marks1, marks2, marks3));
			
			
		}
	
 }
	}
	


//ALKA


//Ques.1

public class Student
{
String name;
double marks1;
double marks2;
double marks3;


public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}
public double getMarks1()
{
return marks1;
}
public void setMarks1(double marks1)
{
this.marks1 = marks1;
}
public double getMarks2()
{
return marks2;
}
public void setMarks2(double marks2)
{
this.marks2 = marks2;
}
public double getMarks3()
{
return marks3;
}
public void setMarks3(double marks3)
{
this.marks3 = marks3;
}
}


//TestStudent

import java.util.Scanner;

public class TestStudent
{
static String checkName(String name)
{
if (name.length()==0)
{
throw new NullPointerException("Name can not be blank");
}

return "Name is valid";

}
static boolean checkMarks(double marks1,double marks2,double marks3) throws MarksNotFoundException
{
if (marks1==0 && marks2==0 && marks3==0)
{
throw new MarksNotFoundException();
}
else if(marks1==0 || marks2==0 || marks3==0)
{
return false;
}
return true;
}
static String buildResult(Student s ) throws StudentFailedException
{
double total=s.marks1+s.marks2+s.marks3;
double percentage=total/3;

if (percentage>=90)
{
return "Grade : Outstanding";
}
else if(percentage>=80)
{
return "Grade : Excellent";
}
else if(percentage>=70)
{
return "Grade : Very Good";
}
else if(percentage>=60)
{
return "Grade : Good";
}
else if(percentage>=50)
{
return "Grade : Average";
}
else if(percentage<=50)
{
throw new StudentFailedException();
}
return null;

}

public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Name : ");
String name=sc.nextLine();

System.out.println(checkName(name));

System.out.print("Enter Marks in Maths : ");
double marks1=sc.nextDouble();
System.out.print("Enter Marks in English : ");
double marks2=sc.nextDouble();
System.out.print("Enter Marks in Hindi : ");
double marks3=sc.nextDouble();

System.out.println(checkMarks(marks1,marks2,marks3));

Student s=new Student();
s.name=name;
s.marks1=marks1;
s.marks2=marks2;
s.marks3=marks3;

System.out.println(buildResult(s));
}
catch(NullPointerException e)
{
System.out.println(e.getMessage());
}
catch(Exception e)
{
System.out.println(e);
}
}
}



//Exception class MarksNotFoundException

public class MarksNotFoundException extends Exception
{
public String toString()
{
return "Marks Not Found Exception ";
}
}



//Exception class StudentFailedException

public class StudentFailedException extends Exception
{
public String toString()
{
return "Student Failed Exception";
}
}


//Ques.2

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNameAndPassword
{
static boolean checkName(String name) throws InvalidNameException,InvalidLengthException
{
Pattern pattern=Pattern.compile("^[A-Z]+[a-zA-Z]+[a-zA-z0-9_.]+[a-z]$");
Matcher matcher=pattern.matcher(name);

if(name.length()==0)
{
throw new NullPointerException();
}
else if(name.length()>10)
{
throw new InvalidLengthException();
}
else if(matcher.find()==false)
{
throw new InvalidNameException();
}
return true;
}

static boolean checkPassword(String pass)
{
Pattern pattern=Pattern.compile("^[A-G]+[a-z0-9]+[$]$");
Matcher matcher=pattern.matcher(pass);
if (pass.length()>=5 && pass.length()<=10)
{
if(matcher.find()==true)
{
return true;
}
}
return false;
}

public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter name : ");
String name=sc.nextLine();

System.out.println(checkName(name));

System.out.print("Enter Password : ");
String pass=sc.nextLine();

System.out.println(checkPassword(pass));
}
catch(Exception e)
{
System.out.println(e);
}
}
}


public class InvalidLengthException extends Exception
{
public String toString()
{
return "Invalid Length Exception";
}
}


//ADRIKA

//Ques.1

public class Student
{
String name;
double marks1;
double marks2;
double marks3;


public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}
public double getMarks1()
{
return marks1;
}
public void setMarks1(double marks1)
{
this.marks1 = marks1;
}
public double getMarks2()
{
return marks2;
}
public void setMarks2(double marks2)
{
this.marks2 = marks2;
}
public double getMarks3()
{
return marks3;
}
public void setMarks3(double marks3)
{
this.marks3 = marks3;
}
}


import java.util.Scanner;

public class TestStudent 
{
	static String checkName(String name)
	{
		if (name.length()==0)
		{
			throw new NullPointerException("Name can not be blank");
		}
		
		return "Name is valid";
		
	}
	static boolean checkMarks(double marks1,double marks2,double marks3) throws MarksNotFoundException
	{
		if (marks1==0 && marks2==0 && marks3==0)
		{
			throw new MarksNotFoundException();
		}
		else if(marks1==0 || marks2==0 || marks3==0)
		{
			return false;
		}
		return true;
	}
	static String buildResult(Student s ) throws StudentFailedException
	{
		double total=s.marks1+s.marks2+s.marks3;
		double percentage=total/3;
				
		if (percentage>=90)
		{
			return "Grade : Outstanding";
		}
		else if(percentage>=80)
		{
			return "Grade : Excellent";
		}
		else if(percentage>=70)
		{
			return "Grade : Very Good";
		}
		else if(percentage>=60)
		{
			return "Grade : Good";
		}
		else if(percentage>=50)
		{
			return "Grade : Average";
		}
		else if(percentage<=50)
		{
			throw new StudentFailedException();
		}
		return null;
		
	}
	
	public static void main(String args[])
	{
		try 
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Name : ");
			String name=sc.nextLine();
			
			System.out.println(checkName(name));
			
			System.out.print("Enter Marks in Maths : ");
			double marks1=sc.nextDouble();
			System.out.print("Enter Marks in English : ");
			double marks2=sc.nextDouble();
			System.out.print("Enter Marks in Hindi : ");
			double marks3=sc.nextDouble();
			
			System.out.println(checkMarks(marks1,marks2,marks3));
			
			Student s=new Student();
			s.name=name;
			s.marks1=marks1;
			s.marks2=marks2;
			s.marks3=marks3;
			
			System.out.println(buildResult(s));
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//Ques.2

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNameAndPassword
{
static boolean checkName(String name) throws InvalidNameException,InvalidLengthException
{
Pattern pattern=Pattern.compile("^[A-Z]+[a-zA-Z]+[a-zA-z0-9_.]+[a-z]$");
Matcher matcher=pattern.matcher(name);

if(name.length()==0)
{
throw new NullPointerException();
}
else if(name.length()>10)
{
throw new InvalidLengthException();
}
else if(matcher.find()==false)
{
throw new InvalidNameException();
}
return true;
}

static boolean checkPassword(String pass)
{
Pattern pattern=Pattern.compile("^[A-G]+[a-z0-9]+[$]$");
Matcher matcher=pattern.matcher(pass);
if (pass.length()>=5 && pass.length()<=10)
{
if(matcher.find()==true)
{
return true;
}
}
return false;
}

public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter name : ");
String name=sc.nextLine();

System.out.println(checkName(name));

System.out.print("Enter Password : ");
String pass=sc.nextLine();

System.out.println(checkPassword(pass));
}
catch(Exception e)
{
System.out.println(e);
}
}
}

public class InvalidLengthException extends Exception
{
public String toString()
{
return "Invalid Length Exception";
}
}


//KHUSHI

//Ques.1

public class Student extends TestStudent {
 String name;
 double marks1;
 double marks2;
 double marks3;
public String getName() {
 return name;
}
public void setName(String name) {
 this.name = name;
}
public double getMarks1() {
 return marks1;
}
public void setMarks1(double marks1) {
 this.marks1 = marks1;
}
public double getMarks2() {
 return marks2;
}
public void setMarks2(double marks2) {
 this.marks2 = marks2;
}
public double getMarks3() {
 return marks3;
}
public void setMarks3(double marks3) {
 this.marks3 = marks3;
}
}

import java.util.Scanner;
public class TestStudent {
 static String checkName(String name){
  if (name.length()==0){
   throw new NullPointerException("Name can't be blank");
  }
  return "Name is valid";
 }
 static boolean checkMarks(double marks1,double marks2,double marks3) throws MarksNotFoundException{
  if (marks1==0 && marks2==0 && marks3==0){
   throw new MarksNotFoundException();
  }
  else if(marks1==0 || marks2==0 || marks3==0){
   return false;
  }
  return true;
 }
 static String buildResult(Student s ) throws StudentFailedException{
  double total=s.marks1+s.marks2+s.marks3;
  double percentage=total/3;
  if (percentage>=90){
   return "Grade : Otstndng";
  }
  else if(percentage>=80){
   return "Grade : Exclnt";
  }
  else if(percentage>=70){
   return "Grade : Vgood";
  }
  else if(percentage>=60){
   return "Grade : Gud";
  }
  else if(percentage>=50){
   return "Grade : Avrg";
  }
  else if(percentage<=50){
   throw new StudentFailedException();
  }
  return null;
 }
 public static void main(String args[]){
  try {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Name : ");
   String name=sc.nextLine();
   System.out.println(checkName(name));
   System.out.print("Enter Math's marks: ");
   double marks1=sc.nextDouble();
   System.out.print("Enter English's marks: ");
   double marks2=sc.nextDouble();
   System.out.print("Enter Hindi's marks : ");
   double marks3=sc.nextDouble();
   System.out.println(checkMarks(marks1,marks2,marks3));
   Student s=new Student();
   s.name=name;
   s.marks1=marks1;
   s.marks2=marks2;
   s.marks3=marks3;
   System.out.println(buildResult(s));
  }
  catch(NullPointerException e){
   System.out.println(e.getMessage());
  }
  catch(Exception e){
   System.out.println(e);
  }
 }
}

public class MarksNotFoundException extends Exception {
public String toString() {
 return "MarksNotFoundException";
}
}

public class StudentFailedException extends Exception {
 public String toString() {
  return "StudentFailedException";
}

Ques.2

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.naming.InvalidNameException;
public class TestNameAndPassword{
static boolean checkName(String name) throws InvalidNameException,InvalidLengthException{
Pattern pattern=Pattern.compile("^[A-Z]+[a-zA-Z]+[a-zA-z0-9_.]+[a-z]$");
Matcher matcher=pattern.matcher(name);
if(name.length()==0){
throw new NullPointerException();
}
else if(name.length()>10){
throw new InvalidLengthException();
}
else if(matcher.find()==false) {
throw new InvalidNameException();
}
return true;
}
static boolean checkPassword(String pass){
Pattern pattern=Pattern.compile("^[A-G]+[a-z0-9]+[$]$");
Matcher matcher=pattern.matcher(pass);
if (pass.length()>=5 && pass.length()<=10){
if(matcher.find()==true){
return true;
}
}
return false;
}
public static void main(String args[]){
try{
Scanner sc=new Scanner(System.in);
System.out.print("Enter name : ");
String name=sc.nextLine();
System.out.println(checkName(name));
System.out.print("Enter Password : ");
String pass=sc.nextLine();
System.out.println(checkPassword(pass));
}
catch(Exception e){
System.out.println(e);
}
}
}
public class InvalidLengthException extends Exception
{
public String toString()
{
return "Invalid Length Exception";
}
}

