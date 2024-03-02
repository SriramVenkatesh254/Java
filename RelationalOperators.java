class RelationalOperators{
    public static void main(String a[]){
        
        //Relational Operators
        // < -> Lesser than
        // > -> Greater than
        // <= -> Lesser than equal to
        // >= -> Greater than equal to
        // == -> Equal to
        // != -> Not equal to
        
        //Lesser than
        int x = 10;
        int y = 3;
        boolean result = x < y;
        System.out.println(result); //false

        //Greater than
        int x = 10;
        int y = 3;
        boolean result = x > y;
        System.out.println(result); //true

        //Lesser than equal to
        int x = 41;
        int y = 40;
        boolean result = x <= y;
        System.out.println(result); //false

        //Greater than equal to
        int x = 41;
        int y = 40;
        boolean result = x >= y;
        System.out.println(result); //true

        //Equal to
        int x = 5;
        int y = 5;
        boolean result = x == y;
        System.out.println(result); //true

        //Not equal to
        int x = 5;
        int y = 6;
        boolean result = x != y;
        System.out.println(result); //true
    }
}