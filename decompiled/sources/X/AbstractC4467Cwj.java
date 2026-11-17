package X;

import com.facebook.aura.handoff.impl.HandoffLinkVerifier;
import java.io.IOException;
import java.math.RoundingMode;

/* renamed from: X.Cwj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4467Cwj {
    public static final AbstractC4467Cwj A00;
    public static final AbstractC4467Cwj A01;
    public static final AbstractC4467Cwj A02;
    public static final AbstractC4467Cwj A03;
    public static final AbstractC4467Cwj A04;

    public final String A00(byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        CeX.A02(0, i, length);
        C4464Cwg c4464Cwg = (C4464Cwg) this;
        C4468Cwk c4468Cwk = c4464Cwg.A00;
        int i2 = c4468Cwk.A03;
        StringBuilder sbA0p = BV4.A0p(c4468Cwk.A02 * AbstractC4469Cwl.A00(RoundingMode.CEILING, i, i2));
        try {
            if (c4464Cwg instanceof C4465Cwh) {
                int i3 = 0;
                CeX.A02(0, i, length);
                for (int i4 = i; i4 >= 3; i4 -= 3) {
                    int i5 = bArr[i3] & 255;
                    int i6 = ((bArr[i3 + 1] & 255) << 8) | (i5 << 16) | (bArr[i3 + 2] & 255);
                    char[] cArr = c4468Cwk.A07;
                    sbA0p.append(cArr[i6 >>> 18]);
                    sbA0p.append(cArr[(i6 >>> 12) & 63]);
                    sbA0p.append(cArr[(i6 >>> 6) & 63]);
                    sbA0p.append(cArr[i6 & 63]);
                    i3 += 3;
                }
                if (i3 < i) {
                    c4464Cwg.A01(sbA0p, bArr, i3, i - i3);
                }
            } else if (c4464Cwg instanceof C4466Cwi) {
                C4466Cwi c4466Cwi = (C4466Cwi) c4464Cwg;
                CeX.A02(0, i, length);
                for (int i7 = 0; i7 < i; i7++) {
                    int i8 = bArr[i7] & 255;
                    char[] cArr2 = c4466Cwi.A00;
                    sbA0p.append(cArr2[i8]);
                    sbA0p.append(cArr2[i8 | 256]);
                }
            } else {
                CeX.A02(0, i, length);
                for (int i9 = 0; i9 < i; i9 += i2) {
                    c4464Cwg.A01(sbA0p, bArr, i9, C8j3.A0F(i, i9, i2));
                }
            }
            return sbA0p.toString();
        } catch (IOException e) {
            throw BV4.A0N(e);
        }
    }

    static {
        C4468Cwk c4468Cwk = new C4468Cwk("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray());
        C4465Cwh c4465Cwh = new C4465Cwh(c4468Cwk, '=');
        if (c4468Cwk.A07.length != 64) {
            throw BV4.A0P();
        }
        A01 = c4465Cwh;
        C4468Cwk c4468Cwk2 = new C4468Cwk("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray());
        C4465Cwh c4465Cwh2 = new C4465Cwh(c4468Cwk2, '=');
        if (c4468Cwk2.A07.length != 64) {
            throw BV4.A0P();
        }
        A02 = c4465Cwh2;
        A03 = new C4464Cwg(new C4468Cwk("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
        A04 = new C4464Cwg(new C4468Cwk("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
        A00 = new C4466Cwi(new C4468Cwk("base16()", HandoffLinkVerifier.HEX_DIGITS.toCharArray()));
    }
}
