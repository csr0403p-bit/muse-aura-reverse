package X;

import com.android.billingclient.u3;
import com.android.billingclient.v6;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.maplibre.android.R;
import sun.misc.Unsafe;

/* renamed from: X.GHy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9409GHy implements GIK {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final GIF A04;
    public final C9411GIa A05;
    public final int[] A06;
    public final int[] A07;
    public final Object[] A08;
    public static final int[] A0A = new int[0];
    public static final Unsafe A09 = AbstractC9404GHt.A01();

    public static int A04(GIS gis, GI4 gi4, byte[] bArr, int i, int i2, int i3) throws v6 {
        Object c9332GEp;
        int iA07 = i2;
        if ((i >>> 3) == 0) {
            throw AbstractC7607F5u.A0q("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iA08 = A08(gis, bArr, i2);
            gi4.A02(i, Long.valueOf(gis.A02));
            return iA08;
        }
        if (i4 == 1) {
            gi4.A02(i, Long.valueOf(AbstractC7611F5y.A0I(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iA072 = A07(gis, bArr, i2);
            int i5 = gis.A00;
            if (i5 < 0) {
                throw AbstractC7607F5u.A0q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int length = bArr.length;
            if (i5 > length - iA072) {
                throw AbstractC7607F5u.A0q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                c9332GEp = AbstractC9330GEn.A01;
            } else {
                try {
                    AbstractC9330GEn.A00(iA072, iA072 + i5, length);
                    c9332GEp = new C9332GEp(AbstractC9330GEn.A00.A2n(bArr, iA072, i5));
                } catch (v6 e) {
                    throw Bb9.A00("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            }
            gi4.A02(i, c9332GEp);
            return iA072 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw AbstractC7607F5u.A0q("Protocol message contained an invalid tag (zero).");
            }
            gi4.A02(i, Integer.valueOf(AbstractC7611F5y.A0E(bArr, i2)));
            return i2 + 4;
        }
        int i6 = 0;
        GI4 gi42 = new GI4(new int[8], new Object[8], 0, true);
        int i7 = (i & (-8)) | 4;
        int i8 = gis.A01 + 1;
        gis.A01 = i8;
        if (i8 >= 100) {
            throw AbstractC7607F5u.A0q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (iA07 < i3) {
            iA07 = A07(gis, bArr, iA07);
            i6 = gis.A00;
            if (i6 == i7) {
                break;
            }
            iA07 = A04(gis, gi42, bArr, i6, iA07, i3);
        }
        gis.A01--;
        if (iA07 > i3 || i6 != i7) {
            throw AbstractC7607F5u.A0q("Failed to parse the message.");
        }
        gi4.A02(i, gi42);
        return iA07;
    }

    public static GI4 A0F(Object obj) {
        GI0 gi0 = (GI0) obj;
        GI4 gi4 = gi0.b;
        if (gi4 != GI4.A05) {
            return gi4;
        }
        GI4 gi42 = new GI4(new int[8], new Object[8], 0, true);
        gi0.b = gi42;
        return gi42;
    }

    public static Field A0J(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw BV4.A0d(FGI.A0j("Field ", str, " for ", cls.getName(), " not found. Known fields are ", Arrays.toString(declaredFields)), e);
        }
    }

    @Override // X.GIK
    public final void A2p(GIS gis, Object obj, byte[] bArr, int i, int i2) throws v6 {
        A0R(gis, obj, bArr, i, i2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010 A[PHI: r2 r6
  0x0010: PHI (r2v1 int) = (r2v0 int), (r2v3 int) binds: [B:3:0x0006, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]
  0x0010: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:3:0x0006, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.GIK r8, X.GIS r9, java.lang.Object r10, byte[] r11, int r12, int r13) throws com.android.billingclient.v6 {
        /*
            int r6 = r12 + 1
            r5 = r11
            r2 = r11[r12]
            r3 = r9
            if (r2 >= 0) goto L10
            int r6 = A09(r9, r11, r2, r6)
            int r2 = r9.A00
            if (r2 < 0) goto L34
        L10:
            int r13 = r13 - r6
            if (r2 > r13) goto L34
            int r0 = r9.A01
            int r1 = r0 + 1
            r9.A01 = r1
            r0 = 100
            if (r1 >= r0) goto L2d
            int r7 = r6 + r2
            r2 = r8
            r4 = r10
            r2.A2p(r3, r4, r5, r6, r7)
            int r0 = r9.A01
            int r0 = r0 + (-1)
            r9.A01 = r0
            r9.A03 = r10
            return r7
        L2d:
            java.lang.String r0 = "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."
            com.android.billingclient.v6 r0 = X.AbstractC7607F5u.A0q(r0)
            throw r0
        L34:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            com.android.billingclient.v6 r0 = X.AbstractC7607F5u.A0q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9409GHy.A00(X.GIK, X.GIS, java.lang.Object, byte[], int, int):int");
    }

    public static int A01(GIK gik, GIS gis, Object obj, byte[] bArr, int i, int i2, int i3) throws v6 {
        C9409GHy c9409GHy = (C9409GHy) gik;
        int i4 = gis.A01 + 1;
        gis.A01 = i4;
        if (i4 >= 100) {
            throw AbstractC7607F5u.A0q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iA0R = c9409GHy.A0R(gis, obj, bArr, i, i2, i3);
        gis.A01--;
        gis.A03 = obj;
        return iA0R;
    }

    public static int A02(GIS gis, InterfaceC9313GDp interfaceC9313GDp, byte[] bArr, int i) throws v6 {
        GDW gdw = (GDW) interfaceC9313GDp;
        int iA07 = A07(gis, bArr, i);
        int i2 = gis.A00;
        if (i2 < 0) {
            throw AbstractC7607F5u.A0q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iA07) {
            throw AbstractC7607F5u.A0q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i3 = i2 + iA07;
        while (iA07 < i3) {
            int i4 = iA07 + 1;
            byte b = bArr[iA07];
            if (b >= 0) {
                gis.A00 = b;
                iA07 = i4;
            } else {
                iA07 = A09(gis, bArr, b, i4);
            }
            gdw.A03(gis.A00);
        }
        if (iA07 == i3) {
            return iA07;
        }
        throw AbstractC7607F5u.A0q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int A05(GIS gis, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A09(gis, bArr, b, i2);
        }
        gis.A00 = b;
        return i2;
    }

    public static int A07(GIS gis, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A09(gis, bArr, b, i2);
        }
        gis.A00 = b;
        return i2;
    }

    public static int A08(GIS gis, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            gis.A02 = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            i3++;
        }
        gis.A02 = j2;
        return i3;
    }

    public static int A09(GIS gis, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i & 127;
        int i7 = i2 + 1;
        int i8 = bArr[i2];
        if (i8 < 0) {
            int i9 = i6 | ((i8 & 127) << 7);
            int i10 = i2 + 2;
            int i11 = bArr[i7];
            if (i11 < 0) {
                i6 = i9 | ((i11 & 127) << 14);
                i7 = i2 + 3;
                int i12 = bArr[i10];
                i3 = i12 << 21;
                if (i12 < 0) {
                    i9 = i6 | ((i12 & 127) << 21);
                    i10 = i2 + 4;
                    int i13 = bArr[i7];
                    if (i13 < 0) {
                        i4 = i9 | ((i13 & 127) << 28);
                        while (true) {
                            i7 = i10 + 1;
                            if (bArr[i10] >= 0) {
                                break;
                            }
                            i10 = i7;
                        }
                    } else {
                        i5 = i13 << 28;
                    }
                }
                gis.A00 = i4;
                return i7;
            }
            i5 = i11 << 14;
            gis.A00 = i9 | i5;
            return i10;
        }
        i3 = i8 << 7;
        i4 = i6 | i3;
        gis.A00 = i4;
        return i7;
    }

    public static int A0A(GIS gis, byte[] bArr, int i, int i2, int i3) throws v6 {
        if ((i >>> 3) == 0) {
            throw AbstractC7607F5u.A0q("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return A08(gis, bArr, i2);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return A07(gis, bArr, i2) + gis.A00;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw AbstractC7607F5u.A0q("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = gis.A01 + 1;
        gis.A01 = i6;
        if (i6 >= 100) {
            throw AbstractC7607F5u.A0q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = 0;
        while (i2 < i3) {
            i2 = A07(gis, bArr, i2);
            i7 = gis.A00;
            if (i7 == i5) {
                break;
            }
            i2 = A0A(gis, bArr, i7, i2, i3);
        }
        gis.A01--;
        if (i2 > i3 || i7 != i5) {
            throw AbstractC7607F5u.A0q("Failed to parse the message.");
        }
        return i2;
    }

    public static int A0B(Object obj, long j) {
        return ((Number) AbstractC9404GHt.A00.A04(obj, j)).intValue();
    }

    private final GIK A0C(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A08;
        GIK gik = (GIK) objArr[i2];
        if (gik != null) {
            return gik;
        }
        GIK gikA00 = GIL.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = gikA00;
        return gikA00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.Hs7] */
    public static Hs7 A0D(Object obj, Object obj2) {
        Hs7 hs7;
        Hs7 hs72 = (Hs7) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!hs72.a) {
                if (hs72.isEmpty()) {
                    hs7 = new Hs7();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(hs72);
                    hs7.a = true;
                    hs7 = linkedHashMap;
                }
                hs72 = hs7;
            }
            if (!hs72.a) {
                throw C8j3.A17();
            }
            AbstractC7609F5w.A1R(abstractMap, hs72);
        }
        return hs72;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x015d, code lost:
    
        if ((r5 & 2048) == 0) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0213 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C9409GHy A0E(X.GIM r37, X.C9411GIa r38) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9409GHy.A0E(X.GIM, X.GIa):X.GHy");
    }

    public static Object A0I(Object obj, long j) {
        return AbstractC9404GHt.A00.A04(obj, j);
    }

    private final void A0K(int i, Object obj) {
        int i2 = this.A06[i + 2];
        long j = 1048575 & i2;
        if (j != 1048575) {
            AbstractC9408GHx abstractC9408GHx = AbstractC9404GHt.A00;
            abstractC9408GHx.A09(obj, j, (1 << (i2 >>> 20)) | abstractC9408GHx.A02(obj, j));
        }
    }

    public static void A0L(GI5 gi5, int i, int i2) throws u3 {
        gi5.A09(i << 3);
        gi5.A08(i2);
    }

    public static void A0M(GI5 gi5, int i, int i2) throws u3 {
        gi5.A09(i << 3);
        gi5.A09(i2);
    }

    private final boolean A0N(int i, Object obj) {
        boolean zEquals;
        int[] iArr = this.A06;
        int i2 = iArr[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = i3 & 1048575;
            switch (AbstractC7608F5v.A03(i3)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC9404GHt.A00.A00(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC9404GHt.A00.A01(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (AbstractC9404GHt.A00.A03(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (AbstractC9404GHt.A00.A02(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return AbstractC9404GHt.A00.A0G(obj, j2);
                case 8:
                    Object objA0I = A0I(obj, j2);
                    if (objA0I instanceof String) {
                        zEquals = ((String) objA0I).isEmpty();
                    } else {
                        if (!(objA0I instanceof AbstractC9330GEn)) {
                            throw BV4.A0P();
                        }
                        zEquals = AbstractC9330GEn.A01.equals(objA0I);
                    }
                    return !zEquals;
                case 9:
                case 17:
                    if (A0I(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    zEquals = AbstractC9330GEn.A01.equals(A0I(obj, j2));
                    return !zEquals;
                default:
                    throw BV4.A0P();
            }
        } else if (((1 << (i2 >>> 20)) & AbstractC9404GHt.A00.A02(obj, j)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean A0O(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GI0) {
            return AbstractC7609F5w.A1U(((GI0) obj).memoizedSerializedSize, Integer.MIN_VALUE);
        }
        return true;
    }

    private final boolean A0P(Object obj, int i, int i2) {
        return AnonymousClass002.A1Q(AbstractC9404GHt.A00.A02(obj, AbstractC7609F5w.A0Q(this.A06, i2)), i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x095e, code lost:
    
        throw X.C3cG.A0Q("Wrote more data than expected.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0965, code lost:
    
        throw X.C3cG.A0Q("Did not write as much data as expected.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0966, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x096b, code lost:
    
        throw X.BV4.A0e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x096c, code lost:
    
        if (r11 == null) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x096e, code lost:
    
        ((X.GI0) r37).b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0976, code lost:
    
        if (r41 != 0) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0978, code lost:
    
        if (r5 == r40) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x097e, code lost:
    
        throw X.AbstractC7607F5u.A0q("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x097f, code lost:
    
        if (r5 > r40) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0983, code lost:
    
        if (r13 != r41) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0985, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x098a, code lost:
    
        throw X.AbstractC7607F5u.A0q("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cf, code lost:
    
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
    
        if (r1 == 1048575) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d6, code lost:
    
        r11.putInt(r37, r1, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r12 = r35.A02;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0a1f, code lost:
    
        throw X.AbstractC7607F5u.A0q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0571, code lost:
    
        r6.add("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e1, code lost:
    
        if (r12 >= r35.A03) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e3, code lost:
    
        r4 = r35.A07[r12];
        r21 = r35.A06[r4];
        r3 = A0I(r37, r1[r4 + 1] & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        if (r3 == null) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:
    
        r2 = r35.A08;
        r1 = (r4 / 3) * 2;
        r15 = (X.GIU) r2[r1 + 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0104, code lost:
    
        if (r15 == null) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0106, code lost:
    
        r14 = ((X.GIO) r2[r1]).A00;
        r20 = X.C3cG.A0i((java.util.AbstractMap) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0116, code lost:
    
        if (r20.hasNext() == false) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0118, code lost:
    
        r19 = X.C3cH.A0l(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0128, code lost:
    
        if (r15.A2k(X.AnonymousClass001.A0F(r19.getValue())) != false) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
    
        if (r11 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012c, code lost:
    
        r11 = A0F(r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0130, code lost:
    
        r1 = r19.getKey();
        r0 = r19.getValue();
        r10 = r14.A01;
        r1 = X.C9410GHz.A00(r10, r1, 1);
        r6 = r14.A02;
        r0 = X.C9410GHz.A00(r6, r0, 2) + r1;
        r3 = new byte[r0];
        r2 = new X.GI5(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014d, code lost:
    
        r1 = r19.getKey();
        r0 = r19.getValue();
        X.C9410GHz.A02(r2, r10, r1, 1);
        X.C9410GHz.A02(r2, r6, r0, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015b, code lost:
    
        r1 = r2.A02 - r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0160, code lost:
    
        if (r1 > 0) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0162, code lost:
    
        if (r1 < 0) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        r11.A02((r21 << 3) | 2, new X.C9332GEp(r3));
        r20.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0174, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x076d A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0951 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r7v31, types: [X.Hs7] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:278:0x0506 -> B:269:0x04e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:316:0x058d -> B:319:0x0594). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A0R(X.GIS r36, java.lang.Object r37, byte[] r38, int r39, int r40, int r41) throws com.android.billingclient.v6 {
        /*
            Method dump skipped, instructions count: 2752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9409GHy.A0R(X.GIS, java.lang.Object, byte[], int, int, int):int");
    }

    @Override // X.GIK
    public final int A2g(GI0 gi0) {
        int i;
        int iHashCode;
        long jA03;
        int[] iArr = this.A06;
        int length = iArr.length;
        int iHashCode2 = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int i3 = iArr[i2 + 1];
            int i4 = (267386880 & i3) >>> 20;
            if (i4 <= 50) {
                long j = 1048575 & i3;
                switch (i4) {
                    case 0:
                        i = iHashCode2 * 53;
                        jA03 = Double.doubleToLongBits(AbstractC9404GHt.A00.A00(gi0, j));
                        byte[] bArr = AbstractC9307GDj.A00;
                        iHashCode = AnonymousClass002.A0A(jA03);
                        iHashCode2 = i + iHashCode;
                        break;
                    case 1:
                        i = iHashCode2 * 53;
                        iHashCode = Float.floatToIntBits(AbstractC9404GHt.A00.A01(gi0, j));
                        iHashCode2 = i + iHashCode;
                        break;
                    case 2:
                    case 3:
                    case 5:
                    case 14:
                    case 16:
                        i = iHashCode2 * 53;
                        jA03 = AbstractC9404GHt.A00.A03(gi0, j);
                        byte[] bArr2 = AbstractC9307GDj.A00;
                        iHashCode = AnonymousClass002.A0A(jA03);
                        iHashCode2 = i + iHashCode;
                        break;
                    case 4:
                    case 6:
                    case 11:
                    case 12:
                    case 13:
                    case 15:
                        i = iHashCode2 * 53;
                        iHashCode = AbstractC9404GHt.A00.A02(gi0, j);
                        iHashCode2 = i + iHashCode;
                        break;
                    case 7:
                        i = iHashCode2 * 53;
                        boolean zA0G = AbstractC9404GHt.A00.A0G(gi0, j);
                        byte[] bArr3 = AbstractC9307GDj.A00;
                        iHashCode = BV7.A02(zA0G ? 1 : 0);
                        iHashCode2 = i + iHashCode;
                        break;
                    case 8:
                        i = iHashCode2 * 53;
                        iHashCode = ((String) A0I(gi0, j)).hashCode();
                        iHashCode2 = i + iHashCode;
                        break;
                    case 9:
                    case 17:
                        iHashCode = C8j4.A0E(A0I(gi0, j), 37);
                        i = iHashCode2 * 53;
                        iHashCode2 = i + iHashCode;
                        break;
                    case 10:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                    case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                    case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                    case 40:
                    case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                    case 42:
                    case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                    case 44:
                    case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                    case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                    case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                    case 48:
                    case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                    case 50:
                        i = iHashCode2 * 53;
                        iHashCode = A0I(gi0, j).hashCode();
                        iHashCode2 = i + iHashCode;
                        break;
                }
            }
        }
        int i5 = this.A03;
        while (true) {
            int[] iArr2 = this.A07;
            if (i5 >= iArr2.length) {
                return gi0.b.hashCode() + (iHashCode2 * 53);
            }
            if (!A0P(gi0, 0, iArr2[i5])) {
                iHashCode2 = A0I(gi0, iArr[r3 + 1] & 1048575).hashCode() + (iHashCode2 * 53);
            }
            i5++;
        }
    }

    @Override // X.GIK
    public final GI0 A2i() {
        return (GI0) ((GI0) this.A04).A0E(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    @Override // X.GIK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A2j(java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9409GHy.A2j(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x001d, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x001d A[SYNTHETIC] */
    @Override // X.GIK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A2l(X.GI0 r12, X.GI0 r13) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9409GHy.A2l(X.GI0, X.GI0):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:491:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0ade  */
    @Override // X.GIK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A2o(X.GIQ r23, java.lang.Object r24) throws com.android.billingclient.u3 {
        /*
            Method dump skipped, instructions count: 3072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9409GHy.A2o(X.GIQ, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05bc  */
    @Override // X.GIK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A51(X.GI0 r22) throws com.android.billingclient.kb {
        /*
            Method dump skipped, instructions count: 1992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9409GHy.A51(X.GI0):int");
    }

    public C9409GHy(GIF gif, C9411GIa c9411GIa, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A06 = iArr;
        this.A08 = objArr;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = iArr2;
        this.A02 = i3;
        this.A03 = i4;
        this.A05 = c9411GIa;
        this.A04 = gif;
    }

    public static int A03(GIS gis, EnumC10217Grd enumC10217Grd, Class cls, byte[] bArr, int i, int i2) throws v6 {
        Object objValueOf;
        Object objValueOf2;
        int iA08;
        Object objValueOf3;
        switch (enumC10217Grd.ordinal()) {
            case 0:
                objValueOf = Double.valueOf(Double.longBitsToDouble(AbstractC7611F5y.A0I(bArr, i)));
                gis.A03 = objValueOf;
                return i + 8;
            case 1:
                objValueOf2 = Float.valueOf(Float.intBitsToFloat(AbstractC7611F5y.A0E(bArr, i)));
                gis.A03 = objValueOf2;
                return i + 4;
            case 2:
            case 3:
                iA08 = A08(gis, bArr, i);
                objValueOf3 = Long.valueOf(gis.A02);
                gis.A03 = objValueOf3;
                return iA08;
            case 4:
            case 12:
            case 13:
                iA08 = A07(gis, bArr, i);
                objValueOf3 = Integer.valueOf(gis.A00);
                gis.A03 = objValueOf3;
                return iA08;
            case 5:
            case 15:
                objValueOf = Long.valueOf(AbstractC7611F5y.A0I(bArr, i));
                gis.A03 = objValueOf;
                return i + 8;
            case 6:
            case 14:
                objValueOf2 = Integer.valueOf(AbstractC7611F5y.A0E(bArr, i));
                gis.A03 = objValueOf2;
                return i + 4;
            case 7:
                int iA082 = A08(gis, bArr, i);
                gis.A03 = Boolean.valueOf(AnonymousClass002.A1L((gis.A02 > 0L ? 1 : (gis.A02 == 0L ? 0 : -1))));
                return iA082;
            case 8:
                int iA07 = A07(gis, bArr, i);
                int i3 = gis.A00;
                if (i3 < 0) {
                    throw AbstractC7607F5u.A0q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                if (i3 == 0) {
                    gis.A03 = "";
                    return iA07;
                }
                gis.A03 = GEK.A00.A02(bArr, iA07, i3);
                return iA07 + i3;
            case 9:
            default:
                throw BV4.A0c("unsupported field type.");
            case 10:
                GIK gikA00 = GIL.A02.A00(cls);
                GI0 gi0A2i = gikA00.A2i();
                int iA00 = A00(gikA00, gis, gi0A2i, bArr, i, i2);
                gikA00.A52(gi0A2i);
                gis.A03 = gi0A2i;
                return iA00;
            case 11:
                return A06(gis, bArr, i);
            case 16:
                iA08 = A07(gis, bArr, i);
                objValueOf3 = Integer.valueOf(AbstractC7608F5v.A04(gis.A00));
                gis.A03 = objValueOf3;
                return iA08;
            case 17:
                iA08 = A08(gis, bArr, i);
                objValueOf3 = Long.valueOf(AbstractC7610F5x.A0T(gis.A02));
                gis.A03 = objValueOf3;
                return iA08;
        }
    }

    public static int A06(GIS gis, byte[] bArr, int i) throws v6 {
        int iA07 = A07(gis, bArr, i);
        int i2 = gis.A00;
        if (i2 < 0) {
            throw AbstractC7607F5u.A0q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int length = bArr.length;
        if (i2 > length - iA07) {
            throw AbstractC7607F5u.A0q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            gis.A03 = AbstractC9330GEn.A01;
            return iA07;
        }
        try {
            AbstractC9330GEn.A00(iA07, iA07 + i2, length);
            gis.A03 = new C9332GEp(AbstractC9330GEn.A00.A2n(bArr, iA07, i2));
            return iA07 + i2;
        } catch (v6 e) {
            throw Bb9.A00("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    private final Object A0G(int i, Object obj) {
        GIK gikA0C = A0C(i);
        long jA0P = AbstractC7609F5w.A0P(this.A06, i);
        if (!A0N(i, obj)) {
            return gikA0C.A2i();
        }
        Object object = A09.getObject(obj, jA0P);
        if (A0O(object)) {
            return object;
        }
        GI0 gi0A2i = gikA0C.A2i();
        if (object != null) {
            gikA0C.A2j(gi0A2i, object);
        }
        return gi0A2i;
    }

    private final Object A0H(Object obj, int i, int i2) {
        GIK gikA0C = A0C(i2);
        if (!A0P(obj, i, i2)) {
            return gikA0C.A2i();
        }
        Object object = A09.getObject(obj, AbstractC7609F5w.A0P(this.A06, i2));
        if (A0O(object)) {
            return object;
        }
        GI0 gi0A2i = gikA0C.A2i();
        if (object != null) {
            gikA0C.A2j(gi0A2i, object);
        }
        return gi0A2i;
    }

    private final boolean A0Q(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? A0N(i, obj) : AbstractC7609F5w.A1U(i3, i4);
    }

    @Override // X.GIK
    public final boolean A2m(Object obj) {
        boolean zA0Q;
        int i = 0;
        int i2 = 1048575;
        int i3 = 0;
        while (i < this.A02) {
            int i4 = this.A07[i];
            int[] iArr = this.A06;
            int i5 = iArr[i4 + 1];
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 == i2) {
                i7 = i2;
            } else if (i7 != 1048575) {
                i3 = A09.getInt(obj, i7);
            }
            if ((268435456 & i5) == 0 || A0Q(obj, i4, i7, i3, i8)) {
                int i9 = (267386880 & i5) >>> 20;
                if (i9 == 9 || i9 == 17) {
                    zA0Q = A0Q(obj, i4, i7, i3, i8);
                } else {
                    if (i9 != 27) {
                        if (i9 == 60 || i9 == 68) {
                            zA0Q = A0P(obj, iArr[i4], i4);
                        } else {
                            if (i9 != 49) {
                                if (i9 == 50) {
                                    AbstractMap abstractMap = (AbstractMap) A0I(obj, i5 & 1048575);
                                    if (!abstractMap.isEmpty() && ((GIO) this.A08[(i4 / 3) * 2]).A00.A02.a == EnumC10218Gre.MESSAGE) {
                                        Iterator itA0x = BV5.A0x(abstractMap);
                                        GIK gikA0Y = null;
                                        while (itA0x.hasNext()) {
                                            Object next = itA0x.next();
                                            if (gikA0Y == null) {
                                                gikA0Y = AbstractC7609F5w.A0Y(next);
                                            }
                                            if (!gikA0Y.A2m(next)) {
                                                return false;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i++;
                            i2 = i7;
                        }
                    }
                    List list = (List) A0I(obj, i5 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        GIK gikA0C = A0C(i4);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (gikA0C.A2m(list.get(i10))) {
                            }
                        }
                    }
                    i++;
                    i2 = i7;
                }
                if (zA0Q && !A0C(i4).A2m(A0I(obj, i5 & 1048575))) {
                    return false;
                }
                i++;
                i2 = i7;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040 A[SYNTHETIC] */
    @Override // X.GIK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A52(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = A0O(r10)
            if (r0 == 0) goto L88
            boolean r0 = r10 instanceof X.GI0
            r5 = 0
            if (r0 == 0) goto L1e
            r3 = r10
            X.GI0 r3 = (X.GI0) r3
            int r2 = r3.memoizedSerializedSize
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r1 | r2
            r3.memoizedSerializedSize = r0
            r3.a = r5
            r3.memoizedSerializedSize = r1
        L1e:
            int[] r7 = r9.A06
            int r6 = r7.length
            r4 = 0
        L22:
            if (r4 >= r6) goto L7e
            int r0 = r4 + 1
            r1 = r7[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r2 = (long) r0
            int r1 = X.AbstractC7608F5v.A03(r1)
            r0 = 9
            if (r1 == r0) goto L6a
            r0 = 60
            if (r1 == r0) goto L63
            r0 = 68
            if (r1 == r0) goto L63
            switch(r1) {
                case 17: goto L6a;
                case 18: goto L43;
                case 19: goto L43;
                case 20: goto L43;
                case 21: goto L43;
                case 22: goto L43;
                case 23: goto L43;
                case 24: goto L43;
                case 25: goto L43;
                case 26: goto L43;
                case 27: goto L43;
                case 28: goto L43;
                case 29: goto L43;
                case 30: goto L43;
                case 31: goto L43;
                case 32: goto L43;
                case 33: goto L43;
                case 34: goto L43;
                case 35: goto L43;
                case 36: goto L43;
                case 37: goto L43;
                case 38: goto L43;
                case 39: goto L43;
                case 40: goto L43;
                case 41: goto L43;
                case 42: goto L43;
                case 43: goto L43;
                case 44: goto L43;
                case 45: goto L43;
                case 46: goto L43;
                case 47: goto L43;
                case 48: goto L43;
                case 49: goto L43;
                case 50: goto L52;
                default: goto L40;
            }
        L40:
            int r4 = r4 + 3
            goto L22
        L43:
            java.lang.Object r1 = A0I(r10, r2)
            X.GDp r1 = (X.InterfaceC9313GDp) r1
            X.GDG r1 = (X.GDG) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L40
            r1.A00 = r5
            goto L40
        L52:
            sun.misc.Unsafe r8 = X.C9409GHy.A09
            java.lang.Object r1 = r8.getObject(r10, r2)
            if (r1 == 0) goto L40
            r0 = r1
            X.Hs7 r0 = (X.Hs7) r0
            r0.a = r5
            r8.putObject(r10, r2, r1)
            goto L40
        L63:
            r0 = r7[r4]
            boolean r0 = r9.A0P(r10, r0, r4)
            goto L6e
        L6a:
            boolean r0 = r9.A0N(r4, r10)
        L6e:
            if (r0 == 0) goto L40
            X.GIK r1 = r9.A0C(r4)
            sun.misc.Unsafe r0 = X.C9409GHy.A09
            java.lang.Object r0 = r0.getObject(r10, r2)
            r1.A52(r0)
            goto L40
        L7e:
            X.GI0 r10 = (X.GI0) r10
            X.GI4 r1 = r10.b
            boolean r0 = r1.A02
            if (r0 == 0) goto L88
            r1.A02 = r5
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9409GHy.A52(java.lang.Object):void");
    }
}
