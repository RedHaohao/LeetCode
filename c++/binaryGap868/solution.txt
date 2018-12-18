class Solution {
public:
    int binaryGap(int N) {
        list<int > l;
        int temp=N;
        while(temp!=0)
        {
            l.push_front(temp%2);
            temp=temp>>1;
        }
        list<int >::iterator i;
        int begin =-1;
        int index=-1;
        int dis=0;
	

        for(i=l.begin();i!=l.end();i++)
        {
            index++;
            if(*i==1)
            {
                if(begin>=0)
                    dis=max(dis,index-begin);
                begin=index;
            }
			
        }

        return dis;
    }

    
};