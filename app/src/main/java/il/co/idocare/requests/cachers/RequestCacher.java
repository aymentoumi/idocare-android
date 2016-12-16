package il.co.idocare.requests.cachers;

import android.content.ContentValues;
import android.support.annotation.NonNull;

import il.co.idocare.requests.RequestEntity;
import il.co.idocare.contentproviders.IDoCareContract.Requests;
import il.co.idocare.utils.StringUtils;

/**
 * This class handles request related info storage into the cache
 */
public class RequestCacher {


    private ContentValues requestEntityToContentValues(@NonNull RequestEntity requestEntity) {

        ContentValues values = new ContentValues();

        values.put(Requests.COL_REQUEST_ID, requestEntity.getId());
        values.put(Requests.COL_CREATED_BY, requestEntity.getCreatedBy());
        values.put(Requests.COL_CREATED_AT, requestEntity.getCreatedAt());
        values.put(Requests.COL_CREATED_COMMENT, requestEntity.getCreatedComment());
        values.put(Requests.COL_CREATED_PICTURES, StringUtils.listToCommaSeparatedString(requestEntity.getCreatedPictures()));
        values.put(Requests.COL_CREATED_VOTES, requestEntity.getCreatedVotes());
        values.put(Requests.COL_LATITUDE, requestEntity.getLatitude());
        values.put(Requests.COL_LONGITUDE, requestEntity.getLongitude());
        values.put(Requests.COL_PICKED_UP_BY, requestEntity.getPickedUpBy());
        values.put(Requests.COL_PICKED_UP_AT, requestEntity.getPickedUpAt());
        values.put(Requests.COL_CLOSED_BY, requestEntity.getClosedBy());
        values.put(Requests.COL_CLOSED_AT, requestEntity.getClosedAt());
        values.put(Requests.COL_CLOSED_COMMENT, requestEntity.getClosedComment());
        values.put(Requests.COL_CLOSED_PICTURES, StringUtils.listToCommaSeparatedString(requestEntity.getClosedPictures()));
        values.put(Requests.COL_CLOSED_VOTES, requestEntity.getClosedVotes());
        values.put(Requests.COL_LOCATION, requestEntity.getLocation());

        return values;
    }
}
