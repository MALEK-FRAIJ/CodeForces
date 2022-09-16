#include<iostream>
#include<cmath>
using namespace std;

/* G. Katryoshka
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output */
int main(void){

    long long eyes,mouth,body,count=0;
   

    cin>>eyes>>mouth>>body;

    if (eyes>0 && mouth>0&& body>0)
    {
      long long  m = min(eyes,min(mouth,body));
      eyes-=m;mouth-=m;body-=m;
      count=m;
    }
    if (eyes>1&& body>0)
        count+=min(eyes/2,body);
 
    cout<<count;
    
    
    return 0;
}