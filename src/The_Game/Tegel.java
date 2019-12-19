package The_Game;

public class Tegel {

    public int waarde;
    private int X;
    private int Y;

    public int verhoogWaarde() {
        return 0;
    }

    public Tegel(int waarde) {
        this.waarde = waarde;
    }

    public Tegel() {
        this(0);
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }

    public void setX(int x) {
        this.X = x;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public boolean gelijkeWaarde(Tegel tegel) {
        return (tegel.getWaarde() == this.getWaarde());
    }
}
