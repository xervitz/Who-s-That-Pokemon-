/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whosthatpokemon;

/**
 *
 * @author milesnecker
 */
public class pokemon {
    private String name;
    private int type1 = -1;
    private int type2 = -1;
    private String[] types = "normal,fighting,flying,poison,ground,rock,bug,ghost,steel,fire,water,grass,electric,psychic,ice,dragon,dark,fairy".split(",");
    
    public pokemon(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }
    
    public String getType() {
        String s = "";
        if(type1 != -1) {
            s = s + types[type1-1];
        }
        if(type2 != -1) {
            s = s + ", " + types[type2-1];
        }
        return s;
    }
    
    public void setType(int t1, int t2) {
        type1 = t1;
        type2 = t2;
    }
}
