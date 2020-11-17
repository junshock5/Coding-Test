package com.company.datastructure;


class LinkedList {

    private Node header;
    private int size;

    public LinkedList() {

        header = new Node(null);
        size = 0;
    }

    // 단순 연결 리스트 노드
    private class Node {

        private Object data;
        private Node nextNode;

        Node(Object data) {

            this.data = data;
            this.nextNode = null;
        }

    }

    // index 위치의 노드 데이터를 반환한다.
    public Object get(int index) {
        return getNode(index).data;
    }

    // index 위치의 노드를 반환한다.
    private Node getNode(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }

        Node node = header.nextNode;
        for (int i = 0; i < index; i++) {
            node = node.nextNode;
        }

        return node;
    }

    // data를 리스트의 첫번째에 삽입한다.
    public void addFirst(Object data) {

        Node newNode = new Node(data);
        newNode.nextNode = header.nextNode;
        header.nextNode = newNode;
        size++;

    }
    // 리스트의 마지막에 data를 삽입한다.
    public void add(Object data){
        addLast(data);
    }

    // index 위치에 data를 삽입한다.
    public void add(int index, Object data) {

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node previous = getNode(index - 1); //전노드 찾기
        Node next = previous.nextNode; //지금노드 포인터

        Node newNode = new Node(data); // 추가할 새로운노드
        previous.nextNode = newNode; // 전노드의 다음은 추가노드
        newNode.nextNode = next; // 주가노드의 다음은 지금노드.
        size++;
    }

    // 리스트의 마지막에 data 를 삽입한다.
    public void addLast(Object data) {
        add(size, data);
    }

    // 리스트의 크기를 반환한다.
    public int size() {
        return size;
    }


    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        list.add(100);
        list.add(200);
        list.add(400);
        list.add(500);
        System.out.println(list);

        list.add(2, 300);
        list.addFirst(50);
        System.out.println(list);

        System.out.println(list.get(4));

        System.out.println(list);

        System.out.println("크기 " + list.size());

    }

}