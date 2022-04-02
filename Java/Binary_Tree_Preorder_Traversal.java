public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
		if(root == null) { return list; }
		return recHelper(root, list);
	}

	private static List<Integer> recHelper(TreeNode curr, List<Integer> list){
		if(curr == null) { return list; }
		list.add(curr.val);
		recHelper(curr.left, list);
		recHelper(curr.right, list);
		return list;
	}