package javaClass;
//�ٱ�Ŭ����
public class Button {
	
	OnClickListener listener; // �������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}

	//�������̽�
	interface OnClickListener{
		//�߻� �޼���	
		void onClick();
	}

}
