#include<iostream>
using namespace std;
 

int  Sum(int number){
     int sum = 0;
    while (number != 0) {
        sum += number % 10;  
        number /= 10;        
    }
    return sum;
}
    

int main(){
    int number;
    std::cout<<"Enter a positive number";
    std::cin>>number;

  int result = Sum(number);
  std::cout<<result;

}
