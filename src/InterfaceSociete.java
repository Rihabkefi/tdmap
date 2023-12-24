public interface InterfaceSociete {
    public void ajouterEmployeDepartement(Employee e,Departement d);
    public void supprimerEmploye(Employee e);
    public void afficherLesEmployesLeursDepartements();
    public void afficherLesEmployes();
    public void afficherLesDepartements();
    public void afficherDepartement(Employee e);
    public boolean rechercherEmploye(Employee e);
    public boolean rechercherDepartement(Departement d);
}
