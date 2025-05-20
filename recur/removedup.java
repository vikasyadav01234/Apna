public class removedup {

    public static void stringdup(String st, int i, StringBuilder newst, boolean [] map){
        if(i==st.length()){
            System.out.print(newst);
            return;
        }
        char v = st.charAt(i);
        if(map[v-'a']==true){
            stringdup(st, i+1, newst, map);
        }else{
            map[v-'a']=true;
            stringdup(st, i, newst.append(v), map);
        }
    }
    public static void main(String [] args){
        String str ="vikasyadav";
        StringBuilder st = new StringBuilder();
        boolean [] map=new boolean[26];
        int i =0;
        stringdup(str,i, st, map);
    }
}
