
public class Archive {
    
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public String toString(){
        return identifier + ": " + name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedArchive = (Archive) compared;

        if (this.identifier.equals(comparedArchive.getIdentifier())){
            return true;
        }

        return false;
    }
        
}
