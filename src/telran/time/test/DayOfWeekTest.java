package telran.time.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.time.DayOfWeek;

class DayOfWeekTest {

	@Test
	void valuesTest() {
		DayOfWeek[] days = DayOfWeek.values();
		assertEquals(DayOfWeek.SUN, days[0]);
		assertEquals(7, days.length);
	}
	@Test
	void plusDaysTest() {
		assertEquals(DayOfWeek.TUE.plusDays(700), DayOfWeek.TUE);
		assertEquals(DayOfWeek.TUE.plusDays(2), DayOfWeek.THU);
	}
	@Test
	void minusDaysTest() {
		assertEquals(DayOfWeek.TUE.minusDays(700), DayOfWeek.TUE);
		assertEquals(DayOfWeek.SHABBAT.minusDays(2), DayOfWeek.THU);
	}
	@Test
	void betweenTest() {
		assertEquals(DayOfWeek.between(DayOfWeek.THU, DayOfWeek.MON), 4);
		assertEquals(DayOfWeek.between(DayOfWeek.THU, DayOfWeek.THU), 7);
	}
}
