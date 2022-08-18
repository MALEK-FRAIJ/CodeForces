#include <iostream>
using namespace std;

/*
L. The Brothers
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output
*/

int main()
{
    string s1[4];

    for (size_t i = 0; i < 4; i++)
    {
        cin >> s1[i];
    }
    if (s1[1] == s1[3])
        cout << "ARE Brothers";
    else
        cout << "NOT";

    return 0;
}