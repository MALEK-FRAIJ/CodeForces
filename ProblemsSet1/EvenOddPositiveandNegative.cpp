#include <iostream>
using namespace std;
/* C. Even, Odd, Positive and Negative
time limit per test1 second
memory limit per test256 megabytes
input
standard input
output
standard output */

int main(void)
{
    int t, EvCount = 0, OdCount = 0,nPositive = 0,nNegative =  0;
    long long n;
    cin >> t;

    for (size_t i = 1; i <= t; i++)
    {
        
        cin >> n;
        if (n % 2 == 0)
            EvCount++;
        else
            OdCount++;

        if (n > 0)
            nPositive++;
        else if (n<0)
           nNegative++; 
                
    }
    cout<<"Even: "<<EvCount<<"\nOdd: "<<OdCount<<"\nPositive: "<<
    nPositive<<"\nNegative: "<<nNegative<<endl;

    return 0;
}