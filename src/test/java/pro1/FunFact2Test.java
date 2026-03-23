package pro1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunFact2Test
{
    @Test
    void test01()
    {
        var data = TestDataUtils.getTestData();
        var result = FunFact2.getFunFact(data);
        System.out.println(result);
        assertEquals(
                10_909_500,
                result
        );
    }
}
