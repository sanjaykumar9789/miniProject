package miniProject;

public class Student {
	private String id;
	private String name;
	private String grade;
	private String feesPaid;
	private String feesTotal="500000";
	
	//creating constructor 
	public Student(String id, String name, String grade, String feesPaid) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = feesPaid;
		this.feesTotal = feesTotal="";
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


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getFeesPaid() {
		return feesPaid;
	}


	public void setFeesPaid(String feesPaid) {
		this.feesPaid = feesPaid;
	}


	public String getFeesTotal() {
		return feesTotal;
	}


	public void setFeesTotal(String feesTotal) {
		this.feesTotal = feesTotal;
	}

	


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", feesPaid=" + feesPaid + ", feesTotal="
				+ feesTotal + "]";
	}






	
	
	
	
	
	
	
	
	
	
	

}



