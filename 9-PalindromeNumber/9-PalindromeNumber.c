// Last updated: 2/13/2026, 11:34:03 AM
bool isPalindrome(int x) {
   long int rev = 0;
   int temp, rem = x;
   if(x<0)
   return false;
   while (x!=0)
   {
    temp = x%10;
    rev = rev*10+temp;
    x=x/10;
   }
   return rem==rev;
}