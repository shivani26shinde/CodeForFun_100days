// LeetCode --> Virtual Contest --> Question 1 --> Can Place Flowers

class canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i=1;
        while(i<flowerbed.length-1){
            if(flowerbed[i] == 0){
                if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                    count++;
                    i++;
                    if(count >= n){
                        return true;
                    }
                }
            }
            i++;
        }
        if(count >= n){
            return true;
        }
        return false;
    }
}