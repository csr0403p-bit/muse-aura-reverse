package X;

import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;

/* loaded from: classes5.dex */
public abstract class EZ0 extends EZ1 {
    public static void A03(int i, int i2, long j, boolean z, int i3) {
        if (z || i < i2) {
            throw BV6.A0k("illegal syntax");
        }
        if (j <= AuraImpressionTimeTracker.UNKNOWN_TIME || j > 2147483647L || i3 > 646456993) {
            throw BV6.A0k("value exceeds limits");
        }
    }
}
