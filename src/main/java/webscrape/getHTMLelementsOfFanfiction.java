package webscrape;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class getHTMLelementsOfFanfiction {

	public static String getffIDnumber(String ffID) {//uses String ffID to create URL for Document doc to use 
		String url = "https://www.fanfiction.net/s/"+ffID;	
		
		return url;
	}
	
	public String getTitle(String ffID) { //Obtains the text inside the text element "b.xcontrast_txt"
		String titleText = null;
		
		try {
			
			Document doc = Jsoup.connect(getffIDnumber(ffID)).get();
			
			Element profile = doc.select("div#profile_top").first();
			Element title = profile.select("b.xcontrast_txt").first();
			if(title == null) {
				System.out.println("ERROR - Title is null");
				return null;
			}
			
			titleText = title.text();
			
		}
		catch (Exception ne) {
			ne.printStackTrace();
		}
		
		return titleText;
		
 	}
	
	public String getAuthor(String ffID) {//Obtains the HTML text for Author element of a.xcontrast_txt[href] 
		String authorText = null;
		
		try {
			
			Document doc = Jsoup.connect(getffIDnumber(ffID)).get();
			
			Element profile = doc.select("div#profile_top").first();
			Element author = profile.select("a.xcontrast_txt[href]").first();
			
			authorText = author.text();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return authorText;
		
	}
	
	public String getDesc(String ffID) {//Obtains the HTML text for the Description element of div.xcontrast_txt
		String descText = null;
		
		try {
			Document doc = Jsoup.connect(getffIDnumber(ffID)).get();
			
			Element profile = doc.select("div#profile_top").first();
			Element desc = profile.select("div.xcontrast_txt").first();
			
			descText = desc.text();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return descText;
	}
	
	public String getByLine(String ffID) {//Obtains the HTML text for the ByLine element of span.xgray.xcontrast_txt
		String byLineText = null;
		
		try {
			Document doc = Jsoup.connect(getffIDnumber(ffID)).get();
			
			Element profile = doc.select("div#profile_top").first();
			Element byLine = profile.select("span.xgray.xcontrast_txt").first();
			
			byLineText = byLine.text();
		}
		catch (Exception e) {	
			e.printStackTrace();
		}
		
		return byLineText;
	}
	
	public boolean canFindFF(String ffID) {// NOTE! Change method so if noStoryFound element is not available it returns true
		boolean obtainFF = true;
		try{
			Document doc = Jsoup.connect(getffIDnumber(ffID)).get();
			
			Elements noStoryFound = doc.select("span.gui_warning");
			
			if(!noStoryFound.isEmpty()) {
				String noStoryFoundText = noStoryFound.text();
				
				if (noStoryFoundText.equals("Story Not Found Story is unavailable for reading. (A)")) {
					obtainFF = false;
				}
				else {
					obtainFF = true;
				}
			}
			
			else {
				obtainFF = true;
			}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		return obtainFF;
	}
	
}
