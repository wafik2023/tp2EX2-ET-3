package Eercice3_personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p =new Personne();
        p.setFirstName("imen");
        p.setName("ouerdiene");
        p.setDaeNaiss(12,7,2003);
        System.out.println(p.firstName+" "+p.name+" votre age est:"+p.ageEn2023());
    }
}
