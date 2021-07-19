package com.java.springAzure_poc;

/**
 * Hello world!
 *
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
/**
 * Hello world!
 *
 */

@SpringBootApplication
@RestController
public class SpringAzureApp 
{
	@GetMapping("/message")
	public String msg(){
		return "deployed successfully";
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
