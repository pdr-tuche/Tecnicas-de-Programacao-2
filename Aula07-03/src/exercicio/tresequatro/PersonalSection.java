package exercicio.tresequatro;

import java.util.ArrayList;
import java.util.List;

public class PersonalSection {
    private List<Employee> employees;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public PersonalSection() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee person){
        this.employees.add(person);
    }

    public void showPaymentList(){
        System.out.println("Lista de pagamento:");
        this.employees.forEach(elem -> System.out.println("nome: " + ANSI_GREEN+elem.getName()+ANSI_RESET+ " salario: "+ANSI_GREEN+ elem.getSalary()+ANSI_RESET));
    }

    public float totalPaymentList(){
        return this.employees.stream().map(elem -> elem.getSalary()).reduce((float)0,(a, b) -> a+b);
    }

    public Employee mostExpensiveEmployee(){
        Employee mostExpensive = employees.get(0);
        for (int i = 1; i < this.employees.size(); i++) {
            if(mostExpensive.getSalary() < this.employees.get(i).getSalary()){
                mostExpensive = employees.get(i);
            }
        }
        return mostExpensive;
    }
    public void showEmployeesByDepartment(String department){
        List<Employee>list = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getDepartament().equalsIgnoreCase(department)){
                list.add(employees.get(i));
            }
        }
        if(list.size() == 0){
            System.out.println(ANSI_RED + "O departamento passado não foi encontrado" + ANSI_RESET);
        }else {
            System.out.println("lista dos empregados por setor:\nsetor de " + department + ":");
            list.forEach(elem -> System.out.println("nome: " +ANSI_GREEN+ elem.getName() +ANSI_RESET+ " função: " + ANSI_GREEN+elem.getFunction()+ANSI_RESET));
        }
    }

    public void showEmployeesByFunction(String function){
        List<Employee>list = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getFunction().equalsIgnoreCase(function)){
                list.add(employees.get(i));
            }
        }
        System.out.println("todos os "+ function +":");
        list.forEach(elem-> System.out.println("nome: "+ANSI_GREEN+elem.getName()+ANSI_RESET));
    }
}
