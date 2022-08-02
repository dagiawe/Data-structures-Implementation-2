package implementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AbebeImplementationStart {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner Assgniment3data = new Scanner(new File("C:\\Users\\dagi\\IdeaProjects\\Data-structures-Implementation-2\\src\\main\\java\\implementation\\DataSources.txt"));
        AbebeBinarySearchTree<String> MyAbebeBST = new AbebeBinarySearchTree<>();
        AbebeAVLTree<String> MyAbebeAVLT = new AbebeAVLTree<>();
        AbebeHashSet<String> MyAbebeHS = new AbebeHashSet<>();
        AbebeHashMap<String, String> MyAbebeHM = new AbebeHashMap<>();
        AbebeWeightedGraph<String> MyAbebeWG = new AbebeWeightedGraph<>();
        while (Assgniment3data.hasNextLine()) {
            String[] tonke = Assgniment3data.nextLine().split("\t");
            MyAbebeHS.add(tonke[0]);
            MyAbebeHM.put(tonke[1], tonke[2]);
            MyAbebeBST.insert((tonke[2]));
            MyAbebeAVLT.insert((tonke[2]));
            MyAbebeWG.vertices.addAll(MyAbebeHS);
        }
        //BST
        System.out.println("BST,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        System.out.print("Inorder (sorted): ");
        MyAbebeBST.inorder();
        System.out.print("\nPostorder: ");
        MyAbebeBST.postorder();
        System.out.print("\nPreorder: ");
        MyAbebeBST.preorder();
        System.out.print("\nThe number of nodes is " + MyAbebeBST.getSize());
        System.out.print("\nIs 555 in the tree? " +
                MyAbebeBST.search("555"));
        System.out.print("\nA path from the root to 555 is: ");
        ArrayList<AbebeBinarySearchTree.TreeNode<String>> path = MyAbebeBST.path("Peter");
        for (int i = 0; path != null && i < path.size(); i++)
            System.out.print(path.get(i).element + " ");
        MyAbebeBST.inorder();
        //AVLT
        System.out.println("AVLT..............................................................");
        MyAbebeAVLT.path("555");
        System.out.println(MyAbebeAVLT.getSize());
        MyAbebeAVLT.delete("555");
        System.out.println("HashSet''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
        //HS
        System.out.println("Elements in set: " + MyAbebeHS);
        System.out.println("Number of elements in set: " + MyAbebeHS.size());
        System.out.println("Is Smith in set? " + MyAbebeHS.contains("Dallas"));
        MyAbebeHS.remove("El Paso");
        System.out.print("Names in set in uppercase are ");
        for (String s : MyAbebeHS) {
            System.out.print(s.toUpperCase() + " ");
        }
        MyAbebeHS.clear();
        System.out.println("\nElements in set: " + MyAbebeHS);
        //HM
        System.out.println("HM,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        System.out.println("Entries in map: " + MyAbebeHM);
        System.out.println("The distance  for Boston is " +
                MyAbebeHM.get("Boston"));
        System.out.println("Is Dallas in the map? " +
                MyAbebeHM.containsKey("Dallas"));
        System.out.println("Is distance 555 in the map? " +
                MyAbebeHM.containsValue("555"));
        MyAbebeHM.remove("Boston");
        System.out.println("Entries in map: " + MyAbebeHM);
        MyAbebeHM.clear();
        System.out.println("Entries in map: " + MyAbebeHM);
    }
}




