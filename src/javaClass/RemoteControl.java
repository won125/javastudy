package javaClass;
//������
public interface RemoteControl {
	//���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻�޼���
	void turnOn();//���� on
	void turnOff();//���� off
	void up_chennel();
	void down_chennel();
	void set_volume(int volume);
	//����Ʈ�޼���
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó�� �մϴ�.");
		}else {
			System.out.println("���� ���� �մϴ�.");
		}
	}
	//�����޼���
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}

}
