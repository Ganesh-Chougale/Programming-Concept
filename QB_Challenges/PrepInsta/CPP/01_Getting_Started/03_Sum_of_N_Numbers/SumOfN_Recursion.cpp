#include <iostream>
using namespace std;

int SONN(int num){
    if(num == 1){
        return 1;
    }

    return num + SONN(num - 1);
}

int main(){
    int digit;
    cout <<"Enter the number: ";
    cin >> digit;
    cout <<"The sum of 0 to "<<digit<<" numbers is: "<<SONN(digit) <<endl;
    
    return 0;
}