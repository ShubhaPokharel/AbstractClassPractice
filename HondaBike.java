abstract class HondaBike{
		abstract void speed(int number);
		abstract void milage(double mil);
}
class Unicorn extends HondaBike{
	void speed(int number){
		if(number > 100){
			System.out.println("You are  caught. You speed is greater than 100");
		}
		else if(number > 90 && number <=  100){
			System.out.println("Your speed is between 90 and 100");
		}

		else if(number >= 80 && number <=  90){
			System.out.println("Your speed is between 80 and 90");
		}
		else if(number == 0){
			System.out.println("You need to start driving. Your speed is 0");
		}

		else{
			System.out.println("You are a good driver. Your speed is less than 80");
		}
	}
	void milage(double mil){
		if(mil > 5000){
			System.out.println("Oil change required in your car");
		}
		else{
			System.out.println("You are good, you dont need oil change");
		}
	}
}

class Shine extends HondaBike{
	void speed(int number){
		int speed = 95;

		switch(speed){
			case 80:
				System.out.println("Your speed is 80");
				break;
			case 90:
				System.out.println("Your speed is 90. Be careful");
				break;

			case 95:
				System.out.println("Your speed is 95. You are over speeded");
				break;

			default:
				System.out.println("Always drive carfully");
				break;
		}
	}

	void milage(double mil){
		if(mil > 5000){
			System.out.println("Oil change required in your car");
		}
		else{
			System.out.println("You are good, you dont need oil change");
		}
	}

}

class Test{
	public static void main(String[] args){
		Unicorn uni = new Unicorn();
		uni.speed(79);
		uni.speed(0);
		uni.speed(100);
		uni.speed(60);

		uni.milage(90.983);
		uni.milage(0.79);
		uni.milage(1000.9);


		Shine shi = new Shine();
		// shi.speed(95);
		shi.speed(0);
		// shi.speed(90);
		// shi.speed(80);


	}
}