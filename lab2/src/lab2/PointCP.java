package lab2;
//This file contains material supporting section 2.9 of the textbook:
//"Object Oriented Software Engineering" and is issued under the open-source
//license found at www.lloseng.com 

/**
* This class contains instances of coordinates in either polar or
* cartesian format.  It also provides the utilities to convert
* them into the other type. It is not an optimal design, it is used
* only to illustrate some design issues.
*
* @author Fran&ccedil;ois B&eacute;langer
* @author Dr Timothy C. Lethbridge
*/
public abstract class PointCP
{
//Instance variables ************************************************

/**
* Contains the current value of X or RHO depending on the type
* of coordinates.
*/
private double xOrRho;

/**
* Contains the current value of Y or THETA value depending on the
* type of coordinates.
*/
private double yOrTheta;
	

//Constructors ******************************************************

/**
* Constructs a coordinate object, with a type identifier.
*/
public PointCP(double xOrRho, double yOrTheta)
{
 this.xOrRho = xOrRho;
 this.yOrTheta = yOrTheta;
}
	

//Instance methods **************************************************


public abstract double getXorRho();

public abstract double getYorTheta();
	
/**
* Converts Cartesian coordinates to Polar coordinates.
*/
public abstract void convertStorageToPolar();
	
/**
* Converts Polar coordinates to Cartesian coordinates.
*/
public abstract void convertStorageToCartesian();

/**
* Calculates the distance in between two points using the Pythagorean
* theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
*
* @param pointA The first point.
* @param pointB The second point.
* @return The distance between the two points.
*/
public double getDistance(PointCP pointB)
{
 // Obtain differences in X and Y, sign is not important as these values
 // will be squared later.
 double deltaX = getXorRho() - pointB.getXorRho();
 double deltaY = getYorTheta() - pointB.getYorTheta();
 
 return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
}

/**
* Rotates the specified point by the specified number of degrees.
* Not required until E2.30
*
* @param point The point to rotate
* @param rotation The number of degrees to rotate the point.
* @return The rotated image of the original point.
*/
public abstract PointCP rotatePoint(double rotation);

/**
* Returns information about the coordinates.
*
* @return A String containing information about the coordinates.
*/
public abstract String toString();
}