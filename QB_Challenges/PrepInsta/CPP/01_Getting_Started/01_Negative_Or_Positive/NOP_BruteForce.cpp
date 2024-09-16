#include <iostream>
using namespace std;


void NOP(){
    int num;
    cout <<"Enter the number: ";
    cin >> num;

    if(num>0){
        cout <<num <<" is positive number" <<endl;
    }else if(num<0){
        cout <<num <<" is negative number" <<endl;
    }else{
        cout <<num <<" is Zero number" <<endl;
    }
}


int main(){
    NOP();
  return 0;
}