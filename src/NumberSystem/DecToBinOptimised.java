package NumberSystem;


class Converter{
    public String toBinary(int decimalNo){
        String result = "";
        while(decimalNo != 0){
            int lastBit = decimalNo & 1;
            result = lastBit + result;
            decimalNo = decimalNo>>1;
        }
        return result;
    }
}

public class DecToBinOptimised {
    public static void main(String[] args) {
        // create object of the converter class

        Converter converter = new Converter();
        System.out.println(converter.toBinary(10));

    }
}
