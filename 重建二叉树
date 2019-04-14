package sword2offer;
//输入某二叉树的前序遍历和中序遍历结果，重建二叉树，假设前序遍历和中序遍历中都不含重复数字{1，2，4，7，3，5，6，8}， {4，7，2，1，5，3，8，6}，重建二叉树并返回
public class offer4 {
	public static class BinaryTreeNode{
		int value;
		BinaryTreeNode left;
		BinaryTreeNode right;
	}
	public static BinaryTreeNode construct(int[] preorder,int[] inorder) {
		if(preorder==null||inorder==null||preorder.length!=inorder.length||inorder.length<1) {
			return null;
		}
		return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
	}
	// @param preorder 前序遍历
	// @param ps 前序开始
	// @param pe 前序结束
	// @param inorder
	// @param is
	// @param ie
	// @return root
	public static BinaryTreeNode construct(int[] preorder,int ps,int pe,int[] inorder,int is,int ie) {
		if(ps>pe) {
			return null;
		}
		int value=preorder[ps];
		int index=is;
		while(index<= ie && inorder[index]!=value) {
			index++;
		}
		if(index>ie) {
			throw new RuntimeException("Invalid input");
		}
		BinaryTreeNode node=new BinaryTreeNode();
		node.value=value;
		node.left=construct(preorder,ps+1,ps+index-is,inorder,is,index-1);
		node.right=construct(preorder,ps+index-is+1,pe,inorder,index+1,ie);
		return node;
	}
	public static void printTree(BinaryTreeNode root) {
		if(root!=null) {
			printTree(root.left);
			System.out.print(root.value+" ");
			printTree(root.right);
		}
	}
    private static void test1() {
        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        BinaryTreeNode root = construct(preorder, inorder);
        printTree(root);
    }
    
    private static void test2() {

        int[] preorder = {1, 2, 3, 4, 5};
        int[] inorder = {5, 4, 3, 2, 1};
        BinaryTreeNode root = construct(preorder, inorder);
        printTree(root);
    }
	private static void test3() {
		int[] preorder= {1,2,3,4,5};
		int[] inorder= {1,2,3,4,5};
		BinaryTreeNode root=construct(preorder,inorder);
		printTree(root);
	}
	
	private static void test4() {
		int[] preorder= {1};
		int[] inorder= {1};
		BinaryTreeNode root=construct(preorder,inorder);
		printTree(root);
	}

    private static void test5() {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        BinaryTreeNode root = construct(preorder, inorder);
        printTree(root);
    }
	private static void test6() {
		construct(null,null);
	}
	
    private static void test7() {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] inorder = {4, 2, 8, 1, 6, 3, 7};
        BinaryTreeNode root = construct(preorder, inorder);
        printTree(root);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        test1();
        System.out.println();
        test2();
        System.out.println();
        test3();
        System.out.println();
        test4();
        System.out.println();
        test5();
        System.out.println();
        test6();
        System.out.println();
        test7();
	}

}
