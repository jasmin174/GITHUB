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
}