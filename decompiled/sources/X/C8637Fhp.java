package X;

/* renamed from: X.Fhp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8637Fhp {
    public final long A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C8637Fhp) && this.A00 == ((C8637Fhp) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = AnonymousClass004.A00(j);
        StringBuilder sbA0x = C60O.A0x("Point{x=");
        sbA0x.append(fA03);
        sbA0x.append(", y=");
        sbA0x.append(fA00);
        return BV7.A11(sbA0x);
    }

    public /* synthetic */ C8637Fhp(long j) {
        this.A00 = j;
    }
}
