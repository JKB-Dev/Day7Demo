
public class RobotDemo {

	public static void main(String[] args) {
		
		Robot[] robotArr = new Robot[2]; // an Array can also contain objects
		robotArr[0] = new Robot("Grant Chirpus", 5);
		
		for (Robot r : robotArr) {
			System.out.println(r);
		}
	}

}
