class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1sum = 0;
        int arr2sum = 0;
        for (int o : arr1) {
            arr1sum += o;
        }
        for (int m : arr2) {
            arr2sum += m;
        }
        if(arr1.length > arr2.length) {
            return 1;
        } else if (arr2.length > arr1.length) {
            return -1;
        } else {
            if(arr1sum > arr2sum) {
                return 1;
            } else if(arr2sum > arr1sum) {
                return -1;
            } else return 0;
        }
    }
}