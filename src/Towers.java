import java.util.ArrayList;

public class Towers {
    private ArrayList<Integer> a;
    private ArrayList<Integer> b;
    private ArrayList<Integer> c;

    public Towers (int num) {
        a = new ArrayList<>();
        b = new ArrayList<>();
        c = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            a.add(0,i);
        }
    }

    @Override
    public String toString() {
        String output = "";
        output += "a: " + a + "\n";
        output += "b: " + b + "\n";
        output += "c: " + c + "\n";

        return output;
    }
    
    
}
