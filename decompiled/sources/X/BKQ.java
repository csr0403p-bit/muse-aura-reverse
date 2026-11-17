package X;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class BKQ implements C9t6 {
    public int A00;
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
    public final void Aia(String str) {
        int iA0J = C8j3.A0J(str, 0);
        if (iA0J != 0) {
            A00(this.A00, iA0J);
            str.getChars(0, iA0J, this.A01, this.A00);
            this.A00 += iA0J;
        }
    }

    @Override // X.C9t6
    public final void Aig(char c) {
        A00(this.A00, 1);
        char[] cArr = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        cArr[i] = c;
    }

    @Override // X.C9t6
    public final void Air(String str) {
        int i;
        byte b;
        C7384Etj.A0Y(str, 0);
        int length = str.length();
        A00(this.A00, length + 2);
        char[] cArr = this.A01;
        int i2 = this.A00;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (true) {
            if (i5 >= i4) {
                i = i4 + 1;
                cArr[i4] = '\"';
                break;
            }
            char c = cArr[i5];
            byte[] bArr = AbstractC3195C2t.A00;
            if (c >= ']' || bArr[c] == 0) {
                i5++;
            } else {
                for (int i6 = i5 - i3; i6 < length; i6++) {
                    A00(i5, 2);
                    char cCharAt = str.charAt(i6);
                    if (cCharAt >= ']' || (b = bArr[cCharAt]) == 0) {
                        this.A01[i5] = cCharAt;
                        i5++;
                    } else {
                        if (b == 1) {
                            String str2 = AbstractC3195C2t.A01[cCharAt];
                            C7384Etj.A0X(str2);
                            int length2 = str2.length();
                            A00(i5, length2);
                            str2.getChars(0, length2, this.A01, i5);
                            i5 += length2;
                        } else {
                            char[] cArr2 = this.A01;
                            cArr2[i5] = '\\';
                            cArr2[i5 + 1] = (char) b;
                            i5 += 2;
                        }
                        this.A00 = i5;
                    }
                }
                A00(i5, 1);
                i = i5 + 1;
                this.A01[i5] = '\"';
            }
        }
        this.A00 = i;
    }

    public final String toString() {
        return new String(this.A01, 0, this.A00);
    }

    @Override // X.C9t6
    public final void writeLong(long j) {
        Aia(String.valueOf(j));
    }
}
