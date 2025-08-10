package employeeMenu_pkg;

public class LeavesDetails {
	
	int total_earned_leaves;
	int used_earned_leaves;
	int total_casual_leaves;
	int used_casual_leaves;
	
	public LeavesDetails(int total_earned_leaves,int used_earned_leaves,int total_casual_leaves,int used_casual_leaves) {	
		this.total_earned_leaves = total_earned_leaves;
		this.used_earned_leaves = used_earned_leaves;
		this.total_casual_leaves = total_casual_leaves;
		this.used_casual_leaves = used_casual_leaves;	
	}
	
	public void display() {
		System.out.println("-----Leaves details------");
		System.out.println("Total earned leaves    : "+total_earned_leaves);
		System.out.println("Used earned leaves     : "+used_earned_leaves);
		System.out.println("Remaining earned leaves: "+(total_earned_leaves-used_earned_leaves));
		System.out.println("Total casual leaves    : "+total_casual_leaves);
		System.out.println("Used casual leaves     : "+used_casual_leaves);
		System.out.println("Remaining casual leaves: "+(total_casual_leaves-used_casual_leaves));

	}

}
