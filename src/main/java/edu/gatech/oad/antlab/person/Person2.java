package edu.gatech.oad.antlab.person;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Devashru Patel
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
        String random = "";
		ArrayList<Character> options = new ArrayList<>(input.length());

		for (int i = 0; i < input.length(); i++) {
            options.add(input.charAt(i));
        }
		while (!options.isEmpty()) {
		    random += options.remove((int) (Math.random() * options.size()));
        }
        return random;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
