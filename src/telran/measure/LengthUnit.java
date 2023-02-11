package telran.measure;

public enum LengthUnit {
	MM(1), CM(10), IN(25.4f), M(1000), KM(1_000_000);
	float value;
	LengthUnit(float value) {
		this.value = value;
	}
	public Length between(Length l1, Length l2) {
		return new Length(l2.convert(this).getAmount() - l1.convert(this).getAmount(), this);
	}
	public float getValue() {
		return value;
	}
}
