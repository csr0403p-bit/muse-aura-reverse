package X;

/* loaded from: classes5.dex */
public final class CUT {
    public final boolean A00;
    public final Class<?> A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof CUT)) {
            return false;
        }
        CUT cut = (CUT) obj;
        return cut.A01.equals(this.A01) && cut.A00 == this.A00;
    }

    public final int hashCode() {
        return ((this.A01.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.A00).hashCode();
    }

    public CUT(Class<?> cls, boolean z) {
        this.A01 = cls;
        this.A00 = z;
    }
}
