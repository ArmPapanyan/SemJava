import java.util.*;

public class PhoneBook {
    private Map<String , String> map = new HashMap<>();
    void add (String name , String phoneNumber) {
        map.put(name, phoneNumber);
    }
    String getbyName(String name){
        return name + " : " + map.get(name);

    }
    String getbyPhoneNumber(String phoneNumber){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry:
                map.entrySet()) {
            if(entry.getValue().equals(phoneNumber))
            {
                stringBuilder.append(entry.getKey()).append(" : ").append(phoneNumber).append(" ");
            }
        }
        return stringBuilder.toString();
    }
    String getAll(){
        return map.toString();
    }
}


