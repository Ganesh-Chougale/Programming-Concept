#include <iostream>
using namespace std;

bool func(int i, int num){
    if(num < 2){
        return false;
    }
    if(i == num){
        return true;
    }

    if(num % i == 0){
        return false;
    }

    i+=1;
    return (func(i, num));
}

int main(){

    int num;
    cout <<"Enter your number: ";
    cin >>num;

    bool isPrime = func(2, num);
    string result = isPrime ? " is a prime number." : " is not a prime number.";
    cout <<num <<result <<endl;

    return 0;
}