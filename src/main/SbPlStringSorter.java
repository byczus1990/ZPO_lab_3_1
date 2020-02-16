package main;

import java.text.Collator;

public class SbPlStringSorter {
	String[] namesTable = null;
	public SbPlStringSorter(String[] names)
	{
		if(!(names.length == 0))
		{
			namesTable = names;
		}else
		{
			namesTable = null;
		}
	}
	public static void sortStrings(Collator collator, String[] words)
	{
		
	}
	public static void fastSortStrings(Collator collator, String[] words)
	{
		
	}
	public static void fastSortStrings2(Collator collator, String[] words)
	{
		
	}
}
