package X;

/* renamed from: X.17k, reason: invalid class name */
/* loaded from: classes.dex */
public final class C17k {
    public final C1DE A00;
    public final C1DE A01;
    public final C1DE A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C17k) {
                C17k c17k = (C17k) obj;
                if (!this.A02.equals(c17k.A02) || !this.A01.equals(c17k.A01) || !this.A00.equals(c17k.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C17k(C1DE c1de, C1DE c1de2, C1DE c1de3, C06H c06h, int i) {
        C1D3 c1d3A00 = C1D8.A00(4.0f);
        C1D3 c1d3A002 = C1D8.A00(4.0f);
        C1D3 c1d3A003 = C1D8.A00(0.0f);
        this.A02 = c1d3A00;
        this.A01 = c1d3A002;
        this.A00 = c1d3A003;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A02)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shapes(small=");
        sb.append(this.A02);
        sb.append(", medium=");
        sb.append(this.A01);
        sb.append(", large=");
        return AnonymousClass007.A0Z(this.A00, sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17k() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }
}
