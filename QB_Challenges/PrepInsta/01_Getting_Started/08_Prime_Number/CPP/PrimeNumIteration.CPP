#include <iostream>
using namespace std;

void msgPrime(){
    int num;
    cout <<"Enter Your Number: ";
    cin >>num;

    if(num<2){
        cout <<num <<" is not a prime number" <<endl;
    }

    int count;
    for(int i=1;i<=num; i++){
        if(num % i == 0){
            count ++;
        }
    }

    if(count>2){
        cout <<num <<" is not a prime number" <<endl;
    }else{
        cout <<num <<" is a prime number" <<endl;
    }

}

int main(){
    msgPrime();
    return 0;
}