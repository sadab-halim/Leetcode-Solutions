public List<Integer> postorderTraversal(TreeNode root){
    ArrayList<Integer> res = new ArrayList<Integer>();

    postOrder(res, root);
    return res;
}

public void postOrder(List<Integer> res, TreeNode root){
    if(root == null)
        return;
    postOrder(res, root.left);
    postOrder(res, root.right);
    res.add(root.val);
}