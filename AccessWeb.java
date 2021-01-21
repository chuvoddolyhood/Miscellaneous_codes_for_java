//Link den trang web 
package linhtinh;

public class AccessWeb {
	    public static void main(String[] args) throws Exception {
	        Runtime run = Runtime.getRuntime();
	        String url = "https://chuvoddolyhood.github.io/personal/";
	        run.exec("rundll32 url.dll, FileProtocolHandler " + url);
	    }
}
