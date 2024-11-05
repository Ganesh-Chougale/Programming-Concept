#include <iostream>
#include <math.h>
using namespace std;

bool isPrime(int n){

    if(n<2) return false;

    for(int i = 2; i<= sqrt(n); i++){
        if(n % i == 0) return false;
    }

    return true;

}

int main(){

    int first, last;
    cout <<"Enter first numbe: ";
    cin >>first;
    cout <<"Enter last number: ";
    cin >>last;
    
    if(first < 0 || last < 0){
        cout <<"Please enter the positive number" <<endl;
        return 1;
    }

    int start, end;

    if(first < last){
        start = first;
        end = last;
    }else{
        start = last;
        end = first;
    }

    cout <<"Prime numbers between " <<start <<" & " <<end <<" are: ";

    for(int i = start; i<=end; i++){
        if(isPrime(i)){
            cout <<i <<", ";
        }
    }

    return 0;
}