package miniProject;

public class StudentImpl {
	String id, name, grade; 
	int feesPaid;
	int feesTotal=50000;
	int days;
	int totalDays;
	public StudentImpl(String id, String name, String grade, int feesPaid, int feesTotal) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = feesPaid;
		this.feesTotal = feesTotal;
		this.days=days;
		this.totalDays=totalDays;
		
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
	public int getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getFeesTotal() {
		return feesTotal;
	}
	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
	
	
	public void feesCal(int feesPaid) {
		 int feesrem = (feesTotal-feesPaid);
		 System.out.println("Total fees Paid= "+feesPaid);
		 System.out.println("Total fees= "+feesTotal);
		 System.out.println("Total fees to be paid = "+feesrem);
		 
	}
	
	public void attendancePercent(int days) {
		
		
		
		if(days<=10) {
			double percent=((days*50)/100);
			System.out.println(percent);
		}else if(days<=20){
			double percent=((days*50)/100); 
			System.out.println(percent);
		}
		
		
	}
	@Override
	public String toString() {
		return "StudentImpl [id=" + id + ", name=" + name + ", grade=" + grade + ", feesPaid=" + feesPaid
				+ ", feesTotal=" + feesTotal + "]";
	}
	

}
