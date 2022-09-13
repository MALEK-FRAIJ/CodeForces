#include <iostream>
using namespace std;

int main()
{
    long long a, b, c;
    char o1, o2;

    cin >> a >> o1 >> b >> o2 >> c;

    switch (o1)
    {
    case '+':

        (a + b == c) ? cout << ("Yes") : cout << (a + b);
        break;
    case '-':

        (a - b == c) ? cout << ("Yes") : cout << (a - b);
        break;
    case '*':

        (a * b == c) ? cout << ("Yes") : cout << (a * b);
        break;
    }

    return 0;
}