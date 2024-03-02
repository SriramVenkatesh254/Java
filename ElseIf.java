class ElseIf{
    public static void main(String[] args){
        int x = 60;
        int y = 50;
        int z = 70;

        if (x > y && x > z){
            System.out.println("X is greater than Y and Z");
        }
        else if( y > z){
            System.out.println("Y is greater than X and Z");
        }
        else{
            System.out.println("Z is greater than X and Y");
        }
    }
}