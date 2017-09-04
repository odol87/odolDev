package dataStructure;

import lombok.Getter;

/**
 * Created by Seokho Oh on 2017. 9. 4.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


@Getter
public class OdolLinkedList {
    private OdolNode firstNode;

    public static void main(String[] args) {
        OdolLinkedList linkedList = new OdolLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);

        linkedList.findBehindRearK(linkedList.getFirstNode(), 2);

        System.out.println(linkedList.get(3));
        System.out.println(linkedList.get(4));
    }

    public void add(Object data) {
        if (firstNode == null) {
            firstNode = new OdolNode();
            firstNode.setData(data);
        } else {
            addData(firstNode, data);
        }
    }

    private void addData(OdolNode node, Object data) {
        if (node.getRearNode() == null) {
            node.setRearNode(new OdolNode());
            node.getRearNode().setData(data);
        } else {
            node = node.getRearNode();
            addData(node, data);
        }
    }

    public boolean get(Object data) {
        if (firstNode == null) {
            return false;
        } else {
            return getData(firstNode, data);
        }
    }

    private boolean getData(OdolNode node, Object data) {
        if (node == null) {
            return false;
        } else if (node.getData() == data) {
            return true;
        } else {
            return getData(node.getRearNode(), data);
        }
    }

    public int findBehindRearK(OdolNode node, int k) {
        if(node == null) {
            return 0;
        }
        int i = findBehindRearK(node.getRearNode(), k) + 1;
        if(i == k) {
            System.out.println(node.getData());
        }
        return i;
    }
}
