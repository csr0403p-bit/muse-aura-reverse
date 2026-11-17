package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Ea3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6793Ea3 implements F94 {
    public int A00;
    public C6795Ea6 A01;
    public Integer A02;
    public String A03;
    public final int A04;
    public final int A05;
    public final ArrayList<String> A06;
    public final byte[] A07;
    public final C6794Ea4 A08;

    public C6793Ea3(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        this.A07 = bArr;
        this.A05 = i;
        this.A04 = i2 + i;
        this.A00 = i;
        this.A06 = C60O.A11(256);
        this.A08 = new C6794Ea4();
        this.A02 = C79.A02;
    }

    private final long A00() throws IOException {
        long j = 0;
        int i = 0;
        do {
            int i2 = this.A00;
            if (i2 >= this.A04) {
                break;
            }
            byte[] bArr = this.A07;
            this.A00 = i2 + 1;
            j |= (r2 & Byte.MAX_VALUE) << i;
            if (bArr[i2] >= 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw BV4.A0K("Malformed varint in binary token stream");
    }

    @Override // X.F94
    public final Integer ARK() throws IOException {
        Integer num;
        int i = this.A00;
        int i2 = this.A05;
        if (i == i2) {
            byte[] bArr = AbstractC6796Ea7.A00;
            if (this.A04 - i2 >= 4) {
                Iterable aDq = new ADq(0, 3);
                if (!(aDq instanceof Collection) || !((Collection) aDq).isEmpty()) {
                    Iterator<Integer> it = aDq.iterator();
                    while (it.hasNext()) {
                        int iA00 = ((BNt) it).A00();
                        if (this.A07[i2 + iA00] == bArr[iA00]) {
                        }
                    }
                }
                i = i2 + 4;
                this.A00 = i;
            }
            throw BV4.A0K("Not a binary token stream");
        }
        this.A03 = null;
        this.A01 = null;
        int i3 = this.A04;
        if (i == i3) {
            num = C79.A02;
        } else {
            byte[] bArr2 = this.A07;
            int i4 = i + 1;
            this.A00 = i4;
            byte b = bArr2[i];
            if (b == 1) {
                num = C79.A0C;
            } else if (b == 2) {
                num = C79.A0K;
            } else if (b == 3) {
                num = C79.A00;
            } else if (b == 4) {
                num = C79.A01;
            } else if (b == 5) {
                C6794Ea4 c6794Ea4 = this.A08;
                num = C79.A0c;
                C6794Ea4.A00(c6794Ea4, num, null);
            } else if (b == 6 || b == 7) {
                C6794Ea4 c6794Ea42 = this.A08;
                boolean z = b == 7;
                num = C79.A0Z;
                C6794Ea4.A00(c6794Ea42, num, null);
                c6794Ea42.A01 = z;
            } else if (b == 8) {
                long jA00 = A00();
                C6794Ea4 c6794Ea43 = this.A08;
                num = C79.A0Y;
                C6794Ea4.A00(c6794Ea43, num, null);
                c6794Ea43.A00 = (-(jA00 & 1)) ^ (jA00 >>> 1);
                c6794Ea43.A03 = true;
            } else if (b == 9) {
                C6794Ea4 c6794Ea44 = this.A08;
                String strA02 = A02();
                num = C79.A0Y;
                C6794Ea4.A00(c6794Ea44, num, strA02);
            } else if (b == 10) {
                C6794Ea4 c6794Ea45 = this.A08;
                String strA022 = A02();
                this.A06.add(strA022);
                num = C79.A0T;
                C6794Ea4.A00(c6794Ea45, num, strA022);
            } else if (b == 11) {
                C6794Ea4 c6794Ea46 = this.A08;
                String strA01 = A01();
                C7384Etj.A0Y(strA01, 0);
                num = C79.A0T;
                C6794Ea4.A00(c6794Ea46, num, strA01);
            } else if (b == 12) {
                String strA023 = A02();
                this.A06.add(strA023);
                this.A03 = strA023;
                num = C79.A0P;
            } else if (b == 13) {
                this.A03 = A01();
                num = C79.A0P;
            } else {
                if (b != 14) {
                    throw BV4.A0K(FGI.A0H("Unknown binary token tag ", b));
                }
                if (i3 - i4 < 4) {
                    throw BV4.A0K("Binary token stream ended inside a value");
                }
                long j = 0;
                int i5 = 0;
                do {
                    j |= (bArr2[i4 + i5] & 255) << (i5 * 8);
                    i5++;
                } while (i5 < 4);
                int i6 = i4 + 4;
                this.A00 = i6;
                if (0 > j || j > i3 - i6) {
                    throw BV4.A0K("Binary token stream ended inside a value");
                }
                int i7 = (int) j;
                C6795Ea6 c6795Ea6 = new C6795Ea6(bArr2, i6, i7);
                this.A00 = i6 + i7;
                this.A01 = c6795Ea6;
                C6794Ea4 c6794Ea47 = this.A08;
                num = C79.A0T;
                C6794Ea4.A00(c6794Ea47, num, null);
                c6794Ea47.A02 = true;
            }
        }
        this.A02 = num;
        return num;
    }

    @Override // X.F94
    public final String AXk() throws IOException {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        throw BV5.A0M("No name at ", HqV.A00(this.A02));
    }

    @Override // X.F94
    public final Integer AXl() {
        return this.A02;
    }

    @Override // X.F94
    public final F95 AXm() {
        return this.A08;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x000d A[SYNTHETIC] */
    @Override // X.F94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Afp() throws java.io.IOException {
        /*
            r4 = this;
            java.lang.Integer r1 = r4.A02
            java.lang.Integer r0 = X.C79.A00
            if (r1 == r0) goto Lb
            java.lang.Integer r0 = X.C79.A0C
            if (r1 == r0) goto Lb
        La:
            return
        Lb:
            r3 = 0
            r2 = 1
        Ld:
            java.lang.Integer r0 = r4.ARK()
            int r1 = r0.intValue()
            if (r1 == r3) goto L2e
            r0 = 2
            if (r1 == r0) goto L2e
            r0 = 1
            if (r1 == r0) goto L2b
            r0 = 3
            if (r1 == r0) goto L2b
            r0 = 10
            if (r1 != r0) goto Ld
            java.lang.String r0 = "Binary token stream ended inside a value"
            java.io.IOException r0 = X.BV4.A0K(r0)
            throw r0
        L2b:
            int r2 = r2 + (-1)
            goto L30
        L2e:
            int r2 = r2 + 1
        L30:
            if (r2 == 0) goto La
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6793Ea3.Afp():void");
    }

    private final String A01() throws IOException {
        long jA00 = A00();
        if (0 <= jA00) {
            ArrayList<String> arrayList = this.A06;
            if (jA00 < arrayList.size()) {
                String str = arrayList.get((int) jA00);
                C7384Etj.A0U(str);
                return str;
            }
        }
        throw BV4.A0K(FGI.A0J("String reference ", jA00, " is out of range"));
    }

    private final String A02() throws IOException {
        long jA00 = A00();
        if (0 <= jA00) {
            int i = this.A04;
            int i2 = this.A00;
            if (jA00 <= i - i2) {
                int i3 = (int) jA00;
                String strA0n = BV4.A0n(DCl.A05, this.A07, i2, i3);
                this.A00 += i3;
                return strA0n;
            }
        }
        throw BV4.A0K("Binary token stream ended inside a value");
    }
}
