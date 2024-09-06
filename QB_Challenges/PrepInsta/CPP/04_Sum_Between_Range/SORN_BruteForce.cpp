#include <iostream>
using namespace std;


void SORN(){
    int num1, num2;
    cout <<"Enter the first number: ";
    cin >> num1;
    cout <<"Enter the second number: ";
    cin >> num2;

    int sum;
    for(int i=num1; i<=num2; i++){
        sum += i;
    }
    cout <<"The sum of "<<num1<<" & "<<num2<<" is: "<<sum<<endl;
}

int main(){
    SORN();

    return 0;
}