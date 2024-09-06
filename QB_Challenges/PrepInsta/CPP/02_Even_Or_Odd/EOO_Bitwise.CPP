#include <iostream>
using namespace std;

void EOO(){
    int num;
    cout <<"Enter the number: ";
    cin >>num;

    if((num & 1) == 0){
        cout <<num<<" is Even number" <<endl;
    }else{
        cout <<num<<" is Odd number" <<endl;
    }
}

int main(){
    EOO();
    return 0;
}