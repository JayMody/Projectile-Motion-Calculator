public class Vector 
{
	//	Instance Variables	//
	private double x;
	private double y;

	
	
	//	Constructos 	//
	public Vector()
	{
		x = 0.0;
		y = 0.0;
	}
	
	public Vector(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public Vector(String xDirection, String yDirection, double magnitude, double angle)
	{
		if (Unit.positiveDirection(xDirection))
		{
			this.x = magnitude * Math.cos(angle);
		}
		else
		{
			this.x = -1 * magnitude * Math.cos(angle);
		}
		
		if (Unit.positiveDirection(yDirection))
		{
			this.y = magnitude * Math.sin(angle);
		}
		else
		{
			this.y = -1 * magnitude * Math.cos(angle);
		}
	}
	
	
	
	//	Set Methods	 //
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	} 
	
	
	
	//	Get Magnitudes	//
	public double getXMagnitude()
	{
		return x;
	}
	public double getYMagnitude()
	{
		return y;
	}
	
	
	
	//	Get Directions	//
	public String getXDirection()
	{
		if (this.x > 0)
		{
			return Unit.rightDirection;
		}
		else if (this.x < 0)
		{
			return Unit.leftDirection;
		}
		else
		{
			return "";
		}
	}
	public String getYDirection()
	{
		if (this.y > 0)
		{
			return Unit.upDirection;
		}
		else if (this.y < 0)
		{
			return Unit.downDirection;
		}
		else
		{
			return "";
		}
	}
	public String getResultantDirection()
	{
		if (x > -0.01 && x < 0.01)
		{
			return "[" + this.getYDirection() + "]";
		}
		else if (y > -0.01 && y < 0.01)
		{
			return "[" + this.getXDirection() + "]"; 
		}
		else
		{
			return "[" + this.getXDirection() + " " + this.getAngle() + Unit.degree + " " + this.getYDirection() + "]";
		}
	}

	
	//	Get 2D	//
	public double getResultant()
	{
		return Math.abs(Math.round(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) * 100.0) / 100.0);	
	}
	
	public double getAngle()
	{
		return Math.abs(Math.round(Math.atan(y/x) * (180.0 / Math.PI) * 10.0) / 10.0);	
	}
}
