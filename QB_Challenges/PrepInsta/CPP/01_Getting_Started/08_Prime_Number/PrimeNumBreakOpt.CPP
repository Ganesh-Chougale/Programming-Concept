#include <iostream>
using namespace std;

void msgPrime(){
    int num;
    cout <<"Enter your number: ";
    cin >>num;

    bool isPrime = true;

    if(num<2){
        isPrime = false;
    }else{
        for(int i=2; i<num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
    }

    string result = isPrime ? " is a prime number" : " is not a prime number";

    cout <<num <<result <<endl;
}

int main(){
    msgPrime();
    return 0;
}