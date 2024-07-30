package NumberSystem;


class ConverterBToD{
    public int toDecimal(int binaryNo){
        int result = 0;
        int index = 0;

        while(binaryNo != 0){
            int lastDigit = binaryNo % 10;
            if(lastDigit == 1){
                result = result + (int) Math.pow(2, index);
            }
            index = index + 1;
            binaryNo = binaryNo / 10;
        }
        return result;

    }
}

public class BinToDecOptimised {
    public static void main(String[] args) {
        // create object of the converter class

        ConverterBToD converter = new ConverterBToD();
        System.out.println(converter.toDecimal(1010));

    }
}
