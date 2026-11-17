package X;

import android.util.Log;

/* loaded from: classes5.dex */
public final class Cc9 {
    public final int A00;
    public final String A01;
    public final CA9 A02;

    public Cc9(String str) {
        this.A01 = str;
        this.A02 = new CA9(str, null);
        int i = 2;
        while (!Log.isLoggable(this.A01, i) && (i = i + 1) <= 7) {
        }
        this.A00 = i;
    }
}
