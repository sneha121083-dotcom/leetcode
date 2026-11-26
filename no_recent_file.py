from collections import deque

class RecentCounter:
    def __init__(self):
        self.q = deque()

    def ping(self, t: int) -> int:
        # Add the current request timestamp to the back of the queue
        self.q.append(t)
        
        # Remove all timestamps older than the 3000ms window
        while self.q[0] < t - 3000:
            self.q.popleft()
            
        # The remaining elements are all within [t - 3000, t]
        return len(self.q)
