#include <iostream>
using namespace std;

void EOO(){
    int num;
    cout <<"Enter the number: ";
    cin >>num;

    if(num % 2 == 0){
        cout <<num<<" is a Even number" <<endl;
    }else{
        cout <<num<<" is a Odd number" <<endl;
    }

}

int main(){
    EOO();
    return 0;
}