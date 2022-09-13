#include <iostream>
using namespace std;

/*  Z. Hard Compare
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output
*/

int main(void)
{

    long long n[4] = {0}, result;

    for (size_t i = 0; i < 4; i++)
    {
        cin >> n[i];
        n[i] %= 100;
    }

    result = (n[0] * n[1] * n[2] * n[3]) % 100;
    if (result <= 9)
        cout << "0" << result << endl;
    else
        cout << result << endl;

    return 0;
}