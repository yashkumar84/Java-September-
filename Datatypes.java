
public class Datatypes {
    public static void main(String[] args) {
        // Variables
        int a = 2147483647;
        double d = 10.10;
        float f = 10.10f;
        long l = 3248322342343l;
        short s = 7878;
        byte b = 127;
        char c = 'a';
        boolean bool = true;
        int e = 'a';
        System.out.println(Integer.MAX_VALUE);
        System.out.println(e);

        // -2 ^ n - 1 to (2 ^ n - 1) - 1 n = number of bits
        a = 10;

        String str = "sajhfjhsdgfsd";
        str = "Yash";
        int t = 0;
        System.out.println(t);

        StringBuilder st = new StringBuilder();
        st.append("Y");

        st.append("a");
        st.append("sh");
        System.out.println(st.toString());

        String newString = st.toString();

        StringBuffer sb = new StringBuffer();
        sb.append("Y");
        sb.append("as");
        sb.append("h");
        System.out.println(sb.toString());

    }

}
