class Node:
    
    def __init__(self, val : int = None, next : "Node | None" = None):
        self.val = val
        self.next = next

class MyLinkedList:

    def __init__(self):
        self.sentinel = Node()
        self.size = 0

    def get(self, index: int) -> int:
        if index < 0 or index >= self.size:
            return -1

        cur = self.sentinel
        for _ in range(index):
           cur = cur.next

        return cur.next.val 
                

    def addAtHead(self, val: int) -> None:
        self.sentinel.next = Node(val, self.sentinel.next)
        self.size = self.size + 1

    def addAtTail(self, val: int) -> None:
        cur = self.sentinel
        while cur.next:
            cur = cur.next
        cur.next = Node(val)
        self.size = self.size + 1

    def addAtIndex(self, index: int, val: int) -> None:
        if index < 0 or index > self.size:
            return
        
        cur = self.sentinel
        for _ in range(index):
            cur = cur.next
        
        cur.next = Node(val, cur.next)
        self.size = self.size + 1

    def deleteAtIndex(self, index: int) -> None:
        if index < 0 or index >= self.size:
            return

        cur = self.sentinel
        for _ in range(index):
            cur = cur.next
        
        cur.next = cur.next.next
        self.size = self.size - 1


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)
