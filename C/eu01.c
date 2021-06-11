#include <stdio.h>
#include <iostream>

int main() {    

    int sum = 0;
    for(int i =0; i < 10000; i++){
        if(i%3 == 0 || i%5 == 0){
            sum = sum + i;
        }
         
    }
    std::cout << "the sum is:" << sum;
   
}
