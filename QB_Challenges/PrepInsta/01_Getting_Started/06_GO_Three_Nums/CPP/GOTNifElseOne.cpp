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

    if(num1 >= num2 && num1 >= num3){
        cout <<num1 <<" is the greatest number" <<endl;
    }else if(num2 >= num1 && num2 >= num3){
        cout <<num2 <<" is the greatest number" <<endl;
    }else{
        cout <<num3 <<" is the greatest number" <<endl;
    }

}

int main(){
    GOTN();
    return 0;
}