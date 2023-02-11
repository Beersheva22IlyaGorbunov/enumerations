package telran.measure;

import java.io.InvalidClassException;

public class Length implements Comparable<Length>{
	private float amount;
	private LengthUnit lengthUnit;
	public Length(float amount, LengthUnit lengthUnit) {
		this.amount = amount;
		this.lengthUnit = lengthUnit;
	}
	@Override
	/**
	 * equals two Length objects according to LengthUnit and amount
	 * 10m == 10000mm
	 */
	public boolean equals(Object obj) {
		if (obj.getClass() != Length.class) {
			throw new ClassCastException();
		}
		return this.compareTo((Length) obj) == 0;
	}

	@Override
	/**
	 * 
	 * @param o
	 * @return < 0 "this" object less than "o" object,
	 *  > 0 "this" object greater than "o" object,
	 *  == 0 "this" object equals "o" object,
	 */
	public int compareTo(Length o) {
		float between = lengthUnit.between(o, this).getAmount();
		int res;
		if (between > 0) {
			res = 1;
		} else if (between < 0) {
			res = -1;
		} else {
			res = 0;
		}
		return res;
	}
	/**
	 * 
	 * @param unit
	 * @return new Length object with a given LengthUnit
	 * example, convert(LengthUnit.M) returns Length in meters 
	 */
	public Length convert(LengthUnit unit) {
		float newAmount = lengthUnit.value / unit.value * amount;
		Length res = new Length(newAmount, unit);
		return res;
	}
	@Override
	/**
	 * returns string with amount and length unit pinned to amount with no space
	 * Example: 20.0M (string expression of Length object presenting 20 meters)
	 */
	public String toString() {
		return String.format("%s%s", getAmount(), getUnit().toString());
	}

	public float getAmount() {
		return amount;
	}

	public LengthUnit getUnit() {
		return lengthUnit;
	}
}
