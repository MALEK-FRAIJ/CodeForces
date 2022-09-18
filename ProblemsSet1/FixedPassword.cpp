#include <iostream>
using namespace std;
/*  D. Fixed Password
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output
*/
int main(void)
{
    long long password;
    bool flag = true;
    while (flag)
    {
        cin>>password;
      if (password == 1999)
      {
        cout<<"Correct"<<endl;
        flag =false;
      }
      else
        cout<<"Wrong"<<endl;
        
    }

    return 0;
}