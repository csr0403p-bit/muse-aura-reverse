package X;

/* renamed from: X.77e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C066277e {
    public final long A00;
    public final long A01;
    public final long A02;
    public final InterfaceC066377f A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C066277e) {
                C066277e c066277e = (C066277e) obj;
                if (this.A02 != c066277e.A02 || this.A00 != c066277e.A00 || this.A01 != c066277e.A01 || !this.A03.equals(c066277e.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C066277e() {
        F24 f24 = F24.A07;
        long jA01 = AbstractC0852A5y.A01(f24, 45);
        long jA012 = AbstractC0852A5y.A01(f24, 5);
        long jA013 = AbstractC0852A5y.A01(f24, 5);
        InterfaceC066377f interfaceC066377f = C066477g.A00;
        this.A02 = jA01;
        this.A00 = jA012;
        this.A01 = jA013;
        this.A03 = interfaceC066377f;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A03, AnonymousClass006.A06(this.A01, AnonymousClass006.A06(this.A00, AnonymousClass005.A07(this.A02))));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TimeoutOptions(initialTimeout=");
        sbA0x.append((Object) C0851A5x.A05(this.A02));
        sbA0x.append(", additionalTime=");
        sbA0x.append((Object) C0851A5x.A05(this.A00));
        sbA0x.append(", idleTimeout=");
        sbA0x.append((Object) C0851A5x.A05(this.A01));
        sbA0x.append(", timeSource=");
        return AnonymousClass007.A0Z(this.A03, sbA0x);
    }
}
