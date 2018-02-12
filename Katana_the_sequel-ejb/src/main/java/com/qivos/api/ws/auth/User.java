
package com.qivos.api.ws.auth;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author marianna
 */
@Entity
@Table(name = "users")
@AttributeOverride (name = "Id", column = @Column (name = "UserId"))
public class User implements Serializable {

    private static final long serialVersionUID = -5373312808149528456L;
    
    
    
    private String username;
    private String password;
    @Id
    private Long id;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
