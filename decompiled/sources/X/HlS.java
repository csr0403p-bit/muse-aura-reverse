package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public abstract class HlS {
    public static HuF A00;
    public static final int A01;
    public static final int A02;
    public static final long A03;
    public static final long A04;
    public static final String A05;

    static {
        String property;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        A05 = property;
        A04 = AbstractC10483Hlb.A00(100000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX, "kotlinx.coroutines.scheduler.resolution.ns");
        int i = HuL.A00;
        if (i < 2) {
            i = 2;
        }
        A01 = (int) AbstractC10483Hlb.A00(i, 2147483647L, "kotlinx.coroutines.scheduler.core.pool.size");
        A02 = (int) AbstractC10483Hlb.A00(2097150L, 2097150L, "kotlinx.coroutines.scheduler.max.pool.size");
        A03 = TimeUnit.SECONDS.toNanos(AbstractC10483Hlb.A00(60L, LinkEncryptedPairingKt.LINK_COUNTER_MAX, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        A00 = HuF.A00;
    }
}
