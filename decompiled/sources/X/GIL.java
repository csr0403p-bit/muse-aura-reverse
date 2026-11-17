package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class GIL {
    public static final GIL A02 = new GIL();
    public final ConcurrentHashMap A01 = C60O.A1C();
    public final GI3 A00 = new GI3();

    public final GIK A00(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.A01;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (GIK) obj;
        }
        GIK gikA00 = this.A00.A00(cls);
        byte[] bArr = AbstractC9307GDj.A00;
        GIK gik = (GIK) concurrentHashMap.putIfAbsent(cls, gikA00);
        return gik != null ? gik : gikA00;
    }
}
