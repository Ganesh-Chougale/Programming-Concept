#include <iostream>
using namespace std;

void GOOTN(){
    int num1, num2;
    cout <<"Enter the first number: ";
    cin >>num1;
    cout <<"Enter the second number: ";
    cin >>num2;

    string result =
    (num1>num2) ?
    to_string(num1) + " is greater than " + to_string(num2) :
    to_string(num2) + " is greater than " + to_string(num1) ;

    cout << result;
}

int main(){
    GOOTN();
    return 0;
}