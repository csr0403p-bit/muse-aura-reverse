package X;

/* renamed from: X.Avo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1983Avo {
    public float A00 = 0.0f;
    public boolean A02 = true;
    public AbstractC2062AxZ A01 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1983Avo) {
                C1983Avo c1983Avo = (C1983Avo) obj;
                if (Float.compare(this.A00, c1983Avo.A00) != 0 || this.A02 != c1983Avo.A02 || !C7384Etj.areEqual(this.A01, c1983Avo.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C0KA.A01(C8j4.A04(this.A00), this.A02) + AnonymousClass006.A0D(this.A01)) * 31;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RowColumnParentData(weight=");
        sbA0x.append(this.A00);
        sbA0x.append(", fill=");
        sbA0x.append(this.A02);
        sbA0x.append(", crossAxisAlignment=");
        sbA0x.append(this.A01);
        sbA0x.append(", flowLayoutData=");
        return AnonymousClass007.A0Z(null, sbA0x);
    }
}
