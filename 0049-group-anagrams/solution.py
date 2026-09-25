class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        mapy = {}

        for s in strs:
            arr = [0] * 26
            
            for char in s:
                index = ord(char) - ord("a")
                arr[index] = arr[index] + 1
            
            lst = mapy.get(str(arr), [])
            lst.append(s)
            mapy[str(arr)] = lst

        return list(mapy.values())
