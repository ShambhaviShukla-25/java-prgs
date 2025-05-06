public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // byte
        byte smallVal = 100;
        System.out.println("Byte Value: " + smallVal);

        // short
        short mediumVal = 10000;
        System.out.println("Short Value: " + mediumVal);

        // int
        int normalVal = 10_00_000; // Java allows the use of _ with large integer numebrs for readability
        System.out.println("Int Value: " + normalVal);

        // long
        long largeVal = 1_00_00_00_00_000L; // 'L' or 'l'  suffix is needed for long values
        System.out.println("Long Value: " + largeVal);

        // float
        float floatVal = 2.04f;             // 'F' or 'f'  suffix is needed for long values
        System.out.println("Float Value: " + floatVal);

        // double
        double doubleVal = 3.653276924975297475548626;
        System.out.println("Double Value: " + doubleVal);

        // char
        // assigning numeric UNICODE value
        char charVal1=65;    //ASCII code for 'A'
        char charVal2='B';   
        System.out.println("charVal1: "+charVal1+" charVal2: "+charVal2);    //will print A  B

        // boolean
        boolean boolVal=false;
        System.out.println("Boolean Value of boolVar: "+boolVal);
    }
}
