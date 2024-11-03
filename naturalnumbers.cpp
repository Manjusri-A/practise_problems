#include <iostream>

using namespace std;

int main() {
    int N;
    cout << "Enter a positive integer N: ";
    cin >> N;
    int sum = N * (N + 1) / 2;
    cout <<  sum << endl;

    return 0;
}