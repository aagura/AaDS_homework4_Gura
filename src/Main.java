public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int myi = 1; myi <= 12; myi++) {
            tree.add(myi);
        }
        tree.print();
    }
    }
