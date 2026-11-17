package X;

import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class CJS {
    public final String A00;

    public final void A00(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            String str2 = this.A00;
            if (objArr.length > 0) {
                try {
                    str = String.format(Locale.US, str, objArr);
                } catch (IllegalFormatException e) {
                    str = BV8.A0y(str, e, objArr);
                }
            }
            Log.i("PlayCore", FGI.A0U(str2, " : ", str));
        }
    }

    public CJS(String str) {
        this.A00 = BV8.A0w(str);
    }
}
