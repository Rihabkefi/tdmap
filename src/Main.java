

public class Main {
    public static void main(String[] args) {
        InterfaceSociete societeHashMap = new SocieteHashMap();
        InterfaceSociete societeTreeMap = new SocieteTreeMap();

        Employee employe1 = new Employee("123", "E001", 123456, "rihab");
        Employee employe2 = new Employee("426", "E002", 125896, "iyed");

        Departement departement1 = new Departement(1, "HR");
        Departement departement2 = new Departement(2, "IT");

        societeHashMap.ajouterEmployeDepartement(employe1, departement1);
        societeHashMap.ajouterEmployeDepartement(employe2, departement2);

        societeTreeMap.ajouterEmployeDepartement(employe1, departement1);
        societeTreeMap.ajouterEmployeDepartement(employe2, departement2);

        System.out.println("Employees and their departments (HashMap):");
        societeHashMap.afficherLesEmployesLeursDepartements();

        System.out.println("Employees and their departments (TreeMap):");
        societeTreeMap.afficherLesEmployesLeursDepartements();

        societeHashMap.supprimerEmploye(employe1);

        System.out.println("Employees and their departments after removal (HashMap):");
        societeHashMap.afficherLesEmployesLeursDepartements();

        System.out.println("Is employe1 in the HashMap? " + societeHashMap.rechercherEmploye(employe1));
        System.out.println("Is employe1 in the TreeMap? " + societeTreeMap.rechercherEmploye(employe1));

    }
}