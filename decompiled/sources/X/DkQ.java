package X;

/* loaded from: classes5.dex */
public final class DkQ {
    public final E29 A00;
    public final E29 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                DkQ dkQ = (DkQ) obj;
                if (!this.A00.equals(dkQ.A00) || !this.A01.equals(dkQ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public static DkQ A00(E29 e29, long j, long j2) {
        return new DkQ(e29, new E29(j, j2));
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[");
        E29 e29 = this.A00;
        sbA0x.append(e29);
        E29 e292 = this.A01;
        sbA0x.append(e29.equals(e292) ? "" : AnonymousClass007.A0a(", ", e292));
        return AnonymousClass001.A0v("]", sbA0x);
    }

    public DkQ(E29 e29, E29 e292) {
        this.A00 = e29;
        this.A01 = e292;
    }
}
