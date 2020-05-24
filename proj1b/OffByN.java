public class OffByN implements CharacterComparator {
    int N;
    public boolean equalChars(char x, char y){
        return (x-y)<=N && (x-y)>=-N;
    }
    public OffByN(int n){
        N=n;
    }
}
