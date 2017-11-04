public class factoryDemo{
    public static void main(String[] args){
        shapeFactory shapeFactory1 = new shapeFactory();
        shape shape1 = shapeFactory1.getShape("CIRCLE");

        shape1.draw();
    }
}