package in.co.bytehub.ds.tree;

public class FindMaxFromTree  {

    public static void main(String[] args) {

        BinaryTreeNode tree = TreeUtil.createSampleTree();
        System.out.println(max(tree));
    }

    private static Integer max(BinaryTreeNode root) {
        if (root == null)  return Integer.MIN_VALUE;
        Integer leftMax = max(root.getLeft());
        Integer rightMax = max(root.getRight());
        return largestOf3(leftMax, rightMax, root.getData());
    }
    private static Integer largestOf3(Integer a, Integer b, Integer c){
        return a > b ? (a > c ? a : c ) : (b > c) ? b : c ;
    }
}
