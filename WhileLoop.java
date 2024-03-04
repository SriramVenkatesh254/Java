class WhileLoop{
    public static void main(String a[]){
        int i = 0;
        while(i <= 4){
            System.out.println("Heyy " + i);
            int j = 1;
            while(j <= 3){
                System.out.println("Good Morning " + j);
                j++;
            }
            i++;
        }
    }
}