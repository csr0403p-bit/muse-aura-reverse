package X;

import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class EY1 implements Closeable {
    public int A04;
    public long A07;
    public int[] A09;
    public String A0A;
    public int[] A0B;
    public String[] A0C;
    public final Reader A0E;
    public Integer A08 = C79.A01;
    public final char[] A0D = new char[1024];
    public int A05 = 0;
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A06 = 1;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        A0E();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String A0A() throws com.google.gson.stream.MalformedJsonException {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
        L2:
            r4 = 0
        L3:
            int r6 = r7.A05
            int r5 = r6 + r4
            int r0 = r7.A00
            char[] r3 = r7.A0D
            if (r5 >= r0) goto L4a
            int r6 = r6 + r4
            char r5 = r3[r6]
            r0 = 9
            if (r5 == r0) goto L76
            r0 = 10
            if (r5 == r0) goto L76
            r0 = 12
            if (r5 == r0) goto L76
            r0 = 13
            if (r5 == r0) goto L76
            r0 = 32
            if (r5 == r0) goto L76
            r0 = 35
            if (r5 == r0) goto L73
            r0 = 44
            if (r5 == r0) goto L76
            r0 = 47
            if (r5 == r0) goto L73
            r0 = 61
            if (r5 == r0) goto L73
            r0 = 123(0x7b, float:1.72E-43)
            if (r5 == r0) goto L76
            r0 = 125(0x7d, float:1.75E-43)
            if (r5 == r0) goto L76
            r0 = 58
            if (r5 == r0) goto L76
            r0 = 59
            if (r5 == r0) goto L73
            switch(r5) {
                case 91: goto L76;
                case 92: goto L73;
                case 93: goto L76;
                default: goto L47;
            }
        L47:
            int r4 = r4 + 1
            goto L3
        L4a:
            r0 = 1024(0x400, float:1.435E-42)
            if (r4 >= r0) goto L57
            int r0 = r4 + 1
            boolean r0 = r7.A0M(r0)
            if (r0 == 0) goto L76
            goto L3
        L57:
            if (r1 != 0) goto L63
            r0 = 16
            int r0 = java.lang.Math.max(r4, r0)
            java.lang.StringBuilder r1 = X.BV4.A0p(r0)
        L63:
            r1.append(r3, r6, r4)
            int r0 = r7.A05
            int r0 = r0 + r4
            r7.A05 = r0
            r0 = 1
            boolean r0 = r7.A0M(r0)
            if (r0 != 0) goto L2
            goto L77
        L73:
            r7.A0E()
        L76:
            r2 = r4
        L77:
            int r0 = r7.A05
            if (r1 != 0) goto L86
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3, r0, r2)
        L80:
            int r0 = r7.A05
            int r0 = r0 + r2
            r7.A05 = r0
            return r1
        L86:
            r1.append(r3, r0, r2)
            java.lang.String r1 = r1.toString()
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EY1.A0A():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        A0E();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0F() throws com.google.gson.stream.MalformedJsonException {
        /*
            r4 = this;
        L0:
            r3 = 0
        L1:
            int r2 = r4.A05
            int r1 = r2 + r3
            int r0 = r4.A00
            if (r1 >= r0) goto L48
            char[] r0 = r4.A0D
            int r2 = r2 + r3
            char r1 = r0[r2]
            r0 = 9
            if (r1 == r0) goto L55
            r0 = 10
            if (r1 == r0) goto L55
            r0 = 12
            if (r1 == r0) goto L55
            r0 = 13
            if (r1 == r0) goto L55
            r0 = 32
            if (r1 == r0) goto L55
            r0 = 35
            if (r1 == r0) goto L52
            r0 = 44
            if (r1 == r0) goto L55
            r0 = 47
            if (r1 == r0) goto L52
            r0 = 61
            if (r1 == r0) goto L52
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L55
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L55
            r0 = 58
            if (r1 == r0) goto L55
            r0 = 59
            if (r1 == r0) goto L52
            switch(r1) {
                case 91: goto L55;
                case 92: goto L52;
                case 93: goto L55;
                default: goto L45;
            }
        L45:
            int r3 = r3 + 1
            goto L1
        L48:
            r4.A05 = r1
            r0 = 1
            boolean r0 = r4.A0M(r0)
            if (r0 != 0) goto L0
            return
        L52:
            r4.A0E()
        L55:
            int r0 = r4.A05
            int r0 = r0 + r3
            r4.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EY1.A0F():void");
    }

    public static void A0J(EY1 ey1) {
        ey1.A03 = 0;
        int[] iArr = ey1.A09;
        int i = ey1.A06 - 1;
        iArr[i] = iArr[i] + 1;
    }

    private char A04() throws MalformedJsonException {
        String strConcat;
        int i;
        if (this.A05 != this.A00 || A0M(1)) {
            char[] cArr = this.A0D;
            int i2 = this.A05;
            int i3 = i2 + 1;
            this.A05 = i3;
            char c = cArr[i2];
            if (c == '\n') {
                this.A01++;
                this.A02 = i3;
                return c;
            }
            if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
                return c;
            }
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c == 'u') {
                if (i2 + 5 <= this.A00 || A0M(4)) {
                    int i4 = this.A05;
                    int i5 = i4 + 4;
                    int i6 = 0;
                    while (i4 < i5) {
                        char c2 = cArr[i4];
                        int i7 = i6 << 4;
                        if (c2 >= '0') {
                            if (c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a') {
                                if (c2 <= 'f') {
                                    i = c2 - 'W';
                                }
                            } else if (c2 >= 'A' && c2 <= 'F') {
                                i = c2 - '7';
                            }
                            i6 = i7 + i;
                            i4++;
                        }
                        strConcat = "Malformed Unicode escape \\u".concat(new String(cArr, i4, 4));
                    }
                    this.A05 = i5;
                    return (char) i6;
                }
                A0K("Unterminated escape sequence");
            } else {
                strConcat = "Invalid escape sequence";
            }
            A0K(strConcat);
        } else {
            A0K("Unterminated escape sequence");
        }
        throw F60.createAndThrow();
    }

    public static int A05(EY1 ey1) {
        int i = ey1.A03;
        return i == 0 ? ey1.A0P() : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r5 != '/') goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        r7.A05 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (r1 != r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        r7.A05 = r6;
        r1 = A0M(2);
        r7.A05++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r1 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        r7.A05 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        if (r5 != '#') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        A0E();
        r2 = r7.A05;
        r1 = r3[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if (r1 == '*') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (r1 != '/') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        r7.A05 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        if (r7.A05 < r7.A00) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (A0M(1) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r0 = r7.A05;
        r2 = r0 + 1;
        r7.A05 = r2;
        r1 = r3[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        if (r1 != '\n') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        r7.A01++;
        r7.A02 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        if (r1 != '\r') goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
    
        r1 = r2 + 1;
        r7.A05 = r1;
        r4 = "*\/".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        if ((r1 + r4) <= r7.A00) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        if (A0M(r4) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
    
        A0K("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        throw X.F60.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b3, code lost:
    
        r2 = r7.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
    
        if (r3[r2] != '\n') goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bb, code lost:
    
        r7.A01++;
        r7.A02 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        r1 = r7.A05 + 1;
        r7.A05 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
    
        r0 = r7.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
    
        if (r6 >= r4) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d7, code lost:
    
        if (r3[r0 + r6] != "*\/".charAt(r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d9, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A06(boolean r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EY1.A06(boolean):int");
    }

    public static IllegalStateException A07(C6731EXp c6731EXp, String str, String str2) {
        return new IllegalStateException(FGI.A0h("Expected ", str, " but was ", str2, FGI.A0M(" at path ", C6731EXp.A01(c6731EXp, false))));
    }

    public static Object A09(C6731EXp c6731EXp) {
        return c6731EXp.A02[c6731EXp.A00 - 1];
    }

    private final String A0B() {
        int i = this.A01 + 1;
        int i2 = (this.A05 - this.A02) + 1;
        StringBuilder sbA0y = C60O.A0y(" at line ", i);
        sbA0y.append(" column ");
        sbA0y.append(i2);
        sbA0y.append(" path ");
        return AnonymousClass001.A0v(A0S(), sbA0y);
    }

    private String A0C(char c) throws MalformedJsonException {
        char[] cArr = this.A0D;
        StringBuilder sbA0p = null;
        while (true) {
            int i = this.A05;
            int i2 = this.A00;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.A05 = i3;
                        int i4 = (i3 - i) - 1;
                        if (sbA0p == null) {
                            return new String(cArr, i, i4);
                        }
                        sbA0p.append(cArr, i, i4);
                        return sbA0p.toString();
                    }
                    if (c2 == '\\') {
                        this.A05 = i3;
                        int i5 = i3 - i;
                        int i6 = i5 - 1;
                        if (sbA0p == null) {
                            sbA0p = BV4.A0p(Math.max(i5 * 2, 16));
                        }
                        sbA0p.append(cArr, i, i6);
                        sbA0p.append(A04());
                    } else {
                        if (c2 == '\n') {
                            this.A01++;
                            this.A02 = i3;
                        }
                        i = i3;
                    }
                } else {
                    if (sbA0p == null) {
                        sbA0p = BV4.A0p(Math.max((i - i) * 2, 16));
                    }
                    sbA0p.append(cArr, i, i - i);
                    this.A05 = i;
                    if (!A0M(1)) {
                        A0K("Unterminated string");
                        throw F60.createAndThrow();
                    }
                }
            }
        }
    }

    private String A0D(boolean z) {
        StringBuilder sbA0x = C60O.A0x("$");
        int i = 0;
        while (true) {
            int i2 = this.A06;
            if (i >= i2) {
                return sbA0x.toString();
            }
            int i3 = this.A0B[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.A09[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sbA0x.append('[');
                    sbA0x.append(i4);
                    sbA0x.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sbA0x.append('.');
                    String str = this.A0C[i];
                    if (str == null) {
                        break;
                    } else {
                        sbA0x.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw BV4.A0N(FGI.A0H("Unknown scope value: ", i3));
            }
            i++;
        }
    }

    private void A0E() throws MalformedJsonException {
        if (this.A08 == C79.A00) {
            return;
        }
        A0K("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw F60.createAndThrow();
    }

    private void A0G(char c) throws MalformedJsonException {
        char[] cArr = this.A0D;
        while (true) {
            int i = this.A05;
            int i2 = this.A00;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.A05 = i3;
                        return;
                    }
                    if (c2 == '\\') {
                        this.A05 = i3;
                        A04();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.A01++;
                            this.A02 = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.A05 = i;
                    if (!A0M(1)) {
                        A0K("Unterminated string");
                        throw F60.createAndThrow();
                    }
                }
            }
        }
    }

    private void A0H(int i) throws MalformedJsonException {
        int i2 = this.A06;
        if (i2 - 1 >= 255) {
            throw new MalformedJsonException(FGI.A0W("Nesting limit ", " reached", A0B(), 255));
        }
        int[] iArr = this.A0B;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.A0B = Arrays.copyOf(iArr, i3);
            this.A09 = Arrays.copyOf(this.A09, i3);
            this.A0C = (String[]) Arrays.copyOf(this.A0C, i3);
        }
        int[] iArr2 = this.A0B;
        int i4 = this.A06;
        this.A06 = i4 + 1;
        iArr2[i4] = i;
    }

    public static void A0I(C6731EXp c6731EXp) {
        int i = c6731EXp.A00;
        if (i > 0) {
            int[] iArr = c6731EXp.A01;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    private boolean A0L(char c) throws MalformedJsonException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case AuraWaitlistConfettiKt.StandardParticleCount /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A0E();
        return false;
    }

    private boolean A0M(int i) throws IOException {
        int i2;
        char[] cArr = this.A0D;
        int i3 = this.A02;
        int i4 = this.A05;
        this.A02 = i3 - i4;
        int i5 = this.A00;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.A00 = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.A00 = 0;
        }
        this.A05 = 0;
        do {
            Reader reader = this.A0E;
            int i7 = this.A00;
            int i8 = reader.read(cArr, i7, 1024 - i7);
            if (i8 == -1) {
                return false;
            }
            i2 = this.A00 + i8;
            this.A00 = i2;
            if (this.A01 == 0 && this.A02 == 0 && i2 > 0 && cArr[0] == '\ufeff') {
                this.A05++;
                this.A02 = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x012e, code lost:
    
        if (r19 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0131, code lost:
    
        if (r11 == 4) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0133, code lost:
    
        if (r11 != 7) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0135, code lost:
    
        r20.A04 = r12;
        r2 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01b3, code lost:
    
        if (r12 == 1) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x022e, code lost:
    
        if (r12 != 5) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010e, code lost:
    
        if (A0L(r0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0110, code lost:
    
        if (r11 != 2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0112, code lost:
    
        if (r20 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0118, code lost:
    
        if (r2 != Long.MIN_VALUE) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x011a, code lost:
    
        if (r19 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011e, code lost:
    
        if (r2 != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0120, code lost:
    
        if (r19 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0122, code lost:
    
        r2 = -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0123, code lost:
    
        r20.A07 = r2;
        r20.A05 += r12;
        r2 = 15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A0P() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EY1.A0P():int");
    }

    public final double A0N() throws MalformedJsonException, NumberFormatException {
        char c;
        String strA0C;
        if (this instanceof C6731EXp) {
            C6731EXp c6731EXp = (C6731EXp) this;
            Integer numA0R = c6731EXp.A0R();
            if (numA0R != C79.A0W && numA0R != C79.A0T) {
                throw A07(c6731EXp, "NUMBER", numA0R != null ? EY2.A00(numA0R) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
            }
            double asDouble = ((JsonElement) A09(c6731EXp)).getAsDouble();
            if (c6731EXp.A08 == C79.A00 || !(Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
                C6731EXp.A00(c6731EXp);
                A0I(c6731EXp);
                return asDouble;
            }
            StringBuilder sbA0x = C60O.A0x("JSON forbids NaN and infinities: ");
            sbA0x.append(asDouble);
            throw new MalformedJsonException(sbA0x.toString());
        }
        int iA05 = A05(this);
        if (iA05 == 15) {
            A0J(this);
            return this.A07;
        }
        if (iA05 == 16) {
            this.A0A = new String(this.A0D, this.A05, this.A04);
            this.A05 += this.A04;
        } else {
            if (iA05 == 8) {
                c = '\'';
            } else if (iA05 == 9) {
                c = '\"';
            } else if (iA05 == 10) {
                strA0C = A0A();
                this.A0A = strA0C;
            } else if (iA05 != 11) {
                throw A08(this, "a double");
            }
            strA0C = A0C(c);
            this.A0A = strA0C;
        }
        this.A03 = 11;
        double d = Double.parseDouble(this.A0A);
        if (this.A08 == C79.A00 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            this.A0A = null;
            A0J(this);
            return d;
        }
        StringBuilder sbA0x2 = C60O.A0x("JSON forbids NaN and infinities: ");
        sbA0x2.append(d);
        A0K(sbA0x2.toString());
        throw F60.createAndThrow();
    }

    public final int A0O() throws MalformedJsonException, NumberFormatException {
        char c;
        String strA0C;
        if (this instanceof C6731EXp) {
            C6731EXp c6731EXp = (C6731EXp) this;
            Integer numA0R = c6731EXp.A0R();
            if (numA0R != C79.A0W && numA0R != C79.A0T) {
                throw A07(c6731EXp, "NUMBER", numA0R != null ? EY2.A00(numA0R) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
            }
            int asInt = ((JsonElement) A09(c6731EXp)).getAsInt();
            C6731EXp.A00(c6731EXp);
            A0I(c6731EXp);
            return asInt;
        }
        int iA05 = A05(this);
        if (iA05 == 15) {
            long j = this.A07;
            int i = (int) j;
            if (j != i) {
                throw BV6.A0k(FGI.A0J("Expected an int but was ", j, A0B()));
            }
            A0J(this);
            return i;
        }
        if (iA05 == 16) {
            strA0C = new String(this.A0D, this.A05, this.A04);
            this.A0A = strA0C;
            this.A05 += this.A04;
        } else {
            try {
                if (iA05 == 8) {
                    c = '\'';
                } else {
                    if (iA05 != 9) {
                        if (iA05 != 10) {
                            throw A08(this, "an int");
                        }
                        strA0C = A0A();
                        this.A0A = strA0C;
                        int i2 = Integer.parseInt(strA0C);
                        A0J(this);
                        return i2;
                    }
                    c = '\"';
                }
                int i22 = Integer.parseInt(strA0C);
                A0J(this);
                return i22;
            } catch (NumberFormatException unused) {
            }
            strA0C = A0C(c);
            this.A0A = strA0C;
        }
        this.A03 = 11;
        double d = Double.parseDouble(strA0C);
        int i3 = (int) d;
        if (i3 != d) {
            throw BV6.A0k(FGI.A0U("Expected an int but was ", strA0C, A0B()));
        }
        this.A0A = null;
        A0J(this);
        return i3;
    }

    public final long A0Q() throws MalformedJsonException, NumberFormatException {
        char c;
        String strA0C;
        if (this instanceof C6731EXp) {
            C6731EXp c6731EXp = (C6731EXp) this;
            Integer numA0R = c6731EXp.A0R();
            if (numA0R != C79.A0W && numA0R != C79.A0T) {
                throw A07(c6731EXp, "NUMBER", numA0R != null ? EY2.A00(numA0R) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
            }
            long asLong = ((JsonElement) A09(c6731EXp)).getAsLong();
            C6731EXp.A00(c6731EXp);
            A0I(c6731EXp);
            return asLong;
        }
        int iA05 = A05(this);
        if (iA05 == 15) {
            A0J(this);
            return this.A07;
        }
        if (iA05 == 16) {
            strA0C = new String(this.A0D, this.A05, this.A04);
            this.A0A = strA0C;
            this.A05 += this.A04;
        } else {
            try {
                if (iA05 == 8) {
                    c = '\'';
                } else {
                    if (iA05 != 9) {
                        if (iA05 != 10) {
                            throw A08(this, "a long");
                        }
                        strA0C = A0A();
                        this.A0A = strA0C;
                        long j = Long.parseLong(strA0C);
                        A0J(this);
                        return j;
                    }
                    c = '\"';
                }
                long j2 = Long.parseLong(strA0C);
                A0J(this);
                return j2;
            } catch (NumberFormatException unused) {
            }
            strA0C = A0C(c);
            this.A0A = strA0C;
        }
        this.A03 = 11;
        double d = Double.parseDouble(strA0C);
        long j3 = (long) d;
        if (j3 != d) {
            throw BV6.A0k(FGI.A0U("Expected a long but was ", strA0C, A0B()));
        }
        this.A0A = null;
        A0J(this);
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        if (r1 != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A0R() throws com.google.gson.stream.MalformedJsonException {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C6731EXp
            if (r0 == 0) goto L72
            X.EXp r4 = (X.C6731EXp) r4
            int r2 = r4.A00
            if (r2 == 0) goto L96
            java.lang.Object[] r1 = r4.A02
            int r0 = r2 + (-1)
            r3 = r1[r0]
            boolean r0 = r3 instanceof java.util.Iterator
            if (r0 == 0) goto L30
            int r0 = r2 + (-2)
            r0 = r1[r0]
            boolean r1 = r0 instanceof com.google.gson.JsonObject
            java.util.Iterator r3 = (java.util.Iterator) r3
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8b
            if (r1 != 0) goto L93
            java.lang.Object r0 = r3.next()
            X.C6731EXp.A03(r4, r0)
            java.lang.Integer r0 = r4.A0R()
            return r0
        L30:
            boolean r0 = r3 instanceof com.google.gson.JsonObject
            if (r0 != 0) goto L88
            boolean r0 = r3 instanceof com.google.gson.JsonArray
            if (r0 != 0) goto L85
            boolean r0 = r3 instanceof com.google.gson.JsonPrimitive
            if (r0 == 0) goto L51
            com.google.gson.JsonPrimitive r3 = (com.google.gson.JsonPrimitive) r3
            java.lang.Object r1 = r3.value
            boolean r0 = r1 instanceof java.lang.String
            if (r0 != 0) goto L79
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L82
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto L7f
            java.lang.AssertionError r1 = X.BV6.A0f()
            throw r1
        L51:
            boolean r0 = r3 instanceof X.C6714EWu
            if (r0 != 0) goto L7c
            java.lang.Object r0 = X.C6731EXp.A05
            if (r3 != r0) goto L60
            java.lang.String r0 = "JsonReader is closed"
            java.lang.IllegalStateException r1 = X.C3cG.A0Q(r0)
            throw r1
        L60:
            java.lang.String r2 = "Custom JsonElement subclass "
            java.lang.String r1 = X.C60Q.A0e(r3)
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.FGI.A0U(r2, r1, r0)
            com.google.gson.stream.MalformedJsonException r1 = new com.google.gson.stream.MalformedJsonException
            r1.<init>(r0)
            throw r1
        L72:
            int r0 = A05(r4)
            switch(r0) {
                case 1: goto L88;
                case 2: goto L8d;
                case 3: goto L85;
                case 4: goto L90;
                case 5: goto L82;
                case 6: goto L82;
                case 7: goto L7c;
                case 8: goto L79;
                case 9: goto L79;
                case 10: goto L79;
                case 11: goto L79;
                case 12: goto L93;
                case 13: goto L93;
                case 14: goto L93;
                case 15: goto L7f;
                case 16: goto L7f;
                case 17: goto L96;
                default: goto L79;
            }
        L79:
            java.lang.Integer r0 = X.C79.A0T
            return r0
        L7c:
            java.lang.Integer r0 = X.C79.A0Z
            return r0
        L7f:
            java.lang.Integer r0 = X.C79.A0W
            return r0
        L82:
            java.lang.Integer r0 = X.C79.A0Y
            return r0
        L85:
            java.lang.Integer r0 = X.C79.A00
            return r0
        L88:
            java.lang.Integer r0 = X.C79.A0C
            return r0
        L8b:
            if (r1 == 0) goto L90
        L8d:
            java.lang.Integer r0 = X.C79.A0K
            return r0
        L90:
            java.lang.Integer r0 = X.C79.A01
            return r0
        L93:
            java.lang.Integer r0 = X.C79.A0P
            return r0
        L96:
            java.lang.Integer r0 = X.C79.A0c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EY1.A0R():java.lang.Integer");
    }

    public final String A0S() {
        return this instanceof C6731EXp ? C6731EXp.A01((C6731EXp) this, false) : A0D(false);
    }

    public final String A0T() {
        return this instanceof C6731EXp ? C6731EXp.A01((C6731EXp) this, true) : A0D(true);
    }

    public final String A0U() throws MalformedJsonException {
        char c;
        String strA0C;
        if (this instanceof C6731EXp) {
            C6731EXp c6731EXp = (C6731EXp) this;
            C6731EXp.A02(c6731EXp, C79.A0P);
            Map.Entry entryA0l = C3cH.A0l((Iterator) A09(c6731EXp));
            String strA0t = C60O.A0t(entryA0l);
            c6731EXp.A03[c6731EXp.A00 - 1] = strA0t;
            C6731EXp.A03(c6731EXp, entryA0l.getValue());
            return strA0t;
        }
        int iA05 = A05(this);
        if (iA05 == 14) {
            strA0C = A0A();
        } else {
            if (iA05 == 12) {
                c = '\'';
            } else {
                if (iA05 != 13) {
                    throw A08(this, "a name");
                }
                c = '\"';
            }
            strA0C = A0C(c);
        }
        this.A03 = 0;
        this.A0C[this.A06 - 1] = strA0C;
        return strA0C;
    }

    public final String A0V() throws MalformedJsonException {
        String str;
        if (this instanceof C6731EXp) {
            C6731EXp c6731EXp = (C6731EXp) this;
            Integer numA0R = c6731EXp.A0R();
            if (numA0R != C79.A0T && numA0R != C79.A0W) {
                throw A07(c6731EXp, "STRING", numA0R != null ? EY2.A00(numA0R) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
            }
            String asString = ((JsonElement) C6731EXp.A00(c6731EXp)).getAsString();
            A0I(c6731EXp);
            return asString;
        }
        int iA05 = A05(this);
        if (iA05 == 10) {
            str = A0A();
        } else if (iA05 == 8) {
            str = A0C('\'');
        } else if (iA05 == 9) {
            str = A0C('\"');
        } else if (iA05 == 11) {
            str = this.A0A;
            this.A0A = null;
        } else if (iA05 == 15) {
            str = Long.toString(this.A07);
        } else {
            if (iA05 != 16) {
                throw A08(this, "a string");
            }
            str = new String(this.A0D, this.A05, this.A04);
            this.A05 += this.A04;
        }
        A0J(this);
        return str;
    }

    public final void A0W() throws MalformedJsonException {
        if (this instanceof C6731EXp) {
            C6731EXp c6731EXp = (C6731EXp) this;
            C6731EXp.A02(c6731EXp, C79.A00);
            C6731EXp.A03(c6731EXp, ((JsonArray) A09(c6731EXp)).iterator());
            c6731EXp.A01[c6731EXp.A00 - 1] = 0;
            return;
        }
        if (A05(this) != 3) {
            throw A08(this, "BEGIN_ARRAY");
        }
        A0H(1);
        this.A09[this.A06 - 1] = 0;
        this.A03 = 0;
    }

    public final void A0X() throws MalformedJsonException {
        if (this instanceof C6731EXp) {
            C6731EXp c6731EXp = (C6731EXp) this;
            C6731EXp.A02(c6731EXp, C79.A0C);
            C6731EXp.A03(c6731EXp, C3cG.A0i(((JsonObject) A09(c6731EXp)).members));
        } else {
            if (A05(this) != 1) {
                throw A08(this, "BEGIN_OBJECT");
            }
            A0H(3);
            this.A03 = 0;
        }
    }

    public final void A0Y() {
        if (this instanceof C6731EXp) {
            C6731EXp c6731EXp = (C6731EXp) this;
            C6731EXp.A02(c6731EXp, C79.A01);
            C6731EXp.A00(c6731EXp);
            C6731EXp.A00(c6731EXp);
            A0I(c6731EXp);
            return;
        }
        if (A05(this) != 4) {
            throw A08(this, "END_ARRAY");
        }
        int i = this.A06;
        this.A06 = i - 1;
        int[] iArr = this.A09;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.A03 = 0;
    }

    public final void A0Z() {
        if (this instanceof C6731EXp) {
            C6731EXp c6731EXp = (C6731EXp) this;
            C6731EXp.A02(c6731EXp, C79.A0K);
            c6731EXp.A03[c6731EXp.A00 - 1] = null;
            C6731EXp.A00(c6731EXp);
            C6731EXp.A00(c6731EXp);
            A0I(c6731EXp);
            return;
        }
        if (A05(this) != 2) {
            throw A08(this, "END_OBJECT");
        }
        int i = this.A06;
        int i2 = i - 1;
        this.A06 = i2;
        this.A0C[i2] = null;
        int[] iArr = this.A09;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.A03 = 0;
    }

    public final void A0a() {
        if (!(this instanceof C6731EXp)) {
            if (A05(this) != 7) {
                throw A08(this, HatchCcvLoggingKt.NO_POSTAL_FIELD);
            }
            A0J(this);
        } else {
            C6731EXp c6731EXp = (C6731EXp) this;
            C6731EXp.A02(c6731EXp, C79.A0Z);
            C6731EXp.A00(c6731EXp);
            A0I(c6731EXp);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0b() throws com.google.gson.stream.MalformedJsonException {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C6731EXp
            if (r0 == 0) goto L2c
            X.EXp r7 = (X.C6731EXp) r7
            java.lang.Integer r0 = r7.A0R()
            int r1 = r0.intValue()
            r5 = 1
            r0 = 4
            if (r1 == r0) goto L93
            if (r1 == r5) goto L8f
            r0 = 3
            if (r1 == r0) goto L8b
            r0 = 9
            if (r1 == r0) goto L2b
            X.C6731EXp.A00(r7)
            int r2 = r7.A00
            if (r2 <= 0) goto L2b
            int[] r1 = r7.A01
        L24:
            int r2 = r2 - r5
            r0 = r1[r2]
            int r0 = r0 + 1
            r1[r2] = r0
        L2b:
            return
        L2c:
            r4 = 0
            r6 = 0
        L2e:
            int r3 = A05(r7)
            r1 = 34
            r0 = 39
            java.lang.String r2 = "<skipped>"
            r5 = 1
            switch(r3) {
                case 1: goto L84;
                case 2: goto L72;
                case 3: goto L6e;
                case 4: goto L7c;
                case 5: goto L3c;
                case 6: goto L3c;
                case 7: goto L3c;
                case 8: goto L6a;
                case 9: goto L66;
                case 10: goto L62;
                case 11: goto L3c;
                case 12: goto L55;
                case 13: goto L51;
                case 14: goto L4d;
                case 15: goto L3c;
                case 16: goto L45;
                case 17: goto L2b;
                default: goto L3c;
            }
        L3c:
            r7.A03 = r4
            if (r6 > 0) goto L2e
            int[] r1 = r7.A09
            int r2 = r7.A06
            goto L24
        L45:
            int r1 = r7.A05
            int r0 = r7.A04
            int r1 = r1 + r0
            r7.A05 = r1
            goto L3c
        L4d:
            r7.A0F()
            goto L58
        L51:
            r7.A0G(r1)
            goto L58
        L55:
            r7.A0G(r0)
        L58:
            if (r6 != 0) goto L3c
            java.lang.String[] r1 = r7.A0C
            int r0 = r7.A06
            int r0 = r0 - r5
            r1[r0] = r2
            goto L3c
        L62:
            r7.A0F()
            goto L3c
        L66:
            r7.A0G(r1)
            goto L3c
        L6a:
            r7.A0G(r0)
            goto L3c
        L6e:
            r7.A0H(r5)
            goto L88
        L72:
            if (r6 != 0) goto L7c
            java.lang.String[] r2 = r7.A0C
            int r1 = r7.A06
            int r1 = r1 - r5
            r0 = 0
            r2[r1] = r0
        L7c:
            int r0 = r7.A06
            int r0 = r0 - r5
            r7.A06 = r0
            int r6 = r6 + (-1)
            goto L3c
        L84:
            r0 = 3
            r7.A0H(r0)
        L88:
            int r6 = r6 + 1
            goto L3c
        L8b:
            r7.A0Z()
            return
        L8f:
            r7.A0Y()
            return
        L93:
            java.lang.Integer r0 = X.C79.A0P
            X.C6731EXp.A02(r7, r0)
            java.lang.Object r0 = A09(r7)
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.util.Map$Entry r3 = X.C3cH.A0l(r0)
            r3.getKey()
            java.lang.String[] r2 = r7.A03
            int r0 = r7.A00
            int r1 = r0 + (-1)
            java.lang.String r0 = "<skipped>"
            r2[r1] = r0
            java.lang.Object r0 = r3.getValue()
            X.C6731EXp.A03(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EY1.A0b():void");
    }

    public final boolean A0c() throws MalformedJsonException {
        if (this instanceof C6731EXp) {
            Integer numA0R = A0R();
            if (numA0R != C79.A0K && numA0R != C79.A01 && numA0R != C79.A0c) {
                return true;
            }
        } else {
            int iA05 = A05(this);
            if (iA05 != 2 && iA05 != 4 && iA05 != 17) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0d() {
        if (this instanceof C6731EXp) {
            C6731EXp c6731EXp = (C6731EXp) this;
            C6731EXp.A02(c6731EXp, C79.A0Y);
            boolean asBoolean = ((JsonElement) C6731EXp.A00(c6731EXp)).getAsBoolean();
            A0I(c6731EXp);
            return asBoolean;
        }
        int iA05 = A05(this);
        if (iA05 == 5) {
            this.A03 = 0;
            int[] iArr = this.A09;
            int i = this.A06 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iA05 != 6) {
            throw A08(this, "a boolean");
        }
        this.A03 = 0;
        int[] iArr2 = this.A09;
        int i2 = this.A06 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this instanceof C6731EXp) {
            C6731EXp c6731EXp = (C6731EXp) this;
            c6731EXp.A02 = new Object[]{C6731EXp.A05};
            c6731EXp.A00 = 1;
        } else {
            this.A03 = 0;
            this.A0B[0] = 8;
            this.A06 = 1;
            this.A0E.close();
        }
    }

    public EY1(Reader reader) {
        int[] iArr = new int[32];
        this.A0B = iArr;
        iArr[0] = 6;
        this.A0C = new String[32];
        this.A09 = new int[32];
        Hqg.A00(reader, "in == null");
        this.A0E = reader;
    }

    public static IllegalStateException A08(EY1 ey1, String str) throws MalformedJsonException {
        String str2 = ey1.A0R() == C79.A0Z ? "adapter-not-null-safe" : "unexpected-json-structure";
        Integer numA0R = ey1.A0R();
        return C3cG.A0Q(FGI.A0k("Expected ", str, " but was ", numA0R != null ? EY2.A00(numA0R) : HatchCcvLoggingKt.NO_POSTAL_FIELD, ey1.A0B(), "\nSee ", FGI.A0M("https://github.com/google/gson/blob/main/Troubleshooting.md#", str2)));
    }

    private void A0K(String str) throws MalformedJsonException {
        throw new MalformedJsonException(FGI.A0d(str, A0B(), "\nSee ", FGI.A0M("https://github.com/google/gson/blob/main/Troubleshooting.md#", "malformed-json")));
    }

    public String toString() {
        return FGI.A0M(C3cI.A0Y(this), A0B());
    }
}
