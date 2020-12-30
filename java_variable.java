package project;
import static java.lang.Boolean.TRUE;
public class java_variable {
    public String variable_name;
    public String type = "";
    public String access_modifier = "";
    public Boolean is_static;
    public Boolean has_initial_value ; 
    public String initial_value = "";
    
    
    public String initialize(){
        String s = "\t";
        if (TRUE){
            s+= this.access_modifier;
            s+= " ";
        }
        if (this.is_static){
            s+= "static ";
        }
        s+= this.type;
        s+=" ";
        s+= this.variable_name;
        if (this.has_initial_value){
            s+= " = " + this.initial_value;
        }
        s+=";";
        return s;
    }
    
    public String get_setter(){
        String s ;
        s="\n\tpublic void set_" +this.variable_name+" ( "+this.type+" "+this.variable_name +"){\nyou can add some custom code here\n\n\t\t";
        s+="this."+this.variable_name+" = "+this.variable_name+" ;\n";
        s+="\t}\n\n";
        return s;
    }
    
    public String get_getter(){
        String s;
        s="\n\tpublic "+this.type+" get_"+this.variable_name+" (){\n";
        s+="\t\treturn this."+this.variable_name+" ;\n";
        s+="\t}\n\n";
        return s;
    }

    public java_variable() {
    }
}
