package X;

import androidx.media3.common.util.CodecSpecificDataUtil;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.E2c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6351E2c {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final String A0A;
    public final List<byte[]> A0B;

    public static C6351E2c A00(E1P e1p) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        try {
            int iA06 = (BV6.A06(e1p, 4) & 3) + 1;
            if (iA06 == 3) {
                throw BV4.A0T();
            }
            ArrayList arrayListA0h = C3cG.A0h();
            int iA0A = e1p.A0A() & 31;
            for (int i9 = 0; i9 < iA0A; i9++) {
                int iA0D = e1p.A0D();
                int i10 = e1p.A01;
                e1p.A0S(iA0D);
                byte[] bArr = e1p.A02;
                byte[] bArr2 = new byte[iA0D + 4];
                System.arraycopy(CodecSpecificDataUtil.A01, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iA0D);
                arrayListA0h.add(bArr2);
            }
            int iA0A2 = e1p.A0A();
            for (int i11 = 0; i11 < iA0A2; i11++) {
                int iA0D2 = e1p.A0D();
                int i12 = e1p.A01;
                e1p.A0S(iA0D2);
                byte[] bArr3 = e1p.A02;
                byte[] bArr4 = new byte[iA0D2 + 4];
                System.arraycopy(CodecSpecificDataUtil.A01, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iA0D2);
                arrayListA0h.add(bArr4);
            }
            if (iA0A > 0) {
                C6377E3e c6377E3eA06 = AbstractC6381E3i.A06((byte[]) arrayListA0h.get(0), 5, ((byte[]) arrayListA0h.get(0)).length);
                i = c6377E3eA06.A0C;
                i2 = c6377E3eA06.A07;
                i3 = c6377E3eA06.A02 + 8;
                i4 = c6377E3eA06.A01 + 8;
                i5 = c6377E3eA06.A04;
                i6 = c6377E3eA06.A03;
                i7 = c6377E3eA06.A05;
                i8 = c6377E3eA06.A09;
                f = c6377E3eA06.A00;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(c6377E3eA06.A0A), Integer.valueOf(c6377E3eA06.A06), Integer.valueOf(c6377E3eA06.A08));
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                f = 1.0f;
            }
            return new C6351E2c(str, arrayListA0h, f, iA06, i, i2, i3, i4, i5, i6, i7, i8);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw BV6.A0V("Error parsing AVC config", e);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<[B>;IIIIIIIIIFLjava/lang/String;)V */
    public C6351E2c(String str, List list, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.A0B = list;
        this.A08 = i;
        this.A09 = i2;
        this.A06 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A04 = i6;
        this.A03 = i7;
        this.A05 = i8;
        this.A07 = i9;
        this.A00 = f;
        this.A0A = str;
    }
}
