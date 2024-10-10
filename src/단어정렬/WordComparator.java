package 단어정렬;

import java.util.TreeSet;

public class WordComparator implements Comparable<WordComparator> {
    private String word;


    @Override
    public int compareTo(WordComparator o) {
        if (this.word.length() != o.word.length()) return this.word.length()-o.word.length();
        else return this.word.compareTo(o.word);
    }

    public WordComparator(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    @Override
    public String toString(){
        return getWord();
    }
}
