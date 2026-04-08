/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapp;

/**
 *
 * @author Expert Info
 */  
public class Desktopapp {
   //intialsing objects added
    
    private String name;
    //text zones works with just strings (thats why its not int)
    private String id;
public Desktopapp(String name,String id){
    this.name=name;
    this.id=id;
}

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public String getId() {
        return id;
    }

    public void setId(String name) {
        this.id = id;
    }
    //to show the name and id
    public String ToString(){
        return name+"   "+id;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    }
    
}
