# TypeAheadSuggestions
Typeahead suggestions enable users to search for known and frequently searched terms. As the user types into the search box, it tries to predict the query based on the characters the user has entered and gives a list of suggestions to complete the query. Typeahead suggestions help the user to articulate their search queries better. It’s not about speeding up the search process but rather about guiding the users and lending them a helping hand in constructing their search query. What data structure would be used for the same and how?

Solution for TypeAheadSuggestions -> com.mycompany.app.Typeahead TypeAheader.java

Data Structure used: Trie

Trie will store a set of strings stored in it. Now the user types in a prefix of his search query, we need to give him all recommendations to auto-complete his query based on the strings stored in the Trie. We assume that the Trie stores past searches by the users.
For example if the Trie store {“abc”, “abcd”, “aa”, “abbbaba”} and the User types in “ab” then he must be shown {“abc”, “abcd”, “abbbaba”}.


# Garbage Collection

Garbage Collection automatically determine what memory is no longer being used by a Java application and to recycle this memory for other uses.

* Garbage.java: Entry point of application, call method get(), release() and gc() of GarbageCollector class to create the reference, release the reference and to do the clean-up process respectively.

* GarbageCollector.java: It has createReferences method that will create the reference for object in the graph(add the object in graph ) and return the reference object. It has gc() and release method to release the reference and to do the clean-up process.

* GarbageCollectorTask: this will traverse through graph and identify unused references. It also push collected objects(unused references) to finalize queue, which is taken care by FinalizeTask.

* FinalizeTask: FinalizeTask calls the finalize method on the  objects pushed to finalize queue by GarbageCollectorTask class.

* Reference: Implementation of graph.

* 




