package leetcode;

public class FinalValueOfVariableAfterOperation {
    public static void main(String[] args) {
        String[] operations = new String[]{"++X","++X","X++"};
        System.out.println(finalValue(operations));
    }

    private static int finalValue(String[] operations){
        int X = 0;
        for (int i=0; i<operations.length; i++){
            if(operations[i].charAt(1) == '+'){
                ++X;
            }else{
                --X;
            }
        }

        return X;
    }
}
