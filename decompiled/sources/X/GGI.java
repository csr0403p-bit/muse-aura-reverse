package X;

import androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException;
import androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class GGI extends GHG {
    public static final Logger A01 = BV5.A1B(GGI.class);
    public static final boolean A02 = C9400GHp.A04;
    public GGL A00;

    public final void A0D(boolean z) {
        byte b = z ? (byte) 1 : (byte) 0;
        GGH ggh = (GGH) this;
        if (ggh.A00 == ggh.A02) {
            GGH.A00(ggh);
        }
        byte[] bArr = ggh.A03;
        int i = ggh.A00;
        ggh.A00 = i + 1;
        bArr[i] = b;
        ggh.A01++;
    }

    public static int A03(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int A04(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void A06(int i) {
        GGH ggh = (GGH) this;
        GGH.A01(ggh, 5);
        ggh.A0F(i);
    }

    public final void A07(int i, int i2) {
        GGH ggh = (GGH) this;
        GGH.A01(ggh, 14);
        ggh.A0F((i << 3) | 5);
        ggh.A0E(i2);
    }

    public final void A08(int i, int i2) {
        GGH ggh = (GGH) this;
        GHG.A07(ggh, i);
        if (i2 >= 0) {
            ggh.A0F(i2);
        } else {
            ggh.A0H(i2);
        }
    }

    public final void A09(int i, long j) {
        GGH ggh = (GGH) this;
        GGH.A01(ggh, 18);
        ggh.A0F((i << 3) | 1);
        ggh.A0G(j);
    }

    public final void A0A(int i, long j) {
        GGH ggh = (GGH) this;
        GHG.A07(ggh, i);
        ggh.A0H(j);
    }

    public final void A0B(AbstractC9309GDl abstractC9309GDl) {
        GGH ggh = (GGH) this;
        ggh.A06(abstractC9309GDl.A01());
        C9306GDi c9306GDi = (C9306GDi) abstractC9309GDl;
        GGH.A02(ggh, c9306GDi.bytes, c9306GDi.A02(), c9306GDi.A01());
    }

    public final void A0C(String str) throws CodedOutputStream$OutOfSpaceException {
        int iA00;
        int iA002;
        GGH ggh = (GGH) this;
        try {
            int length = str.length();
            int i = length * 3;
            int iA03 = A03(i);
            int i2 = iA03 + i;
            int i3 = ggh.A02;
            if (i2 > i3) {
                byte[] bArr = new byte[i];
                int iA003 = AbstractC9318GDv.A00.A00(str, bArr, 0, i);
                ggh.A06(iA003);
                GGH.A02(ggh, bArr, 0, iA003);
                return;
            }
            if (i2 > i3 - ggh.A00) {
                GGH.A00(ggh);
            }
            int iA032 = A03(length);
            int i4 = ggh.A00;
            try {
                if (iA032 == iA03) {
                    int i5 = i4 + iA032;
                    ggh.A00 = i5;
                    iA002 = AbstractC9318GDv.A00.A00(str, ggh.A03, i5, i3 - i5);
                    ggh.A00 = i4;
                    iA00 = (iA002 - i4) - iA032;
                    ggh.A0F(iA00);
                } else {
                    iA00 = AbstractC9318GDv.A00(str);
                    ggh.A0F(iA00);
                    iA002 = AbstractC9318GDv.A00.A00(str, ggh.A03, ggh.A00, iA00);
                }
                ggh.A00 = iA002;
                ggh.A01 += iA00;
            } catch (Utf8$UnpairedSurrogateException e) {
                ggh.A01 -= ggh.A00 - i4;
                ggh.A00 = i4;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
            }
        } catch (Utf8$UnpairedSurrogateException e3) {
            A01.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(GGV.A03);
            try {
                int length2 = bytes.length;
                ggh.A06(length2);
                GGH.A02(ggh, bytes, 0, length2);
            } catch (CodedOutputStream$OutOfSpaceException e4) {
                throw e4;
            } catch (IndexOutOfBoundsException e5) {
                throw new CodedOutputStream$OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.", e5);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int A05(String str) {
        int length;
        try {
            str = AbstractC9318GDv.A00(str);
            length = str;
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(GGV.A03).length;
        }
        return A03(length) + length;
    }
}
