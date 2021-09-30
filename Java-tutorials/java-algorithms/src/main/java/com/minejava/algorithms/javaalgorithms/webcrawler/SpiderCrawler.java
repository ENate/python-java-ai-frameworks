package com.minejava.algorithms.javaalgorithms.webcrawler;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpiderCrawler {
	// Fields
	Logger logger = LoggerFactory.getLogger(SpiderCrawler.class);
	private static final int MAX_PAGES_TO_SEARCH = 10;
	// Sets contain unique elements, urls or visited web
	// pages are meant to be unique!
	private Set<String> pagesVisited = new HashSet<>();
	/**
	 * storing a bunch of URLs we have to visit next. When the crawler visits a page
	 * it collects all the URLs on that page and we just append them to this list
	 */
	private List<String> pagesToVisit = new LinkedList<>();

	/**
	 * Our main launching point for the Spider's functionality. Internally it
	 * creates spider legs that make an HTTP request and parse the response (the web
	 * page).
	 *
	 * @param url        - The starting point of the spider
	 * @param searchWord - The word or string that you are searching for
	 */
	public void search(String url, String searchWord) {
		while (this.pagesVisited.size() < MAX_PAGES_TO_SEARCH) {
			String currentUrl;
			SpiderLeg leg = new SpiderLeg();
			if (this.pagesToVisit.isEmpty()) {
				currentUrl = url;
				this.pagesVisited.add(url);
			} else {
				currentUrl = this.nextUrl();
			}
			leg.crawl(currentUrl); // Lots of stuff happening here. Look at the crawl method in
			// SpiderLeg
			boolean success = leg.searchForWord(searchWord);
			if (success) {
				logger.info("**Success** Word {} found at {}", searchWord, currentUrl);
				break;
			}
			this.pagesToVisit.addAll(leg.getLinks());
		}
		logger.info("\n**Done** Visited {}, {}", this.pagesVisited.size(), " web page(s)");
	}

	/**
	 * Returns the next URL to visit (in the order that they were found). We also do
	 * a check to make sure this method doesn't return a URL that has already been
	 * visited.
	 *
	 * @return nextUrl
	 */
	private String nextUrl() {
		String nextUrl;
		do {
			nextUrl = this.pagesToVisit.remove(0);
		} while (this.pagesVisited.contains(nextUrl));
		this.pagesVisited.add(nextUrl);
		return nextUrl;
	}
}
