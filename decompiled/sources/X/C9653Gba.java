package X;

import java.util.Arrays;

/* renamed from: X.Gba, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9653Gba {
    public final boolean A00;
    public final byte[] A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9653Gba) {
                C9653Gba c9653Gba = (C9653Gba) obj;
                if (this.A00 != c9653Gba.A00 || !C7384Etj.areEqual(this.A01, c9653Gba.A01) || !C7384Etj.areEqual(this.A02, c9653Gba.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA02 = (C0KA.A02(this.A00) + AbstractC7609F5w.A0J(this.A01)) * 31;
        byte[] bArr = this.A02;
        return iA02 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        boolean z = this.A00;
        String string = Arrays.toString(this.A01);
        String string2 = Arrays.toString(this.A02);
        StringBuilder sbA10 = C60O.A10("BeginRegistrationKeys(valid=", z);
        sbA10.append(", opaqueL2=");
        sbA10.append(string);
        return C3cJ.A0N(", opaqueL2Sig=", string2, sbA10);
    }

    public C9653Gba(byte[] bArr, byte[] bArr2, boolean z) {
        this.A00 = z;
        this.A01 = bArr;
        this.A02 = bArr2;
    }
}
