package javaClass;

public class TelevisionEx1 {

	public static void main(String[] args) {
		RemoteControl rc; //��ü ����
		rc = new Television();
		rc.turnOn();
		rc.set_volume(4);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();

	}

}
