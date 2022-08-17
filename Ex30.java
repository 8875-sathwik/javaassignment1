package mentor;


public class Ex30 {

    public static Boolean validateCode(String code) {
        boolean boo = false;
        StringBuffer cd = new StringBuffer(code);
        if (cd.length() >= 8) {
            if (isDigit(code)){
                if (code.startsWith("cod")) {
                    if (onlyAldi(code)){
                        if (isUpperCase(code)){
                            if (nUpminusLow(code)){
                                boo = true;
                            }

                        }
                    }
                }
            }
        }
        return boo;
    }

    static boolean isDigit(String code) {
        boolean flag = false;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c >= '0' && c <= '9')
                flag = true;
        }
        return flag;
    }

    static boolean onlyAldi(String code) {
        boolean f = true;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            c = Character.toUpperCase(c);
            if (!((c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9')))
                f = false;
        }
        return f;
    }
    static  boolean isUpperCase(String code){
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(3);
            if (c >= 'A' && c <= 'Z')
                return true;
        }
        return false;
    }
    static boolean nUpminusLow(String code){
        int nup=0;
        int nlow = 0;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(3);
            if (c >= 'A' && c <= 'Z') nup++;
            else if (c>+'a'&& c<='z') nlow++;
            if (nup-nlow>0){
               return  true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validateCode("codTf1tfsASDFGHJGHJ"));
    }
}




