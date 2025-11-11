class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        r = 0
        if len(set(s)) <= 1:
            return len(set(s))

        seen = set()
        res = 0

        while r < len(s):
            if s[r] not in seen:
                seen.add(s[r])
                r += 1
                res = max(res , r-l)
            else:
                seen.remove(s[l])
                l+=1
        
        return res
        