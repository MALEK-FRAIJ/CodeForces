#include <iostream>
using namespace std;

/*  E. Max
time limit per test1 second
memory limit per test256 megabytes*/
int main(void)
{
    int test, number, max = 0;
    cin >> test;
    while (test--)
    {
        cin >> number;
        if (number > max)
            max = number;
        
    }
    cout << max;
    return 0;
}