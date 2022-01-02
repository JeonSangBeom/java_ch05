package lecture;

public class Iphone implements MobilePhoneInterface {

	@Override
	public void sendCall() {
	}
	@Override
	public void receiveCall() { //PhoneInterface 에서 MobilePhoneInterface이 상속 받아서 불러온 것 
	}
	@Override
	public void sendSMS() {
	}
	@Override
	public void receiveSMS() {//MobilePhoneInterface을 구현하여 불러온 것
	}
}
