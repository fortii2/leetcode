from collections import deque


class MyStack:

    def __init__(self):
        self.queue = deque([])

    def push(self, x: int) -> None:
        self.queue.append(x)

    def pop(self) -> int:
        queue = self.queue

        for _ in range(len(self.queue) - 1):
            queue.append(queue.popleft())

        return queue.popleft()

    def top(self) -> int:
        queue = self.queue

        for _ in range(len(self.queue) - 1):
            queue.append(queue.popleft())

        res = queue.popleft()
        queue.append(res)
        return res

    def empty(self) -> bool:
        return not self.queue


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()

