public class Administrator extends Employee implements Workable,Service {
    private int hoursWork;
    private double hourlyRate;
    public Administrator(String firstName, String lastName, int id, String department, boolean isMillitary,int yearsOfExperience, int hoursWork, double hourlyRate) {
        super(firstName, lastName, id, department, isMillitary,yearsOfExperience);
        this.hoursWork = hoursWork;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWork * hourlyRate;
    }

    @Override
    public void perfomDuties() {
        System.out.println(getFullName() + " is managing university administration.");
    }

    @Override
    public void isDuty() {
        System.out.println("Реалізація методу, чи може працівник заступати в наряд. Необхідно здійснити перевірку, чи він військовий");
    }
}