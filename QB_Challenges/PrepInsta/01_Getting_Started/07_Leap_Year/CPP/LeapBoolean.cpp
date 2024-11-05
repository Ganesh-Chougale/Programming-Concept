#include <iostream>
using namespace std;

void isLeap(){
    int year;
    cout <<"Enter the year: ";
    cin >>year;

    bool leap;

    if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
        leap = true;
    }else{
        leap = false;
    } // end

    if(leap){
        cout <<year <<" is a leap year" <<endl;
    }else{
        cout <<year <<" is not a leap year" <<endl;
    } // end

}

int main(){
    isLeap();
    return 0;
}