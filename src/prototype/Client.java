package prototype;

public class Client {
	public static void main(String[] args) {
		Resume a = new Resume("大鸟");
		a.SetPersonalInfo("男", "22");
		a.setWorkExprience("2013-1016", "XXX公司");
		a.Display();
	}
}
