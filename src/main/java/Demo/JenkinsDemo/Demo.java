package Demo.JenkinsDemo;

public class Demo {
	int sum(int a , int b) {
		return a+b;
	}
	int diff(int x , int y ) {
		return x-y;
	}
	

	public static void main(String[] args) {
		Demo d =new Demo();
		System.out.println("sum is : "+d.sum(10, 20));
		System.out.println("Diff is : "+d.diff(44, 22));
		

	}

}
