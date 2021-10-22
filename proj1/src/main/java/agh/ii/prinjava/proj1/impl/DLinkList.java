package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    Node <E> head=null;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
        public Node( T elem ) {
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }
    public E returnFirst(){
        return head.elem;
    }


    /**
     * here we create a new node and we link it with the ancient head
     * we set the new node as head
     * @param elem
     */
    public void addFirst(E elem){
        Node<E> newNode = new Node<>(elem);
        if (head == null) {
            head= newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    /**
     *the list is empty -->  we add at the first position
     *After we go through until we find a null position
     * @return  E
     */
    public E returnlast(){
        Node<E> p = head;
        while ( p.next != null){
            p = p.next;
        }
        return p.elem;
    }

    public void addLast( E elem ){
        Node<E> newNode = new Node<>(elem);
        if (head == null){
            head = newNode;
        }else {
            Node<E> p = head;
            while ( p.next != null){
                p = p.next;
            }
            p.next = newNode;
            newNode.prev = p;
        }
    }


    /**
     *the list is empty--> we do nothing
     * if the list is more than one elem we set the head as the next element
     */


    public void removeFirst(){

        if (head == null) { throw new IllegalStateException("THE LIST IS EMPTY "); }
        else if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    /**
     * if the list is empty the head is becomming null
     * otherwise we search when tDelette is becomming null
     */
    public void removeLast(){
        Node<E> tDelette = head;
        if (head == null || head.next == null){
            head=null;
        }
        while (tDelette.next.next != null){
            tDelette = tDelette.next;
        }
        tDelette.next = null;
    }

    /**
     * we want to display the caracters in the list we create
     *
     * @return
     */
    @Override
    public String toString() {
        Node<E> el = head;
        System.out.println("DLinkLis{");
        while (el != null) {
            System.out.println(el.elem);
            el = el.next;
        }
        return ("}");
    }


    public int numofelement(){
        Node<E> a = head;
        int c= 0;
        if (head == null){
            return c;
        }
        else{
            while( a.next!=null){
                c++;
            }
        }
        return c+1;
    }

}