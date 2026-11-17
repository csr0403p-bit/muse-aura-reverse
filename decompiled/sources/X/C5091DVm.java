package X;

import java.lang.reflect.Method;

/* renamed from: X.DVm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5091DVm {
    public static Method A02;
    public final DWj A00;
    public final DWj A01;

    static {
        try {
            A02 = Class.forName("org.slf4j.LoggerFactory").getDeclaredMethod("getLogger", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
    }

    public C5091DVm(DWj dWj, DWj dWj2) {
        this.A00 = dWj;
        this.A01 = dWj2;
    }
}
