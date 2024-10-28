#include <iostream>
#include <math.h>
using namespace std;

void func(){
    int num;
    cout <<"Enter Your Number: ";
    cin >> num;

    bool isPrime = true;

    if(num < 2){
    isPrime = false;
    }
    else{
        for(int i = 2; i< sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
    }

    string result = isPrime ? " is a prime number." : " is not a prime number";
    cout <<num <<result <<endl;
    
    

}


int main(){
    func();
    return 0;
}