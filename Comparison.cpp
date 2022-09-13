#include <iostream>
using namespace std;
/*  V. Comparison
time limit per test1 second
memory limit per test256 megabytes
input standard input
output standard output*/
int main()
{
    int number1, number2;
    char oper;

    cin >> number1 >> oper >> number2;

    switch (oper)
    {
    case '>':
    (number1 > number2) ? cout<<("Right") : cout<<("Wrong");
        break;
    case '<':
    (number1 < number2) ? cout<<("Right") : cout<<("Wrong");
        break;
    case '=':
    (number1 == number2) ? cout<<("Right") : cout<<("Wrong");
        break;
    }

    return 0;
}
