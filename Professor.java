class Professor extends Employee implements Workable,Service  {
    private int numberOfLectures;
    private double ratePerLecture;
    public Professor(String firstName, String lastName, int id, String department, boolean isMillitary, int yearsOfExperience, int numberOfLectures, double ratePerLecture) {
        super(firstName, lastName, id, department, isMillitary,yearsOfExperience);
        this.numberOfLectures = numberOfLectures;
        this.ratePerLecture = ratePerLecture;
    }
    @Override
    public double calculateSalary() {
        return numberOfLectures * ratePerLecture;
    }
    @Override
    public void isDuty() {
        System.out.println("Реалізація методу, чи може працівник заступати в наряд. Необхідно здійснити перевірку, чи він військовий");
    }

    @Override
    public void perfomDuties() {
        System.out.println(getFullName() + " is teaching " + numberOfLectures + " lectures.");
    }
}
