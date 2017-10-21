public class Unit 
{
	public final static String distance =  "m";
	public final static String time = "s";
	public final static String velocity = "m/s";
	public final static String acceleration = "m/s\u00b2";
	public final static String degree = "\u00b0";
	
	public final static String upDirection = "N";
	public final static String downDirection = "S";
	public final static String rightDirection = "E";
	public final static String leftDirection = "W";
	
	public static boolean positiveDirection(String direction)
	{
		if (direction.equals(downDirection) || direction.equals(leftDirection))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static double correctMagnitude(String direction, Double magnitude)
	{
		if (direction.equals(Unit.downDirection) || direction.equals(Unit.leftDirection))
		{
			return -1.00 * magnitude;
		}
		else
		{
			return 1.00 * magnitude;
		}
		
	}
}