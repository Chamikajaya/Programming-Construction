public abstract  class Shape {
    private int length;
    private int width;

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }
    // Overloaded Constructor -> for square
    public Shape(int length) {
        this.length = length;
    }



    // getters


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    // Setters
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

