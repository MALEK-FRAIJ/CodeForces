#include <iostream>
using namespace std;
/*  I. Lucky Numbers
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output
*/
int main(void)
{

    int number, a1, a2;
    cin >> number;

    a1 = number % 10;
    a2 = number / 10;

    if (a1 % a2 == 0 || a2 % a1 == 0)
        cout << "YES";
    else
        cout << "NO";

    return 0;
}