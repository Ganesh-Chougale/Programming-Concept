#include <iostream>
using namespace std;

void GOTN(){
    int num1, num2, num3;
    cout <<"Enter the first number: ";
    cin >>num1;
    cout <<"Enter the second number: ";
    cin >>num2;
    cout <<"Enter the third number: ";
    cin >>num3;

    int result = max(num1, max(num2, num3));

    cout <<result <<" is a greatest number" <<endl;
}

int main(){
    GOTN();
    return 0;
}