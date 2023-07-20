package com.demo;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculatorTest {
    private Calculator calculator;

    @DisplayName("Add Test")
    @Test
    @Order(value=1)
    public void addTest() {
        Assertions.assertEquals(6, calculator.add(2, 4));
    }

    @DisplayName("Multiply Test")
    @Test
    @Order(value=2)
    public void multiplyTest() {
        Assertions.assertEquals(8, calculator.multiply(2, 4));
    }
    
//    @Test
//    public void multipleTestFailure() {
//        Assertions.assertThrows(ArithmeticException.Class, () -> calculator.multiply(0, 0));
//    }

    @RepeatedTest(2) //Repeats test multiple times
    @DisplayName("Test Info example")
    @Test
    public void print(TestInfo testInfo) {
        System.out.println(testInfo);
    }

    @BeforeEach
    public void initialiseObject() {
        calculator = new Calculator();
    }

    @AfterEach
    public void deleteObject() {
        calculator = null;
    }
}
