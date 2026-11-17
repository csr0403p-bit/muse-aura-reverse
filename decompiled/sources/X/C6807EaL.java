package X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.EaL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6807EaL implements Closeable {
    public static final ThreadLocal<C6811EaP> A0C = new ThreadLocal<>();
    public int A05;
    public int A06;
    public Integer A07;
    public String A08;
    public final List<EnumC6809EaN> A09;
    public final Reader A0B;
    public final char[] A0A = new char[1024];
    public int A04 = 0;
    public int A02 = 0;
    public int A01 = 1;
    public int A00 = 1;
    public int A03 = -1;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        if (r3 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        r3 = X.C60O.A0w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r3.append(r2, r6, r4);
        r8.A05 += r4;
        r8.A04 += r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String A03() {
        /*
            r8 = this;
            r0 = -1
            r8.A06 = r0
            r1 = 0
            r8.A05 = r1
            r7 = 0
            r3 = r7
        L8:
            r4 = 0
        L9:
            int r6 = r8.A04
            int r5 = r6 + r4
            int r0 = r8.A02
            char[] r2 = r8.A0A
            if (r5 >= r0) goto L39
            int r6 = r6 + r4
            char r5 = r2[r6]
            r0 = 9
            if (r5 == r0) goto L49
            r0 = 10
            if (r5 == r0) goto L49
            r0 = 12
            if (r5 == r0) goto L49
            r0 = 13
            if (r5 == r0) goto L49
            r0 = 32
            if (r5 == r0) goto L49
            r0 = 44
            if (r5 == r0) goto L49
            r0 = 40
            if (r5 == r0) goto L49
            r0 = 41
            if (r5 == r0) goto L49
            int r4 = r4 + 1
            goto L9
        L39:
            r0 = 1024(0x400, float:1.435E-42)
            if (r4 >= r0) goto L5b
            int r0 = r4 + 1
            boolean r0 = r8.A06(r0)
            if (r0 != 0) goto L9
            int r0 = r8.A02
            r2[r0] = r1
        L49:
            r1 = r4
            if (r3 != 0) goto L75
            int r0 = r8.A04
            r8.A06 = r0
        L50:
            int r0 = r8.A05
            int r0 = r0 + r1
            r8.A05 = r0
            int r0 = r8.A04
            int r0 = r0 + r1
            r8.A04 = r0
            return r7
        L5b:
            if (r3 != 0) goto L61
            java.lang.StringBuilder r3 = X.C60O.A0w()
        L61:
            r3.append(r2, r6, r4)
            int r0 = r8.A05
            int r0 = r0 + r4
            r8.A05 = r0
            int r0 = r8.A04
            int r0 = r0 + r4
            r8.A04 = r0
            r0 = 1
            boolean r0 = r8.A06(r0)
            if (r0 != 0) goto L8
        L75:
            int r0 = r8.A04
            r3.append(r2, r0, r1)
            java.lang.String r7 = r3.toString()
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6807EaL.A03():java.lang.String");
    }

    private boolean A06(int i) throws IOException {
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            i2 = this.A04;
            if (i4 >= i2) {
                break;
            }
            if (this.A0A[i4] == '\n') {
                this.A01++;
                this.A00 = 1;
            } else {
                this.A00++;
            }
            i4++;
        }
        int i5 = this.A02;
        if (i5 != i2) {
            int i6 = i5 - i2;
            this.A02 = i6;
            char[] cArr = this.A0A;
            System.arraycopy(cArr, i2, cArr, 0, i6);
        } else {
            this.A02 = 0;
        }
        this.A04 = 0;
        do {
            Reader reader = this.A0B;
            char[] cArr2 = this.A0A;
            int i7 = this.A02;
            int i8 = reader.read(cArr2, i7, 1024 - i7);
            if (i8 == -1) {
                return false;
            }
            i3 = this.A02 + i8;
            this.A02 = i3;
            if (this.A01 == 1 && this.A00 == 1 && i3 > 0 && cArr2[0] == '\ufeff') {
                this.A04++;
                this.A00 = 0;
            }
        } while (i3 < i);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A08 = null;
        this.A07 = null;
        List<EnumC6809EaN> list = this.A09;
        list.clear();
        list.add(EnumC6809EaN.CLOSED);
        this.A0B.close();
    }

    private int A00() throws EOFException {
        while (true) {
            if (this.A04 >= this.A02 && !A06(1)) {
                throw new EOFException("End of input");
            }
            char[] cArr = this.A0A;
            int i = this.A04;
            this.A04 = i + 1;
            char c = cArr[i];
            if (c != '\t' && c != '\n' && c != '\r' && c != ' ' && c != ',') {
                return c;
            }
        }
    }

    public static C6811EaP A01() {
        ThreadLocal<C6811EaP> threadLocal = A0C;
        C6811EaP c6811EaP = threadLocal.get();
        if (c6811EaP != null) {
            return c6811EaP;
        }
        C6811EaP c6811EaP2 = new C6811EaP();
        threadLocal.set(c6811EaP2);
        return c6811EaP2;
    }

    private void A05(String str) throws IOException {
        int i;
        int i2 = this.A01;
        int i3 = 0;
        while (true) {
            i = this.A04;
            if (i3 >= i) {
                break;
            }
            if (this.A0A[i3] == '\n') {
                i2++;
            }
            i3++;
        }
        int i4 = this.A00;
        for (int i5 = 0; i5 < i; i5++) {
            i4++;
            if (this.A0A[i5] == '\n') {
                i4 = 1;
            }
        }
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append(" at line ");
        sbA0g.append(i2);
        throw BV4.A0K(C60P.A1O(" column ", sbA0g, i4));
    }

    public final Integer A07() throws IOException {
        Integer num;
        Integer num2 = this.A07;
        if (num2 != null) {
            return num2;
        }
        List<EnumC6809EaN> list = this.A09;
        int iOrdinal = ((EnumC6809EaN) BV5.A0e(list)).ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal == 0) {
                list.set(C60O.A00(list), EnumC6809EaN.NONEMPTY_LIST);
                if (A00() != 41) {
                    this.A04--;
                    this.A08 = A03();
                    if (this.A05 == 0) {
                        A05("Expected literal value");
                        throw F60.createAndThrow();
                    }
                    this.A08 = A01().A00(this.A0A, this.A06, this.A05);
                    num = C79.A0C;
                }
                this.A07 = num;
                return num;
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw BV6.A0f();
                    }
                    throw C3cG.A0Q("SExpReader is closed");
                }
                try {
                    return A02();
                } catch (EOFException unused) {
                    Integer num3 = C79.A0W;
                    this.A07 = num3;
                    return num3;
                }
            }
            if (A00() != 41) {
                this.A04--;
            }
            list.remove(C60O.A00(list));
            num = C79.A01;
            this.A07 = num;
            return num;
        }
        list.set(C60O.A00(list), EnumC6809EaN.NONEMPTY_DOCUMENT);
        return A02();
    }

    public final void A09() throws IOException {
        Integer num = C79.A01;
        A07();
        if (this.A07 != num) {
            throw C3cG.A0Q(FGI.A0d("Expected ", "END_LIST", " but was ", AbstractC6810EaO.A00(A07())));
        }
        A04(this);
    }

    public C6807EaL(Reader reader) {
        ArrayList arrayListA0h = C3cG.A0h();
        this.A09 = arrayListA0h;
        arrayListA0h.add(EnumC6809EaN.EMPTY_DOCUMENT);
        this.A0B = reader;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Integer A02() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6807EaL.A02():java.lang.Integer");
    }

    public static void A04(C6807EaL c6807EaL) throws IOException {
        c6807EaL.A07();
        c6807EaL.A07 = null;
        c6807EaL.A08 = null;
    }

    public final String A08() throws IOException {
        A07();
        Integer num = this.A07;
        if (num != C79.A0C && num != C79.A0K) {
            throw BV5.A0U("Expected a string but was ", AbstractC6810EaO.A00(A07()));
        }
        this.A03++;
        String str = this.A08;
        A04(this);
        return str;
    }

    public final boolean A0A() throws IOException {
        A07();
        Integer num = this.A07;
        if (num != C79.A0P) {
            throw BV5.A0U("Expected a boolean but was ", AbstractC6810EaO.A00(num));
        }
        this.A03++;
        boolean z = this.A08 == "true";
        A04(this);
        return z;
    }

    public final String toString() {
        String strA0Y = C3cI.A0Y(this);
        StringBuilder sbA0w = C60O.A0w();
        int i = this.A04;
        int iMin = Math.min(i, 20);
        char[] cArr = this.A0A;
        sbA0w.append(cArr, i - iMin, iMin);
        int i2 = this.A02;
        int i3 = this.A04;
        sbA0w.append(cArr, i3, Math.min(i2 - i3, 20));
        return FGI.A0U(strA0Y, " near ", String.valueOf(sbA0w));
    }
}
