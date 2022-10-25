package lamda;

interface  ComputeTool{
    public abstract int coumpute(int x, int y);

}

public class Main {


    public static void main(String[] args) {


        ComputeTool c1 = new ComputeTool(){
            @Override
            public int coumpute(int x, int y){
                return x>y? x:y;
            }
        };


        System.out.println(c1.coumpute(10,11));

        ComputeTool computeTool = (x, y) -> {return x>y ? x:y;};


        System.out.println(computeTool.coumpute(10,20));


    }
}
