#include <iostream>
using namespace std;

bool isPalindrome(int number) {
    int originalNumber = number; 
    int reversedNumber = 0;

   
    while (number > 0) {
        int digit = number % 10; 
        reversedNumber = reversedNumber * 10 + digit; 
        number /= 10;
    }

    
    return originalNumber == reversedNumber;
}

int main() {
    int num;

    cout << "Enter a number: ";
    cin >> num;

    if (isPalindrome(num)) {
        cout << " palindrome " << endl;
    } else {
        cout << " not a palindrome " << endl;
    }

    return 0;
}