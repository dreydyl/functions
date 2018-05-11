package functions;

public final class Logic {

	/** <b><u>Logic Class</u></b>
	 * <br>
	 * The class Logic makes boolean expressions into functions.<br>
	 * <br>
	 * <u>How to read a truth table</u><br>
	 * The two letters at the top are variables.
	 */
	public Logic() {}

	public final static boolean TRUE = true;
	public final static boolean FALSE = false;
	/** <b><u>AND</u></b>
	 * <br>
	 * Takes in two boolean variables, X and Y, and returns a boolean equivalent to (X && Y)
	 * as seen in the truth table below<br>
	 * 	<br>
	 * 	<table>
  	 * 		<b><tr> <th>X</th><th>Y</th><th>Z</th> </tr></b>
  	 * 		<tr> <td>0</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>1</td> </tr>
     * 	</table><br>
     * If X is true and Y is true, then Z is true. Otherwise Z is false.<br>
     *  <br>
     * For more info on how to read the truth table see the Logic javadoc
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean AND(boolean X,boolean Y) {
		System.out.println(X+" AND "+Y+" = "+(X && Y));
		return X && Y;
		}
	/** <b><u>AND</u></b>
	 * <br>
	 * Takes in more than two boolean variables, X and an array of booleans Ys, and returns a
	 * boolean equivalent to (X && Y[0] && Y[1] &&...)<br>
	 * 	<br>
     * If X is true and all Ys are true, then Z is true. Otherwise Z is false.<br>
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean AND(boolean X,boolean...Ys) {
		boolean Z = X;
		for(boolean Y:Ys) { Z = AND(Y,Z); }
		return Z;
	}
	/** <b><u>OR</u></b>
	 * <br>
	 * Takes in two boolean variables, X and Y, and returns a boolean equivalent to (X || Y)
	 * as seen in the truth table below<br>
	 * 	<br>
	 * 	<table>
  	 * 		<b><tr> <th>X</th><th>Y</th><th>Z</th> </tr></b>
  	 * 		<tr> <td>0</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>1</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>1</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>1</td> </tr>
     * 	</table><br>
     * If X is true or Y is true, then Z is true. Otherwise Z is false.<br>
     *  <br>
     * For more info on how to read a truth table see Logic javadoc.
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean OR(boolean X,boolean Y) {
		System.out.println(X+" OR "+Y+" = "+(X || Y));
		return X || Y;
		}
	/** <b><u>OR</u></b>
	 * <br>
	 * Takes in more than two boolean variables, X and an array of booleans Ys, and returns a
	 * boolean equivalent to (X || Y[0] || Y[1] ||...)<br>
	 * 	<br>
     * If X is true or any Ys are true, then Z is true. Otherwise Z is false.<br>
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean OR(boolean X,boolean...Ys) {
		boolean Z = X;
		for(boolean Y:Ys) { Z = OR(Y,Z); }
		return Z;
	}
	/** <b><u>NOT</u></b>
	 * <br>
	 * Takes in more than a boolean variable, X, and returns a boolean equivalent to !X<br>
	 * 	<br>
     * If X is true, then Z is false. Otherwise Z is true.<br>
	 * @param X
	 * @return Z
	 */
	public static boolean NOT(boolean X) {
		System.out.println("NOT "+X+" = "+!X);
		return !X;
		}
	/** <b><u>NAND</u></b>
	 * <br>
	 * Takes in two boolean variables, X and Y, and returns a boolean equivalent to !(X && Y)
	 * as seen in the truth table below<br>
	 * 	<br>
	 * 	<table>
  	 * 		<b><tr> <th>X</th><th>Y</th><th>Z</th> </tr></b>
  	 * 		<tr> <td>0</td><td>0</td><td>1</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>0</td> </tr>
     * 	</table><br>
     * If X is true and Y is true, then Z is false. Otherwise Z is true.<br>
     * Also equivalent to (!X || !Y).<br>
     *  <br>
     * For more info on how to read a truth table see Logic javadoc.
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean NAND(boolean X,boolean...Y) { return NOT(AND(X,Y)); }
	/** <b><u>NOR</u></b>
	 * <br>
	 * Takes in two boolean variables, X and Y, and returns a boolean equivalent to !(X || Y)
	 * as seen in the truth table below<br>
	 * 	<br>
	 * 	<table>
  	 * 		<b><tr> <th>X</th><th>Y</th><th>Z</th> </tr></b>
  	 * 		<tr> <td>0</td><td>0</td><td>1</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>1</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>1</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>0</td> </tr>
     * 	</table><br>
     * If X is true and Y is true, then Z is false. Otherwise Z is true.<br>
     * Also equivalent to (!X && !Y).<br>
     *  <br>
     * For more info on how to read a truth table see Logic javadoc.
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean NOR(boolean X,boolean...Y) { return NOT(OR(X,Y)); }
	/** <b><u>XOR</u></b>
	 * <br>
	 * Takes in two boolean variables, X and Y, and returns a boolean equivalent to (X ^ Y)
	 * as seen in the truth table below<br>
	 * 	<br>
	 * 	<table>
  	 * 		<b><tr> <th>X</th><th>Y</th><th>Z</th> </tr></b>
  	 * 		<tr> <td>0</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>1</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>1</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>0</td> </tr>
     * 	</table><br>
     * If X is true or Y is true, then Z is true. If X is true and Y is true, then Z is false.
     * Otherwise Z is false.<br>
     * <br>
     * Also equivalent to ((X && !Y) || (!X && Y))<br>
     * or ((X || Y) && !(X && Y)).<br>
     *  <br>
     * For more info on how to read a truth table see Logic javadoc.
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean XOR(boolean X,boolean Y) { return X^Y; }
	/** <b><u>XOR</u></b>
	 * <br>
	 * Takes in more than two boolean variables, X and an array of booleans Ys, and returns a
	 * boolean equivalent to<br>((X && !Y[0] && !Y[1] &&...) || (!X && Y[0] && !Y[1]...)
	 * || (X && Y[0] && !Y[1]...) ||...)<br>
	 * Example truth table:
	 * 	<br>
	 * 	<table>
  	 * 		<b><tr> <th>W</th><th>X</th><th>Y</th><th>Z</th> </tr></b>
  	 * 		<tr> <td>0</td><td>0</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>0</td><td>0</td><td>1</td><td>1</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>0</td><td>1</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>1</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>1</td><td>1</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>1</td><td>0</td> </tr>
     * 	</table><br>
     * If X is true or any Ys are  then Z is true. If any variables are true at the same time,
     * then Z is false. Otherwise Z is false.<br>
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean XOR(boolean X,boolean...Ys) {
		boolean Z = X;
		for(boolean Y:Ys) {
			if(AND(Y,Z)) {
				return false;
			}
			if(Z == false && Y == true)
				Z = Y;
		}
		return Z;
	}
	/** <b><u>XNOR</u></b>
	 *  <br>
	 * Takes in two boolean variables, X and Y, and returns a boolean equivalent to !(X ^ Y)
	 * as seen in the truth table below<br>
	 * 	<br>
	 * 	<table>
  	 * 		<b><tr> <th>X</th><th>Y</th><th>Z</th> </tr></b>
  	 * 		<tr> <td>0</td><td>0</td><td>1</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>1</td> </tr>
     * 	</table><br>
     * If X is true or Y is true, then Z is false. If any variables are true at the same time,
     * then Z is true. Otherwise Z is true.<br>
     *  <br>
     * Also equivalent to !((X && !Y) || (!X && Y))<br>
     * or !((X || Y) && !(X && Y)).<br>
     * or (!(X || Y) || (X && Y)).<br>
     * or ((!X && !Y) || (X && Y)).<br>
     *  <br>
     * For more info on how to read a truth table see Logic javadoc.
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean XNOR(boolean X,boolean...Y) { return NOT(XOR(X,Y)); }
	/** <b><u>BUT_NOT</u></b>
	 * <br>
	 * Takes in two boolean variables, X and Y, and returns a boolean equivalent to (X && !Y)
	 * as seen in the truth table below<br>
	 * 	<br>
	 * 	<table>
  	 * 		<b><tr> <th>X</th><th>Y</th><th>Z</th> </tr></b>
  	 * 		<tr> <td>0</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>1</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>0</td> </tr>
     * 	</table><br>
     * If X is true and Y is not true, then Z is true. Otherwise Z is false.<br>
     *  <br>
     * For more info on how to read the truth table see the Logic javadoc
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean OR_NOT(boolean X,boolean...Y) { return AND(X,NAND(true,Y)); }
	/** <b><u>BUT_ONLY</u></b>
	 * <br>
	 * Takes in two boolean variables, X and Y, and returns a boolean equivalent to (X || !Y)
	 * as seen in the truth table below<br>
	 * 	<br>
	 * 	<table>
  	 * 		<b><tr> <th>X</th><th>Y</th><th>Z</th> </tr></b>
  	 * 		<tr> <td>0</td><td>0</td><td>1</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>1</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>1</td> </tr>
     * 	</table><br>
     * If X is true or Y is not true, then Z is true. Otherwise Z is false.<br>
     *  <br>
     * For more info on how to read the truth table see the Logic javadoc
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean BUT_ONLY(boolean X,boolean...Y) { return OR(X,NAND(true,Y)); }
	/** <b><u>BUT_NOT</u></b>
	 * <br>
	 * Takes in two boolean variables, X and Y, and returns a boolean equivalent to !(X && !Y)
	 * as seen in the truth table below<br>
	 * 	<br>
	 * 	<table>
  	 * 		<b><tr> <th>X</th><th>Y</th><th>Z</th> </tr></b>
  	 * 		<tr> <td>0</td><td>0</td><td>1</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>1</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>1</td> </tr>
     * 	</table><br>
     * If X is true or Y is not true, then Z is false. Otherwise Z is true.<br>
     * Also equivalent to (!X || Y)<br>
     *  <br>
     * For more info on how to read the truth table see the Logic javadoc
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean NOT_BUT_NOT(boolean X,boolean...Y) { return NOT(OR_NOT(X,Y)); }
	/** <b><u>BUT_NOT</u></b>
	 * <br>
	 * Takes in two boolean variables, X and Y, and returns a boolean equivalent to !(X || !Y)
	 * as seen in the truth table below<br>
	 * 	<br>
	 * 	<table>
  	 * 		<b><tr> <th>X</th><th>Y</th><th>Z</th> </tr></b>
  	 * 		<tr> <td>0</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>0</td><td>1</td><td>1</td> </tr>
  	 * 		<tr> <td>1</td><td>0</td><td>0</td> </tr>
  	 * 		<tr> <td>1</td><td>1</td><td>0</td> </tr>
     * 	</table><br>
     * If X is true and Y is not true, then Z is true. Otherwise Z is true.<br>
     * Also equivalent to (!X && Y)<br>
     *  <br>
     * For more info on how to read the truth table see the Logic javadoc
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public static boolean NOT_BUT_ONLY(boolean X,boolean...Y) { return NOT(BUT_ONLY(X,Y)); }

	public static void main(String[] args) {
		boolean F = false;
		boolean T = true;
		System.out.println("1. "+Logic.OR(F,F));
		System.out.println("2. "+Logic.OR(F,T));
		System.out.println("3. "+Logic.OR(T,F));
		System.out.println("4. "+Logic.OR(T,T));
	}

}
