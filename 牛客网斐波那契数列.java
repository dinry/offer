package sword2offer;
//牛客网斐波那契数列
public class offer7 {
	//递归
	public static int Fibonacci(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
	}
	//非递归，避免stack overflow
	public static int Fibonacci_1(int n) {
		int a=0;
		int b=1;
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int i=2;
		int sum=0;
		while(i<=n) {
			sum=a+b;
			a=b;
			b=sum;
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=0;
		System.out.println(Fibonacci_1(10000));

	}

}
