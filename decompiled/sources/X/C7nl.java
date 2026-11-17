package X;

import java.util.Collections;

/* renamed from: X.7nl, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7nl {
    public static final F39 A00;

    static {
        F39 f39 = null;
        try {
            f39 = (F39) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (f39 == null) {
            f39 = new F39();
        }
        A00 = f39;
    }

    public static BFU A00(Class cls) {
        return new BFU(Collections.EMPTY_LIST, C3cG.A0x(cls));
    }
}
