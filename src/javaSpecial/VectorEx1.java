package javaSpecial;

import java.util.List;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("�ڷγ�", "�ڷγ� �ݸ� 1���� �ǹ�", "ȫ�浿"));
		list.add(new Board("�ڹٱ���", "����Ʈ������ ����", "��ö��"));
		list.add(new Board("�ڹ�������", "Ŭ����,�������̽� .... API", "�̿���"));
		
		for(int i=0;i<list.size();i++) {
			Board board = list.get(i);
			System.out.println("���� : "+board.subject);
			System.out.println("���� : "+board.content);
			System.out.println("�۾��� : "+board.writer);
			System.out.println("=============================");
		}

	}

}
