class MultiDimensioanlArrays{
    public static void main(String a[]){

        // int matrix[] = new int[4]; //Defining a single dimensional array
        // int matrix[][] = new int[3][4]; //Defining a multi-dimensional array

        int matrix[][] = {
            {0,1,2,3}, 
            {4,5,6,7}, 
            {8,9,1,1}, 
            {1,1,1,1}
        };

        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Matrix printing example
        // int matrix[][] = new int[3][4];
        // for(int i = 0; i < 3; i++)
        // {
        //     for(int j = 0; j < 4; j++)
        //     {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    
    }
}