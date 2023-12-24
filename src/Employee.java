public class Employee implements Comparable<Employee>{
    private String name, prenom ;
    private int cin ;
    private String matricule ;

    @Override
    public int compareTo(Employee other) {

        return this.name.compareTo(other.name);
    }
    public Employee(String name, String prenom, int cin, String matricule) {
        this.name = name;
        this.prenom = prenom;
        this.cin = cin;
        this.matricule = matricule;
    }
    public Employee(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin=" + cin +
                ", matricule='" + matricule + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee other = (Employee) obj;
        return cin == other.cin && matricule == other.matricule && name == other.name && prenom == other.prenom;
    }
}
