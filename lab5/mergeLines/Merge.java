import java.io.* ;

class Merge{

    public static void main(String[] args) throws IOException
    {
        FileReader fr1 = new FileReader("file1.txt") ;
        FileReader fr2 = new FileReader("file2.txt") ;
        FileWriter fw = new FileWriter("merged.txt") ;
        BufferedReader r1 = new BufferedReader(fr1) ;
        BufferedReader r2 = new BufferedReader(fr2) ;
        BufferedReader w = new BufferedWriter(fw) ;
        
        String current = "" ;

        while(1){
            
        }

        System.out.print("Contents written.") ;
        fw.flush() ;
        fw.close() ;
        fr1.close( );
        fr2.close() ;

    }

}