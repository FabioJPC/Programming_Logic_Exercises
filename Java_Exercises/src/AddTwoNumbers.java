//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;
        int carry = 0;
        while (l1 != null || l2 !=null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum /10;
            current.next= new ListNode(sum%10);
            current = current.next;
        }

        return result.next;
    }
}
public class AddTwoNumbers {
    static ListNode reverseNodes(ListNode head){
            ListNode previous = null;
            ListNode current = head;
            ListNode next = null;
            while(current != null){
                next = current.next;    //atualiza o ponteiro next para ser o próximo nó do atual
                current.next=previous;  //reverte o ponteiro next do atual para ser o anterior (no começo = null)
                previous=current;       //Atualiza o ponteiro "anterior" para o nó atual e prepara para pular o nó
                current = next;         //pula o nó fazendo o ponteiro atual ser o proximo
            }
            head = previous;            //depois do fim do loop atualizar a cabeça para ser o último membro da lista.
            return head;
        }
    static void WriteList(ListNode head){
        //For testing and debugging.
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(3, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        Solution solution = new Solution();
        ListNode test = solution.addTwoNumbers(reverseNodes(l1),reverseNodes(l2));
        WriteList(test);
    }
}