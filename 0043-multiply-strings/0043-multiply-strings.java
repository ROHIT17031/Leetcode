class Solution {
    public String multiply(String num1, String num2) {
    //        if(num1.equals("0") || num2.equals("0")){
    //         return "0";
    //     }
    //     int l1 = num1.length();
    //     int l2 = num2.length();


    //     int res [] = new int[l1+l2];
    //     int pow = 0;


    //     for(int i = num1.length()-1; i>=0; i--){
    //         int carry = 0;
    //     int k = res.length-1-pow;

    //         for(int j = num2.length()-1; j>=0; j--){
    //             int prod = ((num1.charAt(i)-'0')*(num2.charAt(j)-'0')+res[k]+carry);
    //              carry = prod/10;
    //              res[k] = prod%10;
    //              k--;
    //         }
    //         if(carry!=0){
    //             res[k] = carry;
    //         }
    //         pow++;
    //     }
    //     StringBuilder sb = new StringBuilder();
    //    boolean flag = false;
    //    for (int i : res) {
    //     if(i==0 && flag==false)
    //     { continue;

    //     }
    //     else{
    //         flag = true;
    //         sb.append(i);
    //     }
        
    //    }
    //    String s = sb.toString();
    //    return s;










           if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        
     
        int res [] = new int[num1.length()+num2.length()-1];
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j <num2.length(); j++) {

                res[i+j] += (num1.charAt(i)-'0')*(num2.charAt(j)-'0'); 
                
            }
            
        }
        for(int i = res.length-1; i>0; i--){
            res[i-1] += res[i]/10;
            res[i] = res[i]%10; 
          

        }
        StringBuilder sb = new StringBuilder();
        for (int i : res) {
sb.append(i);
            
        }
        return sb.toString();
    }
}