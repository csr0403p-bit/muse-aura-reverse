package X;

import android.app.Application;
import android.content.SharedPreferences;

/* loaded from: classes5.dex */
public final class C6S {
    public static C6S A01;
    public final SharedPreferences A00;

    public final String A00(String str, String str2) {
        try {
            return this.A00.getString(str, str2);
        } catch (Exception e) {
            CFK.A04(C9Y.TAG, "Failed to read from SharedPreferences");
            C2Q.A00().AT9("PrefSimpleStore", e, null);
            return str2;
        }
    }

    public C6S(Application application) {
        this.A00 = BV4.A07(application, C9Y.TAG);
    }
}
