* Implement regular expression matching with support for ‘.’ and ‘*’.

example:

	‘.’ Matches any single character.
	‘*’ Matches zero or more of the preceding element.
	The matching should cover the entire input string (not partial).

	The function prototype should be:
	bool isMatch(const char *s, const char *p)

	Some examples:
	isMatch(“aa”,”a”) → false
	isMatch(“aa”,”aa”) → true
	isMatch(“aaa”,”aa”) → false
	isMatch(“aa”, “a*”) → true
	isMatch(“aa”, “.*”) → true
	isMatch(“ab”, “.*”) → true
	isMatch(“aab”, “c*a*b”) → true
	
	
hint:
		
Think carefully how you would do matching of ‘*’. Please note that ‘*’ in regular expression is different from wildcard matching, as we match the previous character 0 or more times. But, how many times? If you are stuck, recursion is your friend.

This problem is a tricky one. Due to the huge number of edge cases, many people would write lengthy code and have numerous bugs on their first try. Try your best getting your code correct first, then refactor mercilessly to as clean and concise as possible!


A sample diagram of a deterministic finite state automata (DFA). DFAs are useful for doing lexical analysis and pattern matching. An example is UNIX’s grep tool. Please note that this post does not attempt to descibe a solution using DFA.
	