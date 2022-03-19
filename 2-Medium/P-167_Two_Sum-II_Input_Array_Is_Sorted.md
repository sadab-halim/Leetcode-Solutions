## [Two Sum II - Input Array Is Sorted]()

*Example-1:* <br/>
*Input:* numbers = [2,7,11,15], target = 9 <br/>
*Output:* [1,2] <br/>
*Explanation:* The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2]. <br/>

*Example-2:* <br/>
*Input:* numbers = [2,3,4], target = 6 <br/>
*Output:* [1,3] <br/>
*Explanation:* The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3]. <br/>

*Example-3:* <br/>
*Input:* numbers = [-1,0], target = -1 <br/>
*Output:* [1,2] <br/>
*Explanation:* The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2]. <br/>

### Solution
```
public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                break;
            }
            if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{i+1,j+1};
    }
```