package com.ethohampton.pi_decoder.objects;

public class LoopAnswer {

	private int times;
	private String previous;
	private boolean found = false;
	
	/**
	 * @param times
	 * @param previous
	 */
	public LoopAnswer(int times, String previous) {
		super();
		this.times = times;
		this.previous = previous;
	}
	
	/**
	 * 
	 * @param previous
	 * @param found
	 */
	public LoopAnswer(String previous,boolean found) {
		this.previous = previous;
		this.found = found;
	}

	/**
	 * @return the times
	 */
	public int getTimes() {
		return times;
	}

	/**
	 * @param times the times to set
	 */
	public void setTimes(int times) {
		this.times = times;
	}

	/**
	 * @return the previous
	 */
	public String getPrevious() {
		return previous;
	}

	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(String previous) {
		this.previous = previous;
	}

	/**
	 * @return the found
	 */
	public boolean isFound() {
		return found;
	}

	/**
	 * @param found the found to set
	 */
	public void setFound(boolean found) {
		this.found = found;
	}
	
	
}
