package pro1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunFact3Test
{
    @Test
    void test01()
    {
        var data = TestDataUtils.getTestData();
        var result = FunFact3.getFunFact(data);
        System.out.println(result);
        assertEquals(
                5_625_930,
                result
        );
    }
}
