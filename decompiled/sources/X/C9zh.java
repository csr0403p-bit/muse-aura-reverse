package X;

import com.facebook.aura.handoff.impl.HandoffLinkVerifier;
import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;

/* renamed from: X.9zh, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9zh {
    public static final int[] A00;
    public static final int[] A01;
    public static final long[] A02;

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e2, code lost:
    
        r0 = "byte suffix";
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f5, code lost:
    
        if (r23.charAt(r2) != '\r') goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f7, code lost:
    
        r4 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f9, code lost:
    
        if (r4 >= r9) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ff, code lost:
    
        if (r23.charAt(r4) != '\n') goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0201, code lost:
    
        r2 = r2 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0205, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x020c, code lost:
    
        if (r23.charAt(r2) != '\n') goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x020e, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0214, code lost:
    
        if (r13 == 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0216, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0217, code lost:
    
        if (r4 >= r13) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021d, code lost:
    
        if (A02("  ", r23, r4, r2, r14) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021f, code lost:
    
        A01(r2, r9, r23, "  ", "group separator");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0226, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0229, code lost:
    
        r2 = r2 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0254, code lost:
    
        r1 = X.C60O.A0y("Expected a new line at index ", r2);
        r1.append(", but was ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x026c, code lost:
    
        throw new java.lang.NumberFormatException(X.C8j3.A16(r1, r23.charAt(r2)));
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] A03(java.lang.String r23, X.C9zi r24) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9zh.A03(java.lang.String, X.9zi):byte[]");
    }

    static {
        int length;
        int length2;
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = ManagedBrowserSitePolicy.HEX.charAt(i2 & 15) | (ManagedBrowserSitePolicy.HEX.charAt(i2 >> 4) << '\b');
        }
        A00 = iArr;
        for (int i3 = 0; i3 < 256; i3++) {
            HandoffLinkVerifier.HEX_DIGITS.charAt(i3 >> 4);
            HandoffLinkVerifier.HEX_DIGITS.charAt(i3 & 15);
        }
        int[] iArr2 = new int[256];
        int i4 = 0;
        do {
            iArr2[i4] = -1;
            i4++;
        } while (i4 < 256);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            length = ManagedBrowserSitePolicy.HEX.length();
            if (i5 >= length) {
                break;
            }
            iArr2[ManagedBrowserSitePolicy.HEX.charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            length2 = HandoffLinkVerifier.HEX_DIGITS.length();
            if (i7 >= length2) {
                break;
            }
            iArr2[HandoffLinkVerifier.HEX_DIGITS.charAt(i7)] = i8;
            i7++;
            i8++;
        }
        A01 = iArr2;
        long[] jArr = new long[256];
        int i9 = 0;
        do {
            jArr[i9] = -1;
            i9++;
        } while (i9 < 256);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            jArr[ManagedBrowserSitePolicy.HEX.charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < length2) {
            jArr[HandoffLinkVerifier.HEX_DIGITS.charAt(i)] = i12;
            i++;
            i12++;
        }
        A02 = jArr;
    }

    public static final byte A00(String str, int i) {
        int[] iArr;
        int i2;
        int i3;
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') == 0 && (i2 = (iArr = A01)[cCharAt]) >= 0) {
            i++;
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 >>> '\b') == 0 && (i3 = iArr[cCharAt2]) >= 0) {
                return (byte) (i3 | (i2 << 4));
            }
        }
        StringBuilder sbA0y = C60O.A0y("Expected a hexadecimal digit at index ", i);
        sbA0y.append(", but was ");
        throw new NumberFormatException(C8j3.A16(sbA0y, str.charAt(i)));
    }

    public static final void A01(int i, int i2, String str, String str2, String str3) {
        int length = str2.length() + i;
        if (length <= i2) {
            i2 = length;
        }
        String strSubstring = str.substring(i, i2);
        StringBuilder sbA0x = C3cI.A0x("Expected ", str3);
        sbA0x.append(" \"");
        sbA0x.append(str2);
        sbA0x.append("\" at index ");
        sbA0x.append(i);
        throw new NumberFormatException(C60P.A1M(", but was ", strSubstring, sbA0x));
    }

    public static boolean A02(String str, String str2, int i, int i2, boolean z) {
        return HlF.A02(str.charAt(i), str2.charAt(i2 + i), z);
    }
}
