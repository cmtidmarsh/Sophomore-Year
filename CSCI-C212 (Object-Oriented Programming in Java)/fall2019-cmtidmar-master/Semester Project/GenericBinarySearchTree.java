//Stage 01
	public class GenericBinarySearchTree<T extends Comparable<T>> {
		  private Node<T> root;
		  GenericBinarySearchTree<T> left, right;
		  //int left, right;

		  
		  public GenericBinarySearchTree() {
		    this.root = null;
		  }
		  public GenericBinarySearchTree(Node<T> node) {
		    this.root = node;
		  }
		  public GenericBinarySearchTree(T value) {
		    this.root = new Node<T>(value);
		  }
		  public void insert(T value) {
		    if (this.root == null)
		      this.root = new Node<T>(value);
		    else if (this.root.value().compareTo(value) > 0)
		      this.root.left.insert(value);
		    else if (this.root.value().compareTo(value) < 0)
		      this.root.right.insert(value);
		  }
		  public String print() {
		    if (this.root == null) return "()";
		    else return "(" + this.root.print() + ")";
		  }
		  public String toString() {
		    return this.root == null ? "" : this.root + "";
		  }
		  
		  public int size(T value) {
		      if (value == null) return 0;
		      else return 1 + GenericBinarySearchTree.size(value.left) + GenericBinarySearchTree.size(value.right);
		  }
		  
		  public void find(T value) {
		      if (value == 1 + GenericBinarySearchTree.size(this.left)) return this.GenericBinarySearchTree<T>;
		      else if (value <= GenericBinarySearchTree.size(this.left)) {
		          return this.left.find(value);
		      } else {
		          return this.right.find(value - 1 - GenericBinarySearchTree.size(this.left));
		      }
		  }


		class Node<T extends Comparable<T>> {
		  T value;
		  GenericBinarySearchTree<T> left, right;
		  public Node(T value) {
		    this.value = value;
		    this.left = new GenericBinarySearchTree<T>();
		    this.right = new GenericBinarySearchTree<T>();
		  }
		  public String toString() {
		    return this.left + " " + this.value + " " + this.right;
		  }
		  public T value() {
		    return this.value;
		  }
		  public String print() {
		    return this.value + " " + this.left.print() + " " + this.right.print();
		  }
		}
	}
