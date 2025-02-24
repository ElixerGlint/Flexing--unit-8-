import java.util.ArrayList;
import java.util.Arrays;

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
            //or put i-- here
            }
        }

        System.out.println(highRollers);
        

        marblebag sack = new marblebag(10);

        System.out.println(sack);
        System.out.println(sack.pull());
        System.out.println(sack);

        System.out.println(sack.pull(5));
        System.out.println(sack);

        ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,0,0,5,0,2,0,4)); //equivilent to doing int[] abc = {1,2,4}
        System.out.println(number);
        movezerostostart(number);
        System.out.println(number);
        movezerostoend(number);
        System.out.println(number);

    }

    public static void movezerostoend(ArrayList<Integer> list) {
        for(int i = list.size()-1; i > -1; i--) {
            if(list.get(i) == 0) {
                list.add(list.remove(i));

            }
        }
    }

    public static void movezerostostart(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == 0) {
                list.add(0,list.remove(i));
            }
        }
    }


}
