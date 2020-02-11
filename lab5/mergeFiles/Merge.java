import java.io.* ;

class Merge{

    public static void main(String[] args) throws IOException
    {
        FileReader fr1 = new FileReader("file1.txt") ;
        FileReader fr2 = new FileReader("file2.txt") ;
        String content = "" ;
        int current ;

        while((current = fr1.read()) != -1){
            content += (char)current ;
        }
        while((current = fr2.read()) != -1){
            content += (char)current ;
        }
        FileWriter fw = new FileWriter("merged.txt") ;
        fw.write(content);
        fw.flush() ;
        System.out.print("Contents written.") ;
        fw.close() ;
        fr1.close( );
        fr2.close() ;

    }

}