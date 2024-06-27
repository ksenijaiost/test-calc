package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class AppMockitoTest {
    //тест для add
    @Test
    public void testAddition() {
        //Создание макета (mock) объекта
        Calculator calc = mock(Calculator.class);
        //Задаём ожидание поведение
        when(calc.add(2, 3)).thenReturn(5);
        //Создание экземпляра класса, который использует объект
        ExService exService = new ExService(calc);
        //Вызов метода
        int result = exService.performAddition(2,3);
        //Проверка результата
        assertEquals(5,result);
        //Проверка, что метод add был вызван с верными параметрами
        verify(calc).add(2,3);
    }
    //тест для subtraction
    @Test
    public void testSubtraction() {
        Calculator calc = mock(Calculator.class);
        //Задаём ожидание поведение
        when(calc.subtract(5, 3)).thenReturn(2);
        ExService exService = new ExService(calc);
        int result = exService.performSubtraction(5,3);
        assertEquals(2,result);
        verify(calc).subtract(5,3);
    }
}
