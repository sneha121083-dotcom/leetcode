from typing import Optional

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # A dummy node handles the edge case where the list has only 1 node
        dummy = ListNode(0, head)
        slow = dummy
        fast = head
        
        # Move fast by 2 steps and slow by 1 step
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
        # 'slow' is now right before the middle node; bypass the middle node
        slow.next = slow.next.next
        
        return dummy.next
