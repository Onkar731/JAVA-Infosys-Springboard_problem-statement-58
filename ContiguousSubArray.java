public class ContiguousSubArray {
    public static int maxLengthSubArray(char []array) {
        int maxlen = 0;

        // finding max length of contiguous sub array
        for(int start = 0; start < array.length; start++) {
            int aCount = 0;
            int bCount = 0;

            for(int end = start; end < array.length; end++) {
                if(array[end] == 'a') {
                    aCount++;
                } else {
                    bCount++;
                }

                if(aCount == bCount) {
                    maxlen = Math.max(maxlen, end - start + 1);
                }
            }
        }

        // returning max length of sub array
        return maxlen;
    }
}