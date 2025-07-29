package task.javafundamentals;

public class Exercise10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix=
				{{3,5,6},
				{5,7,8},
				{6,8,2}};
		int temp;
		for(int i=0;i<3;i++) {
			for(int j=i;j<3;j++) {
				temp = matrix [i][j];
				matrix [i][j]=matrix [j][i];
				matrix [j][i]=temp;
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
