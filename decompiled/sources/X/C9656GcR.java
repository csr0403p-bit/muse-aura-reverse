package X;

import java.util.Arrays;

/* renamed from: X.GcR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9656GcR {
    public final int A00;
    public final boolean A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;
    public final byte[] A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9656GcR) {
                C9656GcR c9656GcR = (C9656GcR) obj;
                if (this.A01 != c9656GcR.A01 || !C7384Etj.areEqual(this.A02, c9656GcR.A02) || !C7384Etj.areEqual(this.A05, c9656GcR.A05) || !C7384Etj.areEqual(this.A03, c9656GcR.A03) || !C7384Etj.areEqual(this.A04, c9656GcR.A04) || this.A00 != c9656GcR.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA02 = (((((C0KA.A02(this.A01) + AbstractC7609F5w.A0J(this.A02)) * 31) + AbstractC7609F5w.A0J(this.A05)) * 31) + AbstractC7609F5w.A0J(this.A03)) * 31;
        byte[] bArr = this.A04;
        return ((iA02 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31) + this.A00;
    }

    public final String toString() {
        boolean z = this.A01;
        String string = Arrays.toString(this.A02);
        String string2 = Arrays.toString(this.A05);
        String string3 = Arrays.toString(this.A03);
        String string4 = Arrays.toString(this.A04);
        int i = this.A00;
        StringBuilder sbA10 = C60O.A10("FleetKeyBundleFields(valid=", z);
        sbA10.append(", fleetKeyList=");
        sbA10.append(string);
        sbA10.append(", fleetKeyListSignatureMessage=");
        sbA10.append(string2);
        sbA10.append(", fleetKeyListSignature1=");
        sbA10.append(string3);
        sbA10.append(", fleetKeyListSignature2=");
        sbA10.append(string4);
        return AbstractC7610F5x.A0x(", bundleVersion=", sbA10, i);
    }

    public C9656GcR(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, boolean z) {
        this.A01 = z;
        this.A02 = bArr;
        this.A05 = bArr2;
        this.A03 = bArr3;
        this.A04 = bArr4;
        this.A00 = i;
    }
}
