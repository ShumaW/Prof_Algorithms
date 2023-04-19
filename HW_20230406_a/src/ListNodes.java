public class ListNodes {

    int val;
    ListNodes next;

    public ListNodes(int val) {
        this.val = val;

    }

    public void add(int val) {
        if (this.next == null) {
            this.next = new ListNodes(val);
        } else {
            this.next.add(val);
        }
    }


}
