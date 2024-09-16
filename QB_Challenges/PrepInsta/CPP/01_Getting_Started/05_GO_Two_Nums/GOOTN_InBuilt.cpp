#include <iostream>
using namespace std;

void GOOTN(){
    int num1, num2;
    cout <<"Enter the first number: ";
    cin >>num1;
    cout <<"Enter the second number: ";
    cin >>num2;

    if (num1 == num2)
        cout << "both are equal";
    else
        cout << max(num1,num2) << " is greater ";

}

int main(){
    GOOTN();
    return 0;
}