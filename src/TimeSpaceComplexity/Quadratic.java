package TimeSpaceComplexity;

public class Quadratic {
    public static void main(String[] args) {
        int[] arr= new int[] {3, 4, 5 , 10, 0, 5, 6, 25, 30};

        int target =10;
        // find pairs whose sum = target (10)

        // as a beginner we do like

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                System.out.println("Pairs are: " +  arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
