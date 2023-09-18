public class Tree {
    private int root;
    private Tree[] subtrees;
    /* === Representation Invariants ===
            # - If self._root is None then self._subtrees is an empty list.
    #   This setting of attributes represents an empty tree.
            #
            #   Note: self._subtrees may be empty when self._root is not None.
            #   This setting of attributes represents a tree consisting of just one
    #   node.
    */
    public Tree(int root, Tree[] subtrees){
        this.root = root;
        this.subtrees = subtrees;
    }
    public Tree(int root){
        this.root = root;
        this.subtrees = new Tree[] {};
    }
    // ega

}
