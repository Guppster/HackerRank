#! /usr/bin/awk -f 
#use BEGIN sepecial character to set FS built-in variable
BEGIN { FS=":" }
#search for username: aaronkilik and print account details 
/singh/ { print "Username :",$1,"User ID :",$3,"User GID :",$4 }
