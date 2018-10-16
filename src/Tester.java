import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        StatsObj obj = new StatsObj();

        obj.add("a");
        obj.add("a");
        obj.add("a");
        obj.add("a");
        obj.add("c");
        obj.add("s");
        obj.add("s");
        obj.add("s");
        obj.add("q");
        obj.add("q");

        System.out.println(obj.getCountOf("a"));            //should return 4
        System.out.println(obj.getCountOf("e"));            //should return 0
        System.out.println(obj.getTotalCount());                  // should return 10
        System.out.println(obj.getUniqueVals());                  //should return 4
        System.out.println(obj.getMostFreq());                    //should return "a"

        ArrayList<String> top3 = obj.getTop3MostFreq();           //should return {"a", "s", "q"}
        System.out.println(Arrays.toString(top3.toArray()));
        ArrayList<String> topN = obj.getTopNMostFreq(2);
        System.out.println(Arrays.toString(topN.toArray()));
    }
}
