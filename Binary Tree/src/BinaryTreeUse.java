import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
	
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
		System.out.println(" Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left Child of " + parentData);
			}else {
				System.out.println("Enter right Child Of " + parentData);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println(" Enter root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput();
		BinaryTreeNode<Integer> rightChild = takeTreeInput();
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	public static void printTreeDetails(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ":") ;
		if(root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data );
		}
		System.out.println();
		
		
		
		printTreeDetails(root.left);
		printTreeDetails(root.right);
	}
	
	public static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> node, int x){
		if(node == null) {
			BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer> (x);
			return newRoot;
		}
		if(x >= node.data) {
		node.right = insert(node.right, x);	
		}else {
			node.left = insert(node.left, x);
		}
		return node;
	}
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
//		if(root.left != null) {
//		printTree(root.left);
//		}
//		if(root.right != null) {
//		printTree(root.right);
//		}
	}
	
	
	public static int numNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);
		return 1 + leftNodeCount + rightNodeCount;
	}
	
	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}
	
	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return numLeaves(root.left) + numLeaves(root.right);
	}
	
	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return;
		}
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}
		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
		
		boolean isBal = true;
		int height =  1 + Math.max(leftOutput.height, rightOutput.height);
		
		if(Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBal = false;			
		}
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}
	
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		if(Math.abs(leftHeight - rightHeight) >1) {
			return false;
		}
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);
		return isLeftBalanced && isRightBalanced;
	}
	
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		if(root.left == null && root.right == null) {
			return null;
		}
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}
	
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter root data");
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;			
		}
		BinaryTreeNode<Integer> root = new  BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);
		
		while (!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			System.out.println(" Enter left child of " + front.data);
			int left = s.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				pendingChildren.add(leftChild);
			}
			System.out.println(" Enter right child of " + front.data);
			int right = s.nextInt();
			if(right != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				pendingChildren.add(rightChild);
			}
		}
		return root;
	}
	
	public static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int [] pre, int [] in, int siPre, int eiPre, int siIn, int eiIn){
	if(siPre > eiPre) {
		return null;
	     }	
	int rootData = pre[siPre];
	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
	
	int rootIndex = -1;
	for(int i = siIn; i <= eiIn; i++) {
		if(in[i] == rootData) {
			rootIndex = i;
			break;
		}
	}
	// I am assuming that root actually is present inInorder
	
	int siPreLeft = siPre+1;
	int siInLeft = siIn;
	int eiInLeft = rootIndex - 1;
	int siInRight = rootIndex + 1;
	int eiPreRight = eiPre;
	int eiInRight = eiIn;
	
	int leftSubtreelength = eiInLeft - siInLeft +1;
	int eiPreLeft = siPreLeft + leftSubtreelength -1;
	int siPreRight = eiPreLeft +1;
	
	
	BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
	BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
	root.left = left;
	root.right = right;
	return root;
	
	}
	
	public static BinaryTreeNode<Integer> buildTreeFromPreIn(int pre[], int in[]){
		BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre, in, 0, pre.length - 1, 0, in.length -1);
		return root;
		
	}
	
	public static boolean searchBST(BinaryTreeNode<Integer> root, int data) {
		if(root == null) {
			return false;
		}
		if(root.data ==  data) {
			return true;
		}
		if(data < root.data) {
			return searchBST(root.left, data);
		}
		return searchBST(root.right, data);
	}
	
	public static void printBetweenK1K2(BinaryTreeNode<Integer> root, int K1, int K2) {
		if(root == null) {
			return;
		}
		if(root.data< K1) {
			printBetweenK1K2(root.right, K1, K2);
		}else if(root.data > K2) {
			printBetweenK1K2(root.left , K1, K2);
		}else {
			System.out.println(root.data);
			printBetweenK1K2(root.left, K1, K2);
			printBetweenK1K2(root.right, K1, K2);
		}
	}
	
	public static  int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		return Math.min(root.data, Math.min(leftMin, rightMin));
		}
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		int leftMax = largest(root.left);
		if(leftMax >= root.data) {
			return false;
		}
		int rightmin = minimum(root.right);
		if(rightmin < root.data) {
			return false;
		}
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		return isLeftBST && isRightBST;
	}
	
	public static isBSTReturn isBST2(BinaryTreeNode<Integer> root) {
		if(root == null) {
			isBSTReturn ans = new isBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}
		isBSTReturn leftAns = isBST2(root.left);
		isBSTReturn rightAns = isBST2(root.right);
		
		int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
		int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
		boolean isBST = true;
		if(leftAns.max >= root.data) {
			isBST = false;
		}
		if(rightAns.min < root.data) {
			isBST = false;
		}
		if(!rightAns.isBST) {
			isBST = false;
		}
		if(!rightAns.isBST) {
			isBST = false;
		}
		isBSTReturn ans = new isBSTReturn(min, min, isBST);
		return ans;
	}
	
	public static boolean isBST3(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
		if(root == null) {
			return true;
		}
		if(root.data < minRange || root.data > maxRange) {
			return false;
		}
		boolean isLeftwithinRange = isBST3(root.left, minRange, root.data -1);
		boolean isRightwithinRange = isBST3(root.right, root.data, maxRange );
		return isLeftwithinRange && isRightwithinRange;
			
		
	}
	
	public static ArrayList<Integer>nodeToRootPath(BinaryTreeNode<Integer> root, int x){
		if(root == null) {
			return null;
		}
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> leftoutput = nodeToRootPath(root.left, x);
		if(leftoutput != null) {
			leftoutput.add(root.data);
			return leftoutput;
		}
		ArrayList<Integer> rightoutput = nodeToRootPath(root.right, x);
		if(rightoutput != null) {
			rightoutput.add(root.data);
			return rightoutput;
		}
		return null;
	}
 
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		
//		BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//		root.left = rootleft;
//		root.right = rootRight;
//				
//		BinaryTreeNode<Integer> tworight = new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> threeleft = new BinaryTreeNode<Integer>(5);
//		rootleft.right = tworight;
//		rootRight.left =  threeleft;
		
//		printTree(root);
	//	BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
//		BinaryTreeNode<Integer> root = takeInputLevelWise();
//		
//		printTreeDetails(root);
//		System.out.println("Num nodes" + numNodes(root));
//		System.out.println("largest" + largest(root));
//		System.out.println(" num Leaves " + numLeaves(root));
//        System.out.println(" print at depth k");
//        printAtDepthK(root, 2);
////        BinaryTreeNode<Integer> newRoot = removeLeaves(root);
// //       printTreeDetails(newRoot);
//        
////        System.out.println(" isBalanced " + isBalanced(root));  
//        System.out.println(" isBalanced " + isBalancedBetter(root).isBalanced); 
		
		int in[] = {1,2,3,4,5,6,7};
		int pre[] = {4,2,1,3,6,5,7};
	    BinaryTreeNode<Integer> root = buildTreeFromPreIn(pre, in);
	    printTreeDetails(root);
//	    System.out.println(searchBST(root, 3));
//	    System.out.println(isBST(root));
	    isBSTReturn ans = isBST2(root);
	    System.out.println(ans.min+ " " + ans.max+ " " + ans.isBST);
	    root = takeTreeInputBetter(true, 0, true);
	    ArrayList<Integer>path   = nodeToRootPath(root, 5);
	    if(path == null) {
	    	System.out.println("not Found");
	    }else {
	    for(int i: path) {
	    	System.out.println(i);
	    }
	    }
	}
}
