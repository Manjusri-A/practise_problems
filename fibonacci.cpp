#include <iostream>
using namespace std;

int fibonacci(int n) {
    if (n < 0) {
        return -1; 
    } else if (n == 0) {
        return 0; 
    } else if (n == 1) {
        return 1; 
    }

    int a = 0; 
    int b = 1; 
    int fib;

    for (int i = 2; i <= n; ++i) {
        fib = a + b; 
        a = b; 
        b = fib; 
    }
    return fib; 
}

int main() {
    int n;
    cout << "Enter the position n to find the nth Fibonacci number: ";
    cin >> n;

    int result = fibonacci(n);
    if (result != -1) {
        cout  << result << endl;
    } else {
        cout << "Invalid input." << endl;
    }

    return 0;
}