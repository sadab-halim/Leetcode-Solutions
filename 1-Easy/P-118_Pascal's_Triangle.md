## [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)

Given an integer numRows, return the first numRows of Pascal's triangle.

*Example-1:* <br/>
*Input:* numRows = 5 <br/>
*Output:* [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]] <br/>

*Example-2:* <br/> 
*Input:* numRows = 1 <br/>
*Output:* [[1]] <br/>

### Solution
```
public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<numRows; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j <i+1; j++){
                if(j==0 || j==i){
                    temp.add(1);
                }else{
                    temp.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }  
            }
            ans.add(temp);
        }
        return ans;
    }
```