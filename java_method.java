package project;
import java.util.*;
import static java.lang.Boolean.TRUE;
public class java_method {
    public String method_name;
    String return_type = "";
    String access_modiier = "";
    Boolean is_static; e
    ArrayList<java_variable> parameters_list = new ArrayList<>();
    public String get_method(){
        String s ="\t"+this.access_modifier+" ";
        if (this.is_static) {
            s+="static ";
        }
        if (TRUE) {
            s+=this.return_type;
            s+=" ";
        }
        s += this.method_name+" ( ";
        s+=" ){\n";
        s+="//please input what you want to put in your method here";
        
        
        s+="\t";
        return s;
    }

    public java_method() {
    }
}
