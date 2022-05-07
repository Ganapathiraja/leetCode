package trie.triedatastructure;

// Java implementation of search and insert operations
// on Trie
class TrieNode
{
    final int ALPHABET_SIZE = 26;
    final TrieNode[] children;

    // isEndOfWord is true if the node represents
    // end of a word
    boolean isEndOfWord;

    public TrieNode()
    {
        isEndOfWord = false;
        children = new TrieNode[ALPHABET_SIZE];
    }
}
public class Trie
{

    static TrieNode root;

    // If not present, inserts key into trie
    // If the key is prefix of trie node,
    // just marks leaf node
    static void insert(String key)
    {
        int length = key.length();
        TrieNode pCrawl = root;

        for (int level = 0; level < length; level++)
        {
            int index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
            {
                pCrawl.children[index] = new TrieNode();
            }

            pCrawl = pCrawl.children[index];
        }

        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }

    // Returns true if key presents in trie, else false
    static boolean search(String key)
    {

        int length = key.length();
        TrieNode pCrawl = root;

        for (int level = 0; level < length; level++)
        {
            int index = key.charAt(level) - 'a';

            if (pCrawl.children[index] == null)
            {
                return false;
            }

            pCrawl = pCrawl.children[index];
        }

        return (pCrawl.isEndOfWord);
    }

    // Driver
    public static void main(String args[])
    {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {
            "the", "a", "there", "answer", "any",
            "by", "bye", "their" };

        String output[] = { "Not present in trie", "Present in trie" };


        root = new TrieNode();

        // Construct trie
        int i;
        for (i = 0; i < keys.length; i++)
        {
            insert(keys[i]);
        }

        // Search for different keys
        if (search("the") == true)
        {
            System.out.println("the --- " + output[1]);
        }
        else
        {
            System.out.println("the --- " + output[0]);
        }

        if (search("these") == true)
        {
            System.out.println("these --- " + output[1]);
        }
        else
        {
            System.out.println("these --- " + output[0]);
        }

        if (search("their") == true)
        {
            System.out.println("their --- " + output[1]);
        }
        else
        {
            System.out.println("their --- " + output[0]);
        }

        if (search("thaw") == true)
        {
            System.out.println("thaw --- " + output[1]);
        }
        else
        {
            System.out.println("thaw --- " + output[0]);
        }
    }
}
// This code is contributed by Sumit Ghosh
