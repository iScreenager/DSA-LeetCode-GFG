Input = abeefba
In order to make input string palindrome only one deletion is allowed,
To check the plaindrome we follow two pointer approach and
check if characters at start is equal to character at end or not
​
In this question to make input string palindrome
we might need to delete character at start position or at end position,
but we are not sure at which position deletion will be needed, So we will try deletion from both position one by one.
If frequency of deletion from start position is exactly one and
results in palindrom string then we will this info(count of deletion) in variable count1
and same try for end position.
​
After both trial i.e deletion at start and end position if the count of deletion is either zero(means INPUT STRING IS PALINDROME ALREADY) or
one(means ONLY ONE DELETION IS PERFORMED TO MAKE STRING PALINDROME) then return true else return false
```
var validPalindrome = function(s) {
let i = 0;
let j = s.length-1;
let c1 = 0;
let c2 = 0;
while(i<=j){
if(s.charAt(i)==s.charAt(j)){
i++;
j--;
}else{
c1++;