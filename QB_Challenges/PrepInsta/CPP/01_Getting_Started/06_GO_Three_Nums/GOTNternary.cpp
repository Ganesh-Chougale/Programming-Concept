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

    int temp, result;

    temp = (num1 >= num2) ? num1 : num2;
    result = (temp >= num3) ? temp : num3;

    cout <<result <<" is the greatest number" <<endl;

}

int main(){
    GOTN();
    return 0;
}