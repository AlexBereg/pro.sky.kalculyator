package pro.sky.kalculyator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String start() {
        return "Стартовая страница";
    }

    @Override
    public String calculator() {

        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Integer calculatorPlus(Integer n1, Integer n2) {
        return n1 + n2;
    }

    @Override
    public Integer calculatorMinus(Integer n1, Integer n2) {
        return n1 - n2;
    }

    @Override
    public Integer calculatorMultiply(Integer n1, Integer n2) {
        return n1 * n2;
    }

    @Override
    public Integer calculatorDivide(Integer n1, Integer n2) {
        return n1 / n2;
    }
}
