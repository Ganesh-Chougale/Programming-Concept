#include <iostream>
using namespace std;

void EOO(){
    int num;
    cout <<"Enter the number: ";
    cin >>num;

    string result =
    (num % 2 == 0) ?
    to_string(num) + " is a Even number" :
    to_string(num) + " is a Odd number" ;

    cout <<result <<endl;
}

int main(){
    EOO();
    return 0;
}