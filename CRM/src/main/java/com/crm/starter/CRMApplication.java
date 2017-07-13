/**
 * Application starting point.
 */
package com.crm.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author MNagarajan
 *
 */
@SpringBootApplication
@ComponentScan("com.crm.controllers")
public class CRMApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CRMApplication.class, args);

	}
}
