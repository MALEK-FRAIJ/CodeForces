#include <iostream>
using namespace std;
/*
  M. Capital or Small or Digit
  time limit per test1 second
  memory limit per test256 megabytes
  input standard input
  output standard output
   */
int main()
{
    char x;
    cin >> x;

    /* Print a single line contains "IS DIGIT"
       if X is digit otherwise, print "ALPHA" in the first line followed
       by a new line that contains"IS CAPITAL" if X is a capital letter
       and "IS SMALL" if X is a small letter. */

    if (x > 96 && x < 123)
    {
        cout << "ALPHA\nIS SMALL";
    }
    else if (x > 64 && x < 91)
    {
        cout << "ALPHA\nIS CAPITAL";
    }
    else if (x > 47 && x < 58)
    {
        cout << "IS DIGIT";
    }

    return 0;
}