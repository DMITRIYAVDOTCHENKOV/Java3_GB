package src.ru.avdotchenkov.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runners.Parameterized;
import src.ru.avdotchenkov.lesson6.ArrayMy;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {
	@DisplayName("Начало теста, смещение элементов массива в право(отрицательное число)")
		@Test
		public void testNegativeArrayNOffset() {
			int[] expectedN = {1, 2, 3, 4, 5, 6};
			System.out.println("Начальный массив " + Arrays.toString(expectedN));
			int[] sourceN = {3, 4, 5, 6, 1, 2};
			System.out.println("Что должно получится " + Arrays.toString(sourceN));
			Assertions.assertArrayEquals(sourceN, ArrayMy.arrayNOffset(expectedN, - 2));
		}
	@DisplayName("Начало теста, смещение элементов массива в лево(положительное число")
	
	@Test
	public void testPositiveArrayNOffset() {
			int[] expectedP = {1,2,3,4,5,6};
			System.out.println("Начальный массив " + Arrays.toString(expectedP));
			int[] sourceP = {5,6,1,2,3,4};
			System.out.println("Что должно получится " + Arrays.toString(sourceP));
			Assertions.assertArrayEquals(sourceP,ArrayMy.arrayNOffset(expectedP, 2));
	}
}
