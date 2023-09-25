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
protected double xOrRho;

/**
* Contains the current value of Y or THETA value depending on the
* type of coordinates.
*/
protected double yOrTheta;
	

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
public abstract PointCP convertStorageToPolar();
	
/**
* Converts Polar coordinates to Cartesian coordinates.
*/
public abstract PointCP convertStorageToCartesian();

/**
* Returns information about the coordinates.
*
* @return A String containing information about the coordinates.
*/
public abstract String toString();
}