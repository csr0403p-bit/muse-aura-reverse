package X;

/* renamed from: X.7az, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7az {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C7az)) {
                long j = this.A00;
                C7az c7az = (C7az) obj;
                long j2 = c7az.A00;
                long j3 = B6A.A01;
                if (j != j2 || this.A04 != c7az.A04 || this.A03 != c7az.A03 || this.A02 != c7az.A02 || this.A01 != c7az.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = B6A.A01;
        return AnonymousClass006.A06(this.A02, AnonymousClass006.A06(this.A03, AnonymousClass006.A06(this.A04, AnonymousClass005.A07(j)))) + C3cG.A02(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ContextMenuColors(backgroundColor=");
        AnonymousClass005.A0m(this.A00, sbA0x);
        sbA0x.append(", textColor=");
        AnonymousClass005.A0m(this.A04, sbA0x);
        sbA0x.append(", iconColor=");
        AnonymousClass005.A0m(this.A03, sbA0x);
        sbA0x.append(", disabledTextColor=");
        AnonymousClass005.A0m(this.A02, sbA0x);
        sbA0x.append(", disabledIconColor=");
        return AnonymousClass007.A0Z(B6A.A07(this.A01), sbA0x);
    }

    public C7az(long j, long j2, long j3, long j4, long j5) {
        this.A00 = j;
        this.A04 = j2;
        this.A03 = j3;
        this.A02 = j4;
        this.A01 = j5;
    }
}
