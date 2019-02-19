

public class K_in_BST {
 private Node root;
 private static int counter;
  
 public static void main(String[] args) {
  new K_in_BST();
 }
 
 public K_in_BST() {
  add_Node(root, 12); 
  add_Node(root, 25); 
  add_Node(root, 43); 
  add_Node(root, 9); 
  add_Node(root, 4);
  add_Node(root, 32);
  add_Node(root, 24);
 
  printTree(root);
 
  Node SmallestNode = findKthSmallestItem(root, 6); //Put number here to find the kth element
   
  if ( SmallestNode != null ) {
   System.out.println( "\nElement is :" + SmallestNode.getData() );
  } else {
   System.out.println( "\nElement not found" );
  }
 }
  
 private Node findKthSmallestItem(Node root, int k) {
  if ( root==null ){
   return null;
  }
 
  Node node = findKthSmallestItem(root.Left(), k);
  
  if (counter != k)
   { counter++;
   node = root;
  }
   

  if (counter == k) { 
   return node;
  } else {
   return findKthSmallestItem(root.Right(), k);
  }
 }
  
 
 private void add_Node(Node root, int data){
	  if ( root == null ) 
	  {
	   Node temp1 = new Node(data);
	   this.root = temp1;
	  } 
	  else {
	   nodeInPlace(root, data);
	  }
	 }
 
 private void printTree(Node root) 
 {
  if ( root == null )
   return;
  printTree(root.Left());
  System.out.print( root.getData() + " " );
  printTree(root.Right());
 }
 
  
 private void nodeInPlace(Node root, int data) { 
  if ( data>root.getData() ) {
	  
   if ( root.Right() != null ) {
	   
    add_Node( root.Right(), data );
   } else {
	   
    Node temp1 = new Node(data);
    root.setRight(temp1);
   }
  } else if ( data < root.getData() ) {
	  if ( root.Left() != null ) {
	   add_Node( root.Left(), data ); } 
	  
	  else {
    Node temp1 = new Node(data);
    root.setLeft(temp1);
    
   }
  }
 }
}
