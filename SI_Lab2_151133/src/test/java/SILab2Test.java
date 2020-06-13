import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private final SILab2 siLab2;


    SILab2Test(SILab2 siLab2){
        this.siLab2 = siLab2;
    }


    @Test
    void multipleCondition(){
        List<String> users = new ArrayList<>();
        users.add("marthajones57");
        users.add("CutieMary624");

        assertEquals(new RuntimeException("The user argument is not initialized!"), siLab2.function(new User(null, "john", "johny@gmail.com"), users));
        assertEquals(new RuntimeException("User already exists!"), siLab2.function(new User("john", "john", "johny@gmail.com"), users));
        assertEquals(false, siLab2.function(new User("pit", "pot", "john.smith@gmailcom"), users));
        assertEquals(true, siLab2.function(new User("pit", "pot", "john.smith@gmail.com"), users));
    }
    
    @Test
    void everyPath(){
        List<String> users = new ArrayList<>();
        users.add("marthajones57");
        users.add("CutieMary624");

        assertEquals(new RuntimeException("The user argument is not initialized!"), siLab2.function(new User(null, "john", "johny@gmail.com"), users));
        assertEquals(new RuntimeException("User already exists!"), siLab2.function(new User("john", "john", "johny@gmail.com"), users));
        assertEquals(false, siLab2.function(new User("pit", "pot", "john.smith@gmailcom"), users));
        assertEquals(true, siLab2.function(new User("pit", "pot", "@."), users));
        assertEquals(true, siLab2.function(new User("pit", "pot", "john.smith@gmail.com"), users));
    }

}
