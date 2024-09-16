#include <iostream>
using namespace std;

void NOP(){
    int num;
    cout <<"Enter the number: ";
    cin >>num;

    string result = 
    (num > 0) ? to_string(num) + " is a positive number." :
    (num < 0) ? to_string(num) + " is a negative number." :
    to_string(num) + " is Zero number";

    cout <<result <<endl;

}

int main(){
NOP();
  return 0;
}