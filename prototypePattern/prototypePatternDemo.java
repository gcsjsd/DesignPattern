public class prototypePatternDemo{
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape cloneShape = (Shape) ShapeCache.getShape("2");
        System.out.print("Shape": + cloneShape.getType());
    }
}