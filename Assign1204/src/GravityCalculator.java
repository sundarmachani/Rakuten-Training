
public class GravityCalculator {
	public static void main(String[] args) {
		double gravity = -9.81;
		double intialVelocity = 0.0;
		double fallingTime = 10.0;
		double intialPosition = 0.0;
		double finalPosition = ((0.5) * (gravity * fallingTime * fallingTime) + (intialVelocity * fallingTime) //x(t) = 0.5 × at*at + vit + xi
				+ intialPosition);
		System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
	}

}

//The object's position after 10.0 seconds is -490.50000000000006 m.
