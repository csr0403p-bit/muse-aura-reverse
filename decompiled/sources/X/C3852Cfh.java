package X;

/* renamed from: X.Cfh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3852Cfh extends AbstractC3923Ch4 {
    public final long A00;
    public final AbstractC3834CfN A01;
    public final AbstractC3874Cg5 A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3923Ch4) {
                C3852Cfh c3852Cfh = (C3852Cfh) ((AbstractC3923Ch4) obj);
                if (this.A00 != c3852Cfh.A00 || !this.A02.equals(c3852Cfh.A02) || !this.A01.equals(c3852Cfh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode() ^ BV6.A08(this.A02, (AnonymousClass002.A0A(this.A00) ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PersistedEvent{id=");
        sbA0x.append(this.A00);
        sbA0x.append(", transportContext=");
        sbA0x.append(this.A02);
        sbA0x.append(", event=");
        return BV8.A0v(this.A01, sbA0x);
    }

    public C3852Cfh(AbstractC3834CfN abstractC3834CfN, AbstractC3874Cg5 abstractC3874Cg5, long j) {
        this.A00 = j;
        if (abstractC3874Cg5 == null) {
            throw BV4.A0a("Null transportContext");
        }
        this.A02 = abstractC3874Cg5;
        this.A01 = abstractC3834CfN;
    }
}
