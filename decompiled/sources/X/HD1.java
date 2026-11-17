package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class HD1 {
    public final boolean A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;
    public final byte[] A05;
    public final byte[] A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HD1) {
                HD1 hd1 = (HD1) obj;
                if (this.A00 != hd1.A00 || !C7384Etj.areEqual(this.A03, hd1.A03) || !C7384Etj.areEqual(this.A04, hd1.A04) || !C7384Etj.areEqual(this.A05, hd1.A05) || !C7384Etj.areEqual(this.A06, hd1.A06) || !C7384Etj.areEqual(this.A01, hd1.A01) || !C7384Etj.areEqual(this.A02, hd1.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA02 = (((((((((C0KA.A02(this.A00) + AbstractC7609F5w.A0J(this.A03)) * 31) + AbstractC7609F5w.A0J(this.A04)) * 31) + AbstractC7609F5w.A0J(this.A05)) * 31) + AbstractC7609F5w.A0J(this.A06)) * 31) + AbstractC7609F5w.A0J(this.A01)) * 31;
        byte[] bArr = this.A02;
        return iA02 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        boolean z = this.A00;
        String string = Arrays.toString(this.A03);
        String string2 = Arrays.toString(this.A04);
        String string3 = Arrays.toString(this.A05);
        String string4 = Arrays.toString(this.A06);
        String string5 = Arrays.toString(this.A01);
        String string6 = Arrays.toString(this.A02);
        StringBuilder sbA10 = C60O.A10("BeginRegistrationPublicKeys(valid=", z);
        AbstractC7611F5y.A0v(string, string2, string3, string4, sbA10);
        sbA10.append(string5);
        return C3cJ.A0N(", islandEd25519PubSignature=", string6, sbA10);
    }

    public HD1(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z) {
        this.A00 = z;
        this.A03 = bArr;
        this.A04 = bArr2;
        this.A05 = bArr3;
        this.A06 = bArr4;
        this.A01 = bArr5;
        this.A02 = bArr6;
    }
}
