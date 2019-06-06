import java.util.Scanner;

public class NewClass {
    public static float r;

    public NewClass(float arg){
        r=arg;
    }

    public static float Square() {
        float Square = (float) (Math.PI * Math.pow(r, 2));
        return Square;
    }

    public static float Perimetr() {
        float Perimetr = (float) (2 * Math.PI * r);
        return Perimetr;
    }

    public static float Scope() {
        float Scope = (float) (4 / 3 * Math.PI * Math.pow(r, 3));
        return Scope;
    }

    public static void main(String[] args) {
        System.out.print("Insert radius ");
        Scanner in= new Scanner(System.in);
        float r = in.nextFloat();
        NewClass Sphere = new NewClass(r);
        System.out.println("Square: " + Sphere.Square());
        System.out.println("Perimetr: " + Sphere.Perimetr());
        System.out.println("Scope: " + Sphere.Scope());

    }
}
