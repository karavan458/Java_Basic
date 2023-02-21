package sec11;

public class Ex01VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1 > 10) {
            int v2 = v1 - 10;
        }
        //변수 v2는 if문 블록 이후에는 사용이 불가함
    }
}
