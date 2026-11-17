package X;

import java.lang.reflect.Method;

/* renamed from: X.Eui, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7404Eui extends Ev0 {
    public final Method A00;
    public final Method A02;
    public final Method A03 = Class.class.getMethod("isRecord", null);
    public final Method A01 = Class.class.getMethod("getRecordComponents", null);

    public C7404Eui() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.A00 = cls.getMethod("getName", null);
        this.A02 = cls.getMethod("getType", null);
    }
}
