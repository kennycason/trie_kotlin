package trie;

import org.junit.Test;
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by kenny on 6/6/16.
 */
class TrieTest {

    @Test
    fun stringTrie() {
        val trie = Trie<String>()
        assertFalse(trie.contains(emptyList()))

        trie.add(arrayListOf("a", "b", "c"))
        assertFalse(trie.contains(arrayListOf("a")))
        assertFalse(trie.contains(arrayListOf("a", "b")))
        assertTrue(trie.contains(arrayListOf("a", "b", "c")))

        trie.add(arrayListOf("a", "b"))
        assertTrue(trie.contains(arrayListOf("a", "b")))

        trie.add(arrayListOf("a", "b", "d", "e"))
        assertTrue(trie.contains(arrayListOf("a", "b", "d", "e")))
    }

    @Test
    fun charTrie() {
        val trie = Trie<Char>()
        assertFalse(trie.contains(emptyList()))

        trie.add(arrayListOf('a', 'b', 'c'))
        assertFalse(trie.contains(arrayListOf('a')))
        assertFalse(trie.contains(arrayListOf('a', 'b')))
        assertTrue(trie.contains(arrayListOf('a', 'b', 'c')))

        trie.add(arrayListOf('a', 'b'))
        assertTrue(trie.contains(arrayListOf('a', 'b')))

        trie.add(arrayListOf('a', 'b', 'd', 'e'))
        assertTrue(trie.contains(arrayListOf('a', 'b', 'd', 'e')))
    }

    @Test
    fun intTrie() {
        val trie = Trie<Int>()
        assertFalse(trie.contains(emptyList()))

        trie.add(arrayListOf(1, 2, 3))
        assertFalse(trie.contains(arrayListOf(1)))
        assertFalse(trie.contains(arrayListOf(1, 2)))
        assertTrue(trie.contains(arrayListOf(1, 2 ,3)))

        trie.add(arrayListOf(1, 2))
        assertTrue(trie.contains(arrayListOf(1, 2)))

        trie.add(arrayListOf(1, 2, 4, 5))
        assertTrue(trie.contains(arrayListOf(1, 2, 4, 5)))
    }
}
