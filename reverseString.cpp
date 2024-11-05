#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    string str = "Hello World";
    string word;
    cout<< "Enter the String";
    cin>>word;
    reverse(str.begin(), str.end());
    reverse(word.begin(),word.end());
    cout << str;  
    cout<<word;
    return 0;
}