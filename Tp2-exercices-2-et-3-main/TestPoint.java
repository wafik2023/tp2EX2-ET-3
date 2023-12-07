package Exercice2_Point;

public class TestPoint {
    public static void main(String[] args) {
        Point q=new Point(7,2);
        System.out.println("l'abs et l'ord de point "+q.numero+" sont:");
        q.affichePoint();


        Point p=new Point();
        System.out.println("l'abs et l'ord  de  point "+p.numero+" sont:");
        p.affichePoint();

        p.setcoordonnerPoint(5,9);
        System.out.println("les nouveaux l'abs et l'ord  de  point "+p.numero+" sont:");
        p.affichePoint();
        p.translate(1,2);
        System.out.println("les nouveaux l'abs et l'ord  de  point "+p.numero+" sont:");
        p.affichePoint();
        if(p.origine()){
            System.out.println("le point "+p.numero+"est dans l'origine");
        }
        if (p.egale(p,q)){
            System.out.println(" l'abs et l'ord de point p et q sont égaux");
        }
        System.out.println("le nombre de point est "+Point.nombre);
    }
}
