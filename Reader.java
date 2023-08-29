public class Reader
{
    String word = "";
    public String read (wording file) 
    {
        BufferedReader br = new BufferedReader (new FileReader(file));
		while (br.ready())
        {
            word += br.read();
        }
		br.close();
        return word;
    }
}