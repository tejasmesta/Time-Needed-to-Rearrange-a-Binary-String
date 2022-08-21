class Solution {
    public int secondsToRemoveOccurrences(String s) {        
        
        int time = 0;
        
        char arr[] = s.toCharArray();
        
        int n = arr.length;
        
        for(int i=0;i<n;i++)
        {
            boolean check = false;
            
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]=='0' && arr[j+1]=='1')
                {
                    check = true;
                    arr[j] = '1';
                    arr[j+1] = '0';
                    j++;
                }
            }
            
            if(check==true)
            {
                time++;
            }
            else{
                break;
            }
        }
        
        return time;
    }
}
