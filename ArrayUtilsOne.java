//Java数组章节练习题
public class ArrayUtilsOne{
	//1.计算数组中最大值
   public static void arrayMaxElement(int[] data){
        for(int i=0;i<data.length-1;i++){
			for(int j=0;j<data.length-i-1;j++){
				if(data[j]>data[j+1]){
					int a=0;
					a=data[j];
					data[j]=data[j+1];
					data[j+1]=a;
				}
			}
		}
        for(int temp:data){
			System.out.print(temp+"\t");
		}
    }
	public static void main (String[] args){
		int[] temp=new int[]{1,10,7,5,9,25,6};
		//int maxArray=arrayMaxElement(temp);
         arrayMaxElement(temp);
	}
}
