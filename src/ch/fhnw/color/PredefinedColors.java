package ch.fhnw.color;

public enum PredefinedColors {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0),
    CYAN(0, 255, 255),
    ORANGE(255, 165, 0),
    WHITE(255, 255, 255),
    BLACK(0, 0, 0);


    private final int r;
    private final int g;
    private final int b;

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    private PredefinedColors(final int r, final int g, final int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

}
