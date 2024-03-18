public class JavaString {
    public static void main(String a[]){
        //1. Strings are Immutable in nature. Here's an example.
        // String s1 = "Sriram";
        // System.out.println("Before Modification: " + s1);
        // int hashCode = System.identityHashCode(s1);
        // System.out.println(hashCode);   //Before Modification: Sriram
        //                                 //1247233941

        // s1 = s1 + " Venkatesh";
        // System.out.println("After modification " + s1);
        // int hashCode1 = System.identityHashCode(s1);
        // System.out.println(hashCode1);      //After modification Sriram Venkatesh
        //                                     //603742814


        
        //2. Strings are Class and we shud create an instance of it to use String. Heres an example.
        // String name = new String("Sriram Venkatesh");
        // System.out.println(name);

        //3. Strings will create separate object if the value of the string is different. If the value of the string is same, it wont create another object. Instead, It will just create one object and will link its address. Here's ann example 

        //Note: System.identityHashCode() -> Gives you the approximate integer representation of the Memory Address
        // String str1 = "Sriram";
        // System.out.println(System.identityHashCode(str1)); //1247233941
        // String str2 = "Sriram";
        // System.out.println(System.identityHashCode(str2)); //1247233941
        // System.out.println(str1 == str2); //True

        // String str1 = "Sriram";
        // System.out.println(System.identityHashCode(str1)); //1247233941
        // String str2 = "sriram";
        // System.out.println(System.identityHashCode(str2)); //1067040082
        // System.out.println(str1 == str2); //False

        //4. There's something called the String Buffer, in which Strings act as a Mutable object.
        //String Buffer -> Mutable String
        StringBuffer s1 = new StringBuffer("Sriram");
        StringBuffer s2 = new StringBuffer("Sriram");
        // System.out.println(s1 == s2);

        String str1 = "Hello";
        System.out.println("Original string: " + str1);

        // Concatenating " World" to the original string
        str1 = str1 + " World";
        System.out.println("Modified string: " + str1);

        StringBuffer sb = new StringBuffer("ewfhbwEHJBWHGBWJRBGJKWGWHGwnrlkgjlthbliw3hnlk3rhwgi3hg3lil3rfgh4bgjk4g");
        // sb.append(" private Limited");
        // sb.toString();
        // System.out.println(sb.length());
        sb.setLength(400);
        // System.out.println(sb.length());    
        // System.out.println(sb);  
        System.out.println(sb);  
    }
}
