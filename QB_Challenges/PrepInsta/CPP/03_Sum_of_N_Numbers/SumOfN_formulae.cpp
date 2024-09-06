#include <iostream>
using namespace std;

void SONN(){
    int num;
    cout <<"Enter the number: ";
    cin >>num;

    int sum = (num*(num+1)/2);

    cout <<"The sum of 0 to "<<num<<" numbers is: "<< sum <<endl;
}

int main(){
    SONN();
    return 0;
}