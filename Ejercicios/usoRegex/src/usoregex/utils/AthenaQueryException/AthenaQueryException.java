/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoregex.utils.AthenaQueryException;

/**
 *
 * @author ASUS
 */
public class AthenaQueryException extends RuntimeException{
 public AthenaQueryException(String message) {
        super(message);
    }

    public AthenaQueryException(String message, Throwable cause) {
        super(message, cause);
    }
  }