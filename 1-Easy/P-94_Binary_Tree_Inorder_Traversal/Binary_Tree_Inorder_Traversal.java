public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lstRs = new ArrayList<Integer>();
    traverseInOrder(root, lstRs);
    return lstRs;
    }

    public void traverseInOrder(TreeNode node, List<Integer> lstRs) {
        if(node != null) {
            traverseInOrder(node.left, lstRs);
            lstRs.add(node.val);
            traverseInOrder(node.right, lstRs);
        }
    }