package javaSpecial;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Message> mq = new LinkedList<Message>();
		mq.offer(new Message("�̸���","ȫ�浿"));
		mq.offer(new Message("SMS","��ö��"));
		mq.offer(new Message("īī����","�����"));
		while(!mq.isEmpty()) {
			Message message = mq.poll();
			System.out.println(message.getEmail() + "��(��) "+message.getPerson() + "���� �����ϴ�.");
			
		}

	}

}
