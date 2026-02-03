/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

public class Session {
    private static Session instance;
    
    // Fields to store user data
    private int id;
    private String email;
    private String type;
    private String status;
    private String name;
    // Add other fields like name, contact, etc., if they exist in your DB

    private Session() { }

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

   public String getName() { return name; }
    public void setName(String name) { this.name = name; }
   
}
