package pro.sky.kalculyator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StartController {
    private final CalculatorService calculatorService;

    public StartController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String start() {
        return calculatorService.start();
    }
}