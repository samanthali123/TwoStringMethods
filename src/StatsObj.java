import java.util.ArrayList;
import java.util.List;

public class StatsObj {
    ArrayList<String> letterList = new ArrayList<>();


    public void add(String letter) {
        letterList.add(letter);
    }

    public int getCountOf(String letter) {
        int count = 0;
        for (int i = 0; i < letterList.size(); i++) {
            if (letterList.get(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public String getMostFreq() {
        return getMostFreq(letterList);
    }

    public String getMostFreq(List<String> list) {
        int biggestCountSoFar = 0;
        String output = "";

        for (int i = 0; i < list.size(); i++) {
            int count = getCountOf(list.get(i));
            if (count > biggestCountSoFar) {
                biggestCountSoFar = count;
                output = list.get(i);
            }
        }
        return output;
    }

    public ArrayList<String> getTop3MostFreq() {
        ArrayList<String> output = new ArrayList<>();
        List<String> clone = new ArrayList<>(letterList);
        for (int i = 0; i < 3; i++) {
            String letter = getMostFreq(clone);
            output.add(letter);
            while (clone.contains(letter)) {
                clone.remove(letter);
            }
        }
        return output;
    }

    public int getTotalCount() {

        return letterList.size();
    }

    public int getUniqueVals() {
        String s = "";
        for (int i = 1; i < letterList.size(); i++) {
            if (s.indexOf(letterList.get(i)) == -1) {
                s += letterList.get(i);
            }
        }
        return s.length();
    }

    public ArrayList<String> getTopNMostFreq(int n) {
        ArrayList<String> output = new ArrayList<>();
        List<String> clone = new ArrayList<>(letterList);

        for (int i = 0; i < n; i++) {
            String letter = getMostFreq(clone);
            output.add(letter);
            while (clone.contains(letter)) {
                clone.remove(letter);
            }
        }
        return output;
    }
}
