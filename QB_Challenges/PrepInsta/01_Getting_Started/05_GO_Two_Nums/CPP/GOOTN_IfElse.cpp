#include <iostream>
using namespace std;

void GOOTN(){
    int num1, num2;
    cout <<"Enter the first number: ";
    cin >>num1;
    cout <<"Enter the second number: ";
    cin >>num2;

    if(num1>num2){
        cout <<num1 <<" is greater than " <<num2 <<endl;
    }else{
        cout <<num2 <<" is greater than " <<num1 <<endl;
    }
}

int main(){
    GOOTN();
    return 0;
}