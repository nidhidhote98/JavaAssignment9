package com.psl.assign.nine;

public class MovieEnum {
	public enum Category {
		THRILLER, ACTION, ROMANCE, COMEDY, HORROR, DRAMA;
	}

	public enum Language {
		ENGLISH("English"), 
		HINDI("Hindi"), 
		MARATHI("Marathi");
		
		private String language;
		
		Language(String language) {
			this.language = language;
		}
		
		public String getLanguage() {
			return this.language;
		}
	}

}
