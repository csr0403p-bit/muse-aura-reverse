package X;

/* renamed from: X.3ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC05623ug {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/20Q<+TT;>;LX/78T;)LX/20Q<TT;>; */
    public static final C20Q A00(C78T c78t, C20Q c20q) {
        if (c78t.get(HoC.A00) == null) {
            return !c78t.equals(C6ys.A00) ? c20q instanceof C3pV ? ((C3pV) c20q).ABr(C79.A00, c78t, -3) : new C3pT(C79.A00, c78t, c20q, -3) : c20q;
        }
        throw new IllegalArgumentException(AnonymousClass007.A0a("Flow context cannot contain job in it. Had ", c78t));
    }

    public static final <T> C20Q<T> A01(C20Q<? extends T> c20q) {
        Integer num = C79.A01;
        return c20q instanceof C3pV ? ((C3pV) c20q).ABr(num, C6ys.A00, 0) : new C3pT(num, C6ys.A00, c20q, 0);
    }
}
