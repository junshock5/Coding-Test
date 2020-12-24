//// https://leetcode.com/discuss/interview-question/850974/hackerrank-online-assessment-roblox-new-grad-how-to-solve-this
//
//
//int largestSubgrid(vector<vector<int>> grid, int maxSum){
//        int n=grid.size();
//
//        vector<vector<int>> sum(n, vector<int> (n, 0));
//        int maxValue=0;
//
//        for(int i=0;i<n;i++){
//        for(int j=0;j<n;j++){
//        if(i==0 && j==0){
//        sum[0][0]=grid[0][0];
//        }
//        else if(i==0){
//        sum[0][j]=sum[0][j-1]+grid[0][j];
//        }
//        else if(j==0){
//        sum[i][0]=sum[i-1][0]+grid[i][0];
//        }
//        else{
//        sum[i][j]=sum[i-1][j]+sum[i][j-1]+grid[i][j]-sum[i-1][j-1];
//        }
//        maxValue=max(maxValue, grid[i][j]);
//        }
//        }
//        int l=0, r=n;
//        while(l<r){
//        int x=l+(r-l+1)/2;
//        int resValue=0;
//        for(int i=x-1;i<n;i++){
//        for(int j=x-1;j<n;j++){
//        int  total=sum[i][j];
//        if(i>=x)total-=sum[i-x][j];
//        if(j>=x)total-=sum[i][j-x];
//        if(i>=x && j>=x)total+=sum[i-x][j-x];
//        resValue=max(resValue, total);
//        }
//        }
//        if(maxSum >= resValue)l=x;
//        else r=x-1;
//        }
//        return r;
//        }
