package com.testing;
import com.method.ArabicRomanNumerals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class convertingTest {
    @Test
    public void convert_1_into_I() {
        // GIVEN
        int input = 1;
        String expected = "I";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();

        // WHEN
        String result = converter .convert(input);

        // THEN
        assertEquals(expected,result);
    }
    @Test
    public void convert_1_into_II() {
        // GIVEN
        int input = 2;
        String expected = "II";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();

        // WHEN
        String result = converter .convert(input);

        // THEN
        assertEquals(expected,result);
    }
    @Test
    public void convert_3_into_II() {
        // GIVEN
        int input = 3;
        String expected = "III";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();

        // WHEN
        String result = converter .convert(input);

        // THEN
        assertEquals(expected,result);
    }

    @Test
    public void convert_4_into_IV() {
        // GIVEN
        int input = 4;
      String expected="IV";
        ArabicRomanNumerals converter = new ArabicRomanNumerals();

        // WHEN
        String result = converter .convert(input);

        // THEN
        assertEquals(expected,result);
    }
}
