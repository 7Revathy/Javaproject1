package oopsclass;

import java.util.Scanner;

class EmployeeDetails {
    double basicPay;
    double deduction;
    double bonus;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic pay: ");
        basicPay = sc.nextDouble();

        System.out.print("Enter deduction: ");
        deduction = sc.nextDouble();

        System.out.print("Enter bonus: ");
        bonus = sc.nextDouble();
    }
}


class SalaryCalculator {
    double hra;
    double pf;

    void calculateHRAandPF(double basicPay) {
        hra = basicPay * 0.05;  
        pf = basicPay * 0.20;   
    }
}

class SalarySlip {
    double totalSalary;

    void generateSalarySlip(EmployeeDetails employee, SalaryCalculator salaryCalc) {
        totalSalary = employee.basicPay + salaryCalc.hra - salaryCalc.pf - employee.deduction + employee.bonus;

       
        System.out.println("Basic Pay: " + employee.basicPay);
        System.out.println("HRA (5% of Basic Pay): " + salaryCalc.hra);
        System.out.println("PF (20% of Basic Pay): " + salaryCalc.pf);
        System.out.println("Deduction: " + employee.deduction);
        System.out.println("Bonus: " + employee.bonus);
        System.out.println("Total Salary by Hand: " + totalSalary);
        
    }
}


public class SalaryCalculationProgram {
    public static void main(String[] args) {
        
        EmployeeDetails employee = new EmployeeDetails();
        employee.getDetails();

        SalaryCalculator salaryCalc = new SalaryCalculator();
        salaryCalc.calculateHRAandPF(employee.basicPay);

        SalarySlip salarySlip = new SalarySlip();
        salarySlip.generateSalarySlip(employee, salaryCalc);
    }
}
