abstract class Employee {
    private String firstName;

    private String lastName;
    private int id;

    private String department;
    private boolean isMillitary;
    private int yearsOfExperience;

    public Employee(String firstName, String lastName, int id, String department, boolean isMillitary,int yearsOfExperience) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
        this.isMillitary = isMillitary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public abstract double calculateSalary();

    public String getFullName() {

        return firstName + " " + lastName;
    }
    public String getDepartment() {
        return department;
    }
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + getFullName() + ", Department: " + department + ",Experience:" + yearsOfExperience + "years";
    }
}