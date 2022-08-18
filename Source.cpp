#include<iostream>
#include<cmath>
using namespace std;

int main(void) {

/*H. Two numbers
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output*/
	
	double a, b;
	cin >> a >> b;

	cout << "floor " << a << " / " << b << " = " << floor(a / b) << endl;
	cout << "ceil " << a << " / " << b << " = " << ceil(a / b) << endl;
	cout << "round " << a << " / " << b << " = " << round(a / b) << endl;
	return 0;
}