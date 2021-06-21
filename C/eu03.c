#include <stdio.h>
#include <iostream>


long primou(long long n){
    long factor = 1;
    for(int i = 2; i <= n; i++){
        if(n % 1 == 0){
            factor = i;
            
            while (n% i == 0){
                n = (n/i);
            }
        }
    }
    return factor;
}

int main(){
    long n = 423;
    std::cout<<"the largest prime factor is baby olalalal == "<< primou(n);
}
