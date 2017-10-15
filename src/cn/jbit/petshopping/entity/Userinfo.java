package cn.jbit.petshopping.entity;

import java.math.BigDecimal;

import cn.jbit.petshopping.util.MD5Secret;


/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String password;
     private String email;
     private String address;
     private String phone;
     private String sex;
     private Integer isadmin = 0;
     private Integer activation = 0;


    // Constructors

    /** default constructor */
    public Userinfo() {
    }

	/** minimal constructor */
    public Userinfo(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
    
    /** full constructor */
    public Userinfo(String name, String password, String email, String address, String phone, String sex) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.sex = sex;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
    	//调用加密函数
        this.password = MD5Secret.string2MD5(password);
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

	public Integer getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(Integer isadmin) {
		this.isadmin = isadmin;
	}

	public Integer getActivation() {
		return activation;
	}

	public void setActivation(Integer activation) {
		this.activation = activation;
	}
   








}