
 
public class Node {
  
 private Node left;
 private Node right;
 private int data;
  
 public Node(int data) {
  this.data=data;
 }
 
 public Node Left() {
  return left;
 }
 
 public void setLeft(Node left) {
  this.left = left;
 }
 
 public Node Right() {
  return right;
 }
 
 public void setRight(Node right) {
  this.right = right;
 }
 
 public int getData() {
  return data;
 }
 
 public void setData(int data) {
  this.data = data;
 }
}