package com.springsymum.tictactoe.ExceptionHanlder;

public class NotFoundException extends Exception{
    private String message;
    public NotFoundException(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
