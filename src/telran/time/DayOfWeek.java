package telran.time;

public enum DayOfWeek {
	SUN, MON, TUE, WED, THU, FRI, SHABBAT;
	
	public DayOfWeek plusDays(int days) {
		DayOfWeek res = null;
		if (days < 0) {
			res = minusDays(-days);
		} else {
			int seqNumCurrent = ordinal();
			int seqNumResult = (seqNumCurrent + days) % 7;
			res = values()[seqNumResult];
		}
		return res;
	}

	public DayOfWeek minusDays(int days) {
		DayOfWeek res = null;
		if (days < 0) {
			res = plusDays(-days);
		} else {
			int seqNumCurrent = ordinal();
			int seqNumResult = (seqNumCurrent - days) % 7;
			if (seqNumResult < 0) {
				seqNumResult += 7;
			}
			res = values()[seqNumResult];
		}
		return res;
	}
	
	public static int between(DayOfWeek a, DayOfWeek b) {
		int res = b.ordinal() - a.ordinal();
		if (res <= 0) {
			res += 7;
		}
		return res;
	}
}
