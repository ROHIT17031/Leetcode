class Solution {
    public List<List<Integer>> generate(int numRows) {
              List<List<Integer>> list  = new ArrayList<>();
          if(numRows==0){

              return list;
          }
          list.add(new ArrayList<>());
          list.get(0).add(1);
          for(int i = 1; i<numRows; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 1; j<i; j++){
                curr.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            curr.add(1);
            list.add(curr);

          }

          return list;
    }
}