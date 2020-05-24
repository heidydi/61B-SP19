public class Palindrome {
    public Deque<Character> wordToDeque(String word){
        Deque<Character> d=new LinkedListDeque<>();
        for(int i=0;i<word.length();i++){
            d.addLast(word.charAt(i));
        }
        return d;
    }
    public boolean isPalindrome(String word){
        Deque<Character> x=wordToDeque(word);
        while (x.size()>1){
            Character a=x.removeFirst();
            Character b=x.removeLast();
            if(a!=b){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String word, CharacterComparator cc){
        Deque<Character> x=wordToDeque(word);
        while (x.size()>1){
            Character a=x.removeFirst();
            Character b=x.removeLast();
            if(!cc.equalChars(a,b)){
                return false;
            }
        }
        return true;
    }
}
