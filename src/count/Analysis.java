package count;

public class Analysis {


    private int characters;
    private int rows;

    public void rowsanalyser(String text){
        rows++;
        characters+= text.length();

    }
        public int rowscounter()
        {
            return rows;
        }
        public int charactercounter(){
        return characters;
        }



}
