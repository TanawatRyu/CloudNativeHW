package th.ac.kmutt.sit.MyFirstService.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    ArrayList <User> arrayUser = new ArrayList<User>();
    public void setUser(){
        arrayUser.add(new User(1,"Tanawat"));
        arrayUser.add(new User(2,"John"));
        arrayUser.add(new User(3,"Susan"));
        arrayUser.add(new User(4,"Smith"));
        arrayUser.add(new User(5,"Game"));    
    }
    @RequestMapping("/user")
    public ArrayList<User> getUserAll(){
        setUser();
        return arrayUser;

    }
    @RequestMapping("/user/{id}")
    public User getUserIndex(@PathVariable("id") int id){
        setUser();
        return arrayUser.get(id-1);
    }
}