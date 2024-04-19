package ch.etmles.payroll.Controllers;

public class EmployeeMinorException extends RuntimeException {

    EmployeeMinorException(String name, int age) {
        super("Hiring a minor employee is not legally possible : Name Of The Employee :%s\t Age : %d".formatted(name, age));
    }
}