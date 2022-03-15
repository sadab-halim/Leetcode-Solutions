## [Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/)

Given the root of a binary tree, return the sum of all left leaves.

*Example-1* <br/>
*Input:* root = [3,9,20,null,null,15,7] <br/>
*Output:* 24 <br/>
*Explanation:* There are two left leaves in the binary tree, with values 9 and 15 respectively. <br/>

*Example-2* <br/>
*Input:* root = [1] <br/>
*Output:* 0 <br/>

### Solution
```
public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        return sumLeftLeaves(root, false);
    }
    
    public int sumLeftLeaves(TreeNode root, boolean left){
        if(root == null) return 0;
        if(root.left == null && root.right == null && left == true) return root.val;
        int l = sumLeftLeaves(root.left, true);
        int r = sumLeftLeaves(root.right, false);
        return l+r;
    }
```