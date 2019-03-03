import java.util.Arrays;
public class Array{
	public static void main(String[] args){
		int[] data=new int[]{1,4,3,4,55,77,6,9,8};
           //输出最大值和最小值
		   //java.until.Arrays.sort(data);
		   java.util.Arrays.sort(data) ;
		   System.out.println("这组数的最大值是："+data[data.length-1]);
		   System.out.println("这组数的最小值是："+data[0]);
		   System.out.println("这组数的平均数是："+average(data));
		   System.out.println("这组数的综合数是："+sum(data));
	}
	//这个方法是用来求平均值
	public static float average(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=a[i]+sum;
		}
		float aver=sum/a.length;
		return aver;
	}
	//这个方法是用来求综合数的
	public static int sum(int[] b){
		int sum=0;
		for(int i=0;i<b.length;i++){
			sum=b[i]+sum;
		}
		return sum;
	}
}