package X;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: X.CwQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4449CwQ {
    public static final String[] A02 = {"gps", "network"};
    public final LocationManager A00;
    public final Context A01;

    public static boolean A00(C4449CwQ c4449CwQ, String str) {
        try {
            return c4449CwQ.A01.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable th) {
            BzX.A02(th, "Permission check failed for permission: %s", str);
            return false;
        }
    }

    public C4449CwQ(Context context, LocationManager locationManager) {
        this.A01 = context;
        this.A00 = locationManager;
    }
}
