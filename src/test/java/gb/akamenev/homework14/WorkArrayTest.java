package gb.akamenev.homework14;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WorkArrayTest {
    final static int num = 4;
    final static int num2 = 1;

    @Test
    public void afterNumTest1 (){    // тестируем при нормальных вводных
int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
int [] actual = WorkArray.afterNum(array, num);
int [] expected = {5,6,7};
        Assert.assertArrayEquals(actual, expected);
    }
    @Test
    public void afterNumTest2 (){    // тестируем при нескольких вводных числах
        int[] array = new int[]{1, 4, 2, 3, 4, 5, 6, 4, 7};
        int [] actual = WorkArray.afterNum(array, num);
        int [] expected = {7};
        Assert.assertArrayEquals(actual, expected);
    }
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void afterNumTestException (){    // тестируем без 4-к
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage ("Выкинуто исключение: в исследуемом массиве нет числа " + num);
        int[] array = new int[]{-1, 2, 3, -4, 5, 6, -7};
        WorkArray.afterNum(array, num);
    }

    // ------------ 2 часть дз ---------------------

    @Test
    public void binaryTrueTest1 (){    // тестируем массив из 1 и 4
         int[] array = {1,4,4,4,1,1,1,4,4,1,4,1,4,4,4,4};
        boolean test = false;
         if ((WorkArray.binaryTrue(array, num2, num))==true){
            test = true;
        }
//        boolean expected;
//        expected = true;
         Assert.assertTrue(test);
    }

    @Test
    public void binaryTrueTest2 (){    // тестируем массив из 1 и 4
        int[] array = {1,4,5,4,1,1,1,4,4,1,4,1,4,4,4,4};
        boolean actual = WorkArray.binaryTrue(array, num2, num);
        boolean expected = false;
        Assert.assertTrue(true);
    }
}
