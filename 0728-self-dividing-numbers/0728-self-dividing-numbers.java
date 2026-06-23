class Solution {
    static boolean isSelfDividing(int num){
        int original = num;
        while(num > 0){
            int temp = num % 10;
            
            if(temp == 0 || original % temp != 0 )
                return false;
            num /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isSelfDividing(i)){
                output.add(i);
            }
        }
        return output;
    }
}