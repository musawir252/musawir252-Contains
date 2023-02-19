

public class Contains {

    /**
     * This method should search an array to see if that array contains some value.
     * You will need to use a for loop to check every value of the array to see if it matches the target value.
     *
     * @param arr array to be manipulated.
     * @param target the value that the method should be searching for.
     * @return true if arr contains target, false otherwise.
     */
    public boolean arrayContains(int[] arr, int target){
        //for loop to traverse through array to find value
        for(int index = 0; index <arr.length; index++){
            //if statement to compare value to target example arr[0] = 1 but target equals 2 so that will not work until it finds arr[i] to be equal to target return true if so 
            if(arr[index] == target){
                return true;
            } 
        }//otherwise return false
            return false;
        
        
    }
}