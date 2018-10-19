import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Sculpture sul = new Sculpture();
        Circular c = new Circular(1,1 );
        Square s = new Square(0, 1);
        ArrayList<Shape> sss = new ArrayList<>();
        sss.add(c);
        sss.add(s);
        sul.store(sss);
        System.out.println(sul.hasBalance());
        // second commit
        // third commit 
    }
}
