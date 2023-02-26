package student;

public class Add {
    public static int addArray(int []list){
        int result = 0;
        for(int i=0;i<list.length;i++){
            result+=list[i];
        }
        return result;
    }
}
