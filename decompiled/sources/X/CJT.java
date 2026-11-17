package X;

import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class CJT {
    public final String A00;

    public static String A00(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                str2 = BV8.A0y(str2, e, objArr);
            }
        }
        return FGI.A0U(str, " : ", str2);
    }

    public final void A01(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public final void A02(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public final void A03(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", A00(this.A00, str, objArr), th);
        }
    }

    public CJT(String str) {
        this.A00 = BV8.A0w(str);
    }
}
