package ArraysPack;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		String names[][] = new String[2][5];
		
		names[1][2] = "OneTwo";
		names[0][2] = "ZeroTwo";
		names[1][1] = "OneOne";
		names[0][1] = "ZeroOne";
		names[1][3] = "OneThree";
		names[0][3] = "ZeroThree";
		names[1][4] = "OneFour";
		names[0][4] = "ZeroFour";
		names[1][0] = "OneZero";
		names[0][0] = "ZeroZero";
		
		
		for(int r = 0 ; r < names.length ; r++)
		{
			for(int c = 0 ; c < 5 ; c++)
			{
				System.out.print(names[r][c] +"   ");
			}
			System.out.println();
		}
		
	}

}
