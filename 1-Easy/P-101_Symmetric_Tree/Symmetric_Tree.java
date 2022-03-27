public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return true;
        if (root.left == null || root.right == null) return false;

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode root1, TreeNode root2) {
        boolean left = true;
        boolean right = true;

        if (root2 == null) return false;
        if (root1.val != root2.val)
            return false;
        if (root1.left != null)
            left = isSymmetric(root1.left, root2.right);
        else if(root2.right!=null)
            left=false;
        if (root1.right != null)
            right = isSymmetric(root1.right, root2.left);
        else if(root2.left!=null)
            right=false;
        
        return (left && right);
    }