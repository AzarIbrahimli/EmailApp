package emailApp;

import java.util.ArrayList;
import java.util.List;

public class Collection implements CRUD {

    List<Email> listEmail = new ArrayList<>();

    @Override
    public String save(Email email) {
        listEmail.add(email);
        return "Saved";
    }

    @Override
    public void load() {
        System.out.println(listEmail);
    }



    @Override
    public String delete(Email email) {
        listEmail.remove(email);
        return "Deleted";
    }
}
