package telran.measure;

public enum LengthUnit {
	MM(1), CM(10), IN(25.4f), M(1000), KM(1_000_000);
	float value;
	LengthUnit(float value) {
		this.value = value;
	}
	
	public Length between (Length l1, Length l2) {
		//returns length in between in this units
		return null;
	}
}
