from typing import Optional

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        
        odd = head
        even = head.next
        even_head = even  # Save the start of the even list to attach later
        
        # Re-link odd and even nodes alternately
        while even and even.next:
            odd.next = even.next
            odd = odd.next
            even.next = odd.next
            even = even.next
            
        # Attach the even sublist after the odd sublist
        odd.next = even_head
        
        return head
