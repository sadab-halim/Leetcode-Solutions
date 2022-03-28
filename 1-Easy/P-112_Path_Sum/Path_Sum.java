public boolean hasPathSum(TreeNode root, int targetSum) {
    return findTargetSum(root, targetSum, 0);
}
public static boolean findTargetSum(TreeNode node, int target, int currSum){
    if(node == null)
        return false;
    
    currSum += node.val;
    if(node.left == null && node.right == null)
        if(currSum == target)
            return true;
    
    return findTargetSum(node.left, target, currSum) || findTargetSum(node.right, target, currSum);
}