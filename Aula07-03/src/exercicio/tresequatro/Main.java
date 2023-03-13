package exercicio.tresequatro;

public class Main {
    public static void main(String[] args) {
    Employee anna = new Employee(1234, "Anna Luiza", "desenvolvimento de software", 2000, "desenvolvedor frontend");
    Employee lucas = new Employee(5678, "Lucas Calado", "desenvolvimento de software", 2300, "desenvolvedor backend");
    Employee samuel = new Employee(9101, "Samuel Primo", "desenvolvimento e operações", 2400, "Analista de operações");
    Employee samuelNas = new Employee(1010,"Samuel Nascimento", "design", 2000, "desenvolvedor de UI");
    Employee anderson = new Employee(2020, "Anderson Marqueive", "design", 2300, "Analista de UI e UX");
    Employee anny = new Employee(3030,"Anny Gabrielly","desenvolvimento de software", 2000, "desenvolvedor frontend");
    Employee kayanne = new Employee(4040, "Kayanne Kikuti", "desenvolvimento e operações", 2400, "Analista de operações");
    Employee nivas = new Employee(5050,"Nivaldo Lucas", "desenvolvimento e operações", 2000, "Analista de suporte N2");

    PersonalSection development = new PersonalSection();
    development.addEmployee(anna);
    development.addEmployee(lucas);
    development.addEmployee(samuel);
    development.addEmployee(samuelNas);
    development.addEmployee(anderson);
    development.addEmployee(anny);
    development.addEmployee(kayanne);
    development.addEmployee(nivas);

    development.showPaymentList();
    separator();

    System.out.println("valor total da folha de pagamento:\n"+ development.totalPaymentList());
    separator();

    System.out.println("o funcionario com salario mais alto e de: \n"+ development.mostExpensiveEmployee().toString());
    separator();

    development.showEmployeesByDepartment("design");
    separator();

    development.showEmployeesByFunction("desenvolvedor frontend");
    separator();


    }
    public static void separator(){
        System.out.println("-- -- -- -- -- -- -- -- -- -- --");
    }
}
