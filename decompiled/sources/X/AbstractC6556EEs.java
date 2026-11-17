package X;

import com.facebook.acra.util.UrlEncodingWriter;
import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;
import java.io.ByteArrayOutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;

/* renamed from: X.EEs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6556EEs {
    public static final C06827l3 A00 = C06827l3.A02("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final byte[] A01;

    public static final String A00(String str) {
        boolean z;
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
                    throw BV4.A0N(FGI.A0U("Invalid IPv6 address: '", str, "'"));
                }
                int i = -1;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
                while (i2 < length) {
                    if (i2 == i) {
                        byteArrayOutputStreamA0F.write(58);
                        i2 += i4;
                        if (i2 == 16) {
                            byteArrayOutputStreamA0F.write(58);
                        }
                    } else {
                        if (i2 > 0) {
                            byteArrayOutputStreamA0F.write(58);
                        }
                        long j = ((address[i2] & 255) << 8) | (address[i2 + 1] & 255);
                        if (j == 0) {
                            byteArrayOutputStreamA0F.write(48);
                        }
                        long j2 = (j >>> 1) | j;
                        long j3 = j2 | (j2 >>> 2);
                        long j4 = j3 | (j3 >>> 4);
                        long j5 = j4 | (j4 >>> 8);
                        long j6 = j5 | (j5 >>> 16);
                        long j7 = j6 | (j6 >>> 32);
                        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
                        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
                        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
                        long j11 = j10 + (j10 >>> 8);
                        long j12 = j11 + (j11 >>> 16);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        for (int i7 = ((int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4)) - 1; i7 >= 0; i7--) {
                            byteArrayOutputStream.write(new byte[]{A01[(int) (15 & j)]});
                            j >>>= 4;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        C7384Etj.A0X(byteArray);
                        int length2 = byteArray.length;
                        if (length2 != 0) {
                            byte[] bArr = new byte[length2];
                            int i8 = length2 - 1;
                            if (i8 >= 0) {
                                int i9 = 0;
                                while (true) {
                                    bArr[i8 - i9] = byteArray[i9];
                                    if (i9 == i8) {
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            byteArray = bArr;
                        }
                        byteArrayOutputStreamA0F.write(byteArray);
                        i2 += 2;
                    }
                }
                return BV4.A0o(C7384Etj.A0d(byteArrayOutputStreamA0F));
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                C7384Etj.A0U(ascii);
                String strA0g = C60Q.A0g(ascii);
                int length3 = strA0g.length();
                if (length3 != 0) {
                    for (int i10 = 0; i10 < length3; i10++) {
                        char cCharAt = strA0g.charAt(i10);
                        if (cCharAt <= 31 || cCharAt >= '\u007f' || C7BY.A08(" #%/:?@[\\]", cCharAt, 0) != -1) {
                            z = true;
                            break;
                        }
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

    public static final boolean A02(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        if (length < 0) {
            throw C8j3.A0v("endIndex < beginIndex: ", " < ", length, 0);
        }
        if (length > length) {
            throw C60O.A0i(FGI.A0T("endIndex > string.length: ", " > ", length, length));
        }
        long j = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            long j2 = 1;
            if (cCharAt >= '\u0080') {
                if (cCharAt < '\u0800') {
                    i = 2;
                } else if (cCharAt < '\ud800' || cCharAt > '\udfff') {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length ? str.charAt(i3) : (char) 0;
                    if (cCharAt > '\udbff' || cCharAt2 < '\udc00' || cCharAt2 > '\udfff') {
                        j++;
                        i2 = i3;
                    } else {
                        j += 4;
                        i2 += 2;
                    }
                }
                j2 = i;
            }
            j += j2;
            i2++;
        }
        return length == ((int) j);
    }

    static {
        byte[] bArrCopyOf;
        int i;
        byte b;
        int i2;
        char cCharAt;
        int length = ManagedBrowserSitePolicy.HEX.length();
        byte[] bArr = new byte[length * 4];
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                bArrCopyOf = Arrays.copyOf(bArr, length);
                break;
            }
            char cCharAt2 = ManagedBrowserSitePolicy.HEX.charAt(i3);
            if (cCharAt2 >= '\u0080') {
                F1E f1e = new F1E();
                f1e.element = i3;
                EP6 ep6 = new EP6(3, bArr, f1e);
                while (i3 < length) {
                    char cCharAt3 = ManagedBrowserSitePolicy.HEX.charAt(i3);
                    if (cCharAt3 < '\u0080') {
                        ep6.invoke(Byte.valueOf((byte) cCharAt3));
                        i3++;
                        while (i3 < length && ManagedBrowserSitePolicy.HEX.charAt(i3) < '\u0080') {
                            ep6.invoke(Byte.valueOf((byte) ManagedBrowserSitePolicy.HEX.charAt(i3)));
                            i3++;
                        }
                    } else {
                        if (cCharAt3 < '\u0800') {
                            i = (cCharAt3 >> 6) | 192;
                        } else {
                            b = UrlEncodingWriter.UTF16_REPLACEMENT_BYTE;
                            if ('\ud800' > cCharAt3 || cCharAt3 >= '\ue000') {
                                ep6.invoke(Byte.valueOf((byte) ((cCharAt3 >> '\f') | 224)));
                                i = ((cCharAt3 >> 6) & 63) | 128;
                            } else if (cCharAt3 > '\udbff' || length <= (i2 = i3 + 1) || '\udc00' > (cCharAt = ManagedBrowserSitePolicy.HEX.charAt(i2)) || cCharAt >= '\ue000') {
                                ep6.invoke(Byte.valueOf(b));
                                i3++;
                            } else {
                                int iCharAt = ((cCharAt3 << '\n') + ManagedBrowserSitePolicy.HEX.charAt(i2)) - 56613888;
                                ep6.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                                ep6.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                                ep6.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                                ep6.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                                i3 += 2;
                            }
                        }
                        ep6.invoke(Byte.valueOf((byte) i));
                        b = (byte) ((cCharAt3 & '?') | 128);
                        ep6.invoke(Byte.valueOf(b));
                        i3++;
                    }
                }
                bArrCopyOf = Arrays.copyOf(bArr, f1e.element);
            } else {
                bArr[i3] = (byte) cCharAt2;
                i3++;
            }
        }
        C7384Etj.A0U(bArrCopyOf);
        A01 = bArrCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd A[LOOP:2: B:46:0x0089->B:66:0x00bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e0 A[EDGE_INSN: B:89:0x00e0->B:75:0x00e0 BREAK  A[LOOP:2: B:46:0x0089->B:66:0x00bd], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress A01(java.lang.String r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6556EEs.A01(java.lang.String, int, int):java.net.InetAddress");
    }
}
