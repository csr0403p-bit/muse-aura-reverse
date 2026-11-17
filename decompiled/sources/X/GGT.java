package X;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class GGT {
    public int A00;
    public GGQ A01;

    public final double A0C() {
        return Double.longBitsToDouble(this instanceof GGC ? GGC.A03((GGC) this) : GGG.A03((GGG) this));
    }

    public final float A0D() {
        return Float.intBitsToFloat(this instanceof GGC ? GGC.A00((GGC) this) : GGG.A00((GGG) this));
    }

    public final int A0E() {
        if (!(this instanceof GGC)) {
            return ((GGG) this).A04;
        }
        GGC ggc = (GGC) this;
        return ggc.A04 + ggc.A03;
    }

    public final int A0F() {
        return this instanceof GGC ? GGC.A01((GGC) this) : GGG.A01((GGG) this);
    }

    public final int A0G() {
        return this instanceof GGC ? GGC.A00((GGC) this) : GGG.A00((GGG) this);
    }

    public final int A0H() {
        return this instanceof GGC ? GGC.A01((GGC) this) : GGG.A01((GGG) this);
    }

    public final int A0I() {
        return this instanceof GGC ? GGC.A00((GGC) this) : GGG.A00((GGG) this);
    }

    public final int A0J() {
        return this instanceof GGC ? AbstractC7608F5v.A04(GGC.A01((GGC) this)) : AbstractC7608F5v.A04(GGG.A01((GGG) this));
    }

    public final int A0K() throws InvalidProtocolBufferException {
        if (this instanceof GGC) {
            GGC ggc = (GGC) this;
            if (ggc.A0X()) {
                ggc.A02 = 0;
                return 0;
            }
            int iA01 = GGC.A01(ggc);
            ggc.A02 = iA01;
            if ((iA01 >>> 3) == 0) {
                throw AbstractC7607F5u.A0k("Protocol message contained an invalid tag (zero).");
            }
            return iA01;
        }
        GGG ggg = (GGG) this;
        if (ggg.A0X()) {
            ggg.A02 = 0;
            return 0;
        }
        int iA012 = GGG.A01(ggg);
        ggg.A02 = iA012;
        if ((iA012 >>> 3) == 0) {
            throw AbstractC7607F5u.A0k("Protocol message contained an invalid tag (zero).");
        }
        return iA012;
    }

    public final int A0L() {
        return this instanceof GGC ? GGC.A01((GGC) this) : GGG.A01((GGG) this);
    }

    public final int A0M(int i) {
        if (this instanceof GGC) {
            GGC ggc = (GGC) this;
            if (i < 0) {
                throw AbstractC7607F5u.A0k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i2 = i + ggc.A04 + ggc.A03;
            int i3 = ggc.A01;
            if (i2 > i3) {
                throw AbstractC7608F5v.A0H();
            }
            ggc.A01 = i2;
            GGC.A06(ggc);
            return i3;
        }
        GGG ggg = (GGG) this;
        if (i < 0) {
            throw AbstractC7607F5u.A0k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i4 = i + ggg.A04;
        int i5 = ggg.A01;
        if (i4 > i5) {
            throw AbstractC7608F5v.A0H();
        }
        ggg.A01 = i4;
        int i6 = ggg.A03 + ggg.A00;
        ggg.A03 = i6;
        if (i6 <= i4) {
            ggg.A00 = 0;
            return i5;
        }
        int i7 = i6 - i4;
        ggg.A00 = i7;
        ggg.A03 = i6 - i7;
        return i5;
    }

    public final long A0N() {
        return this instanceof GGC ? GGC.A03((GGC) this) : GGG.A03((GGG) this);
    }

    public final long A0O() {
        return this instanceof GGC ? GGC.A04((GGC) this) : GGG.A04((GGG) this);
    }

    public final long A0P() {
        return this instanceof GGC ? GGC.A03((GGC) this) : GGG.A03((GGG) this);
    }

    public final long A0Q() {
        return this instanceof GGC ? AbstractC7610F5x.A0T(GGC.A04((GGC) this)) : AbstractC7610F5x.A0T(GGG.A04((GGG) this));
    }

    public final long A0R() {
        return this instanceof GGC ? GGC.A04((GGC) this) : GGG.A04((GGG) this);
    }

    public final AbstractC9309GDl A0S() throws InvalidProtocolBufferException {
        if (this instanceof GGC) {
            GGC ggc = (GGC) this;
            int iA01 = GGC.A01(ggc);
            int i = ggc.A00;
            int i2 = ggc.A03;
            if (iA01 <= i - i2 && iA01 > 0) {
                byte[] bArr = ggc.A07;
                AbstractC9309GDl.A00(i2, i2 + iA01, bArr.length);
                C9306GDi c9306GDi = new C9306GDi(AbstractC9309GDl.A00.A7O(bArr, i2, iA01));
                ggc.A03 += iA01;
                return c9306GDi;
            }
            if (iA01 != 0) {
                byte[] bArrA0B = GGC.A0B(ggc, iA01);
                if (bArrA0B != null) {
                    int length = bArrA0B.length;
                    AbstractC9309GDl.A00(0, length, length);
                    return new C9306GDi(AbstractC9309GDl.A00.A7O(bArrA0B, 0, length));
                }
                int i3 = ggc.A03;
                int i4 = ggc.A00;
                int iA0O = i4 - i3;
                ggc.A04 += i4;
                ggc.A03 = 0;
                ggc.A00 = 0;
                ArrayList arrayListA05 = GGC.A05(ggc, iA01 - iA0O);
                byte[] bArr2 = new byte[iA01];
                System.arraycopy(ggc.A07, i3, bArr2, 0, iA0O);
                Iterator it = arrayListA05.iterator();
                while (it.hasNext()) {
                    iA0O = AbstractC7610F5x.A0O(bArr2, it, iA0O);
                }
                return new C9306GDi(bArr2);
            }
        } else {
            GGG ggg = (GGG) this;
            int iA012 = GGG.A01(ggg);
            if (iA012 > 0) {
                int i5 = ggg.A03;
                int i6 = ggg.A04;
                if (iA012 > i5 - i6) {
                    throw AbstractC7608F5v.A0H();
                }
                byte[] bArr3 = ggg.A05;
                AbstractC9309GDl.A00(i6, i6 + iA012, bArr3.length);
                C9306GDi c9306GDi2 = new C9306GDi(AbstractC9309GDl.A00.A7O(bArr3, i6, iA012));
                ggg.A04 += iA012;
                return c9306GDi2;
            }
            if (iA012 != 0) {
                throw AbstractC7607F5u.A0k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return AbstractC9309GDl.A01;
    }

    public final String A0T() throws InvalidProtocolBufferException {
        String strA0n;
        if (!(this instanceof GGC)) {
            GGG ggg = (GGG) this;
            int iA01 = GGG.A01(ggg);
            if (iA01 <= 0) {
                if (iA01 != 0) {
                    throw AbstractC7607F5u.A0k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return "";
            }
            int i = ggg.A03;
            int i2 = ggg.A04;
            if (iA01 > i - i2) {
                throw AbstractC7608F5v.A0H();
            }
            String strA0n2 = BV4.A0n(GGV.A03, ggg.A05, i2, iA01);
            ggg.A04 += iA01;
            return strA0n2;
        }
        GGC ggc = (GGC) this;
        int iA012 = GGC.A01(ggc);
        if (iA012 > 0) {
            int i3 = ggc.A00;
            int i4 = ggc.A03;
            if (iA012 <= i3 - i4) {
                strA0n = BV4.A0n(GGV.A03, ggc.A07, i4, iA012);
            }
            ggc.A03 += iA012;
            return strA0n;
        }
        if (iA012 == 0) {
            return "";
        }
        if (iA012 > ggc.A00) {
            return new String(GGC.A0A(ggc, iA012), GGV.A03);
        }
        GGC.A07(ggc, iA012);
        strA0n = BV4.A0n(GGV.A03, ggc.A07, ggc.A03, iA012);
        ggc.A03 += iA012;
        return strA0n;
    }

    public final String A0U() throws InvalidProtocolBufferException {
        byte[] bArrA0A;
        if (!(this instanceof GGC)) {
            GGG ggg = (GGG) this;
            int iA01 = GGG.A01(ggg);
            if (iA01 <= 0) {
                if (iA01 != 0) {
                    throw AbstractC7607F5u.A0k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return "";
            }
            int i = ggg.A03;
            int i2 = ggg.A04;
            if (iA01 > i - i2) {
                throw AbstractC7608F5v.A0H();
            }
            String strA02 = AbstractC9318GDv.A00.A02(ggg.A05, i2, iA01);
            ggg.A04 += iA01;
            return strA02;
        }
        GGC ggc = (GGC) this;
        int iA012 = GGC.A01(ggc);
        int i3 = ggc.A03;
        int i4 = ggc.A00;
        if (iA012 <= i4 - i3 && iA012 > 0) {
            bArrA0A = ggc.A07;
            ggc.A03 = i3 + iA012;
        } else {
            if (iA012 == 0) {
                return "";
            }
            i3 = 0;
            if (iA012 <= i4) {
                GGC.A07(ggc, iA012);
                bArrA0A = ggc.A07;
                ggc.A03 = iA012;
            } else {
                bArrA0A = GGC.A0A(ggc, iA012);
            }
        }
        return AbstractC9318GDv.A00.A02(bArrA0A, i3, iA012);
    }

    public final void A0V(int i) throws InvalidProtocolBufferException {
        if (this instanceof GGC) {
            if (((GGC) this).A02 != i) {
                throw AbstractC7607F5u.A0k("Protocol message end-group tag did not match expected tag.");
            }
        } else if (((GGG) this).A02 != i) {
            throw AbstractC7607F5u.A0k("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void A0W(int i) {
        if (this instanceof GGC) {
            GGC ggc = (GGC) this;
            ggc.A01 = i;
            GGC.A06(ggc);
            return;
        }
        GGG ggg = (GGG) this;
        ggg.A01 = i;
        int i2 = ggg.A03 + ggg.A00;
        ggg.A03 = i2;
        if (i2 <= i) {
            ggg.A00 = 0;
            return;
        }
        int i3 = i2 - i;
        ggg.A00 = i3;
        ggg.A03 = i2 - i3;
    }

    public final boolean A0X() {
        if (this instanceof GGC) {
            GGC ggc = (GGC) this;
            return ggc.A03 == ggc.A00 && !GGC.A09(ggc, 1);
        }
        GGG ggg = (GGG) this;
        return AnonymousClass002.A1Q(ggg.A04, ggg.A03);
    }

    public final boolean A0Y() {
        return this instanceof GGC ? AnonymousClass002.A1L((GGC.A04((GGC) this) > 0L ? 1 : (GGC.A04((GGC) this) == 0L ? 0 : -1))) : AnonymousClass002.A1L((GGG.A04((GGG) this) > 0L ? 1 : (GGG.A04((GGG) this) == 0L ? 0 : -1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.GGG, X.GGT] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.GGT] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.GGC, X.GGT] */
    public final boolean A0Z(int i) throws InvalidProtocolBufferException {
        ?? r7;
        boolean z;
        int iA01;
        int iA0K;
        int iA012;
        int iA0K2;
        if (this instanceof GGC) {
            r7 = (GGC) this;
            int i2 = i & 7;
            z = true;
            if (i2 == 0) {
                int i3 = r7.A00;
                int i4 = r7.A03;
                int i5 = i4;
                int i6 = 0;
                if (i3 - i4 >= 10) {
                    do {
                        byte[] bArr = r7.A07;
                        int i7 = i5;
                        i5++;
                        r7.A03 = i5;
                        if (bArr[i7] < 0) {
                            i6++;
                        }
                    } while (i6 < 10);
                    throw AbstractC7607F5u.A0k("CodedInputStream encountered a malformed varint.");
                }
                do {
                    if (i4 == r7.A00) {
                        GGC.A07(r7, 1);
                    }
                    byte[] bArr2 = r7.A07;
                    int i8 = r7.A03;
                    i4 = i8 + 1;
                    r7.A03 = i4;
                    if (bArr2[i8] < 0) {
                        i6++;
                    }
                } while (i6 < 10);
                throw AbstractC7607F5u.A0k("CodedInputStream encountered a malformed varint.");
            }
            if (i2 == 1) {
                iA012 = 8;
            } else if (i2 != 2) {
                iA012 = 4;
                if (i2 == 3) {
                    do {
                        iA0K2 = r7.A0K();
                        if (iA0K2 == 0) {
                            break;
                        }
                    } while (r7.A0Z(iA0K2));
                    r7.A0V(((i >>> 3) << 3) | 4);
                    return z;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw AbstractC7608F5v.A0G();
                }
            } else {
                iA012 = GGC.A01(r7);
            }
            GGC.A08(r7, iA012);
            return z;
        }
        r7 = (GGG) this;
        int i9 = i & 7;
        z = true;
        if (i9 != 0) {
            if (i9 == 1) {
                iA01 = 8;
            } else if (i9 != 2) {
                iA01 = 4;
                if (i9 == 3) {
                    do {
                        iA0K = r7.A0K();
                        if (iA0K == 0) {
                            break;
                        }
                    } while (r7.A0Z(iA0K));
                    r7.A0V(((i >>> 3) << 3) | 4);
                    return z;
                }
                if (i9 == 4) {
                    return false;
                }
                if (i9 != 5) {
                    throw AbstractC7608F5v.A0G();
                }
            } else {
                iA01 = GGG.A01(r7);
                if (iA01 < 0) {
                    throw AbstractC7607F5u.A0k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
            }
            int i10 = r7.A03;
            int i11 = r7.A04;
            if (iA01 > i10 - i11) {
                throw AbstractC7608F5v.A0H();
            }
            r7.A04 = i11 + iA01;
            return true;
        }
        int i12 = r7.A03;
        int i13 = r7.A04;
        int i14 = i13;
        int i15 = 0;
        if (i12 - i13 >= 10) {
            do {
                byte[] bArr3 = r7.A05;
                int i16 = i14;
                i14++;
                r7.A04 = i14;
                if (bArr3[i16] < 0) {
                    i15++;
                }
            } while (i15 < 10);
            throw AbstractC7607F5u.A0k("CodedInputStream encountered a malformed varint.");
        }
        do {
            int i17 = i13;
            if (i13 == i12) {
                throw AbstractC7608F5v.A0H();
            }
            byte[] bArr4 = r7.A05;
            i13++;
            r7.A04 = i13;
            if (bArr4[i17] < 0) {
                i15++;
            }
        } while (i15 < 10);
        throw AbstractC7607F5u.A0k("CodedInputStream encountered a malformed varint.");
        return z;
    }
}
