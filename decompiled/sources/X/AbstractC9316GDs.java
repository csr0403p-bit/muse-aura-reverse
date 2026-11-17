package X;

/* renamed from: X.GDs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9316GDs {
    public static final Class<?> A00;
    public static final boolean A01;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        A00 = cls;
        boolean z = Class.forName("org.robolectric.Robolectric") != null;
        A01 = z;
    }
}
