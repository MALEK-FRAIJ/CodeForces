#include <iostream>
using namespace std;
/*  B. Even Numbers
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output
*/
int main(void)
{
    int n;
    cin>>n;
    for (size_t i = 1; i <= n; i++)
    {
        if (i%2 == 0)
            cout<<i<<endl;
        else if (n == 1)
        cout<<-1<<endl;
    
        
        
    }
    
    
    
    return 0;
}