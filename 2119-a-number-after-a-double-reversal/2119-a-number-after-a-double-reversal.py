class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
         return num == 0 or num % 10 != 0
        # if num==0:
        #     return True
        # elif num%10==0:
        #     return False
        # else:
        #     return True
        