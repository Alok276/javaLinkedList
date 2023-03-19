//linked list sample program-- Soft Code-Functions

import java.util.Collections;
import java.util.LinkedList;

class LL1
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.add("two");
        for(int i=0;i< list.size();i++)
        {
            System.out.print(list.get(i)+" ->");
        }
        System.out.println("null");
        System.out.println(list.size());
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}