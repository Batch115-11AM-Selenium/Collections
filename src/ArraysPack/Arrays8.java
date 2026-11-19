package ArraysPack;

public class Arrays8 {

	public static void main(String[] args) {
		String names[] = new String[11];
		
		names[1] = "Parrot";
		names[9] = "Raise";
		names[4] = "Building";
		names[7] = "King";
		names[2] = "Flag";
		names[8] = "Day";
		

		
		System.out.println("The Number of Stored elememnts : " +names.length);
		
		for(int r = 0 ; r < names.length ; r++)
		{
			System.out.println(names[r]);
		}	
		
		

	}

}
