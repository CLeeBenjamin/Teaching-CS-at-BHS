import java.util.ArrayList;

///Creates a word pair ///
class WordPair {
  public String first, second;

  public WordPair(String first, String second) {
    this.first = first;
    this.second = second;

  }

  public String getFirst() {
    return this.first;
  }

  public String getSecond() {
    return this.second;
  }

  @Override
  public String toString() {
    return "(" + this.getFirst() + ", " + this.getSecond() + ")";
  }

}

/// Puts each word pair into a list///
class WordPairList {

  public ArrayList<WordPair> allPairs;
  int count = 0;

  public WordPairList(String[] words) {
      allPairs = new ArrayList<WordPair>();

      for(int i =0; i<words.length-1;i++ ){
        for(int j = i+1; j<words.length;j++){
          allPairs.add(new WordPair(words[i], words[j]));
        }
      }
  }
  public int numMatches(){
   for(WordPair w : allPairs)
     if(w.getFirst().equals(w.getSecond()))
      count++;

    return count;
}
  }



class Main {
  public static void main(String args[]) {
    String[] arr = new String[] {"one","one", "one", "three"};

    WordPairList newList = new WordPairList(arr);
    System.out.println(newList.allPairs);
    System.out.println(newList.numMatches());

  }
}
