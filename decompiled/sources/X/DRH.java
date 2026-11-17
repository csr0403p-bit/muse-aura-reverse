package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public abstract class DRH {
    public static final Charset A00 = Charset.forName(HatchWebPageParserKt.UTF_8);

    public static String A00(byte[] bArr) {
        int i;
        try {
            int length = bArr.length;
            byte[] bArr2 = DRJ.A00;
            int i2 = (length / 3) * 4;
            if (length % 3 > 0) {
                i2 += 4;
            }
            byte[] bArr3 = new byte[i2];
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i4 + 3;
                if (i6 > length) {
                    break;
                }
                int iA0D = BV6.A0D(bArr, i4 + 1) | ((bArr[i4] & 255) << 16) | (bArr[i4 + 2] & 255);
                bArr3[i5] = bArr2[(iA0D >> 18) & 63];
                bArr3[i5 + 1] = bArr2[(iA0D >> 12) & 63];
                bArr3[i5 + 2] = bArr2[(iA0D >> 6) & 63];
                bArr3[i5 + 3] = bArr2[iA0D & 63];
                int i7 = i5 + 4;
                i3--;
                if (i3 == 0) {
                    i5 = i7 + 1;
                    bArr3[i7] = 10;
                    i4 = i6;
                    i3 = 19;
                } else {
                    i5 = i7;
                    i4 = i6;
                }
            }
            if (i4 != length - 1) {
                if (i4 == length - 2) {
                    int i8 = ((bArr[i4] & 255) << 10) | ((bArr[i4 + 1] & 255) << 2);
                    bArr3[i5] = bArr2[(i8 >> 12) & 63];
                    bArr3[i5 + 1] = bArr2[(i8 >> 6) & 63];
                    i = i5 + 3;
                    bArr3[i5 + 2] = bArr2[i8 & 63];
                }
                return new String(bArr3, "US-ASCII");
            }
            int i9 = (bArr[i4] & 255) << 4;
            bArr3[i5] = bArr2[(i9 >> 6) & 63];
            bArr3[i5 + 1] = bArr2[i9 & 63];
            i = i5 + 3;
            bArr3[i5 + 2] = 61;
            bArr3[i] = 61;
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw BV4.A0N(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r12 != 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        r1 = new byte[r2];
        java.lang.System.arraycopy(r3, 0, r1, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] A01(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRH.A01(java.lang.String):byte[]");
    }
}
