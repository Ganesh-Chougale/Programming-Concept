#include <iostream>
using namespace std;

void isLeap(){
    int year;
    cout <<"Enter the yearL ";
    cin >>year;

    int flag = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? 1 : 0;

    if(flag == 1){
        cout <<year <<" is a leap year" <<endl;
    }else{
        cout <<year <<" is not a leap year" <<endl;
    }



}

int main(){
    isLeap();
    return 0;
}