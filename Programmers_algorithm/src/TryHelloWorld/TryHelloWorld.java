package TryHelloWorld;

import java.util.Arrays;

class TryHelloWorld {
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];
		int tmp, r=1;
		int tmp1 = a;
		int tmp2 = b;

		if (a < b) {
			tmp = a;
			b = a;
			a = tmp;
		}
		
		while(r>0){//��Ŭ���� ȣ������ �̿��� GCD(�ִ�����)���ϱ�
            r = a % b;
            a = b;
            b = r;
         }
		
		answer[0] = a;
		answer[1] = tmp1* tmp2/a;;
		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		TryHelloWorld c = new TryHelloWorld();
		System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
	}
}
