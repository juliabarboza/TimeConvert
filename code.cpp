#include <iostream>
#include <string>
#include <sstream>
using namespace std;

string TimeConvert(int num) { 

  // code goes here
  stringstream ss;
  ss << num/60 <<":"<<num%60;
  return ss.str();
            
}

int main() { 
  
  // keep this function call here
  cout << TimeConvert(gets(stdin));
  return 0;
    
}
