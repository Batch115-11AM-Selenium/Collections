package ArraysPack;

public class MultiDimensionalArrays2 {

	public static void main(String[] args) {
		Object names[][] = new Object[2][5];
		
		names[1][2] = false;
		names[0][2] = 462352;
		names[1][1] = -34523.5D;
		names[0][1] = 5224;
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
