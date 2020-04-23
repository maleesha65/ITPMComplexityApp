#include<iostream>
using namespace std;

int main(){
    int i;
    cout << "Please enter an integer value :";
    cin >> i;
    cout << "The value you enterd is :" << i;
    
    if (i > 0){
        cout << "positive number";
    }
    else {
        cout << "negative number";
    }
}
