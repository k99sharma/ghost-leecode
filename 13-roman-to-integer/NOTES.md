Approach One:
* Create  a hashmap with (character, value) as key-value pairs
* result = 0
* put last index value of string in result
* now iterate from i=totalLength - 2 to 0
* if value of s[i] < s[i+1]  => add value of s[i] in result
* otherwise subtract value from s[i]