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