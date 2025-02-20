import java.util.ArrayList;

public class Flex {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Integer> rolls = new ArrayList<>();
        int roll;
        do  {
            roll = (int)(Math.random()*6) + (int)(Math.random()*6) + 2;
            rolls.add(roll);
        } while(roll != 12);

        System.out.println(rolls);
        System.out.println(rolls.size());
        /* 
        if(rolls.size() < 10) {
            rolls.add(13);
        }
        else{
            rolls.add(2,13);
        }*/
        
        //rolls.add(Math.min(10,rolls.size()),13);
        //System.out.println(rolls);

        /* 
        rolls.remove((Integer)7);
        System.out.println(rolls);
        rolls.remove(7);
        System.out.println(rolls);
        System.out.println(rolls.remove(0));
        System.out.println(rolls);
        System.out.println(rolls.remove((Integer) 3));
        //ADD AND REMOVE can crash
        */

        ArrayList<Integer> highRollers = new ArrayList<>();
       
        for(int i = 0; i < rolls.size(); i++) {
            if (rolls.get(i) > 9) {
            highRollers.add(rolls.remove(i--));
            }
        }

        System.out.println(highRollers);

    }
}
