package java_data_types;

abstract class Excercise {
	abstract void cardio();

	abstract void strength();

	abstract void stretch();

}

abstract class routine extends Excercise {
	void cardio() {
		System.out.println("Today do cardio");
	}

	void strength() {
		System.out.println("Today do strenght training");
	}

	abstract void stretch();
}

class times extends routine {
	void crosstraining1() {
		System.out.println("Today do 20mn crosstraining");
	}

	void stretch() {
		System.out.println("Stretching today");
	}

}

public class Day20_Excercise {

	public static void main(String[] args) {
		times a = new times();
		a.cardio();
		a.crosstraining1();
		a.strength();
		a.stretch();
	}

}
