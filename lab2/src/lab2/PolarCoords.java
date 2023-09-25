public class PolarCoords extends PointCP
{
//Instance variables ************************************************

/**
* Contains the current value of RHO.
*/
private double rho;

/**
* Contains the current value of THETA.
*/
private double theta;
	

//Constructors ******************************************************

/**
* Constructs a coordinate object, with a type identifier.
*/
public PolarCoords(double rho, double theta)
{
 
 super(rho, theta);

}
	

//Instance methods **************************************************


public double getXorRho()
{
 return this.rho;
}

public double getYorTheta()
{
 return this.theta;
}

	
/**
* Converts Cartesian coordinates to Polar coordinates.
*/
public PointCP convertStorageToPolar()
{
 return this;
}
	
/**
* Converts Polar coordinates to Cartesian coordinates.
*/
public PointCP convertStorageToCartesian()
{
   //Calculate X and Y
   double x = Math.cos(Math.toRadians(theta) * rho);
   double y = Math.sin(Math.toRadians(theta) * rho);
  PointCP cartesian = new Cartesian(x, y);
  return cartesian;

}


/**
* Returns information about the coordinates.
*
* @return A String containing information about the coordinates.
*/
public String toString()
{
	return "Stored as Polar" + getXorRho() + "," + getYorTheta() + ")\n";
}
}