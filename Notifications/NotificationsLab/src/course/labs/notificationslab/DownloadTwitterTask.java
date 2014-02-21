package course.labs.notificationslab;

import twitter4j.Twitter;
import android.os.AsyncTask;

// Uses an AsyncTask to download a Twitter user's timeline
public class DownloadTwitterTask extends AsyncTask<String, Void, String> {
	final static String CONSUMER_KEY = "MY CONSUMER KEY";
	final static String CONSUMER_SECRET = "MY CONSUMER SECRET";
	final static String TwitterTokenURL = "https://api.twitter.com/oauth2/token";
	final static String TwitterStreamURL = "https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name=";

	@Override
	protected String doInBackground(String... screenNames) {
		String result = null;

		if (screenNames.length > 0) {
			//result = getTwitterStream(screenNames[0]);
		}
		return result;
	}

	// onPostExecute convert the JSON results into a Twitter object (which is an Array list of tweets
	@Override
	protected void onPostExecute(String result) {
		//Twitter twits = jsonToTwitter(result);
/*
		// lets write the results to the console as well
		for (Tweet tweet : twits) {
			Log.i(LOG_TAG, tweet.getText());
		}

		// send the tweets to the adapter for rendering
		ArrayAdapter<Tweet> adapter = new ArrayAdapter<Tweet>(activity, android.R.layout.simple_list_item_1, twits);
		setListAdapter(adapter);*/
	}
		
	}