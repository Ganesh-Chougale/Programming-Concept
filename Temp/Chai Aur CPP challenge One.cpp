#include <iostream>
using namespace std;

// challenge one
void teaInfo(){
    string teaType = "\"Gawati Chaha\"";
    float pricePerKg = 82.50;
    char rating = 'S';

    cout <<teaType <<" is a " <<rating
    <<" type tea \nAnd its price is " <<pricePerKg 
    <<"₹ per kilogram" <<endl;
}

// challenge two
void setTeaPrice(){
    int teaPrice;
    cout <<"Enter the tea price: ";
    cin >>teaPrice;

    double priceHike = 10;

    int modTeaPrice = teaPrice + (teaPrice * (priceHike/100));

    cout <<"The original tea price is: " <<teaPrice <<endl;
    cout <<"The modified tea price is: " <<modTeaPrice <<endl;
}

void displayTea(){
    string favTea;
    cout <<"Enter your favorite tea: ";
    cin >>favTea;

    unsigned int teaQTY;
    cout <<"How many cup of " <<favTea <<" you will have? : ";
    cin >>teaQTY;

    cout <<"I know your favorite tea is "
    <<favTea <<" but " <<teaQTY <<" cups is too much for one go" <<endl;
}


int main(){
    teaInfo();
    setTeaPrice();
    displayTea();
    return 0;
}