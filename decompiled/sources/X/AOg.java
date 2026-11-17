package X;

/* loaded from: classes4.dex */
public abstract class AOg {
    public static final <T extends AOd> T A00(T t) {
        T t2 = (T) t.A03();
        int iA02 = t2.A02();
        for (int i = 0; i < iA02; i++) {
            t2.A05(i, t.A01(i));
        }
        return t2;
    }
}
