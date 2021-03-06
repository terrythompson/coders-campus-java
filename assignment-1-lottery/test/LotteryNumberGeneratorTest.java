package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import main.LotteryNumberGenerator;

public class LotteryNumberGeneratorTest {

	LotteryNumberGenerator underTest;

	@Before
	public void setup() {
		underTest = new LotteryNumberGenerator();
	}

	@Test
	public void shouldGenerateSingleNumberBetween1And49() {
		int result = underTest.test_generateLotteryNumber();
		assertTrue(result >= 1 && result <= 49);
	}

	@Test
	public void shouldReturnSetOfSixNumbers() {
		Set<Integer> result = underTest.generateSetOfLotteryNumbers();
		assertThat(result.size(), is(6));
	}

}
