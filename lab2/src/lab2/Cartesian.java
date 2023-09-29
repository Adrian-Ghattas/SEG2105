package lab2;

public class Cartesian extends PointCP{

	public Cartesian(double xOrRho, double yOrTheta) {
		super(xOrRho, yOrTheta);
	}

	public double getXorRho() {
		return xOrRho;
	}

	public double getYorTheta() {
		return yOrTheta;
	}

	public PointCP convertStorageToPolar() {
		double rho = Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2));
        double theta =  Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
        PolarCoords polar = new PolarCoords(rho, theta);
        return polar;
	}

	public PointCP convertStorageToCartesian() {
		return this;
	}

	public String toString() {
	    return "Stored as Cartesian (" + getXorRho() + "," + getYorTheta() + ")\n";
	    }

}
