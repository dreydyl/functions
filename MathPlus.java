package functions;

public final class MathPlus {

	/** <b><u>MathPlus Class</u></b>
	 * <br>
	 * The class MathPlus provides useful math functions as a plus to the final class Math.<br>
	 */
	public MathPlus() {}

	public static double sum(double...values) {
		double sum = 0;
		for(double value:values) {
			sum += value;
		}
		return sum;
	}
	public static double reciprocal(double value) {
		return 1/value;
	}
	public static double invSum(double...values) {
		int sum = 0;
		for(double value:values) {
			sum += reciprocal(value);
		}
		return reciprocal(sum);
	}
	public static double mean(double...values) {
		int tValues = 0;
		double tValue = 0;
		for(double value:values) {
			tValues++;
			tValue += value;
		}
		return tValue/tValues;
	}
	public static double mean(int...values) {
		int tValues = 0;
		double tValue = 0;
		for(double value:values) {
			tValues++;
			tValue += value;
		}
		return tValue/tValues;
	}
	public static double median(double...values) {
		return values[0];
	}
	public static double mode(double...values) {
		double mode = values[0];
		double highestCount = 1;
		for(double x:values) {
			double count = 0;
			for(double y:values) {
				if(x == y) {
					count++;
				}
			}
			if(count > highestCount) {
				mode = x;
			}
		}
		return mode;
	}
	public static double pctDifference(double n1,double n2) {
		return Math.abs(n1-n2) / ((Math.abs(n1) > Math.abs(n2)) ? n1 : n2);
	}
	public static double pctDifference(int n1, int n2) {
		return pctDifference((double)(n1),(double)(n2));
	}
	public static double geoMean(double...values) {
		double product = 1;
		for(double x:values) {
			product *= x;
		}
		return Math.sqrt(product);
	}
	public static double harMean(double...values) {
		double numerator = 0;
		double denominator = 0;
		for(double x:values) {
			numerator++;
			denominator += x;
		}
		return numerator/denominator;
	}
	public static double stnDeviation(double...set) {
		
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(MathPlus.harMean(5,2,5,5,4,4,3,4,4,4,2,6,4,1,2,4,4,8,12));
	}

}
