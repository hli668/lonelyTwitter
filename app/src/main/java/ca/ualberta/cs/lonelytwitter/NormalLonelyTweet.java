package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
//fixed one
// declaration access redundancy
//fixed two
// change some public method to private
//fixed three
// change some public class to package private
// change some protected variable to private
class NormalLonelyTweet implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date tweetDate;
	private String tweetBody;

	public NormalLonelyTweet() {
	}

	NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	private Date getTweetDate() {
		return tweetDate;
	}

	public void setTweetDate(Date tweetDate) {
		this.tweetDate = tweetDate;
	}

	private String getTweetBody() {
		return tweetBody;
	}

	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.writeObject(tweetDate);
		out.writeObject(tweetBody);
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		tweetDate = (Date) in.readObject();
		tweetBody = (String) in.readObject();
	}

	boolean isValid() {
		// fix one
		//redundant if statement, it can be simplifed
		/*
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
		*/

		return !(tweetBody.trim().length() == 0 || tweetBody.trim().length() > 10);
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}
}