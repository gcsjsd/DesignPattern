public abstract class Burger implements item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }
    @Override
    public abstract float price();
}