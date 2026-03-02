package com.pesexpo.mathtest.web;

import io.github.oogway.mathapi.MathCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MathProbeControllerTest {

    @Autowired
    private MathProbeController controller;

    @Autowired
    private MathCalculator mathCalculator;

    @Test
    void controllerAndMathCalculatorAreWiredFromStarter() {
        assertNotNull(mathCalculator);
        assertNotNull(controller);

        Map<String, Double> result = controller.add(1.5, 2.25);
        assertEquals(3.75, result.get("result"));
    }
}
