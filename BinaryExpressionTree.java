public class BinaryExpressionTree<String> {

	
private TreeNode<String> root;
boolean success;

public BinaryExpressionTree() {
	
	root = null;
	
}
	

public void add(String obj) {
	
	TreeNode<String> newNode = new TreeNode<String>(obj);
	
	success = false;
	if(root == null) {
		
		root = newNode;
	}
	
	else {
		addNode(root, newNode);
	}
	}


private boolean isOperator(TreeNode<String> current) {
	
	
	if (current == null) {
		
		return true;
	}
	if(current.getValue().equals("*") || current.getValue().equals("/") || current.getValue().equals("+") || current.getValue().equals("-")){
		
		return true;
	}
	
	else {
		return false;
		}
	}

private void addNode(TreeNode<String> current, TreeNode<String> newNode) {
	
	if(current != null && isOperator(current)) {
		
		addNode(current.getLeft(), newNode);
		
		if(current.getLeft() == null && !success) {
			
			current.setLeft(newNode);
			success = true;
		}
		
		else if(current.getRight() == null && !success) {
			
			current.setRight(newNode);
			success = true;
		}
		
		else {
			
			addNode(current.getRight(), newNode);
			
		}
		
	}
	
}



public void InorderTraversal()
{	if (root != null)
		InOrderTraversalHelper(root);
	else
		System.out.println("List is empty");
}
private void InOrderTraversalHelper(TreeNode current)
{
		
		if(current!=null)
		{	
			InOrderTraversalHelper(current.getLeft());
			System.out.print(current.getValue()+" ");
			InOrderTraversalHelper(current.getRight());
		}
		
}
public void LevelOrderTraversal()
{	//Done Iteratively
	Queue<TreeNode> queue=new Queue();
	TreeNode current;
	current=root;
	if (current==null)
		System.out.println("Tree Empty");
	else
	{ 	
		queue.enqueue(current);	//initialize to root
		while(!queue.isEmpty())
		{	current=queue.dequeue();
			System.out.print(current.getValue()+" ");
			if(current.getLeft()!=null)
				queue.enqueue(current.getLeft());
			if(current.getRight()!=null)
				queue.enqueue(current.getRight());
			
		}
		
		
	
	}
	
}
public void PostorderTraversal()
{	
	if (root != null)
	
		PostOrderTraversalHelper(root);
	
	else 
		System.out.println("List is empty");
}
private void PostOrderTraversalHelper(TreeNode current)
{
		
		if(current!=null)
		{	
			PostOrderTraversalHelper(current.getLeft());
			PostOrderTraversalHelper(current.getRight());
			System.out.print(current.getValue()+" ");
		}
		
}
public void PreorderTraversal()
{	
	if (root != null)
	
		PreOrderTraversalHelper(root);
	
	else
	
		System.out.println("List is empty");
}
private void PreOrderTraversalHelper(TreeNode current)
{
		
		if(current!=null)
		{	
			System.out.print(current.getValue()+" ");
			PreOrderTraversalHelper(current.getLeft());
			PreOrderTraversalHelper(current.getRight());
			
		}
		
}


public double evaluate() {
	if(root == null)
	{
		
		System.out.println("empty");
		return 0;
	}
	
	else {
		return evaluateHelper(root);
	}
	
}

private double evaluateHelper(TreeNode<String> current) {
	
	if(current.getLeft() == null && current.getRight() == null){
		
		return Double.parseDouble(current.getValue().toString());
	}
	
	
	else {
		
		String operator = current.getValue();
		
		if (operator.equals("*")){
			
			return evaluateHelper(current.getLeft()) * evaluateHelper(current.getRight());
			
		}
		
		
	}
	return 0;
	
	
	
	
	
	
	
}
	
	
}

	

	
	

