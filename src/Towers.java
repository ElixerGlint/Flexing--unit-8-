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
            a.add(0,i + 1);
        }
    }

    public void makemove(String peg1, String peg2) {
        ArrayList<Integer> one = getpeg(peg1);
        ArrayList<Integer> two = getpeg(peg2);

        //check if the moves are legal
        if(one.size()==0) {
            one.add(two.remove(two.size()-1));
        }
        else if (two.size() ==0) {
            two.add(one.remove(one.size()-1));
        }
        else {
            if(one.get(one.size()-1) < two.get(two.size()-1)) { //if two is bigger
                two.add(one.remove(one.size()-1));
            }
            else {
                one.add(two.remove(two.size()-1));
            }
        }
        return;
    }

    public ArrayList<Integer> getpeg(String peg) {
        if(peg.equals("A")) {
            return a;
        }
        if(peg.equals("B")) {
            return b;
        }
        return c;
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
