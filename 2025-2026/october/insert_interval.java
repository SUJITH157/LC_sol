class solution{
    public int[][] insert(int[][] intervals,int[][] newintervals){
        list<int[]> ans = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        while(i<n && intervals[i][1]<newintervals[0][0]){
            ans.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0] <= newintervals[1]){
            newintervals[0][0] = Math.min(newintervals[0][0],intervals[i][0]);
            newintervals[0][1] = Math.max(newintervals[0][1],intervals[i][1]);
            i++;
            
        }
        ans.add(newintervals);

        
        while(i < n) {
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int [ans.size()][]);
    }
}