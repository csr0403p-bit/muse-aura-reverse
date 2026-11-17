package com.facebook.aura.ccv.nativeflow;

import X.C0881AGi;
import com.facebook.aura.json.NetworkException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class HatchCheckoutClientKt {
    public static final String CARD_ACTION_STATE_FAILURE = "FAILURE";
    public static final String CARD_ACTION_STATE_SUCCESS = "SUCCESS";
    public static final long CARD_SAVE_CONFIRMATION_POLL_INTERVAL_MS = 1000;
    public static final long CARD_SAVE_CONFIRMATION_TIMEOUT_MS = 25000;
    public static final long CARD_SAVE_FINAL_CHECK_TIMEOUT_MS = 5000;
    public static final String CHECKOUT_STATUS_PENDING = "PENDING";
    public static final String CHECKOUT_STATUS_SUCCESS = "SUCCESS";
    public static final String COMPONENT_PAYMENT_METHOD = "PAYMENT_METHOD";
    public static final String CONTAINER_MODE_LIVE = "LIVE";
    public static final String CREDENTIAL_TYPE_CARD = "CREDIT_CARD";
    public static final long FINALIZE_AFTER_CHALLENGE_TIMEOUT_MS = 20000;
    public static final int HTTP_REQUEST_TIMEOUT = 408;
    public static final int HTTP_TOO_MANY_REQUESTS = 429;
    public static final String MUTATION_TYPE_CREATE = "CREATE";
    public static final String OTC_TYPE_CARD = "card";
    public static final String PAYMENT_PRODUCT_ID = "766358168544755";
    public static final String PAYMENT_TYPE_ECP = "ECP";
    public static final String RECEIVER_ID = "352501280694489";
    public static final String TAG = "HatchCheckoutClient";

    public static final List<String> acceptedCardTypes(HatchCheckoutInitResponseJson hatchCheckoutInitResponseJson) {
        HatchCheckoutComponentJson next;
        List<String> list;
        Iterator<HatchCheckoutComponentJson> it = hatchCheckoutInitResponseJson.components.iterator();
        do {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
        } while (!COMPONENT_PAYMENT_METHOD.equals(next.type));
        HatchCheckoutComponentJson hatchCheckoutComponentJson = next;
        return (hatchCheckoutComponentJson == null || (list = hatchCheckoutComponentJson.supported_cc_types) == null) ? C0881AGi.A00 : list;
    }

    public static final boolean isFinalClientError(Throwable th) {
        int i;
        NetworkException networkException = th instanceof NetworkException ? (NetworkException) th : null;
        return (networkException == null || 400 > (i = networkException.httpResponseCode) || i >= 500 || i == 408 || i == 429) ? false : true;
    }

    public static final HatchCheckoutUnavailableReason toUnavailableReason(Throwable th) {
        NetworkException networkException;
        return ((th instanceof NetworkException) && (networkException = (NetworkException) th) != null && networkException.httpResponseCode == -1) ? HatchCheckoutUnavailableReason.TIMEOUT : HatchCheckoutUnavailableReason.SERVER_ERROR;
    }
}
