#include <iostream>
using namespace std;

void NOP(){
    int num;
    cout <<"Enter the number: ";
    cin >>num;

    if(num != 0){
        if(num>0){
            cout <<num <<" is positive number";
        }else{
            cout <<num <<" is negative number";
        }
    }else{
            cout <<num <<" is zero number";
    }
}

int main(){
NOP();
  return 0;
}