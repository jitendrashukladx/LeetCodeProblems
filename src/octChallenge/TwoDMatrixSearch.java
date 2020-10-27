package octChallenge;

public class TwoDMatrixSearch {
    boolean binarySearch(int[] matrix, int target) {
        int l = 0;
        int h = matrix.length-1;
        int m;
        //if(matrix.length == 1 && matrix[l] == target)
        //    return true;
        while (l <= h){
            m = (h+l)/2;
            if(matrix[m] == target)
                return true;
            if(matrix[m] > target)
                h = m-1;
            else l = m+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        if(matrix.length <= 0)
            return false;
        for(; i < matrix.length-1; i++){
            if(matrix[i][0] <= target && matrix[i][matrix[i].length-1]>= target)
                break;
        }
        boolean result = binarySearch(matrix[i], target);
        if(result == true){
            return result;
        }
        return false;
    }
}
