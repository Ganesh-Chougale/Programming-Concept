#include <iostream>
#include <math.h>
using namespace std;

void func(){
    int num;
    cout <<"Enter your number: ";
    cin >>num;

    bool isPrime = true;

    if(num<2){
        isPrime = false;
    }else if(num == 2){
        isPrime = true;
    }else{
        for(int i = 3; i < sqrt(num); i+=2){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
    }

    string result = isPrime ? " is a prime number." : " is not a prime number.";
    cout <<num <<result <<endl;
}

int main(){
    func();
    return 0;
}