package org.example;

public class Registration {

    private String email;
   private  String userName;
    private String password;

    public String getEmail(String email){

        if(!email.contains("yahoo")){
            System.out.println("please provide the valid email address");


        }else {
            return email;

        }
        return email;
    }
   public void setUserName(String userName){

        if(userName.isEmpty()||userName.length()>6){
            System.out.println("invalid credentials");
        }else{
            this.userName=userName;
            System.out.println("your userName has been accepted");
        }
    }
    public void setPassword(String password){

        if(password.isEmpty()||password.length()>6){
            System.out.println("password can't be empty" + "password can't contain more than 6 characters" );
        } else if (password.contains(userName)) {
            System.out.println("password can't contain username");

        }else{
            this.password=password;
            System.out.println("your password had been created successfully ");
        }

    }
}
