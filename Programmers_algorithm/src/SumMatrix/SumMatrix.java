package SumMatrix;
class SumMatrix {
	int[][] sumMatrix(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][A[0].length];
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[0].length; j++) {
				answer[i][j] = A[i][j] + B[i][j];
			}
		}
		
		//������
		for(int m=0; m<answer.length; m++) {
			for(int n=0; n<answer[0].length; n++) {
				System.out.print(answer[m][n] + " ");
			}
			System.out.println();
		}

		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = {{ 9,7,4,1}, {6,7,3,9}, {4,8,9,7}};
		int[][] B = {{2,4,2,7}, {5,7,7,4}, {5,4,9,10}};
		int[][] answer = c.sumMatrix(A, B);
		if (answer[0][0] == 11 && answer[0][1] == 11 && answer[0][2] == 6 && answer[0][3] == 8
			&&answer[1][0] == 11 && answer[1][1] == 14 && answer[1][2] == 10 && answer[1][3] == 13
			&&answer[2][0] == 9 && answer[2][1] == 12 && answer[2][2] == 18 && answer[2][3] == 17) {
			System.out.println("�¾ҽ��ϴ�. ������ ���� ������");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�. �����ϴ°� ���ھ��");
		}
	}
}
