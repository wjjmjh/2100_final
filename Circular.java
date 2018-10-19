public class Circular extends Shape{


    public Circular(int x, int y){

        this.x = x;
        this.y = y;

    }

    @Override
    public double getArea(){return Math.PI * Math.pow(0.5, 2);}

}
