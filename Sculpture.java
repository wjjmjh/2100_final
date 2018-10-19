import java.util.ArrayList;

public class Sculpture {

    ArrayList<Shape> storage = new ArrayList<>();


    public Sculpture(){};

    public void store(ArrayList<Shape> list){
        this.storage.addAll(list);
    }

    public void store_add(Shape s){
        this.storage.add(s);
    }

    public double area(){
        double res = 0;
        for (Shape s : storage){
            res += s.getArea();
        }
        return res;
    }

    public Boolean hasBalance(){

        for (Shape s: storage){
            if (cirCheck(s) == false){
                return false;
            }
        }

        return true;

    }

    public Boolean cirCheck(Shape s){

        if (s instanceof Circular){
            if (! (loop(s.x-1, s.y) || loop(s.x+1, s.y) || loop(s.x, s.y+1) || loop(s.x, s.y-1))){
                return false;
            }
        }

        return true;

    }

    public Boolean loop(int x, int y){
        for (Shape s : storage){
            if (s.x == x && s.y == y && s instanceof Square){
                return true;
            }
        }

        return false;
    }


}
