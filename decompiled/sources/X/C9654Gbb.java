package X;

import java.util.Arrays;

/* renamed from: X.Gbb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9654Gbb {
    public final boolean A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9654Gbb) {
                C9654Gbb c9654Gbb = (C9654Gbb) obj;
                if (this.A00 != c9654Gbb.A00 || !C7384Etj.areEqual(this.A02, c9654Gbb.A02) || !C7384Etj.areEqual(this.A03, c9654Gbb.A03) || !C7384Etj.areEqual(this.A01, c9654Gbb.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA02 = (((C0KA.A02(this.A00) + AbstractC7609F5w.A0J(this.A02)) * 31) + AbstractC7609F5w.A0J(this.A03)) * 31;
        byte[] bArr = this.A01;
        return iA02 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        boolean z = this.A00;
        String string = Arrays.toString(this.A02);
        String string2 = Arrays.toString(this.A03);
        String string3 = Arrays.toString(this.A01);
        StringBuilder sbA10 = C60O.A10("BeginRegistrationKeys(valid=", z);
        sbA10.append(", opaqueR2=");
        sbA10.append(string);
        sbA10.append(", opaqueR2Sig=");
        sbA10.append(string2);
        return C3cJ.A0N(", opaqueChallenge=", string3, sbA10);
    }

    public C9654Gbb(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) {
        this.A00 = z;
        this.A02 = bArr;
        this.A03 = bArr2;
        this.A01 = bArr3;
    }
}
