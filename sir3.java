public class sir3 {
    public static void main(String[] args){
        // Data Types
        // Two Types 1- Primitive ex - byte , short , boolean , char 
        // 2 - Non Primitive  ex - String , Array etc
    
        // Numeric DT - short , byte , int , long
        /* 
        byte num1 = 100;
        System.out.println(num1); // Range from -128 to 127
        short num2 = 3000;
        System.out.println(num2);
        int num3 = 50000;
        long num4 = 7000000;
        */

        // Floating DT
        /* 
        float  num5 = 3.14f;
        System.out.println(num5);
        double num6 = 7.27373773783;
        System.out.println(num6);
        */
       //other - Char , Boolean
       /* 
       boolean eligibleToVote=true;
       System.out.println(eligibleToVote);
       char firstCharacter = 'a';
       System.out.println("My first charcter is " + firstCharacter);

       char secondCharacter = 'b';
       System.out.println("My second character is "+ (char)(secondCharacter+2) );
    */
    //Type Casting
    byte num1 = 2;
    int num = num1;
    System.out.println(num); // Implicit Conversion - Kissi choote datatype ko baade datatype mai convert krna 

    // Explicit - Kissi bade datatype ko kissi choote datatype mai convert krna (Data Loss ho jata range sai bahar jaane pr)
    long value1 = 123456789;
    int value = (int)value1;
    System.out.println(value);







    }
}
