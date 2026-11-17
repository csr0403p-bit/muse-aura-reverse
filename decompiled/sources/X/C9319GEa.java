package X;

/* renamed from: X.GEa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9319GEa extends How {
    public static final long serialVersionUID = 1;
    public final byte[] bytes;

    @Override // X.GEY
    public final boolean equals(Object other) {
        int iA01;
        GEY gey;
        int iA012;
        if (other == this) {
            return true;
        }
        if ((other instanceof GEY) && (iA01 = A01()) == (iA012 = (gey = (GEY) other).A01())) {
            if (iA01 == 0) {
                return true;
            }
            if (!(other instanceof C9319GEa)) {
                return other.equals(this);
            }
            int i = this.hash;
            int i2 = gey.hash;
            if (i == 0 || i2 == 0 || i == i2) {
                if (iA01 > iA012) {
                    throw AbstractC7611F5y.A0R(iA01);
                }
                if (!(gey instanceof C9319GEa)) {
                    return gey.A02(iA01).equals(A02(iA01));
                }
                C9319GEa c9319GEa = (C9319GEa) gey;
                byte[] bArr = this.bytes;
                byte[] bArr2 = c9319GEa.bytes;
                int i3 = this instanceof GEZ ? ((GEZ) this).bytesOffset : 0;
                int i4 = iA01 + i3;
                int i5 = c9319GEa instanceof GEZ ? ((GEZ) c9319GEa).bytesOffset : 0;
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

    public C9319GEa(byte[] bytes) {
        bytes.getClass();
        this.bytes = bytes;
    }
}
