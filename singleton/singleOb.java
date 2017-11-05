public class singleOb{
    private static singleOb instance = new singleOb();

    private singleOb(){}

    public static singleOb getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello world!");
    }
}