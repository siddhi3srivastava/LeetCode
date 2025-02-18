//Container with most Water (Problem 11) 

//Return the maximum amount of water a container can store.

int n= height.length;
        int max=Integer.MIN_VALUE;
        int p=1;
        int i=0; 
        int j=n-1;
        while(i<j){
            int dist=j-i;
            if(height[i]<height[j]){
                p=height[i]*dist;
                i++;
            }
            else{
                p=height[j]*dist;
                j--;
            }
            if(max<p){
                max=p;
            }

        }
        return max;
       
    }
}
