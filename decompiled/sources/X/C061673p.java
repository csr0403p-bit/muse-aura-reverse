package X;

/* renamed from: X.73p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C061673p {
    public final C75e A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C061673p) {
                C061673p c061673p = (C061673p) obj;
                if (this.A00 != c061673p.A00 || this.A02 != c061673p.A02 || this.A01 != c061673p.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public static C061673p A00(C75e c75e, boolean z, boolean z2) {
        return new C061673p(c75e, z, z2);
    }

    public final int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.A00), this.A02), this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RowColumnChildSelector(type=");
        sbA0x.append(this.A00);
        sbA0x.append(", expandWidth=");
        sbA0x.append(this.A02);
        sbA0x.append(", expandHeight=");
        sbA0x.append(this.A01);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C061673p(C75e c75e, boolean z, boolean z2) {
        this.A00 = c75e;
        this.A02 = z;
        this.A01 = z2;
    }
}
