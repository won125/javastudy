package javaClass;

public class Audio implements RemoteControl{

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�");
		
	}

	@Override
	public void up_chennel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void down_chennel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set_volume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + this.volume);
		
	}

}
