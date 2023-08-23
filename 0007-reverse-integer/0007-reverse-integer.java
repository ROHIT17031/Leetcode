class Solution {
    public int reverse(int x) {
          long RvrNum = 0;
  while(x!=0){
    int rem = x%10;
    RvrNum = (RvrNum*10)+rem;
    x /=10;
    
  }
  if(RvrNum>Integer.MAX_VALUE || RvrNum <Integer.MIN_VALUE){
        return 0;
    }

  return (int)RvrNum;
    }
}