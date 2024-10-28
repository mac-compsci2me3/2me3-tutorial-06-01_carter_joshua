public class Drawing {
    private static Drawing instance = null;
    
    private Drawing() {}

    public static Drawing getInstance()
    {
        if (Drawing.instance == null)
            Drawing.instance = new Drawing();
        return Drawing.instance;
    }

    public void drawShape(Shape shape)
    {
        System.err.println("Drawing a " + shape.getClass().getName() + " with color: " + shape.color + " and area: " + shape.calculateArea());
    }
}
