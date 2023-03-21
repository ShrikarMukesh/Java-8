package linkedlist;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Node {
    int data;
    Node next;

    public Node(int i) {
        this.data = i;
    }
}
