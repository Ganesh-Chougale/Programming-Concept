#include <iostream>
using namespace std;

void SORN(){
    int num1, num2;
    cout <<"Enter the first number: ";
    cin >> num1;
    cout <<"Enter the second number: ";
    cin >> num2;

    int sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;

    cout <<"The sum of "<<num1<<" & "<<num2<<" is: "<<sum<<endl;
}

int main(){
    SORN();
    return 0;
}