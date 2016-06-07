package trie

/**
 * Created by kenny on 6/6/16.
 */
data class Node<T>(val value: T?,
                var isLeaf: Boolean,
                val children: MutableMap<T, Node<T>> = mutableMapOf())