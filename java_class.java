package project;
import java.util.*;
public class java_class {
    public String class_name;
    public String class_package;
    public ArrayList<java_variable> variables_list = new ArrayList<>();
    public ArrayList<java_method> methods_list = new ArrayList<>();
    public String class_acess_modifier;
    public boolean has_contructor;
    public boolean has_getters;
    public boolean has_setters ;
    public boolean overrides_print;
    public boolean overrides_to_string;
    public boolean cotain_mains;
    public boolean class_extends;
    public String class_extended;

    
    public String to_code(){
        String s="package " + this.class_package+";\n" ;
        s += this.class_acess_modifier + " class " + this.class_name; 
        if (this.class_extends){
            s+= " extends " + this.class_extended;
        }
        
        s += " { \n";
        if (this.variables_list.size()>0){
           s += "\n// defining variables \n\n"; 
            for (int i = 0; i < this.variables_list.size(); i++) {
                s+= this.variables_list.get(i).initialize();
                s+="\n";
            }
            s+="\n\n";
        }
        if (this.has_contructor) {
            s+="// constuctor for the class\n";
            s+="public "+this.class_name+"(";
            if (this.variables_list.size()>0){
            boolean first = true;
            for (int i = 0; i < this.variables_list.size(); i++) {
                if(!this.variables_list.get(i).is_static){
                    if (first){
                        first=false;
                    }else{
                        s+=" , ";
                    }
                    s+=variables_list.get(i).type+" "+variables_list.get(i).variable_name;
                }
                    
            }
            }
            s+="){\n\n";
            if (this.variables_list.size()>0){
            for (int i = 0; i < this.variables_list.size(); i++) {
                if(!this.variables_list.get(i).is_static){
                    s+="\nthis."+variables_list.get(i).variable_name+" = "+variables_list.get(i).variable_name+";\n";
            }
                
            }
            s+="\n}\n";
        }
        }
        if (this.cotain_mains) {
            s+="\n\n// Main method\n\n";
            s+="public static void main(Srring [] args){\n//TODO Code here\n}";
        }

        if (this.methods_list.size()>0) {
            s+= "\n\n\n// needed methods methods \n";
            for (int i = 0; i < this.methods_list.size(); i++) {
                s+= methods_list.get(i).get_method()+"\n";
            }
        }

        if (this.has_getters | this.has_setters) {
            s+= "\n\n// Setters and getters\n\n";
            if (this.has_setters) {
                s+= "\n\n// Setters\n\n";
                s = variables_list.stream().map((v) -> v.get_setter()).reduce(s, String::concat);     
            }
            if (this.has_getters){
                s += "\n\n//Getters\n\n"; 
                s = variables_list.stream().map((v) -> v.get_getter()).reduce(s, String::concat);
            }
        }

        if(overrides_print){
            s+= "\n\n\n// print function override\n";
            s+="public void print(){";
            
            for (java_variable v : variables_list){
                s+="\n\t\tSystem.out.println(\""+v.variable_name+" is equal to \" + this."+v.variable_name +");\n";
            }
            
            s+="}";
            
            
        }

        
        if(overrides_to_string){
            s+= "\n\n\n\n// to string function override\n";
            s+="@Override\n";
            s+="\tpublic String toString() {\n";
            s+="\t\tString stringToReturn= \"\"\n";
            for (java_variable v : variables_list){
                s+="\t\tstringToReturn += \""+v.variable_name+" is equal to \" + this."+v.variable_name +";\n\n";
            }
            s+="\t\treturn stringToReturn;\n";
            s+="\t}";
        }
        
        s+="\n\n\n}";
        return s;
    }

    public java_class() {
    }
}



























/*

-- .- .--- -.. / -.-. . -. --. ...-- ..--- .....

*/