package Exercice2_Point;

public class Point {
    int abs;
    int ord;

    public  static int nombre;
    int numero=nombre;

    public Point() {
        this.abs=0;
        this.ord=0;
        nombre++;
    }
    void setcoordonnerPoint(int u, int v){
        abs=u;
        ord=v;
    }
    void translate(int u, int v){
        abs=abs+u;
        ord=ord+v;
    }

    public  void affichePoint(){
        System.out.println("l'abs:"+abs);
        System.out.println("ord:"+ord);
    }
    public boolean origine(){
        if (abs==0 && ord==0){
            return true;
        } else return false;

    }
    public boolean egale( Point p1,Point q){
        if (p1.abs==q.abs && p1.ord==q.ord){
            return true;
        } else return false;

    }

    public Point(int u, int v) {
        this.abs = u;
        this.ord = v;
        nombre++;
    }
    public void setCoordonnePoint(Point p){
        abs=p.abs;
        ord=p.ord;
    }
    public Point symetrie(int u, int v){
        return new Point(-u,-v);
    }
}
