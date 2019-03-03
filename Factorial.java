public class Factorial{
	public static void main(String[] args){
		int a=10;
		int result=nul(a);
		System.out.println(result);
	}
	public static int nul(int n){
	if(n==1){
		return 1;
	}else{
		return n*nul(n-1);
	}
	}
}
