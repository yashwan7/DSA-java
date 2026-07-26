public class aggregatetwotimeseries {

    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> ans =new ArrayList<> ();
        
        int i = 0 ; int j= 0 ; 
        while(i<series1.length||j<series2.length){
            int t; 
            if(j== series2.length || (i<series1.length && series1[i][0] < series2[j][0]))
            {
                t=series1[i][0];
                
            }  else {
                
                t=series2[j][0]; 
            }
            int v1 = 0,v2=0;
            if(i<series1.length && series1[i][0]==t){
                v1= series1[i][1];
                
            } else if (i<series1.length){
                v1 = series1[i][1];
                
            }
            if(j<series2.length && series2[j][0]==t){
                v2= series2[j][1];
                
            } else if (j<series2.length){
                v2=series2[j][1];
                
            }
            ans.add(Arrays.asList(t,v1+v2));
            if(i<series1.length&& series1[i][0]==t)
                i++;
            if(j<series2.length&& series2[j][0]==t)
                j++;
        }
        return ans ;
    } 
}

