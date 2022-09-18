#include <bits/stdc++.h>
using namespace std;

/*  H. One Prime
time limit per test3 seconds
memory limit per test64 megabytes
*/
int main(void)
{
    int x;
    cin >> x;
    bool is_prime = true;

    if (x== 0 || x == 1)
    {
        is_prime = false;
    }

    for (size_t i = 2; i <= x/2; ++i)
    {
        if (x % i == 0)
        {
            is_prime = false;
            break;
        }
    }

    if (is_prime)
        cout << "YES";
    else
        cout << "NO";

    return 0;
}