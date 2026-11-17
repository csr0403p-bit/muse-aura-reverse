package X;

import android.os.StrictMode;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.F0i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7535F0i {
    public static final AtomicReference A00 = BV4.A15();

    public static UUID A00() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return UUID.randomUUID();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
