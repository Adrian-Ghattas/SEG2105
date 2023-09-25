package lab2;

public class Cartesian extends PointCP {

	public Cartesian(double xOrRho, double yOrTheta) {
		super(xOrRho, yOrTheta);
		
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return xOrRho;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getRho() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTheta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void convertStorageToPolar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void convertStorageToCartesian() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PointCP rotatePoint(double rotation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
