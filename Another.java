
public class Another {

    public static void main(String[] args) {

        String[] names = {"Man", "Woman", "Osas", "People", "Family"};

        String search = "man";

//        for(String d : names){
//            if(d.equalsIgnoreCase(search))
//                System.out.println("Found Osas in ");
//        }
        for (String name : names) {
            if (search.equalsIgnoreCase(name)) {
                System.out.println("Found " + search);
            } else {
            }
            break;
//            else{
//                System.out.println("Not found");
//                break;
//                }
        }

        String n = "David";

        if (n.equalsIgnoreCase("david")) {
            System.out.println("true");
        }
    }

}
