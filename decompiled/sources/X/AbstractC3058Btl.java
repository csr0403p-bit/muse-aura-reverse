package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Btl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3058Btl {
    public static final Map A00;
    public static final Map A01;
    public static final Map A02;

    static {
        HashMap mapA0u = BV4.A0u();
        A00 = mapA0u;
        HashMap mapA0u2 = BV4.A0u();
        A01 = mapA0u2;
        mapA0u.put(-1, "Too many sessions are running for current app, existing sessions must be resolved first.");
        mapA0u.put(-2, "A requested module is not available (to this user/device, for the installed apk).");
        mapA0u.put(-3, "Request is otherwise invalid.");
        mapA0u.put(-4, "Requested session is not found.");
        mapA0u.put(-5, "Split Install API is not available.");
        mapA0u.put(-6, "Network error: unable to obtain split details.");
        mapA0u.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        mapA0u.put(-8, "Requested session contains modules from an existing active session and also new modules.");
        mapA0u.put(-9, "Service handling split install has died.");
        mapA0u.put(-10, "Install failed due to insufficient storage.");
        mapA0u.put(-11, "Signature verification error when invoking SplitCompat.");
        mapA0u.put(-12, "Error in SplitCompat emulation.");
        mapA0u.put(-13, "Error in copying files for SplitCompat.");
        mapA0u.put(-14, "The Play Store app is either not installed or not the official version.");
        mapA0u.put(-15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        mapA0u.put(-16, "The download is too large to start over the current connection.");
        mapA0u.put(-100, "Unknown error processing split install.");
        mapA0u2.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        mapA0u2.put(-2, "MODULE_UNAVAILABLE");
        mapA0u2.put(-3, "INVALID_REQUEST");
        mapA0u2.put(-4, "DOWNLOAD_NOT_FOUND");
        mapA0u2.put(-5, "API_NOT_AVAILABLE");
        mapA0u2.put(-6, "NETWORK_ERROR");
        mapA0u2.put(-7, "ACCESS_DENIED");
        mapA0u2.put(-8, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        mapA0u2.put(-9, "SERVICE_DIED");
        mapA0u2.put(-10, "INSUFFICIENT_STORAGE");
        mapA0u2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        mapA0u2.put(-12, "SPLITCOMPAT_EMULATION_ERROR");
        mapA0u2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        mapA0u2.put(-14, "PLAY_STORE_NOT_FOUND");
        mapA0u2.put(-15, "APP_NOT_OWNED");
        mapA0u2.put(-16, "DOWNLOAD_TOO_LARGE");
        mapA0u2.put(-100, "INTERNAL_ERROR");
        A02 = BV4.A0u();
        Iterator itA0i = C3cG.A0i(mapA0u2);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            A02.put(entryA0l.getValue(), entryA0l.getKey());
        }
    }
}
