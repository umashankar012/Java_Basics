enum Status {
    Running,Failed,Success,Pending
}


public class enumPrac {
    public static void main(String[] args) {
        
        Status s = Status.Pending;
        // System.out.println(s);

        // Status[] ss = Status.values();
        // System.out.println(ss[0]);

        // for(Status st : ss) {
        //     System.out.println(st + ": "+st.ordinal());
        // }


        // if(s == Status.Running){
        //     System.out.println("its working");
        // }
        // else if(s == Status.Pending){
        //     System.out.println("take time");
        // }
        // else if(s == Status.Failed){
        //     System.out.println("Not done");
        // }
        // else {
        //     System.out.println("Done");
        // }



        switch (s) {
            case Running:
                System.out.println("Working");
                break;

            case Failed:
                System.out.println("Not working");
                break;

            case Pending:
                System.out.println("Take time");
                break;
        
            default:
            System.out.println("Done");
                break;
        }



    }
}
