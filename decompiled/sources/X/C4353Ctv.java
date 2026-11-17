package X;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: X.Ctv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4353Ctv {
    public static C4353Ctv A01;
    public static final RootTelemetryConfiguration A02 = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public RootTelemetryConfiguration A00;

    public static synchronized C4353Ctv A00() {
        C4353Ctv c4353Ctv;
        c4353Ctv = A01;
        if (c4353Ctv == null) {
            c4353Ctv = new C4353Ctv();
            A01 = c4353Ctv;
        }
        return c4353Ctv;
    }
}
