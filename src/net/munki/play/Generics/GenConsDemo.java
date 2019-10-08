package net.munki.play.Generics;

class GenCons {
	private double val;
	
	<T extends Number> GenCons(T arg) {
		val = arg.doubleValue();
	}
	
	void showVal() {
		System.out.println("val : " + val);
	}
}

class GenConsDemo {
	public static void main(String args[]) {
		GenCons test = new GenCons(1);
		GenCons test2 = new GenCons(2.5);
		test.showVal();
		test2.showVal();
	}
}


