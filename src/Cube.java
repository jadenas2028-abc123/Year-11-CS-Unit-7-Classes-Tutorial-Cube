public class Cube {
    private int side;

    public int getSide(){
        return side;
    }

    public void setSide(int side){
        this.side=side;
    }

    public Cube (int side){
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        this.side=side;
    }
    public Cube(){
        side = 1;
    }
    public int calculateVolume(){
        return side * side * side;
    }

    public int calculateSurfaceArea(){
        return side * side * 6;
    }

}
