class MinStack:
    def __init__(self):
        self.values = []
        self.mins = []

    def push(self, val: int) -> None:
        self.values.append(val)

        if not self.mins:
            self.mins.append(val)
            return

        self.mins.append(min(self.mins[len(self.mins) - 1], val))

    def pop(self) -> None:
        self.mins.pop()
        return self.values.pop()

    def top(self) -> int:
        return self.values[len(self.values) - 1]

    def getMin(self) -> int:
        return self.mins[len(self.values) - 1]

