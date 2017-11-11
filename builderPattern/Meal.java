import java.util.ArrayList;
import java.util.List;

public class Meal{
    private List<item> items = new ArrayList<item>();

    public void addItem(item item1){
        items.add(item);
    }

    public flaot getCost(){
        float cost = 0.0f;
        for(item element:items){
            cost += element.price();
        }
        return cost;
    }

    public void showItems(){
        for(item elements:items){
            System.out.print("Item"+element.name());
            System.out.print(",Packing:"+element.packing().pack());
            Syetem.out.println(", Price:" + element.price());
        }
    }
}