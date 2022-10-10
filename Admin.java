package miniProject;
//package miniProject;


public class Admin {
	private String id,name,password,emailId;
	
	Student[] studentList = new Student[15];
	static int count=0;
	public Admin(String id, String name, String password, String emailId) {
		super();
		this.id = id;
		this.name = name;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	
	}
	
	
		
	

		
	
	
	
	
	public void addStudent(Student student) {
		studentList[count++]=student;
		
	}

	public void viewStudentList()
	{
		for(int i =0;i<count;i++)
		{
			System.out.println("Student list  : "+studentList[i]);
		}
		
		
		}

		/**/
	public void removeStudentById(String id)
	{   int pos=-1;
		for(int i=0;i<count;i++)
		{
			if(studentList[i].getId().equals(id))
			{
				pos= i;
				break;
			}
		}
		for(int i=pos;i<count;i++)
		{
			studentList[i] = studentList[i+1];
			
		}
		if(pos>=0)
		{
			count--;
		}
		}
	
	

	


}
