package testExam;

public class Calculation {

	
	public static boolean decisionCoverage(boolean decision) {
		if(decision) {
			System.out.println("decision is true");
			return true;
		}
		else {
			System.out.println("decision is false");
			return false;

		}
		
	}
	
	public static int findMax(int arr[]) {
		
		
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculation c = new Calculation();
	c.decisionCoverage(true);
	}

}
