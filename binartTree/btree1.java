package binartTree;

public class btree1 {
    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(4);
        node n3 = new node(2);
        node n4 = new node(3);
        node n5 = new node(7);
        node n6 = new node(5);

        node root = n1;
      n1.left = n2;
      n1.right = n3;
      n2.left = n4;
      n2.right = n5;
      n3.left = n6;

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();


     }

    static void inOrder(node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void preOrder(node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }

}

class node{
    int data ;

    node left;

    node right;

    public node(int data) {
        this.data = data;
    }
}