package X;

import java.net.IDN;
import java.net.InetAddress;

/* renamed from: X.EEt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6557EEt {
    public static final String A00(String str) {
        boolean z;
        int i = 0;
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0q(str, ":", false)) {
            InetAddress inetAddressA01 = (str.startsWith("[") && str.endsWith("]")) ? A01(str, 1, str.length() - 1) : A01(str, 0, str.length());
            if (inetAddressA01 != null) {
                byte[] address = inetAddressA01.getAddress();
                int length = address.length;
                if (length != 16) {
                    if (length == 4) {
                        return inetAddressA01.getHostAddress();
                    }
                    throw BV4.A0N(FGI.A0N("Invalid IPv6 address: '", str, '\''));
                }
                int i2 = -1;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                C6818EaW c6818EaW = new C6818EaW();
                while (i < length) {
                    if (i == i2) {
                        c6818EaW.Aif(58);
                        i += i4;
                        if (i == 16) {
                            c6818EaW.Aif(58);
                        }
                    } else {
                        if (i > 0) {
                            c6818EaW.Aif(58);
                        }
                        byte b = address[i];
                        byte[] bArr = AbstractC6843Eav.A06;
                        c6818EaW.Ail(((b & 255) << 8) | (address[i + 1] & 255));
                        i += 2;
                    }
                }
                return C6818EaW.A00(DCl.A05, c6818EaW, c6818EaW.A00);
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                C7384Etj.A0U(ascii);
                String strA0g = C60Q.A0g(ascii);
                int length2 = strA0g.length();
                if (length2 != 0) {
                    int i7 = 0;
                    while (i7 < length2) {
                        int i8 = i7 + 1;
                        char cCharAt = strA0g.charAt(i7);
                        if (C7384Etj.A00(cCharAt, 31) <= 0 || C7384Etj.A00(cCharAt, 127) >= 0 || C7BY.A08(" #%/:?@[\\]", cCharAt, 0) != -1) {
                            z = true;
                            break;
                        }
                        i7 = i8;
                    }
                    z = false;
                    if (z) {
                        return null;
                    }
                    return strA0g;
                }
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6 A[LOOP:2: B:32:0x006a->B:52:0x00a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c9 A[EDGE_INSN: B:76:0x00c9->B:61:0x00c9 BREAK  A[LOOP:2: B:32:0x006a->B:52:0x00a6], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress A01(java.lang.String r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6557EEt.A01(java.lang.String, int, int):java.net.InetAddress");
    }
}
