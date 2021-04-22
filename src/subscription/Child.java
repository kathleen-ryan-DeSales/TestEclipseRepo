package subscription;

public class Child extends Parent implements InterfaceTest{

	/***
	 * Abstract Method Overriden by child
	 */
	@Override
	void silly() {
		System.out.println("Overode Abstract");
	}

	/***
	 * Interface Method in Child
	 */
	@Override
	public void interfaceMethod() {
		System.out.println("Overode Interface");
	}
}
