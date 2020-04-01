import java.io.*;
import java.net.*;

public class RSSReader {


    public static String readRSS(String url) throws IOException {
        URL rssURL = new URL(url);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(rssURL.openStream()));
        String source = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains("<title><![CDATA")) {
                int firstPos = line.indexOf("<title><![CDATA");
                String temp = line.substring(firstPos);
                temp = temp.replace("<title><![CDATA", "");
                int lastPos = temp.indexOf("]></title>");
                temp = temp.substring(0, lastPos);
                source += temp + "\n";
            }
        }
        bufferedReader.close();
        return source;
    }

        public static void main (String[]args) throws IOException {
            System.out.println(readRSS("\thttp://feeds.bbci.co.uk/news/world/rss.xml"));
        }
    }

