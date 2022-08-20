import java.math.BigInteger;

public class BreakThe3xpls1{
	public static void main(String[] args){
		System.out.println("Now I will break the 3x + 1 problem !!!!!");
		BreakThe3xpls1 mainClass = new BreakThe3xpls1();
		BigInteger startFrom = new BigInteger(args[0]);

		while(mainClass.returnIf1Loop(startFrom)){
			startFrom = startFrom.add(BigInteger.ONE);
		}
	}

	public boolean returnIf1Loop(BigInteger startFrom)
	{
		BigInteger highest = startFrom;
		BigInteger result = startFrom;
		BigInteger steps = BigInteger.ZERO;
		while(!result.equals(BigInteger.ONE)){
			if(result.mod(new BigInteger("2")).equals(BigInteger.ZERO)){
				result = result.divide(BigInteger.valueOf(2));
			} else {
				result = result.multiply(BigInteger.valueOf(3)).add(BigInteger.valueOf(1));
			}
			if(result.compareTo(highest) == 1){
				highest = result;
			}
			steps = steps.add(BigInteger.ONE);
		}
		System.out.println("The highest for "+startFrom+" with: "+steps+" steps is: "+highest);
		return true;
	}
}