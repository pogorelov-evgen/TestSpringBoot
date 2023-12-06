import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list = list.stream().map(x->x*2).toList();
        list = list.stream().filter(x->x%2==0).map(x->x*2).map(x->2).toList();



    }
}