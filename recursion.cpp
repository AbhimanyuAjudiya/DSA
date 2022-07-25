#include<iostream>
using namespace std;

int sum(int n){
    if(n==0){
        return 0;
    }

    int prevSum = sum(n-1);
    return n + prevSum;
}

int power(int n, int p){
    if(p == 0){
        return 1;
    }
    int prevPower = power(n, p-1);
    return n * prevPower;
}

int main()
{
    // cout<<sum(4)<<endl;
    // cout<<power(4 , 10)<<endl;
    int n = 3984930;
    cout<<n[1]<<endl;
    return 0;
}