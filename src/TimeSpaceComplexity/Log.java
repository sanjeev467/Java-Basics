package TimeSpaceComplexity;

public class Log {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, 30, 40, 60};

        // find 40 in the given array
        //linear search -- linear T.C O(n)

//        for(int i = 0; i<arr.length; i++){
//            if(arr[i] == 40){
//                System.out.println("found 40 at index " + i);
//            }


        // With Binary Search -- T.C O(log n)

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int midElem = (start+end)/2;
            System.out.println(midElem);
            if(arr[midElem] == 40){
                System.out.println(midElem);
                break;
            }else if(arr[midElem]<40){
                start = midElem+1;
            }else{
                end = midElem-1;
            }

        }
    }
}
