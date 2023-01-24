import java.util.*;  


public class APIResponseParser {
    
     /**
	 * Parses the input text and returns a Book instance containing
	 * the parsed data. 
	 * @param response text to be parsed
	 * @return Book instance containing parsed data
	 */
     public static Book parse(String response) {
        Book book = new Book();
		String endRule = "<";
		
		String startRule = "<title>";		
		String title = parse(response, startRule, endRule); 
	    book.setTitle(title);
	    //method getAuthor()
	    startRule = "<name>";
	    String author=parse(response, startRule, endRule); 
	    book.setAuthor(author);
// 		method getAverageRating()

        startRule = "<average_rating>";
	    String Rating=parse(response, startRule, endRule); 
	    //System.out.println(rating);
	    double val=Double.parseDouble(Rating);
	    book.setAverageRating(val);
	    
	    
		//method getRatingsCount()
        startRule = "<original_publication_year type=\"integer\">" ;
	    String year=parse(response, startRule, endRule); 
	    //System.out.println(rating);
	    int val1=Integer.parseInt(year);
	    book.setPublicationYear(val1);
	   
	   startRule = "<ratings_count type=\"integer\">" ;
	    String rcnt=parse(response, startRule, endRule); 
	    System.out.println(rcnt);
	    int val2=converter(rcnt);
	    System.out.println(val2);
	    book.setRatingsCount(val2);
	    
	    
	   startRule = "<image_url>" ;
	   String url=parse(response, startRule, endRule); 
	    book.setImageUrl(url);

		// Your code
		return book;
     }
     
     static int converter(String str)
     {
         int val=0;
         for(int i=0;i<str.length();i++)
         {
             char x=str.charAt(i);
             if(x!=',')
             {
                 val=val*10+(x-'0');
             }
         }
         return val;
     }
     // write overloaded parse method with the 3 parameters response, startRule, endRule
     static String parse(String response, String startRule, String endRule)
     {
         int ind1 = (int)response.indexOf(startRule);
         ind1+=startRule.length();
         int ind2=response.indexOf(endRule,ind1);
         String ans=response.substring(ind1,ind2);
        
         return ans;
         
         
     }
     
     public static void main(String[] args) {
		String response = "<work>" + 
	                            "<id type=\"integer\">2361393</id>" +
	                            "<books_count type=\"integer\">813</books_count>" +
	                            "<ratings_count type=\"integer\">1,16,315</ratings_count>" + 
	                            "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
	                            "<original_publication_year type=\"integer\">1854</original_publication_year>" +
								"<original_publication_month type=\"integer\" nil=\"true\"/>" +
								"<original_publication_day type=\"integer\" nil=\"true\"/>" +
								"<average_rating>3.79</average_rating>" +
								"<best_book type=\"Book\">" +
									"<id type=\"integer\">16902</id>" +
									"<title>Walden</title>" + 
									"<author>" +
										"<id type=\"integer\">10264</id>" + 
										"<name>Henry David Thoreau</name>" + 
									"</author>" +
									"<image_url>" + 
										"http://images.gr-assets.com/books/1465675526m/16902.jpg" +
									"</image_url>" +
									"<small_image_url>" + 
										"http://images.gr-assets.com/books/1465675526s/16902.jpg" +
									"</small_image_url>" +
								"</best_book>" +
							"</work>";
		
		APIResponseParser.parse(response);
	}
}