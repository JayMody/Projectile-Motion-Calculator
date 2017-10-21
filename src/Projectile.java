public class Projectile 
{
	//	Instance Variables	//
	private double time;
	private Vector acceleration = new Vector(0, -9.8);
	
	private Vector initialVelocity;
	private Vector finalVelocity;
	private Vector displacement;
	
	private double timeAtMaxHeight;
	private Vector maxHeight;

	//	Constructors  //
	public Projectile()
	{
		time = 0.0;
		
		initialVelocity = new Vector();
		finalVelocity = new Vector();
		displacement = new Vector();
		
		initialVelocity = new Vector();
		initialVelocity = new Vector();
		
		timeAtMaxHeight = 0.0;
		maxHeight = new Vector();
	}
	
	 
	public void calculateProjectile(Vector velocity, double time)
	{
		initialVelocity.setX(velocity.getXMagnitude());
		initialVelocity.setY(velocity.getYMagnitude());
		
		this.time = time;
		
		finalVelocity.setX(velocity.getXMagnitude());
		finalVelocity.setY(calculateFinalYVelocity());
		
		displacement.setX(calculateXDisplacement());
		displacement.setY(calculateYDisplacement());
		
		timeAtMaxHeight = calculateTimeAtMaxHeight();
		
		maxHeight.setX(calculateMaxHeightX());
		maxHeight.setY(calculateMaxHeightY());
		
	}
	
	
	
	public double calculateFinalYVelocity()
	{
		return (acceleration.getYMagnitude() * this.time) + initialVelocity.getYMagnitude();
	}
	public double calculateXDisplacement()
	{
		return initialVelocity.getXMagnitude() * this.time;
	}
	public double calculateYDisplacement()
	{
		return (initialVelocity.getYMagnitude() * time) + ((0.5) * (this.acceleration.getYMagnitude()) * Math.pow(this.time, 2));
	}
	public double calculateTimeAtMaxHeight()
	{
		return (-1.0 * initialVelocity.getYMagnitude()) / acceleration.getYMagnitude();
	}
	public double calculateMaxHeightY()
	{
		return (-1.00 * Math.pow(initialVelocity.getYMagnitude(), 2)) / (2.00 * acceleration.getYMagnitude());
	}
	public double calculateMaxHeightX()
	{
		return initialVelocity.getXMagnitude() * calculateTimeAtMaxHeight();
	}
	
	
	
	
	public String getTime()
	{
		return Math.round(time * 100.0) / 100.0 + Unit.time;
	}
	public String getAccelerationY()
	{
		return Math.abs(Math.round(acceleration.getYMagnitude() * 100.0) / 100.0) + Unit.acceleration + " [" + acceleration.getYDirection() + "]";
	}
	public String getAccelerationX()
	{
		return Math.abs(Math.round(acceleration.getXMagnitude() * 100.0) / 100.0) + Unit.acceleration + " [" + acceleration.getXDirection() + "]";
	}
	public String getInitialVelocityY()
	{
		return Math.abs(Math.round(initialVelocity.getYMagnitude() * 100.0) / 100.0) + Unit.velocity + " [" + initialVelocity.getYDirection() + "]";
	}
	public String getInitialVelocityX()
	{
		return Math.abs(Math.round(initialVelocity.getXMagnitude() * 100.0) / 100.0) + Unit.velocity + " [" + initialVelocity.getXDirection() + "]";
	}
	public String getInitialVelocity()
	{
		return initialVelocity.getResultant() + Unit.velocity + " " + initialVelocity.getResultantDirection();
	}
	public String getFinalVelocityY()
	{
		return Math.abs(Math.round(finalVelocity.getYMagnitude() * 100.0) / 100.0) + Unit.acceleration + " [" + finalVelocity.getYDirection() + "]";
	}
	public String getFinalVelocityX()
	{
		return Math.abs(Math.round(finalVelocity.getXMagnitude() * 100.0) / 100.0) + Unit.velocity + " [" + finalVelocity.getXDirection() + "]";
	}
	public String getFinalVelocity()
	{
		return finalVelocity.getResultant() + Unit.velocity + " " + finalVelocity.getResultantDirection();
	}	
	public String getDisplacementY()
	{
		return Math.abs(Math.round(displacement.getYMagnitude() * 100.0) / 100.0) + Unit.distance + " [" + displacement.getYDirection() + "]";
	}
	public String getDisplacementX()
	{
		return Math.abs(Math.round(displacement.getXMagnitude() * 100.0) / 100.0) + Unit.distance + " [" + displacement.getXDirection() + "]";
	}
	public String getDisplacement()
	{
		return displacement.getResultant() + Unit.distance + " " + displacement.getResultantDirection();
		//return displacement.getResultant() + Unit.distance + " [" + displacement.getXDirection() + " " + displacement.getAngle() + Unit.degree + " " + displacement.getYDirection() + "]";
	}
	public String getTimeAtMaxHeight()
	{
		return Math.round(timeAtMaxHeight * 100.0) / 100.0 + Unit.time;
	}
	public String getMaxHeightY()
	{
		return Math.abs(Math.round(maxHeight.getYMagnitude() * 100.0) / 100.0) + Unit.distance + " [" + maxHeight.getYDirection() + "]";
	}
	
	
	
	
	public String getMotion()
	{
		String statement = "| Motion of the Object |\n\n";
		
		statement = statement + "Vertical Acceleration: " + this.getAccelerationY() + "\n";
		statement = statement + "Horizontal Acceleration: " + this.getAccelerationX() + "\n";
		
		statement = statement + "\nTotal time in motion: " + this.getTime() + "\n";
		 
		statement = statement + "\nInitial Velocity: " + this.getInitialVelocity() + "\n";
		statement = statement + "Initial Horizontal Velocity: " + this.getInitialVelocityX() + "\n";
		statement = statement + "Initial Vertical Velocity: " + this.getInitialVelocityY()  + "\n";
		
		statement = statement + "\nFinal Velocity: " + this.getFinalVelocity() + "\n";
		statement = statement + "Final Horizontal Velocity: " + this.getFinalVelocityX() + "\n";
		statement = statement + "Final Vertical Velocity: " + this.getFinalVelocityY() + "\n";
		
		statement = statement + "\nMax Height: " + this.getMaxHeightY() + "\n";
		statement = statement + "Time When At Max Height: " + this.getTimeAtMaxHeight() + "\n";
		
		statement = statement + "\nRange (Horizontal Displacement): " + this.getDisplacementX() + "\n";
		statement = statement + "Landing Height (Vertical Displacement): " + this.getDisplacementY() + "\n";
		statement = statement + "Total Displacement: " + this.getDisplacement() + "\n";
		
		return statement;
	}
	
	
		
}
