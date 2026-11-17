package X;

/* renamed from: X.9uH, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9uH {
    public static final boolean A00;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        A00 = z;
    }
}
