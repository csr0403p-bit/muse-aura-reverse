package X;

import android.os.Trace;

/* renamed from: X.BzG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3136BzG {
    public static final void A00(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final void A01(String str, int i) {
        if (str.length() > 127) {
            str = BV4.A0j(str, 127);
        }
        Trace.setCounter(str, i);
    }
}
