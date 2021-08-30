package Programs;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] numArray = {1,2,3,4,5};
        double sum = 0.0;

        for (double num: numArray) {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);

	}

}
