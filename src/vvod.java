/**
 * Created by kirillov.mv on 26.03.2015.
 */
public class vvod {
    public static void main(String args[]) {
       Reader r = new Reader();
        r.Scann();
        r.a = pluss(r.a);
        r.b =  pluss(r.b);


        System.out.println("vashe_chislo 1 =" + r.a);
        System.out.println("vashe chislo 2 =" + r.b);
    }

    private static int pluss(int x) {
        x = x + 4;
        return x;

    }
}
