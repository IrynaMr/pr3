public class Main {
    public static void main(String[] args) {

    Administrator administrator = new Administrator("Anna", "Pavlova", 1, "Facultet CZ", false,5,100,50);
    Professor professor = new Professor("Yulia", "Nazar",1,"ITTS",true,3,30,200);

    System.out.println(administrator.calculateSalary());
    System.out.println(professor.calculateSalary());

    administrator.perfomDuties();
    professor.perfomDuties();
}
}