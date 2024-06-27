package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExService {
    private Calculator calculator;

    public int performAddition(int a, int b) {
        return calculator.add(a, b);
    }

    public int performSubtraction(int a, int b) {
        return calculator.subtract(a, b);
    }
}
