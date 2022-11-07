package pack;

public class Sort {

	public static void main(String[] args) {
		
		BubbleSort bs=new BubbleSort();
		int[] a= {8,6,10,15,2};
		bs.sort(a);
		
		for(int value:a)
			System.out.println("Sorted array:"+value);
		

	}

}
