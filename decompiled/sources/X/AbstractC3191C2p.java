package X;

import android.os.Trace;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.C2p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3191C2p {
    public static final AtomicInteger A00 = BV5.A17();

    static {
        if (AbstractC3190C2o.A03) {
            Method method = AbstractC3190C2o.A02;
            C1H.A00(method);
            AbstractC3190C2o.A00(method, BV4.A1Z(true));
        }
    }

    public static final void A00(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }
}
