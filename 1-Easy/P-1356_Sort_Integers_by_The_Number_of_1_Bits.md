## [Sort Integers by the Number of 1 Bits](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/)

You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.

Return the array after sorting it.

*Example-1:*
*Input:* arr = [0,1,2,3,4,5,6,7,8] <br/>
*Output:* [0,1,2,4,8,3,5,6,7] <br/>
*Explantion:* [0] is the only integer with 0 bits. <br/>
[1,2,4,8] all have 1 bit. <br/>
[3,5,6] have 2 bits. <br/>
[7] has 3 bits. <br/>
The sorted array by bits is [0,1,2,4,8,3,5,6,7]

*Example-2:* <br/>
*Input:* arr = [1024,512,256,128,64,32,16,8,4,2,1] <br/>
*Output:* [1,2,4,8,16,32,64,128,256,512,1024] <br/>
*Explantion:* All integers have 1 bit in the binary representation, you should just sort them in ascending order. <br/>

### Solution:
```
public int[] sortByBits(int[] arr) {
        int l =arr.length;
        for(int i=0;i<l;i++){
            arr[i]+=10001*Integer.bitCount(arr[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<l;i++){
            arr[i]=arr[i]%10001;
        }
        return arr;
    }
```