#include <iostream>
using namespace std;

void UserName(){
    string txt;
    int num;
    cout <<"Enter your name: ";
    cin >>txt;
    cout <<"Enter your age: ";
    cin >>num;

    cout <<"Your name is "<<txt <<" & your age is " <<num <<endl;
    return;
}

int main(){
    UserName();
    return 0;
}