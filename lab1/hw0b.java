public class hw0b{
	public static int max(int[] m){
		int i=0;
		int max=m[0];
        while (i<m.length){
        	if(m[i]>max){
        		max=m[i];
        	}
        i++;
        }
        return max;  
	}
	public static void main(String[] args){
		int[] numbers=new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.print(max(numbers));
	}
}