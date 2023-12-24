import java.util.Map;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete{
    private Map<Employee, Departement> employeDepartementMap = new TreeMap<>();
    public void ajouterEmployeDepartement(Employee e,Departement d){
        employeDepartementMap.put(e,d);
    }
    public void supprimerEmploye(Employee e){
        employeDepartementMap.remove(e);
    }
    public void afficherLesEmployesLeursDepartements(){
        for (Map.Entry<Employee, Departement> entry : employeDepartementMap.entrySet()) {
            System.out.println("Employe: " + entry.getKey() + ", Departement: " + entry.getValue());
        }

    }
    public void afficherLesEmployes(){
        for (Employee e : employeDepartementMap.keySet()){
            System.out.println(e);
        }
    }
    public void afficherLesDepartements(){
        for ( Departement d : employeDepartementMap.values()){
            System.out.println(d);

        }
    }
    public void afficherDepartement(Employee e){
        Departement d = employeDepartementMap.get(e);
        if (d != null) {
            System.out.println("Departement de l'employe " + e + ": " + d);
        } else {
            System.out.println("Employe non trouvé.");
        }
    }
    public boolean rechercherEmploye(Employee e){
        return  employeDepartementMap.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d) {
        return employeDepartementMap.containsValue(d);
    }

}
