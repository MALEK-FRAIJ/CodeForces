#include <iostream>
using namespace std;
int main()
{

    int number1, number2;
    char oper;
    cin >> number1 >> oper>> number2;

    switch (oper)
    {
    case '+':
        cout << number1 + number2 << endl;
        break;
    case '*':
        cout << number1 * number2 << endl;
        break;
    case '-':
        cout << number1 - number2 << endl;
        break;

    default:
        cout << number1 / number2 << endl;
        break;
    }
    return 0;
}