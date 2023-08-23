class Solution {
    public String convertToTitle(int columnNumber) {
              StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;  // corner case

            int rem = columnNumber%26;
            int a = 'A';                  
            int b = a+rem;
            char ch = (char)b;
            sb.append(ch);
            columnNumber /=26;
        }
       return sb.reverse().toString();
    }
}

// if we halving the array after every iteration then TC O(LOG N) its base log base 2 and value n
// but here after every iteration divided by 26 so log base 26 and value n. its complexity less than log n. so we can say it's TC will be O(1)