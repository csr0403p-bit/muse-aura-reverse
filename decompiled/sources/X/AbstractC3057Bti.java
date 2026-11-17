package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Bti, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3057Bti {
    public static final Map A00;
    public static final Map A01;

    static {
        HashMap mapA0u = BV4.A0u();
        A00 = mapA0u;
        HashMap mapA0u2 = BV4.A0u();
        A01 = mapA0u2;
        mapA0u.put(-2, "An unknown error occurred.");
        mapA0u.put(-3, "The API is not available on this device.");
        mapA0u.put(-4, "The request that was sent by the app is malformed.");
        mapA0u.put(-5, "The install is unavailable to this user or device.");
        mapA0u.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        mapA0u.put(-7, "The install/update has not been (fully) downloaded yet.");
        mapA0u.put(-8, "The install is already in progress and there is no UI flow to resume.");
        mapA0u.put(-9, "The Play Store app is either not installed or not the official version.");
        mapA0u.put(-10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        mapA0u.put(-100, "An internal error happened in the Play Store.");
        mapA0u2.put(-2, "ERROR_UNKNOWN");
        mapA0u2.put(-3, "ERROR_API_NOT_AVAILABLE");
        mapA0u2.put(-4, "ERROR_INVALID_REQUEST");
        mapA0u2.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        mapA0u2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        mapA0u2.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        mapA0u2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        mapA0u2.put(-100, "ERROR_INTERNAL_ERROR");
        mapA0u2.put(-9, "ERROR_PLAY_STORE_NOT_FOUND");
        mapA0u2.put(-10, "ERROR_APP_NOT_OWNED");
        mapA0u2.put(-100, "ERROR_INTERNAL_ERROR");
    }
}
