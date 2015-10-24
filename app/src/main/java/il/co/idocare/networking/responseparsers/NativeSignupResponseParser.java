package il.co.idocare.networking.responseparsers;

import android.os.Bundle;

import java.io.IOException;

import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.client.ClientProtocolException;

/**
 * This is the decorator which should be used to process server responses to signup requests
 */
public class NativeSignupResponseParser implements ServerHttpResponseParser {

    private ServerHttpResponseParser mDecoratedResponseHandler;

    public NativeSignupResponseParser() {
        mDecoratedResponseHandler = new NativeLoginResponseParser();
    }

    @Override
    public Bundle parseResponse(HttpResponse httpResponse) {
        // Currently, signup and login responses are the same
        return mDecoratedResponseHandler.parseResponse(httpResponse);
    }
}