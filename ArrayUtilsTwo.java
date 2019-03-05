//Java数组章节练习题
import java.util.Arrays;
public class ArrayUtilsTwo{
	//1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
        for(int i=0;i<data.length-1;i++){
			if(data[i]>data[i+1]){
				int a=0;
				a=data[i];
				data[i]=data[i+1];
				data[i+1]=a;
			}
		}
        return data[data.length-1];
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int[] data){
        for(int i=0;i<data.length-1;i++){
			if(data[i]<data[i+1]){
				int a=0;
				a=data[i];
				data[i]=data[i+1];
				data[i+1]=a;
			}
		}
        return data[0];
    }
	//3.数组求和
	public static int arrayElement(int [] data){
	int sum=0;
	for(int i=0;i<data.length;i++){
	sum +=data[i];
	}
	return sum;
	}
    //4.数组拼接
	public static void arrayJion(int [] data1,int[] data2){
	int a=data1.length+data2.length;
	int[] nul=Arrays.copyOf(data1,a);
	System.arraycopy(data2,0,nul,data1.length,data2.length);
	printArray(nul);
	}
	//5.数组的截取
	public static void arraySub(int [] data,int start,int end){
	int a=end-start+1;
	int[] nul=new int[a];
	System.arraycopy(data,start,nul,0,a);
	printArray(nul);
	}
	//6.数组的打印
    public static void printArray(int [] data){
	for(int i=0;i<data.length;i++){
	System.out.print(data[i]+"\t");
	}
	}
	//7.数组的反转
	public static void printReversa(int [] data){
	for(int i=0;i<data.length/2-1;i++){
	 int a=0;
	 a= data[i];
	 data[i]=data[data.length-1-i];
	 data[data.length-1-i]=a;
	}
	printArray(data);
    }
	public static void main (String[] args){
		int[] temp1=new int[]{1,10,7,5,9,25,6};
		int[] temp2=new int[]{5,5,5,6,6};
		System.out.println("这组数的最大值是："+arrayMaxElement(temp1));
	    System.out.println("这组数的最小值是："+arrayMinElement(temp1));
		System.out.println("这组数的总和是："+arrayElement(temp1));
		System.out.println("两个数组的拼接结果是：");
		arrayJion(temp1,temp2);
		System.out.println();
		System.out.println("temp1数组的截取结果是：");
		arraySub(temp1,2,4);
		System.out.println();
		System.out.println("temp1数组的反转结果是：");
		printReversa(temp1);
		System.out.println();
}
}