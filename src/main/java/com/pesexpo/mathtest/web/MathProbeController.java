package com.pesexpo.mathtest.web;

import io.github.oogway.mathapi.MathCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/math")
public class MathProbeController {

    private final MathCalculator mathCalculator;

    public MathProbeController(MathCalculator mathCalculator) {
        this.mathCalculator = mathCalculator;
    }

    @GetMapping("/add")
    public Map<String, Double> add(@RequestParam double a, @RequestParam double b) {
        return Map.of(
                "a", a,
                "b", b,
                "result", mathCalculator.add(a, b)
        );
    }
}
