package X;

/* renamed from: X.GEf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9324GEf extends Hp9 {
    public static final long serialVersionUID = 1;
    public final byte[] bytes;

    @Override // X.AbstractC9321GEc
    public final boolean equals(Object other) {
        int iA02;
        AbstractC9321GEc abstractC9321GEc;
        int iA022;
        if (other == this) {
            return true;
        }
        if ((other instanceof AbstractC9321GEc) && (iA02 = A02()) == (iA022 = (abstractC9321GEc = (AbstractC9321GEc) other).A02())) {
            if (iA02 == 0) {
                return true;
            }
            if (!(other instanceof C9324GEf)) {
                return other.equals(this);
            }
            int i = this.hash;
            int i2 = abstractC9321GEc.hash;
            if (i == 0 || i2 == 0 || i == i2) {
                if (iA02 > iA022) {
                    throw AbstractC7611F5y.A0R(iA02);
                }
                if (!(abstractC9321GEc instanceof C9324GEf)) {
                    return abstractC9321GEc.A03(iA02).equals(A03(iA02));
                }
                C9324GEf c9324GEf = (C9324GEf) abstractC9321GEc;
                byte[] bArr = this.bytes;
                byte[] bArr2 = c9324GEf.bytes;
                int i3 = this instanceof C9325GEg ? ((C9325GEg) this).bytesOffset : 0;
                int i4 = iA02 + i3;
                int i5 = c9324GEf instanceof C9325GEg ? ((C9325GEg) c9324GEf).bytesOffset : 0;
                while (i3 < i4) {
                    if (bArr[i3] != bArr2[i5]) {
                        return false;
                    }
                    i3++;
                    i5++;
                }
                return true;
            }
        }
        return false;
    }

    public C9324GEf(byte[] bytes) {
        bytes.getClass();
        this.bytes = bytes;
    }
}
