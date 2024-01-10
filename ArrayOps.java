public class ArrayOps {
    public static void main(String[] args) {
        int[] arr  = {1, 2, 3, 4, 1, 5} ;
        int[] test = {1, 2, 2, 1, 3, 4};
        System.out.println(findMissingInt(arr));
        System.out.println(secondMaxValue(arr));
        System.err.println(containsTheSameElements(arr, test));
        System.err.println(isSorted(arr));

        
    }
    
    public static int findMissingInt (int [] array) {
        boolean exist = false;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i <= array.length; i++) {
                if((array[i]) == j) exist=true; 
                if(exist==false && i==array.length-1) return j;
                }
                exist=false;
            }
           return -1; 
        }


    public static int secondMaxValue(int [] array) {
         int max = array [0];
         int max2 = array [0];
         for (int i = 1; i < array.length; i++) {
               if (array[i] > max) {
               max2 = max;
               max = array[i];
                
                
            }
            
         }

        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
       // Check if every element in array2 is also in array1

        for (int i = 0; i < array2.length; i++) {
            boolean found = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
            }

        }
       
        if(!found) return false;

    }
    // Check if every element in array1 is also in array2

         for (int k = 0; k < array1.length; k++) {
            boolean found = false;
            for (int m = 0; m < array2.length; m++) {
                if (array1[k] == array2[m]) {
                    found = true;
                    break;
                
            }
            
         }       
                
        if(!found) return false;
    
        }

           return true;

    }

    public static boolean isSorted(int [] array) {
        for (int i = 0; i < array.length -2; i++) {
           int current = array[i];
           int nextOne = array[i+1];                
           if(array[0] <= array[array.length-1]) {
            if(current > nextOne) return false;
           }
        
        if(array[0] >= array[array.length-1]) {
            if(current < nextOne) return false;
        }
    
        }
        return true;
    }

}


