import java.util.ArrayList;

public class marblebag {
    private ArrayList<String> marbles;

    public marblebag(int count) {
        marbles = new ArrayList<String>();
        for(int i = 0; i < count; i++) {
            int tempnum = (int)(Math.random()*4);
            if(tempnum == 0) {
                marbles.add("Red");
        
            }
            if(tempnum == 1) {
                marbles.add("Blue");
           
            }
            if(tempnum == 2) {
                marbles.add("Green");
               
            }
            if(tempnum == 3) {
                marbles.add("Gold");
         
            }
        }
    }

    public String pull() {
        if(marbles.size() == 0) {
            return "No marbles left!";
        }
        int temp = (int)(Math.random()*marbles.size());
        return (marbles.remove(temp));
    }

    @Override
    public String toString() {
        return "marblebag [marbles=" + marbles + "]";
    }



    
}
