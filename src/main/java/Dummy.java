public class Dummy {
    boolean success;

    public void set(){
        int better=1;

        while(!success)
            doIt(better++);


    }

    public void doIt(int better){
        better++;
    }
}
