
public class Calculate {
	
	public int calcCGPA (int arr[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		double cgpa = (float)sum / 25;
		System.out.println(sum);
		System.out.printf("%.2f", cgpa);
		System.out.println(" ");
		return 0;
		
	}
	
	public int TEcalcCGPA (int arr[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		double cgpa = (float)sum / 23;
		System.out.println(sum);
		System.out.printf("%.2f", cgpa);
		System.out.println(" ");
		return 0;
		
	}
	
	public int BEcalcCGPA (int arr[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		double cgpa = (float)sum / 22;
		System.out.println(sum);
		System.out.printf("%.2f", cgpa);
		System.out.println(" ");
		return 0;
		
	}
	
	public int FEcalcSGPA (int arr[], int arr1[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i] + arr1[i];
		}
		
		double sgpa = (float)sum / 50;
		System.out.println(sum);
		System.out.printf("%.2f", sgpa);
		return 0;
		
	}

	public int SEcalcSGPA (int arr[], int arr1[]) {
	
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			sum = sum + arr1[i];
		}
		
		double sgpa = (float)sum / 50;
		System.out.println(sum);
		System.out.printf("%.2f", sgpa);
		return 0;
	
	}

	public int TEcalcSGPA (int arr[], int arr1[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			sum = sum + arr1[i];
		}
		
		double sgpa = (float)sum / 46;
		System.out.println(sum);
		System.out.printf("%.2f", sgpa);
		return 0;
		
	}

	public int BEcalcSGPA (int arr[], int arr1[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			sum = sum + arr1[i];
		}
		
		double sgpa = (float)sum / 44;
		System.out.println(sum);
		System.out.printf("%.2f", sgpa);
		return 0;
		
	}

}
