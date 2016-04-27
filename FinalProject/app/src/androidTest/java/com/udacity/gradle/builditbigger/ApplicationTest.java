package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testAsynctask() {

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask() {
            @Override
            public void onPostExecute(String joke) {
                assertNotNull(joke);
                assertTrue(joke.length() != 0);
            }
        };
        endpointsAsyncTask.execute(getContext());
    }
}