package pro.sky.kalculyator;

public interface CalculatorService {

    //    String calculatorError();
    String start();

    String calculator();

    Integer calculatorPlus(Integer n1, Integer n2);

    Integer calculatorMinus(Integer n1, Integer n2);

    Integer calculatorMultiply(Integer n1, Integer n2);

    Integer calculatorDivide(Integer n1, Integer n2);
}
