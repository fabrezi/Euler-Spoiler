/*
how do you declare a variable in js?

there are four methods to do so: var, const,
let and nothing

*/

//fibo series
var i = 1;
var j = 2;
var s = 0;


do {
    if(i % 2 == 0){
        s=s+i;
    }
    var k = i + j;
    i = j;
    j = k;
  
} while (i < 4000000);

console.log("sum:" + s);
// expected result: "12345"