package lab2;

public class PolarCoords extends PointCP
{
	

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
 return xOrRho;
}

public double getYorTheta()
{
 return yOrTheta;
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
   double x = Math.cos(yOrTheta)*xOrRho;
   double y = Math.sin(yOrTheta) * xOrRho;
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
	return "Stored as Polar [" + getXorRho() + "," + getYorTheta() + "]\n";
}
}