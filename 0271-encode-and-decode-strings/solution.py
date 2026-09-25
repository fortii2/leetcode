class Codec:
    def encode(self, strs: List[str]) -> str:
        """Encodes a list of strings to a single string."""
        res = ""
        for s in strs:
            res = res + str(len(s)) + "#" + s

        return res

    def decode(self, s: str) -> List[str]:
        """Decodes a single string to a list of strings."""
        i = 0
        length = 0
        res = []

        while i < len(s):
            while s[i] != "#":
                length = length * 10
                length = length + int(s[i])
                i = i + 1

            i = i + 1

            res.append(s[i : i + length])
            i = i + length
            length = 0

        return res


# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(strs))

