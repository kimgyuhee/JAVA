/***************************
���ϸ�: DirectedMatrixGraphTest.java
�ۼ���: �����
�ۼ���: 2018. 12. 02
���α׷� ����: adjacency matrix�� ������ directed graph�� ���̿켱Ž���� �����Ѵ�.
 ***************************/
package hw10_1;

import java.util.Scanner;

public class DirectedMatrixGraphTest {
	public static void main(String[] args) {
		System.out.println("hw10_1 : �����");

		// ���� �� n �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �� �Է�: ");
		int n = scan.nextInt();

		// ���� ���� n�� ���� �׷����� ����
		DirectedMatrixGraph graph = new DirectedMatrixGraph(n);

		// ���� �� e �Է�
		System.out.print("���� �� �Է�: ");
		int e = scan.nextInt();

		// e���� ����(���� ��)�� �Է¹޾� �׷����� ����
		System.out.println(e + "���� ������ �Է��ϼ���(�� ������ ���� ��ȣ 2���� whitespace�� �����Ͽ� �Է�):");
		for(int i = 0; i < e; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			graph.addEdge(v1, v2);
		}

		// �� ������ ���� �������� ���
		System.out.println();
		for(int i = 0; i < n; i++) {
			System.out.print("���� " + i + "�� ������ ���� = ");
			graph.printAdjacentVertices(i);
		}

		System.out.println();
		for(int i = 0; i < n; i++)
			graph.depthFirstSearch(i);

	}
}