package javaClass;

import java.io.Serializable;

public class smartTelevision implements RemoteControl, Searchable{

	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url + "�� �̻��մϴ�.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("����Ʈ TV�� ŵ�ϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("����Ʈ TV�� ���ϴ�.");
		
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
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
		
	}	

}
