#include <iostream>
using namespace std;

void isPrime(){
    int first, last;
    cout <<"Enter first number: ";
    cin >>first;
    cout <<"Enter last number: ";
    cin >>last;


    int start, end;

    int size = 0;
    int* pNum = new int[end - start + 1];

    if(first<0 || last<0){
        cout <<"please enter valid numbers" <<endl;
        return;
    }

    if(first < last){
        start = first;
        end = last;
    }else{
        start = last;
        end = first;
    }
    
    for(int i = start; i<=end; i++){
    bool flag = true;

        if(i<2) continue;

            for(int j = start; j<=end/2; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
        

        if(flag){
        pNum[size] = i;
        size++;
        }
    }

    cout <<"prime numbers between " <<start <<" to " <<end <<" is: ";

    for (int i = 0; i < size; i++) {
        cout << pNum[i] << " ";
    }
    cout << endl;

    delete[] pNum;
}

int main(){
    isPrime();
    return 0;
}