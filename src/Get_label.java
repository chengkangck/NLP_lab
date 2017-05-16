
import java.io.BufferedReader; 
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List; 

/*  Author: Kang Cheng,Irene Radchenko **/

     public class Get_label { 
  
		public static List Get_label1(String args) { 
            //List<Object> array=new ArrayList();
            List label=new ArrayList();
            try { 
            
            	BufferedReader reader = new BufferedReader(new FileReader(args));
                reader.readLine();//The first line of information, for the title information,if necessary not, comment out
                String line;
                while((line=reader.readLine())!=null){
                	//System.out.print(Get_label("C:/Users/chengkang/Desktop/emotion/dev.csv"));
                	String[] columns = line.split("\t");
                	label.add(columns[0]);
                	 //String[] strar = line.split(line,','); 
                	// System.out.println(columns [0]); 
                	

               /* while((line=reader.readLine())!=null){ 
                    String item[] = line.split("，");//The CSV format file is a comma delimited file, which is segmented by comma
                     
                    String last = item[item.length-1];//result
                    //int value = Integer.parseInt(last);
                    System.out.println(last); */
                } 
            } catch (Exception e) { 
                e.printStackTrace(); 
            }
           return label;
        }
    }
