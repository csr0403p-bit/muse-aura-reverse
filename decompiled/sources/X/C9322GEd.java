package X;

/* renamed from: X.GEd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9322GEd extends AbstractC10527Hox {
    public static final long serialVersionUID = 1;
    public final byte[] bytes;

    @Override // X.AbstractC9320GEb
    public final boolean equals(Object other) {
        int iA02;
        AbstractC9320GEb abstractC9320GEb;
        int iA022;
        if (other == this) {
            return true;
        }
        if ((other instanceof AbstractC9320GEb) && (iA02 = A02()) == (iA022 = (abstractC9320GEb = (AbstractC9320GEb) other).A02())) {
            if (iA02 == 0) {
                return true;
            }
            if (!(other instanceof C9322GEd)) {
                return other.equals(this);
            }
            int i = this.hash;
            int i2 = abstractC9320GEb.hash;
            if (i == 0 || i2 == 0 || i == i2) {
                if (iA02 > iA022) {
                    throw AbstractC7611F5y.A0R(iA02);
                }
                if (!(abstractC9320GEb instanceof C9322GEd)) {
                    return abstractC9320GEb.A03(iA02).equals(A03(iA02));
                }
                C9322GEd c9322GEd = (C9322GEd) abstractC9320GEb;
                byte[] bArr = this.bytes;
                byte[] bArr2 = c9322GEd.bytes;
                int i3 = this instanceof C9323GEe ? ((C9323GEe) this).bytesOffset : 0;
                int i4 = iA02 + i3;
                int i5 = c9322GEd instanceof C9323GEe ? ((C9323GEe) c9322GEd).bytesOffset : 0;
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

    public C9322GEd(byte[] bytes) {
        bytes.getClass();
        this.bytes = bytes;
    }
}
