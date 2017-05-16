
public class Tweet {
	private String goldLabel ;
	private String predictedLabel ;
	private String tweetText ;
	
	
//String emotionwords;
//String time;
//String id;
//String domain;
//String languge;

	public Tweet(String line) {
		String[] fields = line.split("\t"); 
		goldLabel = fields[0] ;
//tweettext = ...
		
	}
	
	public Tweet() {
	// TODO Auto-generated constructor stub
}

	public void setPredictedLabel (String predictedLabel)  {
		this.predictedLabel = predictedLabel ;
	}
	
	public static void main(String[] args)
	{
		Tweet te=new Tweet();
		Corpus cp=new Corpus();
		//cp.reader();
		cp.evaluate();
		
	}

}
