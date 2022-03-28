public List<List<Integer>> levelOrder(TreeNode root){
    Deque<TreeNode> queue = new ArrayDeque<>();
    List<List<Integer>> res = new ArrayList<>();

    if(root != null)
        queue.add(root);
    
    while(!queue.isEmpty()){
        int toPop = queue.size();
        List<Integer> k = new ArrayList<>(toPop);

        while(toPop > 0){
            TreeNode curr = queue.pop();
            k.add(curr.val);
            toPop--;

            if(curr.left != null)
                queue.add(curr.left);
            if(curr.right != null)
                queue.add(curr.right);
        }
        res.add(k);
    }
    return res;
}