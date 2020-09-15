package hashMap;

/**
 * @program: spring
 * @description: 二叉搜索树
 * @author: wanghao
 * @create: 2020-09-15 14:07
 **/
public class BinarySearchTree {
	int data; //标识数字
	BinarySearchTree left;
	BinarySearchTree right;

	public BinarySearchTree(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public void insert(BinarySearchTree root, int data) {
		if (root.data < data) { // 根节点小于data 插入右子数
			if (root.right == null) { // 右边没有值，直接插入
				root.right = new BinarySearchTree(data);
			} else {
				insert(root.right, data);
			}
		} else {
			if (root.left == null) {
				root.left = new BinarySearchTree(data);
			} else {
				insert(root.left, data);
			}
		}
	}

	/**
	 * 功能描述: 中序遍历 左 根 右
	 *
	 * @param: []
	 * @return: void
	 * @auther: wanghao
	 * @date: 2020/9/15 下午2:19
	 */
	public void in(BinarySearchTree root) {
		if (root != null) {
			in(root.left);
			System.out.println(root.data + "");
			in(root.right);
		}
	}

	public static void main(String[] args) {
		int[] data = {5, 9, 1, 12, 32, 15};
		BinarySearchTree binarySearchTree = new BinarySearchTree(data[0]);//序列的第一个作为root节点
		for (int datum : data) {
			binarySearchTree.insert(binarySearchTree, datum);
		}
		binarySearchTree.in(binarySearchTree);
	}
}
    
