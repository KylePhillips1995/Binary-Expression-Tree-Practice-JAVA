//KylePhillips
public class BETDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String BETTEST = "/+8*62-9*43";


		BinaryExpressionTree<String>listBET = new BinaryExpressionTree<String>();

		for (int i = 0; i < BETTEST.length(); i++) {
			
			listBET.add("" + BETTEST.charAt(i));			
		}


		System.out.println("\nPreOrder Traversal");
		listBET.PreorderTraversal();
		System.out.println("\nPostOrder Traversal");
		listBET.PostorderTraversal();


		 String BETTEST2 ="/+84*32";
		 
		 BinaryExpressionTree<String>listBET2 = new BinaryExpressionTree<String>();
		
		 for (int i = 0; i < BETTEST2.length(); i++) {
				
				listBET2.add("" + BETTEST2.charAt(i));	
		
	
	}
			System.out.println("\nPreOrder Traversal");
			listBET2.PreorderTraversal();
			System.out.println("\nPostOrder Traversal");
			listBET2.PostorderTraversal();
			
 String BETTEST3 ="*-92/31";
		 
		 BinaryExpressionTree<String>listBET3 = new BinaryExpressionTree<String>();
		
		 for (int i = 0; i < BETTEST3.length(); i++) {
				
				listBET3.add("" + BETTEST3.charAt(i));	
	
				
			
	}
		 System.out.println("\nPreOrder Traversal");
			listBET3.PreorderTraversal();
			System.out.println("\nPostOrder Traversal");
			
			listBET3.PostorderTraversal();
 
			String BETTEST4 ="-/*8043";
		 
		 BinaryExpressionTree<String>listBET4 = new BinaryExpressionTree<String>();
		
		 for (int i = 0; i < BETTEST4.length(); i++) {
				
				listBET4.add("" + BETTEST4.charAt(i));	
	
				
				
				
			
	}
			System.out.println("\nPreOrder Traversal");
			listBET4.PreorderTraversal();
			System.out.println("\nPostOrder Traversal");
			listBET4.PostorderTraversal();
}}

	


