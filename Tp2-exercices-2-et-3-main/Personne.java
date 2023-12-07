package Eercice3_personne;

public class Personne {
    String name,firstName;
    int dayNaisent ,monthNaissent, yearNaaissent;

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setDaeNaiss(int jour,int mois, int annee){
        dayNaisent=jour;
        monthNaissent=mois;
        yearNaaissent=annee;
    }
    public int ageEn2023(){
        return 2023-yearNaaissent;
    }
}
