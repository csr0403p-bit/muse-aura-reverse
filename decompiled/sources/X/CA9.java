package X;

import android.util.Log;

/* loaded from: classes5.dex */
public final class CA9 {
    public final String A00;
    public final String A01;

    public final void A00(String str, String str2) {
        if (Log.isLoggable(this.A00, 3)) {
            String str3 = this.A01;
            if (str3 != null) {
                str2 = str3.concat(str2);
            }
            Log.d(str, str2);
        }
    }

    public CA9(String str, String str2) {
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw BV5.A0T("tag \"%s\" is longer than the %d character maximum", objArr);
        }
        this.A00 = str;
        this.A01 = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
