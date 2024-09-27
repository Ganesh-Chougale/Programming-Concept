#include <iostream>
using namespace std;

void PN(){
    int num;
    cout <<"Enter The Number: ";
    cin >>num;

    int count = 0;

    if(num<2){
        cout <<num<<" is not a prime number";
    }

    for(int i=1; i<=num; i++){
        if(num % i == 0){
            count = count + 1;
        }
    }

    if(count > 2){
        cout <<num<<" is not a prime number";
    }else{
        cout <<num<<" is a prime number";
    }
}

int main(){
    PN();
    return 0;
}
