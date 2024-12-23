#include <iostream>
using namespace std;

string RTS(string txt){
    if(txt.length() < 2){
    return "please enter string with atleast 2 characters";
    }

    int left = 0;
    int right = txt.length() -1;
    cout << right <<endl;

    while(left<right){
        char temp = txt.at(left);
        txt.at(left) = txt.at(right);
        txt.at(right) = temp;
        
        left ++;
        right --;
    }

    return txt;

}

int main(){
    string str;
    cout<< "Enter the String: ";
    cin >> str;
    RTS(str);
    return 0;
}


