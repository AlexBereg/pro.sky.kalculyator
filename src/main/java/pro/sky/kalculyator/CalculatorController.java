package pro.sky.kalculyator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/plus")
    public String calculatorPlus(@RequestParam(required = false, value = "num1") Integer n1, @RequestParam(required = false, value = "num2") Integer n2) {
        if (n1 == null || n2 == null) {
            return "Не буду считать!! Не все параметры переданы!!";
        } else {
            return n1 + " + " + n2 + " = " + calculatorService.calculatorPlus(n1, n2);
        }
    }

    @GetMapping("/minus")   // Проверил, что можно не писать "path ="
    public String calculatorMinus(@RequestParam(required = false, value = "num1") Integer n1, @RequestParam(required = false, value = "num2") Integer n2) {
        if (n1 == null || n2 == null) {
            return "Не буду считать!! Не все параметры переданы!!";
        } else {
            return n1 + " - " + n2 + " = " + calculatorService.calculatorMinus(n1, n2);
        }
    }

    @GetMapping("/multiply")
    public String calculatorMultiply(@RequestParam(required = false, value = "num1") Integer n1, @RequestParam(required = false, value = "num2") Integer n2) {
        if (n1 == null || n2 == null) {
            return "Не буду считать!! Не все параметры переданы!!";
        } else {
            return n1 + " * " + n2 + " = " + calculatorService.calculatorMultiply(n1, n2);
        }
    }

    @GetMapping("/divide")
    public String calculatorDivide(@RequestParam(required = false, value = "num1") Integer n1, @RequestParam(required = false, value = "num2") Integer n2) {
        if (n1 == null || n2 == null) {
            return "Не буду считать!! Не все параметры переданы!!";
        } else if (n2 == 0) {
            return "Деление на НОЛЬ недопустимо!!";
        } else {
            return n1 + " / " + n2 + " = " + calculatorService.calculatorDivide(n1, n2);
        }
    }
}
