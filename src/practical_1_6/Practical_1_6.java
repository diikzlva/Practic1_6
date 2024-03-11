
package practical_1_6;

class Telephone {
    private String name;
    
    public Telephone (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName (String name){
        this.name = name;
    }
}

class Seller {
    public void modify(Telephone telephone) {
        String modifiedName = telephone.getName().replace("o","a");
        if (!modifiedName.toLowerCase().startsWith("n")) {
            modifiedName = modifiedName.toLowerCase();
        }
        telephone.setName(modifiedName);
    }
    
}