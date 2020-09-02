
public class Calculate {
	
	public int calc (int arr[]) {
		
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
	
public int calc (int arr[], int arr1[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i] + arr1[i];
		}
		
		double sgpa = (float)sum / 50;
		System.out.println(sum);
		System.out.printf("%.2f", sgpa);
		return 0;
		
	}

}
