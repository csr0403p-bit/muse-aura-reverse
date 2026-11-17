package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.COk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3462COk {
    public static volatile boolean A00;

    public static long A00(long j) {
        if ((1 & COZ.A02) != 0 && !A00) {
            A00 = true;
            Systrace.A06("fburl.com/fbsystrace");
            Systrace.A06("USE fbsystrace");
            Systrace.A06("DO NOT USE systrace");
        } else if (A00 && (1 & COZ.A02) == 0) {
            A00 = false;
        }
        return j - System.nanoTime();
    }
}
