package miniProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import attendenceManagement.Teachers;

public class TestMain {

	private static String remFees;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	   
	    System.out.println("--------------------WELCOME TO THE ABC INSTITUTION----------------------");
	    
	    char ch;
	    do {
	    	System.out.println("Select your option");
	    	System.out.println("1.Admin ");//doing add,delete,modify the teacher and student details
	    	System.out.println("2.Student ");//going to show fees details
	    	
		    int op=Integer.parseInt(bufferedReader.readLine());
		    switch(op)
		    {
		    case 1://admin
				Admin admin=new Admin("12","Sanjay","50000","8300433591");
				Admin adminStud=new Admin("1", "Kumar", "10", "10000");
				char ch1;
				do {
					System.out.println("Which action you want to do...");
					
			        System.out.println("1 for adding student ");
			        System.out.println("2 for view student ");
			        System.out.println("3 for delete student ");
			         
			         int op1 = Integer.parseInt(bufferedReader.readLine());
			         switch(op1) {//Adding the teachers details
			        
		            case 1://add student 
			        	 System.out.println("ENter the Student details...id, name , grade, feespaid");
			        	 Student student = new Student(bufferedReader.readLine(), bufferedReader.readLine(),bufferedReader.readLine(), bufferedReader.readLine());
			        	 adminStud.addStudent(student);
			        	 break;
			         case 2://view student
			        	 adminStud.viewStudentList();
			        	 break;
			         case 3://delete student
			        	 System.out.println("Enter the id to delete");
			        	 
			        	 adminStud.removeStudentById(bufferedReader.readLine());
			        	 break;
			        
			        }
		               
			         System.out.println("Do you want to continue");

					ch1=bufferedReader.readLine().charAt(0);
				}while(ch1=='y'||ch1=='Y');
				break;
		    case 2://student details fees total feespaid balance and attendence percentage
		    
		    	StudentImpl studentimpl =new StudentImpl("12","SanjayKumar","5", 3,50000);
		    	char ch2;
		    	do {
		    		System.out.println("Select the option");
		    		System.out.println("1 For Student attendance ");
		    		System.out.println("2 For fees details");
		    		int op3=Integer.parseInt(bufferedReader.readLine());
		    		
		    		switch(op3) {
		    		case 1://student attendance
		    			
		    			int days;
						studentimpl.attendancePercent(10);
		    			break;
		    		case 2://student fees details
		    			//System.out.println("Enter the fees paid");
		    			
		    		
		    			studentimpl.feesCal(4500);
		    			break;
		    		}
		    		ch2=bufferedReader.readLine().charAt(0);
		    	}while(ch2=='y'||ch2=='Y');
	        	

		    }

            System.out.println("Do you want to continue");

		    ch = bufferedReader.readLine().charAt(0);
	    }while(ch=='y'||ch=='Y');
		
	
		
		 
		
		
		
	}

}
