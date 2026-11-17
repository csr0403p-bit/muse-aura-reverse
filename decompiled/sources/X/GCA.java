package X;

/* loaded from: classes6.dex */
public abstract class GCA {
    public static final HrH A00 = HrH.A00("NO_THREAD_ELEMENTS");
    public static final G0V<Object, C78X, Object> A01 = new I16(20);
    public static final G0V<GC7<?>, C78X, GC7<?>> A02 = new I16(21);
    public static final G0V<GCB, C78X, GCB> A03 = new I16(22);

    public static final Object A00(Object obj, C78T c78t) {
        if (obj == null) {
            obj = A01(c78t);
        }
        if (obj == 0) {
            return A00;
        }
        if (obj instanceof Integer) {
            return c78t.fold(new GCB(c78t, ((Number) obj).intValue()), A03);
        }
        HnY hnY = (HnY) ((GC7) obj);
        ThreadLocal<T> threadLocal = hnY.A01;
        Object obj2 = threadLocal.get();
        threadLocal.set(hnY.A00);
        return obj2;
    }

    public static final void A02(Object obj, C78T c78t) {
        if (obj == A00) {
            return;
        }
        if (!(obj instanceof GCB)) {
            Object objFold = c78t.fold(null, A02);
            C7384Etj.A0Z(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((HnY) ((GC7) objFold)).A01.set(obj);
            return;
        }
        GCB gcb = (GCB) obj;
        GC7<Object>[] gc7Arr = gcb.A03;
        int length = gc7Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            GC7<Object> gc7 = gc7Arr[length];
            C7384Etj.A0X(gc7);
            ((HnY) gc7).A01.set(gcb.A02[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object A01(C78T c78t) {
        Object objFold = c78t.fold(BV4.A0V(), A01);
        C7384Etj.A0X(objFold);
        return objFold;
    }
}
