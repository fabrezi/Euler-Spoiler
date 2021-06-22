#include <stdio.h>
#include <iostream>


int fibo(){
    //first_value
    int i = 1;
    //second value
    int j = 2;
    //next value
    //int k = i + j;
    //sum
    int sum = 0;
    while(i < 4000000){
        if(i % 2 == 0){
            sum = sum + i;
        }
        int k = i + j;
        i = j;
        j = k;
        
        }
        return sum;
    }

int main() {
    //printf("the sum of the digits:")
    std::cout<<fibo();
  
}
