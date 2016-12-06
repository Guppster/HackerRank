#!/bin/bash
awk ' { 
if ( $3 <= 25 ){
    print "User",$1,$2,"is less than 25 years old." ;
}
else {
    print "User",$1,$2,"is more than 25 years old" ; 
}
}'    ~/test.txt

awk ' BEGIN{ counter=0 ;
while(counter<=10){
    print counter;
    counter+=1 ;
}
} ' 
