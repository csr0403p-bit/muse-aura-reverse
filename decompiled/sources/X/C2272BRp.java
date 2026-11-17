package X;

import com.facebook.acra.util.UrlEncodingWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: X.BRp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2272BRp implements C9t6 {
    public int A00;
    public final OutputStream A03;
    public final byte[] A02 = BS3.A00.A01(512);
    public char[] A01 = BQF.A00.A01(128);

    private final void A00(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.A01;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            C7384Etj.A0U(cArrCopyOf);
            this.A01 = cArrCopyOf;
        }
    }

    @Override // X.C9t6
    public final void Aia(String str) throws IOException {
        int iA0J = C8j3.A0J(str, 0);
        A00(0, iA0J);
        str.getChars(0, iA0J, this.A01, 0);
        A02(this.A01, iA0J);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    @Override // X.C9t6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Aig(char r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2272BRp.Aig(char):void");
    }

    @Override // X.C9t6
    public final void Air(String str) throws IOException {
        byte b;
        int iA0J = C8j3.A0J(str, 0);
        int i = iA0J + 2;
        A00(0, i);
        char[] cArr = this.A01;
        cArr[0] = '\"';
        int i2 = 1;
        str.getChars(0, iA0J, cArr, 1);
        int i3 = iA0J + 1;
        while (true) {
            if (i2 >= i3) {
                cArr[i3] = '\"';
                A02(cArr, i);
                break;
            }
            char c = cArr[i2];
            byte[] bArr = AbstractC3195C2t.A00;
            if (c >= ']' || bArr[c] == 0) {
                i2++;
            } else {
                for (int i4 = i2 - 1; i4 < iA0J; i4++) {
                    A00(i2, 2);
                    char cCharAt = str.charAt(i4);
                    if (cCharAt >= ']' || (b = bArr[cCharAt]) == 0) {
                        this.A01[i2] = cCharAt;
                        i2++;
                    } else if (b == 1) {
                        String str2 = AbstractC3195C2t.A01[cCharAt];
                        C7384Etj.A0X(str2);
                        int length = str2.length();
                        A00(i2, length);
                        str2.getChars(0, length, this.A01, i2);
                        i2 += length;
                    } else {
                        char[] cArr2 = this.A01;
                        cArr2[i2] = '\\';
                        cArr2[i2 + 1] = (char) b;
                        i2 += 2;
                    }
                }
                A00(i2, 1);
                char[] cArr3 = this.A01;
                cArr3[i2] = '\"';
                A02(cArr3, i2 + 1);
            }
        }
        A01(this);
    }

    public static final void A01(C2272BRp c2272BRp) throws IOException {
        c2272BRp.A03.write(c2272BRp.A02, 0, c2272BRp.A00);
        c2272BRp.A00 = 0;
    }

    private final void A02(char[] cArr, int i) throws IOException {
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        if (i < 0) {
            throw C60O.A0i("count < 0");
        }
        int length = cArr.length;
        if (i > length) {
            throw C8j3.A0v("count > string.length: ", " > ", i, length);
        }
        int i5 = 0;
        while (i5 < i) {
            char c = cArr[i5];
            if (c < '\u0080') {
                byte[] bArr2 = this.A02;
                int length2 = bArr2.length;
                if (length2 - this.A00 < 1) {
                    A01(this);
                }
                int i6 = this.A00;
                int i7 = i6 + 1;
                this.A00 = i7;
                bArr2[i6] = (byte) c;
                i5++;
                int iMin = Math.min(i, (length2 - i7) + i5);
                while (i5 < iMin) {
                    char c2 = cArr[i5];
                    if (c2 < '\u0080') {
                        int i8 = i7;
                        i7++;
                        this.A00 = i7;
                        bArr2[i8] = (byte) c2;
                        i5++;
                    }
                }
            } else {
                if (c < '\u0800') {
                    bArr = this.A02;
                    if (bArr.length - this.A00 < 2) {
                        A01(this);
                    }
                    int i9 = this.A00;
                    i2 = i9 + 1;
                    this.A00 = i2;
                    bArr[i9] = (byte) ((c >> 6) | 192);
                    i3 = (c & '?') | 128;
                    i4 = i9 + 2;
                } else if (c < '\ud800' || c > '\udfff') {
                    bArr = this.A02;
                    if (bArr.length - this.A00 < 3) {
                        A01(this);
                    }
                    int i10 = this.A00;
                    int i11 = i10 + 1;
                    this.A00 = i11;
                    bArr[i10] = (byte) ((c >> '\f') | 224);
                    i2 = i10 + 2;
                    this.A00 = i2;
                    bArr[i11] = (byte) (((c >> 6) & 63) | 128);
                    i3 = (c & '?') | 128;
                    i4 = i10 + 3;
                } else {
                    int i12 = i5 + 1;
                    char c3 = i12 < i ? cArr[i12] : (char) 0;
                    if (c > '\udbff' || '\udc00' > c3 || c3 >= '\ue000') {
                        byte[] bArr3 = this.A02;
                        if (bArr3.length - this.A00 < 1) {
                            A01(this);
                        }
                        int i13 = this.A00;
                        this.A00 = i13 + 1;
                        bArr3[i13] = UrlEncodingWriter.UTF16_REPLACEMENT_BYTE;
                        i5 = i12;
                    } else {
                        int i14 = (((c & '\u03ff') << 10) | (c3 & '\u03ff')) + 65536;
                        byte[] bArr4 = this.A02;
                        if (bArr4.length - this.A00 < 4) {
                            A01(this);
                        }
                        int i15 = this.A00;
                        int i16 = i15 + 1;
                        this.A00 = i16;
                        bArr4[i15] = (byte) ((i14 >> 18) | 240);
                        int i17 = i15 + 2;
                        this.A00 = i17;
                        bArr4[i16] = (byte) (((i14 >> 12) & 63) | 128);
                        int i18 = i15 + 3;
                        this.A00 = i18;
                        bArr4[i17] = (byte) (((i14 >> 6) & 63) | 128);
                        this.A00 = i15 + 4;
                        bArr4[i18] = (byte) ((i14 & 63) | 128);
                        i5 += 2;
                    }
                }
                this.A00 = i4;
                bArr[i2] = (byte) i3;
                i5++;
            }
        }
    }

    public C2272BRp(OutputStream outputStream) {
        this.A03 = outputStream;
    }

    @Override // X.C9t6
    public final void writeLong(long j) throws IOException {
        Aia(String.valueOf(j));
    }
}
