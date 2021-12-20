//Stage 02
public class BinarySearchTree {
	    int value;
	    BinarySearchTree left, right;
	    
	    public static void main(String[] args) {
	        BinarySearchTree BinarySearchTree = new BinarySearchTree(10, null, null);
	        BinarySearchTree.add(5);   // 1
	        BinarySearchTree.add(1);   // 2
	        BinarySearchTree.add(64);  // 3
	        BinarySearchTree.add(32);  // 4
	        BinarySearchTree.add(12);  // 5
	        BinarySearchTree.add(87);  // 6
	        BinarySearchTree.add(43);  // 7
	        BinarySearchTree.add(98);  // 8
	        BinarySearchTree.add(49);  // 9
	        BinarySearchTree.add(100); // 10
	        System.out.println(BinarySearchTree.find(7));
	    }

	    public BinarySearchTree(int node, BinarySearchTree left, BinarySearchTree right) {
	        this.value = node;
	        this.left = left;
	        this.right = right;
	    }


	    public String print() {
	        return "(" + this.value + " " +
	                ((this.left == null) ? "." : this.left.print()) + " " +
	                ((this.right == null) ? "." : this.right.print()) + ")";
	    }

	    public String toString() {
	        return this.left + " " + this.value + " " + this.right;
	    }

	    public static int size(BinarySearchTree node) {
	        if (node == null) return 0;
	        else return 1 + BinarySearchTree.size(node.left) + BinarySearchTree.size(node.right);
	    }
	    
	    public int find(int k) {
	        if (k == 1 + BinarySearchTree.size(this.left)) return this.value;
	        else if (k <= BinarySearchTree.size(this.left)) {
	            return this.left.find(k);
	        } else {
	            return this.right.find(k - 1 - BinarySearchTree.size(this.left));
	        }
	    }
	    
	    
	    public boolean add(int node) {
	        if (this.value == node) {
	            return false;
	        } else {
	            if (node < this.value) {
	                if (this.left == null) {
	                    this.left = new BinarySearchTree(node, null, null);
	                    return true;
	                } else {
	                    return this.left.add(node);
	                }
	            } else {
	                if (this.right == null) {
	                    this.right = new BinarySearchTree(node, null, null);
	                    return true;
	                } else {
	                    return this.right.add(node);
	                }
	            }
	        }
	    }
	}
