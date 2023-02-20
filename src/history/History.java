package history;

import java.util.Queue;
import java.util.LinkedList;

public class History {
    static Queue<String> calcHistory = new LinkedList<String>();

    //Storing only Last 5 calculations
    public static void insertLatestCalc(String calc){
        int currentSize = calcHistory.size();
        if(currentSize >= 5){
            calcHistory.remove();
        }
        calcHistory.add(calc);
    }

    public static void getLastFiveTransactions(){
        for (String calc: calcHistory) {
            System.out.println(calc);
        }
    }
}
