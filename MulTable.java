public class MulTable{
	public static void main(String[] args){
		for(int i=1;i<10;i++){
			for (int j=1;j<=i;j++){
				int result=i*j;
				System.out.print(j+"*"+i+"="+result+"\t" );
			}
			System.out.println();
		}
	}
}