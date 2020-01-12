
public class A {

	public static void main(String[] args) {
		DemoInterface demoInterface = new DemoInterface() {
			
			@Override
			public void demo() {
				System.out.println("Traditional way");				
			}
		};
		demoInterface.demo();
		
		DemoInterface demoInterface2 = ()->{
			System.out.println("Lambda way");
			System.out.println("Lambda way");
		};
		
		demoInterface2.demo();
	}

}
