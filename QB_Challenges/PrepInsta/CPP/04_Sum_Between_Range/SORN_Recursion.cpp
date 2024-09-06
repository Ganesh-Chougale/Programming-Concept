#include <iostream>
using namespace std;

int SORN(int sum, int n1, int n2){
    if(n1>n2){
        return sum;
    }
    return n1 + SORN(sum, n1+1, n2);
}

int main(){
    int n1, n2;
    cout <<"Enter the first number: ";
    cin >>n1;
    cout <<"Enter the second number: ";
    cin >>n2;
    int sum = SORN(0, n1, n2);
    cout <<"The sum of numbers between "<<n1<<" & "<<n2<<" is: "<<sum <<endl;
    return 0;
}