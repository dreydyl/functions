package functions;

public final class Bool {

	boolean X;
	int B;

	public Bool(boolean b) {
		this.X = b;
		B = get(X);
	}

	public boolean get() {
		return X;
	}
	public int get(boolean x) {
		int b = 0;
		if(x) b = 1;
		return b;
	}

	public void to(boolean x) {
		X = x;
		B = get(X);
	}

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
     * If X is true and Y is  then Z is true. Otherwise Z is false.<br>
     *  <br>
     * For more info on how to read the truth table see the Logic javadoc
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public boolean AND(boolean Y) {
		System.out.println(X+" AND "+Y+" = "+(X && Y));
		return X && Y;
		}
	/** <b><u>AND</u></b>
	 * <br>
	 * Takes in more than two boolean variables, X and an array of booleans Ys, and returns a
	 * boolean equivalent to (X && Y[0] && Y[1] &&...)<br>
	 * 	<br>
     * If X is true and all Ys are  then Z is true. Otherwise Z is false.<br>
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public boolean AND(boolean...Ys) {
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
     * If X is true or Y is  then Z is true. Otherwise Z is false.<br>
     *  <br>
     * For more info on how to read a truth table see Logic javadoc.
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public boolean OR(boolean Y) {
		System.out.println(X+" OR "+Y+" = "+(X || Y));
		return X || Y;
		}
	/** <b><u>OR</u></b>
	 * <br>
	 * Takes in more than two boolean variables, X and an array of booleans Ys, and returns a
	 * boolean equivalent to (X || Y[0] || Y[1] ||...)<br>
	 * 	<br>
     * If X is true or any Ys are  then Z is true. Otherwise Z is false.<br>
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public boolean OR(boolean...Ys) {
		boolean Z = X;
		for(boolean Y:Ys) { Z = OR(Y,Z); }
		return Z;
	}
	/** <b><u>NOT</u></b>
	 * <br>
	 * Takes in more than a boolean variable,  and returns a boolean equivalent to !X<br>
	 * 	<br>
     * If X is  then Z is false. Otherwise Z is true.<br>
	 * @param X
	 * @return Z
	 */
	public boolean NOT() {
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
     * If X is true and Y is  then Z is false. Otherwise Z is true.<br>
     * Also equivalent to (!X || !Y).<br>
     *  <br>
     * For more info on how to read a truth table see Logic javadoc.
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public boolean NAND(boolean...Y) { return Logic.NOT(AND(Y)); }
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
     * If X is true and Y is  then Z is false. Otherwise Z is true.<br>
     * Also equivalent to (!X && !Y).<br>
     *  <br>
     * For more info on how to read a truth table see Logic javadoc.
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public boolean NOR(boolean...Y) { return Logic.NOT(OR(Y)); }
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
     * If X is true or Y is  then Z is true. If X is true and Y is  then Z is false.
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
	public boolean XOR(boolean Y) { return X^Y; }
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
	public boolean XOR(boolean...Ys) {
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
     * If X is true or Y is  then Z is false. If any variables are true at the same time,
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
	public boolean XNOR(boolean...Y) { return Logic.NOT(XOR(Y)); }
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
     * If X is true and Y is not  then Z is true. Otherwise Z is false.<br>
     *  <br>
     * For more info on how to read the truth table see the Logic javadoc
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public boolean OR_NOT(boolean...Y) { return Logic.AND(NAND(Y)); }
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
     * If X is true or Y is not  then Z is true. Otherwise Z is false.<br>
     *  <br>
     * For more info on how to read the truth table see the Logic javadoc
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public boolean BUT_ONLY(boolean...Y) { return OR(NAND(Y)); }
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
     * If X is true or Y is not  then Z is false. Otherwise Z is true.<br>
     * Also equivalent to (!X || Y)<br>
     *  <br>
     * For more info on how to read the truth table see the Logic javadoc
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public boolean NOT_BUT_NOT(boolean...Y) { return Logic.NOT(OR_NOT(Y)); }
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
     * If X is true and Y is not  then Z is true. Otherwise Z is true.<br>
     * Also equivalent to (!X && Y)<br>
     *  <br>
     * For more info on how to read the truth table see the Logic javadoc
	 * @param X
	 * @param Y
	 * @return Z
	 */
	public boolean NOT_BUT_ONLY(boolean...Y) { return Logic.NOT(BUT_ONLY(Y)); }

	public static void main(String[] args) {
		Bool H = new Bool(true);
		H.AND(false);
		System.out.println(Boolean.TRUE);
	}

}
