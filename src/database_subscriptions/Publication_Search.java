/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_subscriptions;

/**
 *
 * @author brendanmcantosh
 */
public class Publication_Search 
{
    
    private String Name;
    private String Address;
    private String Type;
    private String Mfrequency;
    private String Nfrequency;
    private String rate;
    
    public Publication_Search (String Name, String Address, String Type)
    {
        this.Name = Name;
        this.Address = Address;
        this.Type = Type;
    
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getAddress()
    {
        return Address;
    }
    
    public String getType()
    {
        return Type;
    }
    
    public String getMfrequency()
    {
        return Mfrequency;
    }
    
    public String getNfrequency()
    {
        return Nfrequency;
    }
    
    public String getRate()
    {
        return rate;
    }
    
}
