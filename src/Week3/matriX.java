 package Week3;

public class matriX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double [][] matrix = new double[3][3];
	
    		matrix [0][0] = 1;
    		matrix [0][1] = 5;
    		matrix [0][2] = 1;
    		matrix [1][0] = 4;
    		matrix [1][1] = 9;
    		matrix [1][2] = 4;
    		matrix [2][0] = 6;
    		matrix [2][1] = 8;	
    		matrix [2][2] = 8;
	
    double [][] matriX = new double [3][3];
	
			matriX [0][0] = 8;
			matriX [0][1] = 9;
			matriX [0][2] = 8;
			matriX [1][0] = 7;
			matriX [1][1] = 5;
			matriX [1][2] = 0;
			matriX [2][0] = 7;
			matriX [2][1] = 14;
			matriX [2][2] = 75;

	double [][] MatriX = new double [3][3];

			MatriX [0][0] = (matrix[0][0]*matriX[0][0])+(matrix[0][1]*matriX[1][0])+(matrix[0][2]*matriX[2][0]);
			MatriX [0][1] = (matrix[0][0]*matriX[0][1])+(matrix[0][1]*matriX[1][1])+(matrix[0][2]*matriX[2][1]);
			MatriX [0][2] = (matrix[0][0]*matriX[0][2])+(matrix[0][1]*matriX[1][2])+(matrix[0][2]*matriX[2][2]);
			MatriX [1][0] = (matrix[1][0]*matriX[0][0])+(matrix[1][1]*matriX[1][0])+(matrix[1][2]*matriX[2][0]);
			MatriX [1][1] = (matrix[1][0]*matriX[0][1])+(matrix[1][1]*matriX[1][1])+(matrix[1][2]*matriX[2][1]);
			MatriX [1][2] = (matrix[1][0]*matriX[0][2])+(matrix[1][1]*matriX[1][2])+(matrix[1][2]*matriX[2][2]);
			MatriX [2][0] = (matrix[2][0]*matriX[0][0])+(matrix[2][1]*matriX[1][0])+(matrix[2][2]*matriX[2][0]);
			MatriX [2][1] = (matrix[2][0]*matriX[0][1])+(matrix[2][1]*matriX[1][1])+(matrix[2][2]*matriX[2][1]);
			MatriX [2][2] = (matrix[2][0]*matriX[0][2])+(matrix[2][1]*matriX[1][2])+(matrix[2][2]*matriX[2][2]);
	
	
	for (int i = 0; i < MatriX.length; i++) {
				
			System.out.println();
	
			for (int j = 0; j < MatriX[i].length; j++) {
		
					System.out.println(MatriX[i][j]);

	}
	}
}
}
