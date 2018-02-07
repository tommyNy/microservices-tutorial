package pl.tomihome.microservicestutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tomihome.microservicestutorial.domain.Multiplication;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {

    private RandomGeneratorService randomGeneratorService;

    @Autowired
    public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
        this.randomGeneratorService = randomGeneratorService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        int factoryA = randomGeneratorService.generateRandomFactory();
        int factoryB = randomGeneratorService.generateRandomFactory();
        return new Multiplication(factoryA, factoryB);
    }
}