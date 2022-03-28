public TreeNode invertTree (TreeNode root) {
    if (root == null)
        return root;
    TreeNode leftNode = root.left;
    root.left = invertTree(root.right);
    root.right = invertTree(leftNode);
    return root;
}