TreeNode prev = null;
public boolean isValidBST(TreeNode root) {
    if (root != null){
        if(!isValidBST(root.left))
            return false;
        if(prev != null && root.val <= prev.val)
            return false;
        prev = root;
        return isValidBST(root.right);
    }
    return true;
}