import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_3a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while ((s = br.readLine()) != null) {
            if (s.isBlank()) continue;

            listOfStrings.add(s);
        }

        int impossibleTriangle = 0;

        List<String> removeCollection = new ArrayList<>();
        removeCollection.add("");

        for(String str : listOfStrings){
            String [] listOfThreeNumber = str.split(" ");

            List<String>lista = new ArrayList<>();

            for(String strin : listOfThreeNumber)
                lista.add(strin);

            lista.removeAll(removeCollection);

            int a = Integer.parseInt(lista.get(0));
            int b = Integer.parseInt(lista.get(1));
            int c = Integer.parseInt(lista.get(2));

            if(a + b <= c || b + c <= a || a + c <= b) impossibleTriangle++;
        }

        int sizeOfListString = listOfStrings.size();
        System.out.println("Number of possible triangles: " + (sizeOfListString - impossibleTriangle));
    }
}