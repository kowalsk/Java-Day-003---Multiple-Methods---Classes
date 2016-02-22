public class Start {
	Start() {
		System.out.println("Constructor of Start class.");
	}

	void computer_method() {
		System.out.println("Power gone! Shut down your PC soon...");
	}

	public static void main(String[] args) {
		Start my = new Start();
		Laptop your = new Laptop();

		my.computer_method();
		your.laptop_method();
		
		Methods.staticMethod();
		Methods other = new Methods();
		other.nonStaticMethod();
	}
}