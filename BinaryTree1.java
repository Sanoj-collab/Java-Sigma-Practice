import java.util.*;
public class BinaryTree1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root){//o(n)
            if(root == null){
               // System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

        }

        public static void inOrder(Node root){//o(n)
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){//o(n)
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
            
        }

        public static void levelOrder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
//----------------Height, Count and Sum of nodes in tree--------------
        public static int heightOfTree(Node root){
            if(root == null){
                return 0;
            }
            int lH = heightOfTree(root.left);
            int rH = heightOfTree(root.right);

            return Math.max(lH, rH) + 1;
        }

        public static int countNode(Node root){
            if(root == null) return 0;
            int lCount = countNode(root.left);
            int rCount = countNode(root.right);

            return lCount + rCount +  1;

        }

        public static int sumOfNode(Node root){
            if(root == null) return 0;
            int lSum = sumOfNode(root.left);
            int rSum = sumOfNode(root.right);

            return lSum + rSum + root.data;
        }
     //----------------Diqameter of treee--------------
        public static int diameterOfTree(Node root){//Approach 1 0(n^2)
            if(root == null) return 0;
    
            int leftDia = diameterOfTree(root.left);
            int leftHeight = heightOfTree(root.left);
            int rightDia = diameterOfTree(root.right);
            int rightHeight = heightOfTree(root.right);
    
            int selfDia = leftHeight + rightHeight + 1;
    
            return Math.max(selfDia, Math.max(leftDia, rightDia));
    
        }  
        static class Info{
            int ht;
            int dia;
            public Info(int dia, int ht){
                this.dia = dia;
                this.ht = ht;
            }
        }  
        public static Info diameterOfTreeOptimized(Node root){//Approach 2 O(n)
            if(root == null) {
                return new Info(0, 0);
            }
            Info leftInfo = diameterOfTreeOptimized(root.left);
            Info rightInfo = diameterOfTreeOptimized(root.right);

            int dia = Math.max(leftInfo.ht + rightInfo.ht + 1, Math.max(leftInfo.dia, rightInfo.dia));
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(dia, ht);
        }
        //-------------Subtree of another tree--------------
        public static boolean isIdentical(Node node, Node subNode){
            if(node == null && subNode == null ) return true;
            if(node == null || subNode == null || node.data != subNode.data) return false;

            if(!isIdentical(node.left, subNode.left)) return false;
            if(!isIdentical(node.right, subNode.right)) return false;

            return true;
        }

        public static boolean isSubtree(Node root, Node subRoot){
            if(root == null ) return false;

            if(root.data == subRoot.data){
                if(isIdentical(root, subRoot)){
                    return true;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        // -------------------------------kth  level of the tree----------------------
        public static void kLevel(Node root, int k, int level){
            if(root == null) return;
            if(level == k){
                System.out.println(root.data+" ");
                return;
            }
            kLevel(root.left, level+1, k);
            kLevel(root.right, level+1, k);
        }
        public static List<Integer> kLevel1(Node root, int k, int level){//using ArrayList approach 
            List<Integer> result = new ArrayList<>();
            if(root == null) return result;
            if(level == k){
                result.add(root.data);
                return result;
            }
            result.addAll(kLevel1(root.left, k, level+1));
            result.addAll(kLevel1(root.right, k, level+1));
            return result;
        }
        //--------------Lowest common Ancestor----------------
        public static Node lowestCommonAncestor(Node root, int n1, int n2){
            if(root == null) return null;
            if(root.data == n1 || root.data == n2) return root;

            Node leftLCA = lowestCommonAncestor(root.left, n1, n2);
            Node rightLCA = lowestCommonAncestor(root.right, n1, n2);

            if(leftLCA != null && rightLCA != null) return root;

            return (leftLCA != null) ? leftLCA : rightLCA;
        }
        public static boolean getPath(Node root, int n , ArrayList<Node> path){
            if(root == null) return false;

            path.add(root);
            if(root.data == n) return true;

            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if(foundLeft || foundRight){
                return true;
            }
            path.remove(path.size() - 1);
            return false;
        }
        
        public static Node lca(Node root, int n1, int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);
            int i = 0;
            for(; i < path1.size() && i < path2.size(); i++){
                if(path1.get(i) != path2.get(i)){
                    break;
                }
            }

            Node lca = path1.get(i-1);
            return lca;

        }
    }
    //------------------Transform Binary Tree to Sum Tree-------------------
    public static int transform(Node root){
         if(root == null ) return 0;

         int leftChild = transform(root.left);
         int rightChild = transform(root.right);

         int data = root.data;
         int newLeft = root.left == null ? 0: root.left.data;
         int newRight = root.right == null ? 0 : root.right.data;

         root.data = newLeft + leftChild + newRight + rightChild;

         return data;

    }
    public static void preOrder(Node root){
        if(root == null){
               // System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
    }

    public static void main(String[] args) {
        //int nodes[] = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
        //int nodes[] = {1, 2, 4, 6, -1, -1, -1, 3, 7, -1, -1, 5, -1, -1 ,-1};
        //BinaryTree t1 = new BinaryTree();
        //Node root = t1. buildTree(nodes);
        // System.out.println(root.data);

        // t1.preOrder(root);
        // System.out.println();
        // t1.inOrder(root);
        // System.out.println();
        // t1.postOrder(root);
        // System.out.println();
        // t1.levelOrder(root);
        // System.out.println();
        // System.out.println("Height of tree is: "+t1.heightOfTree(root));
        // System.out.println("Count of nodes in tree is: "+t1.countNode(root));
        // System.out.println("Sum of nodes in tree is: "+t1.sumOfNode(root));

        // System.out.println("Diameter of tree is: "+t1.diameterOfTree(root));

        // BinaryTree.Info info = t1.diameterOfTreeOptimized(root);
        // System.out.println("Diameter of tree is: "+info.dia);
        // System.out.println("Height of tree is: "+info.ht);

        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);
        

        // Node subRoot = new Node (2);
        // subRoot.left = new Node (4);
        // subRoot.right = new Node(5);

        // System.out.println("Is sub tree: " + BinaryTree.isSubtree(root, subRoot));

        // int k = 3; 
        // BinaryTree.kLevel(root, k, 1);

        // int n1 = 4, n2 = 7;
        // System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + " is: " + BinaryTree.lowestCommonAncestor(root, n1, n2).data);
       

        transform(root);
        preOrder(root);
    }
}
