#include <iostream>
#include <fstream>
#include <cstring>

using namespace std;

void fileReader(){
    string filename;
    cout << "Enter Filename: ";
    getline(cin, filename);

    ifstream inFile;
    inFile.open(filename);

    if(inFile.fail()){
        cout <<"Error in opening file: "<<filename <<endl;
        // need to type: ../<filename.txt> cause TextFileReader.cpp will create new folder (output) to run exe file
        return;
    }

    char c;
    while(inFile.get(c)){
        cout <<c;
    }
    inFile.close();
}

int main(){
    fileReader();
    return 0;
}