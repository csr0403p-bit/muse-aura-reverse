package X;

import com.facebook.acra.util.UrlEncodingWriter;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Gmy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9982Gmy extends AbstractC9988GnE {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public byte[] A04;
    public int[] A05;
    public final Gn5 A06;

    public static final EnumC9834GiY A0Y(C9982Gmy c9982Gmy, int i) throws JsonParseException {
        Gn2 gn2 = c9982Gmy.A0R;
        char[] cArrA0E = gn2.A0E();
        if (i == 48) {
            i = c9982Gmy.A0L();
        }
        cArrA0E[0] = (char) i;
        int i2 = ((AbstractC9980Gmw) c9982Gmy).A04;
        int i3 = ((AbstractC9980Gmw) c9982Gmy).A05;
        int iA0F = C8j3.A0F(cArrA0E.length + i3, 1, i2);
        int iA0K = 1;
        int i4 = 1;
        while (i3 < iA0F) {
            byte[] bArr = c9982Gmy.A04;
            int i5 = i3;
            i3++;
            ((AbstractC9980Gmw) c9982Gmy).A05 = i3;
            int i6 = bArr[i5] & 255;
            if (i6 < 48) {
                if (i6 != 46) {
                }
                return c9982Gmy.A0b(cArrA0E, iA0K, i6, i4, false);
            }
            if (i6 <= 57) {
                i4++;
                iA0K = AbstractC7607F5u.A0K(cArrA0E, iA0K, i6);
            }
            if ((i6 | 32) != 101) {
                ((AbstractC9980Gmw) c9982Gmy).A05 = i3 - 1;
                gn2.A00 = iA0K;
                if (((AbstractC10020Gns) c9982Gmy.A0F).A02 == 0) {
                    c9982Gmy.A0q(i6);
                }
                return c9982Gmy.A2O(i4, false);
            }
            return c9982Gmy.A0b(cArrA0E, iA0K, i6, i4, false);
        }
        return c9982Gmy.A0c(cArrA0E, iA0K, i4, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r0 > 57) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC9834GiY A0a(X.C9982Gmy r14, boolean r15) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r10 = r14
            X.Gn2 r5 = r14.A0R
            char[] r11 = r5.A0E()
            r9 = 1
            r2 = 0
            if (r15 == 0) goto L10
            r0 = 45
            r11[r2] = r0
            r2 = 1
        L10:
            int r1 = r14.A05
            int r0 = r14.A04
            if (r1 < r0) goto L1e
            r14.A2B()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1e:
            byte[] r7 = r14.A04
            int r0 = X.AbstractC9916Gl7.A01(r14, r7, r1)
            r6 = 46
            r4 = 57
            r3 = 48
            if (r0 > r3) goto L35
            if (r0 == r3) goto L3c
            if (r0 != r6) goto L37
            X.GiY r0 = A0Z(r14, r15)
            return r0
        L35:
            if (r0 <= r4) goto L40
        L37:
            X.GiY r0 = r14.A0V(r0, r15)
            return r0
        L3c:
            int r0 = r14.A0L()
        L40:
            int r12 = X.AbstractC7607F5u.A0K(r11, r2, r0)
            int r1 = r14.A04
            int r2 = r14.A05
            int r0 = r11.length
            int r0 = r0 + r2
            int r1 = X.C8j3.A0F(r0, r12, r1)
            r8 = r12
            r14 = 1
        L50:
            if (r2 < r1) goto L57
            X.GiY r0 = r10.A0c(r11, r12, r14, r15)
            return r0
        L57:
            r0 = r2
            int r2 = r2 + 1
            r10.A05 = r2
            r0 = r7[r0]
            r13 = r0 & 255(0xff, float:3.57E-43)
            if (r13 < r3) goto L6d
            if (r13 > r4) goto L6f
            int r14 = r14 + 1
            int r12 = r12 + 1
            char r0 = (char) r13
            r11[r8] = r0
            r8 = r12
            goto L50
        L6d:
            if (r13 == r6) goto L88
        L6f:
            r1 = r13 | 32
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L88
            int r2 = r2 - r9
            r10.A05 = r2
            r5.A00 = r12
            X.Gnr r0 = r10.A0F
            int r0 = r0.A02
            if (r0 != 0) goto L83
            r10.A0q(r13)
        L83:
            X.GiY r0 = r10.A2O(r14, r15)
            return r0
        L88:
            X.GiY r0 = r10.A0b(r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0a(X.Gmy, boolean):X.GiY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if ((r7 | 32) == 101) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r1 = r3 - 1;
        r10.A05 = r1;
        r10.A0R.A00 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (((X.AbstractC10020Gns) r10.A0F).A02 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        A0q(r2[r1] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        return A2O(r8, r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.EnumC9834GiY A0c(char[] r11, int r12, int r13, boolean r14) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r10 = this;
            r5 = r11
            r6 = r12
            r8 = r13
        L3:
            r4 = r10
            int r1 = r10.A05
            int r0 = r10.A04
            r9 = r14
            if (r1 < r0) goto L14
            X.Gn2 r0 = r10.A0R
            r0.A00 = r6
        Lf:
            X.GiY r0 = r10.A2O(r8, r14)
            return r0
        L14:
            byte[] r2 = r10.A04
            int r3 = r1 + 1
            int r7 = X.AbstractC9916Gl7.A02(r10, r2, r3, r1)
            r0 = 57
            if (r7 > r0) goto L28
            r0 = 48
            if (r7 >= r0) goto L44
            r0 = 46
            if (r7 == r0) goto L55
        L28:
            r1 = r7 | 32
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L55
            int r1 = r3 + (-1)
            r10.A05 = r1
            X.Gn2 r0 = r10.A0R
            r0.A00 = r6
            X.Gnr r0 = r10.A0F
            int r0 = r0.A02
            if (r0 != 0) goto Lf
            r0 = r2[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r10.A0q(r0)
            goto Lf
        L44:
            int r0 = r5.length
            if (r6 < r0) goto L4e
            X.Gn2 r0 = r10.A0R
            char[] r5 = r0.A0F()
            r6 = 0
        L4e:
            int r6 = X.AbstractC7607F5u.A0K(r5, r6, r7)
            int r8 = r8 + 1
            goto L3
        L55:
            X.GiY r0 = r4.A0b(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0c(char[], int, int, boolean):X.GiY");
    }

    public static final void A0y(C9982Gmy c9982Gmy) throws JsonParseException {
        c9982Gmy.A03 = false;
        int[] iArr = AbstractC9988GnE.A08;
        byte[] bArr = c9982Gmy.A04;
        while (true) {
            int i = ((AbstractC9980Gmw) c9982Gmy).A05;
            int i2 = ((AbstractC9980Gmw) c9982Gmy).A04;
            if (i < i2) {
                while (true) {
                    if (i >= i2) {
                        ((AbstractC9980Gmw) c9982Gmy).A05 = i;
                        break;
                    }
                    int i3 = i + 1;
                    int i4 = bArr[i] & 255;
                    int i5 = iArr[i4];
                    if (i5 != 0) {
                        ((AbstractC9980Gmw) c9982Gmy).A05 = i3;
                        if (i4 == 34) {
                            return;
                        }
                        if (i5 == 1) {
                            c9982Gmy.A2K();
                        } else if (i5 == 2) {
                            c9982Gmy.A0l();
                        } else if (i5 == 3) {
                            c9982Gmy.A0m();
                        } else if (i5 == 4) {
                            c9982Gmy.A0n();
                        } else {
                            if (i4 >= 32) {
                                c9982Gmy.A0o(i4);
                                break;
                            }
                            c9982Gmy.A2a(i4, "string value");
                        }
                    } else {
                        i = i3;
                    }
                }
            } else {
                c9982Gmy.A2B();
                break;
            }
        }
        throw F60.createAndThrow();
    }

    public static int[] A15(C9982Gmy c9982Gmy, int[] iArr, int i) throws StreamConstraintsException {
        int length = iArr.length;
        if (i < length) {
            return iArr;
        }
        int[] iArrA2c = c9982Gmy.A2c(iArr, length);
        c9982Gmy.A05 = iArrA2c;
        return iArrA2c;
    }

    private final int A0L() throws JsonParseException {
        int i = super.A05;
        int i2 = super.A04;
        if (i < i2) {
            byte[] bArr = this.A04;
            int i3 = bArr[i] & 255;
            if (i3 >= 48 && i3 <= 57) {
                if ((((AbstractC9916Gl7) this).A00 & AbstractC9988GnE.A05) == 0) {
                    throw AbstractC9916Gl7.A03(this, FGI.A0M("Invalid numeric value: ", "Leading zeroes not allowed"));
                }
                int i4 = i + 1;
                super.A05 = i4;
                if (i3 == 48) {
                    while (i4 < i2) {
                        i3 = bArr[i4] & 255;
                        if (i3 >= 48 && i3 <= 57) {
                            i4++;
                            super.A05 = i4;
                            if (i3 != 48) {
                                break;
                            }
                        }
                    }
                }
                return i3;
            }
        }
        return 48;
    }

    private final int A0M(int i) throws JsonParseException {
        int i2 = super.A05;
        if (i2 >= super.A04) {
            A2B();
        } else {
            byte[] bArr = this.A04;
            int i3 = i2 + 1;
            super.A05 = i3;
            byte b = bArr[i2];
            if ((b & 192) == 128) {
                return ((i & 31) << 6) | (b & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE);
            }
            A0r(b & 255, i3);
        }
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A0N(int r8) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r7 = this;
            int r0 = r7.A05
            int r6 = r7.A04
            if (r0 >= r6) goto L37
            r3 = r8 & 15
            byte[] r5 = r7.A04
            int r2 = r0 + 1
            r7.A05 = r2
            r1 = r5[r0]
            r0 = r1 & 192(0xc0, float:2.69E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r0 == r4) goto L20
            r0 = r1 & 255(0xff, float:3.57E-43)
            r7.A0r(r0, r2)
        L1b:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L20:
            int r3 = r3 << 6
            r0 = r1 & 63
            r3 = r3 | r0
            if (r2 >= r6) goto L37
            int r1 = r2 + 1
            r7.A05 = r1
            r2 = r5[r2]
            r0 = r2 & 192(0xc0, float:2.69E-43)
            if (r0 == r4) goto L3b
            r0 = r2 & 255(0xff, float:3.57E-43)
            r7.A0r(r0, r1)
            goto L1b
        L37:
            r7.A2B()
            goto L1b
        L3b:
            int r1 = r3 << 6
            r0 = r2 & 63
            r1 = r1 | r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0N(int):int");
    }

    private final int A0O(int i) throws JsonParseException {
        int i2 = i & 15;
        byte[] bArr = this.A04;
        int i3 = super.A05;
        int i4 = i3 + 1;
        super.A05 = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            A0r(b & 255, i4);
        } else {
            int i5 = (i2 << 6) | (b & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE);
            int i6 = i4 + 1;
            super.A05 = i6;
            byte b2 = bArr[i4];
            if ((b2 & 192) == 128) {
                return (i5 << 6) | (b2 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE);
            }
            A0r(b2 & 255, i6);
        }
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[PHI: r2 r5
  0x0043: PHI (r2v1 byte) = (r2v0 byte), (r2v2 byte) binds: [B:5:0x0013, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:5:0x0013, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A0P(int r9) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r8 = this;
            int r0 = r8.A05
            int r7 = r8.A04
            if (r0 >= r7) goto L49
            byte[] r6 = r8.A04
            int r3 = r0 + 1
            r8.A05 = r3
            r5 = r3
            r2 = r6[r0]
            r0 = r2 & 192(0xc0, float:2.69E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r0 != r4) goto L43
            r0 = r9 & 7
            int r1 = r0 << 6
            r0 = r2 & 63
            r1 = r1 | r0
            if (r3 >= r7) goto L49
            int r5 = r3 + 1
            r8.A05 = r5
            r2 = r6[r3]
            r0 = r2 & 192(0xc0, float:2.69E-43)
            if (r0 != r4) goto L43
            int r3 = r1 << 6
            r0 = r2 & 63
            r3 = r3 | r0
            if (r5 >= r7) goto L49
            int r1 = r5 + 1
            r8.A05 = r1
            r2 = r6[r5]
            r0 = r2 & 192(0xc0, float:2.69E-43)
            if (r0 == r4) goto L4d
            r0 = r2 & 255(0xff, float:3.57E-43)
            r8.A0r(r0, r1)
        L3e:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L43:
            r0 = r2 & 255(0xff, float:3.57E-43)
            r8.A0r(r0, r5)
            goto L3e
        L49:
            r8.A2B()
            goto L3e
        L4d:
            int r1 = r3 << 6
            r0 = r2 & 63
            r1 = r1 | r0
            r0 = 65536(0x10000, float:9.18355E-41)
            int r1 = r1 - r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0P(int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r6 == 58) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r0 r6
  0x003a: PHI (r0v3 int) = (r0v2 int), (r0v5 int) binds: [B:11:0x002c, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r6v3 byte) = (r6v2 byte), (r6v5 byte) binds: [B:11:0x002c, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A0Q(X.C9982Gmy r10) {
        /*
            int r9 = r10.A05
            int r1 = r9 + 4
            int r0 = r10.A04
            r8 = 0
            if (r1 >= r0) goto L48
            byte[] r7 = r10.A04
            r6 = r7[r9]
            r0 = 58
            r5 = 9
            r4 = 35
            r3 = 47
            r2 = 32
            r1 = 1
            if (r6 == r0) goto L26
            if (r6 == r2) goto L1e
            if (r6 != r5) goto L24
        L1e:
            int r9 = r9 + 1
            r10.A05 = r9
            r6 = r7[r9]
        L24:
            if (r6 != r0) goto L48
        L26:
            int r0 = r9 + 1
            r10.A05 = r0
            r6 = r7[r0]
            if (r6 > r2) goto L3a
            if (r6 == r2) goto L32
            if (r6 != r5) goto L43
        L32:
            int r0 = r0 + 1
            r10.A05 = r0
            r6 = r7[r0]
            if (r6 <= r2) goto L43
        L3a:
            if (r6 == r3) goto L43
            if (r6 == r4) goto L43
            int r0 = r0 + 1
            r10.A05 = r0
            return r6
        L43:
            int r6 = r10.A0U(r1)
            return r6
        L48:
            int r6 = r10.A0U(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0Q(X.Gmy):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = ((X.AbstractC9980Gmw) r3).A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 < ((X.AbstractC9980Gmw) r3).A04) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        throw X.AbstractC9916Gl7.A03(r3, X.AbstractC9916Gl7.A06(r3.A0F, "Unexpected end-of-input within/between "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r1 = r2 + 1;
        r2 = X.AbstractC9916Gl7.A02(r3, r3.A04, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r2 <= 32) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r2 != 47) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r3.A0j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r2 != 35) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if ((((X.AbstractC9916Gl7) r3).A00 & X.AbstractC9988GnE.A04) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        r3.A0k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r2 == 32) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r2 != 10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        X.AbstractC9916Gl7.A07(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r2 != 13) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        r3.A0i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007f, code lost:
    
        if (r2 == 9) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0089, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A0R(X.C9982Gmy r3) throws com.fasterxml.jackson.core.JsonParseException {
        /*
        L0:
            int r2 = r3.A05
            int r0 = r3.A04
            if (r2 >= r0) goto L1e
            byte[] r0 = r3.A04
            int r1 = r2 + 1
            int r2 = X.AbstractC9916Gl7.A02(r3, r0, r1, r2)
            r0 = 32
            if (r2 <= r0) goto L66
            r0 = 47
            if (r2 == r0) goto L1a
            r0 = 35
            if (r2 != r0) goto L89
        L1a:
            int r0 = r1 + (-1)
            r3.A05 = r0
        L1e:
            int r2 = r3.A05
            int r0 = r3.A04
            if (r2 < r0) goto L31
            java.lang.String r1 = "Unexpected end-of-input within/between "
            X.Gnr r0 = r3.A0F
            java.lang.String r0 = X.AbstractC9916Gl7.A06(r0, r1)
            com.fasterxml.jackson.core.JsonParseException r0 = X.AbstractC9916Gl7.A03(r3, r0)
            throw r0
        L31:
            byte[] r0 = r3.A04
            int r1 = r2 + 1
            int r2 = X.AbstractC9916Gl7.A02(r3, r0, r1, r2)
            r0 = 32
            if (r2 <= r0) goto L54
            r0 = 47
            if (r2 != r0) goto L45
            r3.A0j()
            goto L1e
        L45:
            r0 = 35
            if (r2 != r0) goto L89
            int r1 = r3.A00
            int r0 = X.AbstractC9988GnE.A04
            r1 = r1 & r0
            if (r1 == 0) goto L89
            r3.A0k()
            goto L1e
        L54:
            if (r2 == r0) goto L1e
            r0 = 10
            if (r2 != r0) goto L5e
            X.AbstractC9916Gl7.A07(r3, r1)
            goto L1e
        L5e:
            r0 = 13
            if (r2 != r0) goto L7d
            r3.A0i()
            goto L1e
        L66:
            if (r2 == r0) goto L0
            r0 = 10
            if (r2 != r0) goto L70
            X.AbstractC9916Gl7.A07(r3, r1)
            goto L0
        L70:
            r0 = 13
            if (r2 != r0) goto L78
            r3.A0i()
            goto L0
        L78:
            r0 = 9
            if (r2 == r0) goto L0
            goto L81
        L7d:
            r0 = 9
            if (r2 == r0) goto L1e
        L81:
            r3.A2C(r2)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0R(X.Gmy):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:54:?, B:8:0x001e], limit reached: 78 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0048 A[EDGE_INSN: B:47:0x0048->B:75:? BREAK  A[LOOP:0: B:10:0x0023->B:51:0x0023], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0039 -> B:10:0x0023). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:10:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A0S(X.C9982Gmy r11) {
        /*
            int r1 = r11.A05
            int r10 = r11.A04
            if (r1 >= r10) goto L87
            byte[] r8 = r11.A04
            int r0 = r1 + 1
            int r9 = X.AbstractC9916Gl7.A02(r11, r8, r0, r1)
            r7 = 35
            r6 = 47
            r5 = 32
            if (r9 > r5) goto L40
            r4 = 9
            r3 = 13
            r2 = 10
            if (r9 == r5) goto L23
            if (r9 != r2) goto L37
            X.AbstractC9916Gl7.A07(r11, r0)
        L23:
            int r1 = r11.A05
            if (r1 >= r10) goto L48
            int r0 = r1 + 1
            int r9 = X.AbstractC9916Gl7.A02(r11, r8, r0, r1)
            if (r9 > r5) goto L40
            if (r9 == r5) goto L23
            if (r9 != r2) goto L37
            X.AbstractC9916Gl7.A07(r11, r0)
            goto L23
        L37:
            if (r9 != r3) goto L3d
            r11.A0i()
            goto L23
        L3d:
            if (r9 == r4) goto L23
            goto L7f
        L40:
            if (r9 == r6) goto L44
            if (r9 != r7) goto L8b
        L44:
            int r0 = r0 + (-1)
            r11.A05 = r0
        L48:
            int r2 = r11.A05
            int r0 = r11.A04
            if (r2 >= r0) goto L87
            int r1 = r2 + 1
            int r9 = X.AbstractC9916Gl7.A02(r11, r8, r1, r2)
            if (r9 <= r5) goto L69
            if (r9 != r6) goto L5c
            r11.A0j()
            goto L48
        L5c:
            if (r9 != r7) goto L8b
            int r1 = r11.A00
            int r0 = X.AbstractC9988GnE.A04
            r1 = r1 & r0
            if (r1 == 0) goto L8b
            r11.A0k()
            goto L48
        L69:
            if (r9 == r5) goto L48
            r0 = 10
            if (r9 != r0) goto L73
            X.AbstractC9916Gl7.A07(r11, r1)
            goto L48
        L73:
            r0 = 13
            if (r9 != r0) goto L7b
            r11.A0i()
            goto L48
        L7b:
            r0 = 9
            if (r9 == r0) goto L48
        L7f:
            r11.A2C(r9)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L87:
            r11.A2A()
            r9 = -1
        L8b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0S(X.Gmy):int");
    }

    public static final int A0T(C9982Gmy c9982Gmy, int i) throws JsonParseException {
        int i2;
        char c;
        int i3 = i & 255;
        if (i3 > 127) {
            if ((i & 224) == 192) {
                i2 = i & 31;
                c = 1;
            } else if ((i & 240) == 224) {
                i2 = i & 15;
                c = 2;
            } else {
                if ((i & 248) != 240) {
                    c9982Gmy.A0o(i3);
                    throw F60.createAndThrow();
                }
                i2 = i & 7;
                c = 3;
            }
            int i4 = ((AbstractC9980Gmw) c9982Gmy).A05;
            int i5 = ((AbstractC9980Gmw) c9982Gmy).A04;
            if (i4 < i5) {
                byte[] bArr = c9982Gmy.A04;
                int i6 = i4 + 1;
                int iA02 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i6, i4);
                if ((iA02 & 192) == 128) {
                    i3 = (i2 << 6) | (iA02 & 63);
                    if (c > 1) {
                        if (i6 < i5) {
                            int i7 = i6 + 1;
                            iA02 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i7, i6);
                            if ((iA02 & 192) == 128) {
                                i3 = (i3 << 6) | (iA02 & 63);
                                if (c > 2) {
                                    if (i7 < i5) {
                                        iA02 = AbstractC9916Gl7.A01(c9982Gmy, bArr, i7);
                                        if ((iA02 & 192) == 128) {
                                            return (iA02 & 63) | (i3 << 6);
                                        }
                                    }
                                }
                            }
                        }
                        c9982Gmy.A2B();
                    }
                }
                c9982Gmy.A0p(iA02 & 255);
            } else {
                c9982Gmy.A2B();
            }
            throw F60.createAndThrow();
        }
        return i3;
    }

    private final int A0U(boolean z) throws JsonParseException {
        while (true) {
            int i = super.A05;
            if (i >= super.A04) {
                A2G(null, AbstractC9916Gl7.A06(this.A0F, " within/between "));
                break;
            }
            int i2 = i + 1;
            int iA02 = AbstractC9916Gl7.A02(this, this.A04, i2, i);
            if (iA02 > 32) {
                if (iA02 == 47) {
                    A0j();
                } else if (iA02 == 35 && (((AbstractC9916Gl7) this).A00 & AbstractC9988GnE.A04) != 0) {
                    A0k();
                } else {
                    if (z) {
                        return iA02;
                    }
                    if (iA02 != 58) {
                        A2D(iA02, "was expecting a colon to separate field name and value");
                        break;
                    }
                    z = true;
                }
            } else if (iA02 == 32) {
                continue;
            } else if (iA02 == 10) {
                AbstractC9916Gl7.A07(this, i2);
            } else if (iA02 == 13) {
                A0i();
            } else if (iA02 != 9) {
                A2C(iA02);
                break;
            }
        }
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.EnumC9834GiY A0V(int r4, boolean r5) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
            r0 = 73
            if (r4 != r0) goto L4c
            int r2 = r3.A05
            int r0 = r3.A04
            if (r2 < r0) goto L16
            X.GiY r1 = X.EnumC9834GiY.VALUE_NUMBER_FLOAT
            java.lang.String r0 = " in a Number value"
            r3.A2G(r1, r0)
        L11:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L16:
            byte[] r1 = r3.A04
            int r0 = r2 + 1
            r3.A05 = r0
            r4 = r1[r2]
            r0 = 78
            if (r4 != r0) goto L40
            if (r5 == 0) goto L3d
            java.lang.String r2 = "-INF"
        L26:
            r0 = 3
            r3.A10(r2, r0)
            int r1 = r3.A00
            int r0 = X.AbstractC9988GnE.A0A
            r1 = r1 & r0
            if (r1 == 0) goto L6c
            if (r5 == 0) goto L3a
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
        L35:
            X.GiY r0 = r3.A2P(r2, r0)
            return r0
        L3a:
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L35
        L3d:
            java.lang.String r2 = "+INF"
            goto L26
        L40:
            r0 = 110(0x6e, float:1.54E-43)
            if (r4 != r0) goto L4c
            if (r5 == 0) goto L49
            java.lang.String r2 = "-Infinity"
            goto L26
        L49:
            java.lang.String r2 = "+Infinity"
            goto L26
        L4c:
            X.Gnj r0 = X.EnumC10011Gnj.A02
            X.Gnk r0 = r0._mappedFeature
            int r1 = r3.A00
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r1, r0)
            if (r0 != 0) goto L64
            if (r5 != 0) goto L69
            r4 = 43
            java.lang.String r0 = "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow"
        L60:
            r3.A2J(r0, r4)
            goto L11
        L64:
            if (r5 != 0) goto L69
            java.lang.String r0 = "expected digit (0-9) for valid numeric value"
            goto L60
        L69:
            java.lang.String r0 = "expected digit (0-9) to follow minus sign, for valid numeric value"
            goto L60
        L6c:
            java.lang.String r1 = "Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            java.lang.String r0 = java.lang.String.format(r1, r0)
            com.fasterxml.jackson.core.JsonParseException r0 = X.AbstractC9916Gl7.A03(r3, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0V(int, boolean):X.GiY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r14 != 44) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (((X.AbstractC10020Gns) r13.A0F).A02 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (((X.AbstractC10020Gns) r13.A0F).A02 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if ((((X.AbstractC9916Gl7) r13).A00 & X.AbstractC9988GnE.A01) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        ((X.AbstractC9980Gmw) r13).A05--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        return X.EnumC9834GiY.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC9834GiY A0W(X.C9982Gmy r13, int r14) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0W(X.Gmy, int):X.GiY");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC9834GiY A0X(X.C9982Gmy r3, int r4) throws com.fasterxml.jackson.core.JsonParseException, com.fasterxml.jackson.core.exc.StreamConstraintsException {
        /*
            r0 = 34
            r1 = 1
            if (r4 != r0) goto Ld
            r3.A03 = r1
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
        L9:
            r3.A2F(r0)
            return r0
        Ld:
            r0 = 43
            r2 = 0
            if (r4 == r0) goto L36
            r0 = 91
            if (r4 == r0) goto L74
            r0 = 102(0x66, float:1.43E-43)
            if (r4 == r0) goto L6e
            r0 = 110(0x6e, float:1.54E-43)
            if (r4 == r0) goto L68
            r0 = 116(0x74, float:1.63E-43)
            if (r4 == r0) goto L62
            r0 = 123(0x7b, float:1.72E-43)
            if (r4 == r0) goto L58
            r0 = 45
            if (r4 == r0) goto L53
            r0 = 46
            if (r4 == r0) goto L4e
            switch(r4) {
                case 48: goto L49;
                case 49: goto L49;
                case 50: goto L49;
                case 51: goto L49;
                case 52: goto L49;
                case 53: goto L49;
                case 54: goto L49;
                case 55: goto L49;
                case 56: goto L49;
                case 57: goto L49;
                default: goto L31;
            }
        L31:
            X.GiY r0 = A0W(r3, r4)
            goto L9
        L36:
            X.Gnj r0 = X.EnumC10011Gnj.A02
            X.Gnk r0 = r0._mappedFeature
            int r1 = r3.A00
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r1, r0)
            if (r0 == 0) goto L31
            X.GiY r0 = A0a(r3, r2)
            goto L9
        L49:
            X.GiY r0 = A0Y(r3, r4)
            goto L9
        L4e:
            X.GiY r0 = A0Z(r3, r2)
            goto L9
        L53:
            X.GiY r0 = A0a(r3, r1)
            goto L9
        L58:
            int r1 = r3.A0A
            int r0 = r3.A09
            r3.A2Z(r1, r0)
            X.GiY r0 = X.EnumC9834GiY.START_OBJECT
            goto L9
        L62:
            A0x(r3)
            X.GiY r0 = X.EnumC9834GiY.VALUE_TRUE
            goto L9
        L68:
            A0w(r3)
            X.GiY r0 = X.EnumC9834GiY.VALUE_NULL
            goto L9
        L6e:
            A0v(r3)
            X.GiY r0 = X.EnumC9834GiY.VALUE_FALSE
            goto L9
        L74:
            int r1 = r3.A0A
            int r0 = r3.A09
            r3.A2Y(r1, r0)
            X.GiY r0 = X.EnumC9834GiY.START_ARRAY
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0X(X.Gmy, int):X.GiY");
    }

    public static final EnumC9834GiY A0Z(C9982Gmy c9982Gmy, boolean z) throws JsonParseException {
        int i;
        if (!AbstractC7609F5w.A1U(((AbstractC9916Gl7) c9982Gmy).A00, EnumC10011Gnj.A01._mappedFeature._mask)) {
            A0W(c9982Gmy, 46);
            throw F60.createAndThrow();
        }
        char[] cArrA0E = c9982Gmy.A0R.A0E();
        if (z) {
            cArrA0E[0] = '-';
            i = 1;
        } else {
            i = 0;
        }
        return c9982Gmy.A0b(cArrA0E, i, 46, 0, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r6 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.EnumC9834GiY A0b(char[] r10, int r11, int r12, int r13, boolean r14) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0b(char[], int, int, int, boolean):X.GiY");
    }

    private final String A0d(int i, int[] iArr, int i2) throws JsonParseException, StreamConstraintsException {
        int i3;
        int i4;
        int i5;
        int i6 = ((i << 2) - 4) + i2;
        ((AbstractC9927GlO) this).A02.A04(i6);
        if (i2 < 4) {
            int i7 = i - 1;
            i3 = iArr[i7];
            iArr[i7] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        Gn2 gn2 = this.A0R;
        char[] cArrA0E = gn2.A0E();
        int i8 = 0;
        int iA0K = 0;
        while (i8 < i6) {
            int i9 = iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3);
            int i10 = i9 & 255;
            int i11 = i8 + 1;
            if (i10 > 127) {
                if ((i9 & 224) == 192) {
                    i4 = i9 & 31;
                    i5 = 1;
                } else if ((i9 & 240) == 224) {
                    i4 = i9 & 15;
                    i5 = 2;
                } else {
                    if ((i9 & 248) != 240) {
                        A0o(i10);
                        throw F60.createAndThrow();
                    }
                    i4 = i9 & 7;
                    i5 = 3;
                }
                if (i11 + i5 > i6) {
                    A2G(EnumC9834GiY.FIELD_NAME, " in field name");
                } else {
                    int i12 = iArr[i11 >> 2] >> ((3 - (i11 & 3)) << 3);
                    i11 = i8 + 2;
                    if ((i12 & 192) != 128) {
                        A0p(i12);
                    } else {
                        i10 = (i4 << 6) | (i12 & 63);
                        if (i5 > 1) {
                            int i13 = iArr[i11 >> 2] >> ((3 - (i11 & 3)) << 3);
                            i11 = i8 + 3;
                            if ((i13 & 192) == 128) {
                                i10 = (i13 & 63) | (i10 << 6);
                                if (i5 > 2) {
                                    int i14 = iArr[i11 >> 2] >> ((3 - (i11 & 3)) << 3);
                                    i11 = i8 + 4;
                                    if ((i14 & 192) != 128) {
                                        i13 = i14 & 255;
                                    } else {
                                        int i15 = ((i10 << 6) | (i14 & 63)) - 65536;
                                        if (iA0K >= cArrA0E.length) {
                                            char[] cArr = gn2.A07;
                                            int length = cArr.length;
                                            int i16 = (length >> 1) + length;
                                            if (i16 > 65536) {
                                                i16 = (length >> 2) + length;
                                            }
                                            cArrA0E = Arrays.copyOf(cArr, i16);
                                            gn2.A07 = cArrA0E;
                                        }
                                        cArrA0E[iA0K] = (char) ((i15 >> 10) + 55296);
                                        i10 = (i15 & 1023) | 56320;
                                        iA0K++;
                                    }
                                }
                            }
                            A0p(i13);
                        }
                    }
                }
                throw F60.createAndThrow();
            }
            i8 = i11;
            if (iA0K >= cArrA0E.length) {
                char[] cArr2 = gn2.A07;
                int length2 = cArr2.length;
                int i17 = (length2 >> 1) + length2;
                if (i17 > 65536) {
                    i17 = (length2 >> 2) + length2;
                }
                cArrA0E = Arrays.copyOf(cArr2, i17);
                gn2.A07 = cArrA0E;
            }
            iA0K = AbstractC7607F5u.A0K(cArrA0E, iA0K, i10);
        }
        String str = new String(cArrA0E, 0, iA0K);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this.A06.A06(str, iArr, i);
    }

    public static final String A0e(C9982Gmy c9982Gmy) throws JsonParseException, StreamConstraintsException {
        int i = ((AbstractC9980Gmw) c9982Gmy).A05;
        if (i >= ((AbstractC9980Gmw) c9982Gmy).A04) {
            c9982Gmy.A2B();
            throw F60.createAndThrow();
        }
        Gn2 gn2 = c9982Gmy.A0R;
        char[] cArrA0E = gn2.A0E();
        int[] iArr = AbstractC9988GnE.A08;
        int iMin = Math.min(((AbstractC9980Gmw) c9982Gmy).A04, cArrA0E.length + i);
        byte[] bArr = c9982Gmy.A04;
        int iA0K = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i2 = bArr[i] & 255;
            if (iArr[i2] == 0) {
                i++;
                iA0K = AbstractC7607F5u.A0K(cArrA0E, iA0K, i2);
            } else if (i2 == 34) {
                ((AbstractC9980Gmw) c9982Gmy).A05 = i + 1;
                gn2.A00 = iA0K;
                if (gn2.A03 <= 0) {
                    gn2.A09(iA0K);
                    String str = iA0K == 0 ? "" : new String(gn2.A07, 0, iA0K);
                    gn2.A04 = str;
                    return str;
                }
            }
        }
        ((AbstractC9980Gmw) c9982Gmy).A05 = i;
        c9982Gmy.A13(cArrA0E, iA0K);
        return gn2.A07();
    }

    public static final String A0f(C9982Gmy c9982Gmy, int i) throws JsonParseException, StreamConstraintsException {
        int iA01;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6 = i;
        if (i6 == 34) {
            int i7 = ((AbstractC9980Gmw) c9982Gmy).A05;
            int i8 = i7 + 13;
            int i9 = ((AbstractC9980Gmw) c9982Gmy).A04;
            if (i8 <= i9) {
                byte[] bArr = c9982Gmy.A04;
                int[] iArr = AbstractC9988GnE.A07;
                int i10 = i7 + 1;
                ((AbstractC9980Gmw) c9982Gmy).A05 = i10;
                iA01 = bArr[i7] & 255;
                if (iArr[iA01] == 0) {
                    int i11 = i10 + 1;
                    int iA02 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i11, i10);
                    if (iArr[iA02] == 0) {
                        iA01 = (iA01 << 8) | iA02;
                        int i12 = i11 + 1;
                        iA02 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i12, i11);
                        if (iArr[iA02] == 0) {
                            iA01 = (iA01 << 8) | iA02;
                            int i13 = i12 + 1;
                            iA02 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i13, i12);
                            if (iArr[iA02] == 0) {
                                int i14 = (iA01 << 8) | iA02;
                                int i15 = i13 + 1;
                                int iA022 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i15, i13);
                                if (iArr[iA022] != 0) {
                                    if (iA022 != 34) {
                                        return c9982Gmy.A0h(c9982Gmy.A05, 0, i14, iA022, 4);
                                    }
                                    String strA03 = c9982Gmy.A06.A03(i14);
                                    if (strA03 != null) {
                                        return strA03;
                                    }
                                    int[] iArr2 = c9982Gmy.A05;
                                    iArr2[0] = i14;
                                    return c9982Gmy.A0d(1, iArr2, 4);
                                }
                                int i16 = i15 + 1;
                                int iA023 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i16, i15);
                                if (iArr[iA023] != 0) {
                                    i4 = 1;
                                } else {
                                    iA022 = (iA022 << 8) | iA023;
                                    int i17 = i16 + 1;
                                    iA023 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i17, i16);
                                    if (iArr[iA023] != 0) {
                                        i4 = 2;
                                    } else {
                                        iA022 = (iA022 << 8) | iA023;
                                        int i18 = i17 + 1;
                                        iA023 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i18, i17);
                                        if (iArr[iA023] == 0) {
                                            int i19 = (iA022 << 8) | iA023;
                                            int i20 = i18 + 1;
                                            int iA024 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i20, i18);
                                            if (iArr[iA024] != 0) {
                                                if (iA024 == 34) {
                                                    String strA04 = c9982Gmy.A06.A04(i14, i19);
                                                    return strA04 == null ? c9982Gmy.A0d(2, A14(c9982Gmy, i14, i19), 4) : strA04;
                                                }
                                                int[] iArr3 = c9982Gmy.A05;
                                                iArr3[0] = i14;
                                                return c9982Gmy.A0h(iArr3, 1, i19, iA024, 4);
                                            }
                                            int i21 = i20 + 1;
                                            int iA025 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i21, i20);
                                            if (iArr[iA025] == 0) {
                                                iA024 = (iA024 << 8) | iA025;
                                                int i22 = i21 + 1;
                                                int iA026 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i22, i21);
                                                if (iArr[iA026] == 0) {
                                                    iA024 = (iA024 << 8) | iA026;
                                                    int i23 = i22 + 1;
                                                    int iA027 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i23, i22);
                                                    if (iArr[iA027] == 0) {
                                                        int i24 = (iA024 << 8) | iA027;
                                                        int iA012 = AbstractC9916Gl7.A01(c9982Gmy, bArr, i23);
                                                        if (iArr[iA012] != 0) {
                                                            if (iA012 != 34) {
                                                                return c9982Gmy.A0h(A14(c9982Gmy, i14, i19), 2, i24, iA012, 4);
                                                            }
                                                            String strA05 = c9982Gmy.A06.A05(i14, i19, i24);
                                                            if (strA05 != null) {
                                                                return strA05;
                                                            }
                                                            int[] iArrA14 = A14(c9982Gmy, i14, i19);
                                                            iArrA14[2] = i24;
                                                            return c9982Gmy.A0d(3, iArrA14, 4);
                                                        }
                                                        int[] iArrA2c = c9982Gmy.A05;
                                                        iArrA2c[0] = i14;
                                                        iArrA2c[1] = i19;
                                                        iArrA2c[2] = i24;
                                                        int i25 = 3;
                                                        while (true) {
                                                            int i26 = ((AbstractC9980Gmw) c9982Gmy).A05;
                                                            if (i26 + 4 > ((AbstractC9980Gmw) c9982Gmy).A04) {
                                                                return c9982Gmy.A0h(iArrA2c, i25, 0, iA012, 0);
                                                            }
                                                            int i27 = i26 + 1;
                                                            int iA028 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i27, i26);
                                                            if (iArr[iA028] != 0) {
                                                                return iA028 == 34 ? c9982Gmy.A0g(iArrA2c, i25, iA012, 1) : c9982Gmy.A0h(iArrA2c, i25, iA012, iA028, 1);
                                                            }
                                                            int i28 = (iA012 << 8) | iA028;
                                                            int i29 = i27 + 1;
                                                            int iA029 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i29, i27);
                                                            if (iArr[iA029] != 0) {
                                                                return iA029 == 34 ? c9982Gmy.A0g(iArrA2c, i25, i28, 2) : c9982Gmy.A0h(iArrA2c, i25, i28, iA029, 2);
                                                            }
                                                            int i30 = (i28 << 8) | iA029;
                                                            int i31 = i29 + 1;
                                                            int iA0210 = AbstractC9916Gl7.A02(c9982Gmy, bArr, i31, i29);
                                                            if (iArr[iA0210] != 0) {
                                                                return iA0210 == 34 ? c9982Gmy.A0g(iArrA2c, i25, i30, 3) : c9982Gmy.A0h(iArrA2c, i25, i30, iA0210, 3);
                                                            }
                                                            int i32 = (i30 << 8) | iA0210;
                                                            iA012 = AbstractC9916Gl7.A01(c9982Gmy, bArr, i31);
                                                            if (iArr[iA012] != 0) {
                                                                return iA012 == 34 ? c9982Gmy.A0g(iArrA2c, i25, i32, 4) : c9982Gmy.A0h(iArrA2c, i25, i32, iA012, 4);
                                                            }
                                                            if (i25 >= iArrA2c.length) {
                                                                iArrA2c = c9982Gmy.A2c(iArrA2c, i25);
                                                                c9982Gmy.A05 = iArrA2c;
                                                            }
                                                            iArrA2c[i25] = i32;
                                                            i25++;
                                                        }
                                                    } else {
                                                        if (iA027 != 34) {
                                                            return c9982Gmy.A0h(A14(c9982Gmy, i14, i19), 2, iA024, iA027, 3);
                                                        }
                                                        i3 = 3;
                                                    }
                                                } else {
                                                    if (iA026 != 34) {
                                                        return c9982Gmy.A0h(A14(c9982Gmy, i14, i19), 2, iA024, iA026, 2);
                                                    }
                                                    i3 = 2;
                                                }
                                            } else {
                                                if (iA025 != 34) {
                                                    int[] iArr4 = c9982Gmy.A05;
                                                    iArr4[0] = i14;
                                                    iArr4[1] = i19;
                                                    return c9982Gmy.A0h(iArr4, 2, iA024, iA025, 1);
                                                }
                                                i3 = 1;
                                            }
                                            int i33 = (-1) << (i3 << 3);
                                            int i34 = iA024 | i33;
                                            String strA052 = c9982Gmy.A06.A05(i14, i19, i34);
                                            if (strA052 != null) {
                                                return strA052;
                                            }
                                            int[] iArrA142 = A14(c9982Gmy, i14, i19);
                                            iArrA142[2] = i34 | i33;
                                            return c9982Gmy.A0d(3, iArrA142, i3);
                                        }
                                        i4 = 3;
                                    }
                                }
                                if (iA023 == 34) {
                                    int i35 = iA022 | ((-1) << (i4 << 3));
                                    String strA042 = c9982Gmy.A06.A04(i14, i35);
                                    return strA042 == null ? c9982Gmy.A0d(2, A14(c9982Gmy, i14, i35), i4) : strA042;
                                }
                                int[] iArr5 = c9982Gmy.A05;
                                iArr5[0] = i14;
                                return c9982Gmy.A0h(iArr5, 1, iA022, iA023, i4);
                            }
                            i2 = 3;
                        } else {
                            i2 = 2;
                        }
                    } else {
                        i2 = 1;
                    }
                    if (iA02 != 34) {
                        return c9982Gmy.A0h(c9982Gmy.A05, 0, iA01, iA02, i2);
                    }
                    int i36 = iA01 | ((-1) << (i2 << 3));
                    String strA032 = c9982Gmy.A06.A03(i36);
                    if (strA032 != null) {
                        return strA032;
                    }
                    int[] iArr6 = c9982Gmy.A05;
                    iArr6[0] = i36;
                    return c9982Gmy.A0d(1, iArr6, i2);
                }
            } else if (i7 >= i9) {
                str = ": was expecting closing '\"' for name";
            } else {
                iA01 = AbstractC9916Gl7.A01(c9982Gmy, c9982Gmy.A04, i7);
            }
            return iA01 != 34 ? c9982Gmy.A0h(c9982Gmy.A05, 0, 0, iA01, 0) : "";
        }
        if (i6 != 39 || (((AbstractC9916Gl7) c9982Gmy).A00 & AbstractC9988GnE.A02) == 0) {
            if ((((AbstractC9916Gl7) c9982Gmy).A00 & AbstractC9988GnE.A03) != 0) {
                int[] iArr7 = AbstractC10006Gne.A06;
                if (iArr7[i] == 0) {
                    int[] iArrA2c2 = c9982Gmy.A05;
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 0;
                    loop1: while (true) {
                        i37++;
                        i6 |= i39 << 8;
                        while (true) {
                            i39 = i6;
                            int i40 = ((AbstractC9980Gmw) c9982Gmy).A05;
                            if (i40 >= ((AbstractC9980Gmw) c9982Gmy).A04) {
                                break loop1;
                            }
                            i6 = c9982Gmy.A04[i40] & 255;
                            if (iArr7[i6] != 0) {
                                if (i37 > 0) {
                                    int length = iArrA2c2.length;
                                    if (i38 >= length) {
                                        iArrA2c2 = c9982Gmy.A2c(iArrA2c2, length);
                                        c9982Gmy.A05 = iArrA2c2;
                                    }
                                    iArrA2c2[i38] = i39;
                                    i38++;
                                }
                                String strA07 = c9982Gmy.A06.A07(iArrA2c2, i38);
                                return strA07 == null ? c9982Gmy.A0d(i38, iArrA2c2, i37) : strA07;
                            }
                            ((AbstractC9980Gmw) c9982Gmy).A05 = i40 + 1;
                            if (i37 >= 4) {
                                iArrA2c2 = A15(c9982Gmy, iArrA2c2, i38);
                                iArrA2c2[i38] = i39;
                                i38++;
                                i37 = 1;
                            }
                        }
                    }
                } else {
                    c9982Gmy.A2D(i6, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                }
            } else {
                c9982Gmy.A2D((char) A0T(c9982Gmy, i6), "was expecting double-quote to start field name");
            }
            throw F60.createAndThrow();
        }
        int i41 = ((AbstractC9980Gmw) c9982Gmy).A05;
        if (i41 < ((AbstractC9980Gmw) c9982Gmy).A04) {
            byte[] bArr2 = c9982Gmy.A04;
            int iA013 = AbstractC9916Gl7.A01(c9982Gmy, bArr2, i41);
            if (iA013 == 39) {
                return "";
            }
            int[] iArrA2c3 = c9982Gmy.A05;
            int[] iArr8 = AbstractC9988GnE.A07;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            while (iA013 != 39) {
                if (iArr8[iA013] != 0 && iA013 != 34) {
                    if (iA013 != 92) {
                        c9982Gmy.A2a(iA013, "name");
                    } else {
                        iA013 = c9982Gmy.A2K();
                    }
                    if (iA013 > 127) {
                        if (i42 >= 4) {
                            iArrA2c3 = A15(c9982Gmy, iArrA2c3, i43);
                            iArrA2c3[i43] = i44;
                            i43++;
                            i42 = 0;
                            i44 = 0;
                        }
                        int i45 = i44 << 8;
                        if (iA013 < 2048) {
                            i5 = (iA013 >> 6) | 192;
                        } else {
                            int i46 = i45 | (iA013 >> 12) | 224;
                            i42++;
                            if (i42 >= 4) {
                                iArrA2c3 = A15(c9982Gmy, iArrA2c3, i43);
                                iArrA2c3[i43] = i46;
                                i43++;
                                i42 = 0;
                                i46 = 0;
                            }
                            i45 = i46 << 8;
                            i5 = ((iA013 >> 6) & 63) | 128;
                        }
                        i44 = i45 | i5;
                        i42++;
                        iA013 = (iA013 & 63) | 128;
                    }
                }
                if (i42 < 4) {
                    i42++;
                    iA013 |= i44 << 8;
                } else {
                    iArrA2c3 = A15(c9982Gmy, iArrA2c3, i43);
                    iArrA2c3[i43] = i44;
                    i43++;
                    i42 = 1;
                }
                i44 = iA013;
                int i47 = ((AbstractC9980Gmw) c9982Gmy).A05;
                if (i47 < ((AbstractC9980Gmw) c9982Gmy).A04) {
                    iA013 = AbstractC9916Gl7.A01(c9982Gmy, bArr2, i47);
                }
            }
            if (i42 > 0) {
                int length2 = iArrA2c3.length;
                if (i43 >= length2) {
                    iArrA2c3 = c9982Gmy.A2c(iArrA2c3, length2);
                    c9982Gmy.A05 = iArrA2c3;
                }
                int i48 = i43 + 1;
                if (i42 != 4) {
                    i44 |= (-1) << (i42 << 3);
                }
                iArrA2c3[i43] = i44;
                i43 = i48;
            }
            String strA072 = c9982Gmy.A06.A07(iArrA2c3, i43);
            return strA072 == null ? c9982Gmy.A0d(i43, iArrA2c3, i42) : strA072;
        }
        str = ": was expecting closing ''' for field name";
        str = " in field name";
        c9982Gmy.A2G(EnumC9834GiY.FIELD_NAME, str);
        throw F60.createAndThrow();
    }

    private final String A0h(int[] iArr, int i, int i2, int i3, int i4) throws JsonParseException, StreamConstraintsException {
        int i5;
        int[] iArr2 = AbstractC9988GnE.A07;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    if (i4 > 0) {
                        iArr = A15(this, iArr, i);
                        int i6 = i + 1;
                        if (i4 != 4) {
                            i2 |= (-1) << (i4 << 3);
                        }
                        iArr[i] = i2;
                        i = i6;
                    }
                    String strA07 = this.A06.A07(iArr, i);
                    return strA07 == null ? A0d(i, iArr, i4) : strA07;
                }
                if (i3 != 92) {
                    A2a(i3, "name");
                } else {
                    i3 = A2K();
                }
                if (i3 > 127) {
                    int i7 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = A2c(iArr, iArr.length);
                            this.A05 = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    int i8 = i2 << 8;
                    if (i3 < 2048) {
                        i5 = (i3 >> 6) | 192;
                    } else {
                        int i9 = i8 | (i3 >> 12) | 224;
                        i4++;
                        if (i4 >= 4) {
                            iArr = A15(this, iArr, i);
                            iArr[i] = i9;
                            i++;
                            i4 = 0;
                        } else {
                            i7 = i9;
                        }
                        i8 = i7 << 8;
                        i5 = ((i3 >> 6) & 63) | 128;
                    }
                    i2 = i8 | i5;
                    i4++;
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                iArr = A15(this, iArr, i);
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            int i10 = super.A05;
            if (i10 >= super.A04) {
                A2G(EnumC9834GiY.FIELD_NAME, " in field name");
                throw F60.createAndThrow();
            }
            i3 = AbstractC9916Gl7.A01(this, this.A04, i10);
        }
    }

    private final void A0i() {
        int i = super.A05;
        if (i < super.A04 && this.A04[i] == 10) {
            i++;
            super.A05 = i;
        }
        AbstractC9916Gl7.A07(this, i);
    }

    private final void A0j() throws JsonParseException {
        if ((((AbstractC9916Gl7) this).A00 & AbstractC9988GnE.A09) == 0) {
            A2D(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        } else {
            int i = super.A05;
            if (i >= super.A04) {
                A2G(null, " in a comment");
            } else {
                byte[] bArr = this.A04;
                int iA01 = AbstractC9916Gl7.A01(this, bArr, i);
                if (iA01 == 47) {
                    A0k();
                    return;
                }
                if (iA01 == 42) {
                    int[] iArr = AbstractC10006Gne.A03;
                    while (true) {
                        int i2 = super.A05;
                        int i3 = super.A04;
                        if (i2 >= i3) {
                            break;
                        }
                        int i4 = i2 + 1;
                        int iA02 = AbstractC9916Gl7.A02(this, bArr, i4, i2);
                        int i5 = iArr[iA02];
                        if (i5 != 0) {
                            if (i5 == 2) {
                                A0l();
                            } else if (i5 == 3) {
                                A0m();
                            } else if (i5 == 4) {
                                A0n();
                            } else if (i5 == 10) {
                                AbstractC9916Gl7.A07(this, i4);
                            } else if (i5 == 13) {
                                A0i();
                            } else if (i5 == 42) {
                                if (i4 >= i3) {
                                    break;
                                } else if (bArr[i4] == 47) {
                                    super.A05 = i4 + 1;
                                    return;
                                }
                            } else if (iA02 < 32) {
                                A2C(iA02);
                            } else {
                                A0o(iA02);
                            }
                        }
                    }
                } else {
                    A2D(iA01, "was expecting either '*' or '/' for a comment");
                }
            }
        }
        throw F60.createAndThrow();
    }

    private final void A0k() throws JsonParseException {
        int[] iArr = AbstractC10006Gne.A03;
        while (true) {
            int i = super.A05;
            if (i >= super.A04) {
                return;
            }
            int i2 = i + 1;
            int iA02 = AbstractC9916Gl7.A02(this, this.A04, i2, i);
            int i3 = iArr[iA02];
            if (i3 != 0) {
                if (i3 == 2) {
                    A0l();
                } else if (i3 == 3) {
                    A0m();
                } else if (i3 == 4) {
                    A0n();
                } else {
                    if (i3 == 10) {
                        AbstractC9916Gl7.A07(this, i2);
                        return;
                    }
                    if (i3 == 13) {
                        A0i();
                        return;
                    } else if (i3 != 42 && i3 < 0) {
                        if (iA02 < 32) {
                            A2C(iA02);
                        } else {
                            A0o(iA02);
                        }
                        throw F60.createAndThrow();
                    }
                }
            }
        }
    }

    private final void A0l() throws JsonParseException {
        int i = super.A05;
        if (i >= super.A04) {
            A2B();
        } else {
            byte[] bArr = this.A04;
            int i2 = i + 1;
            super.A05 = i2;
            byte b = bArr[i];
            if ((b & 192) == 128) {
                return;
            } else {
                A0r(b & 255, i2);
            }
        }
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0m() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r6 = this;
            int r0 = r6.A05
            int r2 = r6.A04
            if (r0 >= r2) goto L30
            byte[] r5 = r6.A04
            int r4 = r0 + 1
            r6.A05 = r4
            r1 = r5[r0]
            r0 = r1 & 192(0xc0, float:2.69E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r0 == r3) goto L1e
            r0 = r1 & 255(0xff, float:3.57E-43)
            r6.A0r(r0, r4)
        L19:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1e:
            if (r4 >= r2) goto L30
            int r2 = r4 + 1
            r6.A05 = r2
            r1 = r5[r4]
            r0 = r1 & 192(0xc0, float:2.69E-43)
            if (r0 == r3) goto L34
            r0 = r1 & 255(0xff, float:3.57E-43)
            r6.A0r(r0, r2)
            goto L19
        L30:
            r6.A2B()
            goto L19
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0m():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0n() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r8 = this;
            int r0 = r8.A05
            int r7 = r8.A04
            if (r0 >= r7) goto L3e
            byte[] r6 = r8.A04
            int r5 = r0 + 1
            r8.A05 = r5
            r1 = r6[r0]
            r0 = r1 & 192(0xc0, float:2.69E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r0 == r4) goto L1e
            r0 = r1 & 255(0xff, float:3.57E-43)
            r8.A0r(r0, r5)
        L19:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1e:
            if (r5 >= r7) goto L3e
            int r3 = r5 + 1
            r8.A05 = r3
            r2 = r3
            r1 = r6[r5]
            r0 = r1 & 192(0xc0, float:2.69E-43)
            if (r0 != r4) goto L38
            if (r3 >= r7) goto L3e
            int r3 = r3 + 1
            r8.A05 = r3
            r1 = r6[r2]
            r0 = r1 & 192(0xc0, float:2.69E-43)
            if (r0 != r4) goto L38
            return
        L38:
            r0 = r1 & 255(0xff, float:3.57E-43)
            r8.A0r(r0, r3)
            goto L19
        L3e:
            r8.A2B()
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A0n():void");
    }

    private final void A0o(int i) throws JsonParseException {
        throw AbstractC9916Gl7.A03(this, FGI.A0M("Invalid UTF-8 start byte 0x", Integer.toHexString(i)));
    }

    private final void A0p(int i) throws JsonParseException {
        throw AbstractC9916Gl7.A03(this, FGI.A0M("Invalid UTF-8 middle byte 0x", Integer.toHexString(i)));
    }

    private final void A0q(int i) throws JsonParseException {
        int i2 = super.A05 + 1;
        super.A05 = i2;
        if (i != 9) {
            if (i == 10) {
                AbstractC9916Gl7.A07(this, i2);
            } else if (i == 13) {
                super.A05 = i2 - 1;
            } else if (i != 32) {
                A2D(i, "Expected space separating root-level values");
                throw F60.createAndThrow();
            }
        }
    }

    private final void A0r(int i, int i2) throws JsonParseException {
        super.A05 = i2;
        A0p(i);
        throw F60.createAndThrow();
    }

    public static final void A0u(C9982Gmy c9982Gmy) {
        int i = ((AbstractC9980Gmw) c9982Gmy).A05;
        if (i >= ((AbstractC9980Gmw) c9982Gmy).A04) {
            c9982Gmy.A2B();
            throw F60.createAndThrow();
        }
        Gn2 gn2 = c9982Gmy.A0R;
        char[] cArrA0E = gn2.A0E();
        int[] iArr = AbstractC9988GnE.A08;
        int iMin = Math.min(((AbstractC9980Gmw) c9982Gmy).A04, cArrA0E.length + i);
        byte[] bArr = c9982Gmy.A04;
        int iA0K = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i2 = bArr[i] & 255;
            if (iArr[i2] == 0) {
                i++;
                iA0K = AbstractC7607F5u.A0K(cArrA0E, iA0K, i2);
            } else if (i2 == 34) {
                ((AbstractC9980Gmw) c9982Gmy).A05 = i + 1;
                gn2.A00 = iA0K;
                return;
            }
        }
        ((AbstractC9980Gmw) c9982Gmy).A05 = i;
        c9982Gmy.A13(cArrA0E, iA0K);
    }

    public static final void A0v(C9982Gmy c9982Gmy) throws JsonParseException {
        int i;
        int i2 = ((AbstractC9980Gmw) c9982Gmy).A05;
        int i3 = i2 + 4;
        if (i3 < ((AbstractC9980Gmw) c9982Gmy).A04) {
            byte[] bArr = c9982Gmy.A04;
            int i4 = i2 + 1;
            if (bArr[i2] == 97) {
                int i5 = i2 + 2;
                if (bArr[i4] == 108) {
                    int i6 = i2 + 3;
                    if (bArr[i5] == 115 && bArr[i6] == 101 && ((i = bArr[i3] & 255) < 48 || (i | 32) == 125)) {
                        ((AbstractC9980Gmw) c9982Gmy).A05 = i3;
                        return;
                    }
                }
            }
        }
        c9982Gmy.A11("false", 1);
    }

    public static final void A0w(C9982Gmy c9982Gmy) throws JsonParseException {
        int i;
        int i2 = ((AbstractC9980Gmw) c9982Gmy).A05;
        int i3 = i2 + 3;
        if (i3 < ((AbstractC9980Gmw) c9982Gmy).A04) {
            byte[] bArr = c9982Gmy.A04;
            int i4 = i2 + 1;
            if (bArr[i2] == 117) {
                int i5 = i2 + 2;
                if (bArr[i4] == 108 && bArr[i5] == 108 && ((i = bArr[i3] & 255) < 48 || (i | 32) == 125)) {
                    ((AbstractC9980Gmw) c9982Gmy).A05 = i3;
                    return;
                }
            }
        }
        c9982Gmy.A11(HatchCcvLoggingKt.NO_POSTAL_FIELD, 1);
    }

    public static final void A0x(C9982Gmy c9982Gmy) throws JsonParseException {
        int i;
        int i2 = ((AbstractC9980Gmw) c9982Gmy).A05;
        int i3 = i2 + 3;
        if (i3 < ((AbstractC9980Gmw) c9982Gmy).A04) {
            byte[] bArr = c9982Gmy.A04;
            int i4 = i2 + 1;
            if (bArr[i2] == 114) {
                int i5 = i2 + 2;
                if (bArr[i4] == 117 && bArr[i5] == 101 && ((i = bArr[i3] & 255) < 48 || (i | 32) == 125)) {
                    ((AbstractC9980Gmw) c9982Gmy).A05 = i3;
                    return;
                }
            }
        }
        c9982Gmy.A11("true", 1);
    }

    public static final void A0z(C9982Gmy c9982Gmy) {
        c9982Gmy.A0A = ((AbstractC9980Gmw) c9982Gmy).A02;
        int i = ((AbstractC9980Gmw) c9982Gmy).A05;
        c9982Gmy.A0D = c9982Gmy.A0B + i;
        c9982Gmy.A09 = i - ((AbstractC9980Gmw) c9982Gmy).A03;
    }

    private final void A13(char[] cArr, int i) throws JsonParseException {
        int[] iArr = AbstractC9988GnE.A08;
        byte[] bArr = this.A04;
        while (true) {
            int i2 = super.A05;
            if (i2 < super.A04) {
                int i3 = 0;
                if (i >= cArr.length) {
                    cArr = this.A0R.A0F();
                    i = 0;
                }
                int i4 = super.A04;
                int length = cArr.length;
                int i5 = (length - i) + i2;
                if (i5 < 0) {
                    i5 = Integer.MAX_VALUE;
                }
                int iMin = Math.min(i4, i5);
                while (true) {
                    if (i2 >= iMin) {
                        super.A05 = i2;
                        break;
                    }
                    int i6 = i2 + 1;
                    int iA2K = bArr[i2] & 255;
                    int i7 = iArr[iA2K];
                    if (i7 != 0) {
                        super.A05 = i6;
                        if (iA2K == 34) {
                            this.A0R.A00 = i;
                            return;
                        }
                        if (i7 == 1) {
                            iA2K = A2K();
                        } else if (i7 == 2) {
                            iA2K = A0M(iA2K);
                        } else if (i7 == 3) {
                            iA2K = i4 - i6 >= 2 ? A0O(iA2K) : A0N(iA2K);
                        } else if (i7 == 4) {
                            int iA0P = A0P(iA2K);
                            int i8 = i + 1;
                            cArr[i] = (char) ((iA0P >> 10) | 55296);
                            if (i8 >= length) {
                                cArr = this.A0R.A0F();
                                i = 0;
                            } else {
                                i = i8;
                            }
                            iA2K = (iA0P & 1023) | 56320;
                        } else {
                            if (iA2K >= 32) {
                                A0o(iA2K);
                                break;
                            }
                            A2a(iA2K, "string value");
                        }
                        if (i >= cArr.length) {
                            cArr = this.A0R.A0F();
                        } else {
                            i3 = i;
                        }
                        i = AbstractC7607F5u.A0K(cArr, i3, iA2K);
                    } else {
                        i = AbstractC7607F5u.A0K(cArr, i, iA2K);
                        i2 = i6;
                    }
                }
            } else {
                A2B();
                break;
            }
        }
        throw F60.createAndThrow();
    }

    public static int[] A14(C9982Gmy c9982Gmy, int i, int i2) {
        int[] iArr = c9982Gmy.A05;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    @Override // X.AbstractC9916Gl7
    public final int A26() throws InputCoercionException {
        EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) this).A00;
        if (enumC9834GiY != EnumC9834GiY.VALUE_NUMBER_INT && enumC9834GiY != EnumC9834GiY.VALUE_NUMBER_FLOAT) {
            return super.A28(0);
        }
        int i = this.A07;
        if ((i & 1) == 0) {
            if (i == 0) {
                return A2L();
            }
            A2V();
        }
        return this.A08;
    }

    @Override // X.AbstractC9916Gl7
    public final String A27() {
        EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) this).A00;
        if (enumC9834GiY != EnumC9834GiY.VALUE_STRING) {
            return enumC9834GiY == EnumC9834GiY.FIELD_NAME ? A1a() : super.A29(null);
        }
        if (!this.A03) {
            return this.A0R.A07();
        }
        this.A03 = false;
        return A0e(this);
    }

    @Override // X.AbstractC9927GlO
    public final int A28(int i) throws InputCoercionException {
        EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) this).A00;
        if (enumC9834GiY != EnumC9834GiY.VALUE_NUMBER_INT && enumC9834GiY != EnumC9834GiY.VALUE_NUMBER_FLOAT) {
            return super.A28(i);
        }
        int i2 = this.A07;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return A2L();
            }
            A2V();
        }
        return this.A08;
    }

    @Override // X.AbstractC9927GlO
    public final String A29(String str) {
        EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) this).A00;
        if (enumC9834GiY != EnumC9834GiY.VALUE_STRING) {
            return enumC9834GiY == EnumC9834GiY.FIELD_NAME ? A1a() : super.A29(str);
        }
        if (!this.A03) {
            return this.A0R.A07();
        }
        this.A03 = false;
        return A0e(this);
    }

    public C9982Gmy(AbstractC9794GhC abstractC9794GhC, C9984Gn6 c9984Gn6, Gn5 gn5, byte[] bArr, int i, int i2, int i3, int i4) {
        super(c9984Gn6, i);
        ((AbstractC9988GnE) this).A00 = abstractC9794GhC;
        this.A05 = new int[16];
        this.A06 = gn5;
        this.A04 = bArr;
        super.A05 = i2;
        super.A04 = i3;
        ((AbstractC9980Gmw) this).A03 = i2 - i4;
        this.A0B = (-i2) + i4;
    }

    private final String A0g(int[] iArr, int i, int i2, int i3) throws StreamConstraintsException {
        int[] iArrA15 = A15(this, iArr, i);
        int i4 = i + 1;
        if (i3 != 4) {
            i2 |= (-1) << (i3 << 3);
        }
        iArrA15[i] = i2;
        String strA07 = this.A06.A07(iArrA15, i4);
        return strA07 == null ? A0d(i4, iArrA15, i3) : strA07;
    }

    public static final void A0s(C9982Gmy c9982Gmy) throws JsonParseException {
        A0z(c9982Gmy);
        C10019Gnr c10019Gnr = c9982Gmy.A0F;
        if (((AbstractC10020Gns) c10019Gnr).A02 != 1) {
            c9982Gmy.A2X(93, '}');
            throw F60.createAndThrow();
        }
        c10019Gnr.A04 = null;
        c9982Gmy.A0F = c10019Gnr.A06;
    }

    public static final void A0t(C9982Gmy c9982Gmy) throws JsonParseException {
        A0z(c9982Gmy);
        C10019Gnr c10019Gnr = c9982Gmy.A0F;
        if (((AbstractC10020Gns) c10019Gnr).A02 != 2) {
            c9982Gmy.A2X(125, ']');
            throw F60.createAndThrow();
        }
        c10019Gnr.A04 = null;
        c9982Gmy.A0F = c10019Gnr.A06;
    }

    private final void A10(String str, int i) throws JsonParseException {
        int length = str.length();
        int i2 = super.A05;
        if (i2 + length >= super.A04) {
            A11(str, i);
            return;
        }
        while (true) {
            byte[] bArr = this.A04;
            if (bArr[i2] != str.charAt(i)) {
                break;
            }
            i2 = super.A05 + 1;
            super.A05 = i2;
            i++;
            if (i >= length) {
                int i3 = bArr[i2] & 255;
                if (i3 < 48 || i3 == 93 || i3 == 125 || !Character.isJavaIdentifierPart((char) A0T(this, i3))) {
                    return;
                }
            }
        }
        A12(BV4.A0j(str, i), A2S());
        throw F60.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        A12(X.BV4.A0j(r5, r6), A2S());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        throw X.F60.createAndThrow();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A11(java.lang.String r5, int r6) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r4 = this;
            int r3 = r5.length()
        L4:
            int r1 = r4.A05
            int r0 = r4.A04
            if (r1 >= r0) goto L3d
            byte[] r2 = r4.A04
            r1 = r2[r1]
            char r0 = r5.charAt(r6)
            if (r1 != r0) goto L3d
            int r0 = r4.A05
            int r1 = r0 + 1
            r4.A05 = r1
            int r6 = r6 + 1
            if (r6 < r3) goto L4
            int r0 = r4.A04
            if (r1 >= r0) goto L4d
            r0 = r2[r1]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 48
            if (r1 < r0) goto L4d
            r0 = 93
            if (r1 == r0) goto L4d
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L4d
            int r0 = A0T(r4, r1)
            char r0 = (char) r0
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r0)
            if (r0 == 0) goto L4d
        L3d:
            java.lang.String r1 = X.BV4.A0j(r5, r6)
            java.lang.String r0 = r4.A2S()
            r4.A12(r1, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9982Gmy.A11(java.lang.String, int):void");
    }

    private final void A12(String str, String str2) throws JsonParseException {
        StringBuilder sbA0x = C60O.A0x(str);
        while (true) {
            int i = super.A05;
            if (i >= super.A04) {
                break;
            }
            byte[] bArr = this.A04;
            super.A05 = i + 1;
            char cA0T = (char) A0T(this, bArr[i]);
            if (!Character.isJavaIdentifierPart(cA0T)) {
                break;
            }
            sbA0x.append(cA0T);
            if (sbA0x.length() >= this.A0Q.A08._maxErrorTokenLength) {
                sbA0x.append("...");
                break;
            }
        }
        throw AbstractC9916Gl7.A03(this, String.format("Unrecognized token '%s': was expecting %s", sbA0x, str2));
    }

    @Override // X.AbstractC9980Gmw
    public final void A2U() {
        super.A2U();
        Gn5 gn5 = this.A06;
        Gn5 gn52 = gn5.A0B;
        if (gn52 == null || !(!gn5.A07)) {
            return;
        }
        C10047GoR c10047GoR = new C10047GoR(gn5);
        int i = c10047GoR.A00;
        AtomicReference<C10047GoR> atomicReference = gn52.A0C;
        C10047GoR c10047GoR2 = atomicReference.get();
        if (i != c10047GoR2.A00) {
            if (i > 6000) {
                c10047GoR = new C10047GoR(new int[512], new String[128]);
            }
            Bs8.A00(c10047GoR2, c10047GoR, atomicReference);
        }
        gn5.A07 = true;
    }
}
