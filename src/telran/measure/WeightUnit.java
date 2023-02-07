package telran.measure;

public enum WeightUnit {
	GR(1), LBS(453.592f), KG(1000), CN(100000), TN(1000000);
	float value;
	WeightUnit(float value) {
		this.value = value;
	}
	public float convert(WeightUnit to, float weight) {
		return (value * weight) / to.value;
	}
}
