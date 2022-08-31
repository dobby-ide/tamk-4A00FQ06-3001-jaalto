import java.util.HashMap;
import java.util.Map;

public class Program {
    HashMap<String,String> code = new HashMap<String,String>();
    Program(){
        code.put("0","-----");
        code.put("1",".----");
        code.put("2","..---");
        code.put("3","...--");
        code.put("4","....-");
        code.put("5",".....");
        code.put("6","-....");
        code.put("7","--...");
        code.put("8","---..");
        code.put("9","----.");
    }
    public String morseCode(String phone){
        String[] arrayOfPhone = phone.split("");
        String result = "";
        for(Map.Entry m : code.entrySet()){
            for(int j=0;j<phone.length();j++){
                if(arrayOfPhone[j].equals(m.getKey())){
                    result += m.getValue() + " ";

                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Program program = new Program();
        String result = program.morseCode("0011223344455");
        System.out.println(result);
    }
}
