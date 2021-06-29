public class Autoconvert {
    public static void main(String[] args) {
        byte a = 1;
        short b = (short) a;
        System.out.println("byte в short "+b);
        int c = (int) b;
        System.out.println("short в int "+c);
        long d = (long) c;
        System.out.println("int в long "+d);
        double e = (double) d;
        System.out.println("long в double "+e);

        char f = 1;
        int g = (int) f;
        System.out.println("char в int "+g);
        float h = (float) g;
        System.out.println("int в float "+h);
        double i = (double) h;
        System.out.println("float в double "+i);

        int j = 1;
        double k = (double) j;
        System.out.println("int в double "+k);

        long l = 1;
        float m = (float) l;
        System.out.println("long в float "+m);
    }
}