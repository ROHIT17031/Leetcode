class Solution:
    def pivotInteger(self, n: int) -> int:
        for i in range(1,n+1):
            leftsum = (i*(i+1))//2
            rightsum = (n*(n+1)//2)-(i*(i-1))//2
            if leftsum==rightsum:
                return i
        return -1
        