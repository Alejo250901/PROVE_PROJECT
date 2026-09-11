public class Punto {
    private int x,y;
    public Punto(){
        this.setX(0);
        this.setY(0);
    }    
    public Punto(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    public double modulo(){
        return (double) Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
}
