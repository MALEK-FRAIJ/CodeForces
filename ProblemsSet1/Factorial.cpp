#include <bits/stdc++.h>
using namespace std;
/*  time limit per test2 seconds
memory limit per test64 megabytes*/

long long factorial(long long fact) { return (fact == 1 || fact == 0) ? 1 : fact * factorial(fact - 1); }

int main(void)
{
    int t;
    cin >> t;

    long long n;

    while (t--)
    {
        cin >> n;
        cout << factorial(n) << endl;
    }

    return 0;
}