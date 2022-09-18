#include <iostream>
using namespace std;
/*  F. Multiplication table
time limit per test1 second
memory limit per test64 megabytes*/
int main(void)
{
    int Multiplication;
    cin >> Multiplication;

    for (size_t i = 1; i <= 12; i++)
    {
        cout << Multiplication << " * " << i << " = " << Multiplication * i << endl;
    }

    return 0;
}