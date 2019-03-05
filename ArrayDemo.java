//import java.util.Arrays;
public class ArrayDemo{
public static void main(String[] args) {
int[] dataA = new int[]{1,2,3,4,5,6,7,8,9};
for (int temp : dataA) {
System.out.println(temp);
}
int[] dataB = new int[]{11,22,33,44,55,66,77,88,99} ;
System.arraycopy(dataB,4,dataA,1,3) ;
printArray(dataA) ;
}
public static void printArray(int[] temp) {
for (int i = 0 ; i<temp.length ; i++) {
System.out.println(temp[i]) ;
}
System.out.println();
}
}


/*import java.util.Arrays;
public class ArrayDemo{
public static void main(String[] args) {
int[] original = new int[]{1,3,5,7,9};
int[] result = Arrays.copyOf(original,10);
for (int temp : result) {
System.out.println(temp);
}
}
}*/
