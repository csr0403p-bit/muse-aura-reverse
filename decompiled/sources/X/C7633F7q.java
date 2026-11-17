package X;

/* renamed from: X.F7q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7633F7q {
    public final F6D A00;
    public final HsM A01;
    public final C7648F8p A02;
    public final G0U<Hj6, Object> A03;

    /* JADX WARN: Multi-variable type inference failed */
    public C7633F7q(G0U<? super Hj6, ? extends Object> g0u) {
        this.A01 = null;
        this.A00 = null;
        this.A03 = g0u;
        this.A02 = null;
    }

    public final Object A00(Hj6 hj6, F6D f6d) {
        G0U<Hj6, Object> g0u = this.A03;
        if (g0u != null) {
            return g0u.invoke(hj6);
        }
        HsM hsM = this.A01;
        if (hsM != null) {
            F6D f6dA02 = this.A00;
            if (f6dA02 == null) {
                C7648F8p c7648F8p = this.A02;
                if (c7648F8p != null && f6d != null) {
                    f6dA02 = F6D.A02(f6d, c7648F8p);
                }
            }
            return AbstractC7691FAk.A00(f6dA02, hj6, hsM);
        }
        FFI.A01(null, "An attempt to invoke an invalid callback", null);
        return null;
    }

    public C7633F7q(HsM hsM, F6D f6d) {
        this.A01 = hsM;
        this.A00 = f6d;
        this.A03 = null;
        this.A02 = null;
    }

    public C7633F7q(HsM hsM, C7648F8p c7648F8p) {
        this.A01 = hsM;
        this.A00 = null;
        this.A03 = null;
        this.A02 = c7648F8p;
    }
}
