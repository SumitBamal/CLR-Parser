import java.util.regex.*;
import java.util.*;
//------------------------------------------------------
public class firstFollow {
	public static void main(String[] args) {
		String[] sym = {"a","b","c"}; 
		String[] sym2 ={"b","a","d"}; 
		
		nonTerminal X = new nonTerminal('X');
		X.add_first(sym);
		X.add_first(sym2);
		X.add_follow(sym);
		X.add_follow(sym2);
		
		X.printFirstFollow();
	}
}
//------------------------------------------------------
class terminal{
	private char symbol;
	public void terminal(char symbol) {   //constructor
		symbol=symbol;
	}
	public char __str__() {
		return symbol;
	}
}
//------------------------------------------------------

class nonTerminal{
	private char symbol;
	Set<String> first = new HashSet<String>();
	Set follow = new HashSet();
	
	public nonTerminal(char symbol ) {
		symbol= symbol;
	}
	public char __str__() {
		return symbol;
	}
	public void add_first(String[] symbols) {
		List<String> symbols_list = Arrays.asList(symbols );
		first.addAll(new HashSet(symbols_list));		
	}
	public void add_follow(String[] symbols) {
		List<String> symbols_list = Arrays.asList(symbols);
		follow.addAll(new HashSet(symbols_list));
	}		
	public void printFirstFollow() {
		System.out.print("First is of "+symbol+" is :");
		first.forEach(System.out::println);
		System.out.print("\nFollow is of "+symbol+" is :");
		first.forEach(System.out::println);
		
	}
}
  