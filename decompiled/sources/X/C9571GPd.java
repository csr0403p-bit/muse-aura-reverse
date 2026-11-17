package X;

/* renamed from: X.GPd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9571GPd extends C06G {
    public final String A00;
    public final GOU A01;
    public final GPR A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9571GPd) {
                C9571GPd c9571GPd = (C9571GPd) obj;
                if (!C7384Etj.areEqual(this.A00, c9571GPd.A00) || !C7384Etj.areEqual(this.A01, c9571GPd.A01) || !C7384Etj.areEqual(this.A02, c9571GPd.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass006.A0G(this.A00) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + C3cH.A02(this.A02);
    }

    public final String toString() {
        String str = this.A00;
        GOU gou = this.A01;
        GPR gpr = this.A02;
        StringBuilder sbA0x = C3cI.A0x("IapPrefetchQuoteInputResult(sku=", str);
        sbA0x.append(", dcpProductDetails=");
        sbA0x.append(gou);
        return C3cJ.A0L(gpr, ", catalogProduct=", sbA0x);
    }

    public C9571GPd(GOU gou, GPR gpr, String str) {
        this.A00 = str;
        this.A01 = gou;
        this.A02 = gpr;
    }
}
