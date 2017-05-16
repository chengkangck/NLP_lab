import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*  Author: Kang Cheng,Irene Radchenko **/

public class Corpus {

	public List<Corpus> gold_annoation;
	public List<Corpus> predicated_annoation;
	
	private List<Tweet> tweets ;
	
public void reader(){// read the whole information of corpus
    try {
		BufferedReader reader = new BufferedReader(new FileReader("C:/Users/chengkang/Desktop/emotion/dev.csv"));
        reader.readLine();//The first line of information, for the title information,if necessary not, comment out
        String line;
        while((line=reader.readLine())!=null){
        	 String item[] = line.split(",");
        	 String last=item[item.length-1];
        	 System.out.println(last);
        }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

// reads from corpus file with annotations
}

public void readPredictions(String predictedFile) {
	// add predictions to tweet objects
	// iterature through prediction file in parallel with tweets list
}

public void evaluate(){
	Get_label get_label=new Get_label();
	List gold_label=Get_label.Get_label1("C:/Users/chengkang/Desktop/emotion/dev.csv");
	List predicted_label=Get_label.Get_label1("C:/Users/chengkang/Desktop/emotion/dev-predicted.csv");
	List emotion_label=Get_label.Get_label1("C:/Users/chengkang/Desktop/emotion/dev-predicted.csv");
    //System.out.print(gold_label);

	//System.out.print(emotion_label);
	
	HashSet<List> hashset_temp = new HashSet<List>(emotion_label);  
	emotion_label = new ArrayList<List>(hashset_temp); 
	//System.out.print(emotion_label);
    //List<Object> array=new ArrayList();

	double tp = 0;
	double fp = 0;
	double fn = 0;
	double tn = 0;
	for(int j=0;j<emotion_label.size();j++){
		for(int i=0; i<gold_label.size();i++){
		if(gold_label.get(i).equals(predicted_label.get(i))&&gold_label.get(i).equals(emotion_label.get(j))){
		     tp++;
			}
		else if(predicted_label.get(i).equals(emotion_label.get(j))&&gold_label.get(i) !=emotion_label.get(j)){
			fp++;
		}   if(gold_label.get(i).equals(emotion_label.get(j))&&predicted_label.get(i) !=emotion_label.get(j)){
			fn++;
		}
		else
			tn++;	
	}
		
		//System.out.println(tp);
		System.out.println(emotion_label.get(j));

		double accuracy=(tp+tn)/(tp+tn+fp+fn);
		double precision = tp / (tp + fp);
		double recall = tp / (tp + fn);
		double F1= 2*precision*recall/(precision+recall);
		//System.out.print(fp);
		

		System.out.println("precision  " + precision);
		System.out.println("recall  " +  recall);
		System.out.println("accuracy  "+ accuracy);
		System.out.println("F1  "+ F1);
	}
	


	

	
    
	

	
}
}
