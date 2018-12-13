package paintWizard;

public class Paint {

	private double costPerTin = 0;
	private double coveragePerTin = 0;
	private double sizeOfRoom = 0;
	private String name = "";

	public Paint(String name, int cost, int coverage) {
		this.costPerTin = cost;
		this.coveragePerTin = coverage;
		this.name = name;
	}

	public double getCostPerM2(Paint paint) {
		return paint.costPerTin / paint.coveragePerTin;
	}

	public String compareCost(Paint paint, Paint paint2) {

		if (paint.getCostPerM2(paint) < paint2.getCostPerM2(paint2)) {
			return paint.getName() + " is cheaper";
		}
		if (paint.getCostPerM2(paint) > paint2.getCostPerM2(paint2)) {
			return paint2.getName() + " is cheaper";
		} else {
			return "Both are the same price";
		}
	}

	public double calculateWaste(double sizeOfRoom, Paint coverage) {
		double costPerTinTemp = coverage.costPerTin;
		double coveragePerTinTemp = coverage.coveragePerTin;
		while (sizeOfRoom > coverage.coveragePerTin) {

			coverage.coveragePerTin = coverage.coveragePerTin + coveragePerTinTemp;
			coverage.costPerTin = coverage.costPerTin + costPerTinTemp;

		}

		return coverage.coveragePerTin - sizeOfRoom;
	}

	public String getName() {
		return this.name;
	}

}
