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
		super.xOrRho = Math.sqrt(xOrRho*xOrRho + yOrTheta*yOrTheta);
        super.yOrTheta = Math.atan2(yOrTheta, xOrRho);
        Polar polar = new Polar(xOrRho, yOrTheta);
        return polar;
	}

	public PointCP convertStorageToCartesian() {
		return this;
	}

	public String toString() {
	    return "Stored as Cartesian" + getXorRho() + "," + getYorTheta() + ")\n";
	    }

}
