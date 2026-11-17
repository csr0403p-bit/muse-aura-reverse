package X;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.DRh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5056DRh extends AbstractC5052DRc implements DSU {
    public DST A00;
    public DST A01;
    public final DRy A02;
    public final DSZ A03;
    public final InterfaceC5058DRj A04;
    public final F18<List<String>> A05;

    public C5056DRh(DSZ dsz, InterfaceC5058DRj interfaceC5058DRj, DS5 ds5, DS4 ds4) {
        ByteBuffer javaByteBuffer;
        int iA01;
        int iA012;
        short s;
        short s2;
        super(ds5, ds4);
        this.A04 = interfaceC5058DRj;
        this.A03 = dsz;
        DRy dRy = null;
        if (dsz != null && (javaByteBuffer = dsz.getJavaByteBuffer()) != null && javaByteBuffer.capacity() > 0) {
            DRy dRy2 = new DRy();
            javaByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            ((DRt) dRy2).A00 = javaByteBuffer.getInt(javaByteBuffer.position()) + javaByteBuffer.position();
            ((DRt) dRy2).A01 = javaByteBuffer;
            try {
                int iA013 = dRy2.A01(28);
                if (iA013 != 0 && ((DRt) dRy2).A01.getInt(iA013 + ((DRt) dRy2).A00) == 123456 && (((iA01 = dRy2.A01(34)) != 0 && ((DRt) dRy2).A01.getInt(iA01 + ((DRt) dRy2).A00) == 123456) || (iA012 = dRy2.A01(34)) == 0 || ((DRt) dRy2).A01.getInt(iA012 + ((DRt) dRy2).A00) == 0)) {
                    dRy2.A01 = dRy2.A01(6);
                    dRy2.A00 = dRy2.A01(8);
                    dRy2.A06 = dRy2.A01(10);
                    dRy2.A05 = dRy2.A01(12);
                    dRy2.A01(14);
                    dRy2.A01(16);
                    dRy2.A03 = dRy2.A01(18);
                    dRy2.A02 = dRy2.A01(20);
                    dRy2.A08 = dRy2.A01(22);
                    dRy2.A07 = dRy2.A01(24);
                    dRy2.A04 = dRy2.A01(26);
                    dRy2.A09 = dRy2.A01(42);
                    int iA014 = dRy2.A01(32);
                    if (iA014 != 0) {
                        int iA03 = dRy2.A03(iA014);
                        if (iA03 <= 65536) {
                            for (int i = 0; i < iA03; i++) {
                                int iA015 = dRy2.A01(32);
                                if (iA015 != 0) {
                                    int iA02 = dRy2.A02(iA015) + (i * 4);
                                    int i2 = iA02 + ((DRt) dRy2).A01.getInt(iA02);
                                    ByteBuffer byteBuffer = ((DRt) dRy2).A01;
                                    Map<Integer, Integer> map = dRy2.A0A;
                                    int i3 = i2 - byteBuffer.getInt(i2);
                                    Integer numValueOf = Integer.valueOf((8 >= byteBuffer.getShort(i3) || (s2 = byteBuffer.getShort(i3 + 8)) == 0) ? 0 : byteBuffer.getInt(s2 + i2));
                                    int i4 = i2 - byteBuffer.getInt(i2);
                                    map.put(numValueOf, Integer.valueOf((6 >= byteBuffer.getShort(i4) || (s = byteBuffer.getShort(i4 + 6)) == 0) ? 0 : byteBuffer.getInt(s + i2)));
                                }
                            }
                            dRy = dRy2;
                        }
                    } else {
                        dRy = dRy2;
                    }
                } else {
                    int iA016 = dRy2.A01(28);
                    if (iA016 != 0) {
                        ((DRt) dRy2).A01.getInt(iA016 + ((DRt) dRy2).A00);
                    }
                    int iA017 = dRy2.A01(34);
                    if (iA017 != 0) {
                        ((DRt) dRy2).A01.getInt(iA017 + ((DRt) dRy2).A00);
                    }
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        this.A02 = dRy;
        ArrayList arrayListA0h = C3cG.A0h();
        if (dRy != null) {
            try {
                try {
                    int iA018 = dRy.A01(26);
                    iA03 = iA018 != 0 ? dRy.A03(iA018) : 0;
                    int i5 = 0;
                    while (true) {
                        try {
                            DRy dRy3 = this.A02;
                            int iA019 = dRy3.A01(42);
                            if (i5 >= (iA019 != 0 ? dRy3.A03(iA019) : 0)) {
                                break;
                            }
                            DRy dRy4 = this.A02;
                            int i6 = dRy4.A09;
                            arrayListA0h.add(i6 != 0 ? dRy4.A04(dRy4.A02(i6) + (i5 * 4)) : null);
                            i5++;
                        } catch (IndexOutOfBoundsException | BufferUnderflowException e) {
                            e = e;
                            BzX.A00("MobileConfigContextV2Impl", "Failed to initialize config table data due to corrupted flatbuffer", e);
                            this.A01 = new DST(iA03);
                            this.A00 = new DST(iA03);
                            this.A05 = new C7447EwH(new C7603F5q(arrayListA0h, 4));
                        }
                    }
                } catch (IndexOutOfBoundsException | BufferUnderflowException e2) {
                    e = e2;
                    iA03 = 0;
                }
            } catch (Throwable th) {
                this.A01 = new DST(iA03);
                this.A00 = new DST(iA03);
                throw th;
            }
        }
        this.A01 = new DST(iA03);
        this.A00 = new DST(iA03);
        this.A05 = new C7447EwH(new C7603F5q(arrayListA0h, 4));
    }

    public static int A00(C5056DRh c5056DRh, long j) {
        int i = (int) ((j >>> 48) & 63);
        int i2 = (int) (j & 65535);
        DRy dRy = c5056DRh.A02;
        if (dRy != null) {
            try {
            } catch (IndexOutOfBoundsException | BufferUnderflowException e) {
                BzX.A00("MobileConfigContextV2Impl", "Failed to get meta from config table", e);
            }
            if (i == 0) {
                CFK.A04("MobileConfigContextV2Impl", String.format(Locale.ROOT, "Null type specifier is given: %d", Long.valueOf(j)));
                return DSY.A02;
            }
            if (i == 1) {
                int i3 = dRy.A00;
                if (i3 != 0) {
                    return ((DRt) dRy).A01.getInt(dRy.A02(i3) + (i2 * 4));
                }
                return 0;
            }
            if (i == 2) {
                int i4 = dRy.A05;
                if (i4 != 0) {
                    return ((DRt) dRy).A01.getInt(dRy.A02(i4) + (i2 * 4));
                }
                return 0;
            }
            if (i == 3) {
                int i5 = dRy.A07;
                if (i5 != 0) {
                    return ((DRt) dRy).A01.getInt(dRy.A02(i5) + (i2 * 4));
                }
                return 0;
            }
            if (i == 4) {
                int i6 = dRy.A02;
                if (i6 != 0) {
                    return ((DRt) dRy).A01.getInt(dRy.A02(i6) + (i2 * 4));
                }
                return 0;
            }
            CFK.A04("MobileConfigContextV2Impl", String.format(Locale.ROOT, "Fail to get meta for spec: %d", Long.valueOf(j)));
        }
        return DSY.A01;
    }

    private String A01() {
        String strA0n = "";
        try {
            List<String> listAMN = this.A05.AMN();
            if (!listAMN.isEmpty()) {
                strA0n = C60Q.A0n(listAMN, 0);
                return strA0n;
            }
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | OutOfMemoryError | BufferUnderflowException e) {
            BzX.A00("MobileConfigContextV2Impl", "Failed to get exposure unit ID", e);
        }
        return strA0n;
    }

    public static final void A02(C5056DRh c5056DRh, int i) {
        Object[] objArr;
        String str;
        InterfaceC5058DRj interfaceC5058DRj = c5056DRh.A04;
        DRy dRy = c5056DRh.A02;
        if (dRy == null || (((byte) i) & 6) == 0) {
            return;
        }
        int i2 = (i >>> 8) & 16777215;
        try {
            if (c5056DRh.A00.A00.compareAndSet(i2, 0, 1)) {
                try {
                    int i3 = dRy.A04;
                    if (i3 != 0) {
                        String strA04 = dRy.A04(dRy.A02(i3) + (i2 * 4));
                        if (strA04.isEmpty()) {
                            return;
                        }
                        String strA01 = c5056DRh.A01();
                        if (strA01 == null) {
                            strA01 = "";
                        }
                        interfaceC5058DRj.logAccessWithoutExposure(strA04, strA01);
                    }
                } catch (IndexOutOfBoundsException | NegativeArraySizeException | OutOfMemoryError | BufferUnderflowException e) {
                    objArr = new Object[]{e};
                    str = "Failed to get logging ID for access without exposure";
                    BzX.A00("MobileConfigContextV2Impl", str, objArr);
                }
            }
        } catch (IndexOutOfBoundsException | BufferUnderflowException e2) {
            objArr = new Object[]{e2};
            str = "Failed to check access without exposure rate limiter due to corrupted data";
        }
    }

    public static final void A03(C5056DRh c5056DRh, int i, long j) {
        Object[] objArr;
        String str;
        InterfaceC5058DRj interfaceC5058DRj = c5056DRh.A04;
        DRy dRy = c5056DRh.A02;
        if (dRy == null || (((byte) i) & 6) == 0) {
            return;
        }
        int i2 = (i >>> 8) & 16777215;
        try {
            if (c5056DRh.A01.A00.compareAndSet(i2, 0, 1)) {
                try {
                    int i3 = dRy.A04;
                    if (i3 != 0) {
                        String strA04 = dRy.A04(dRy.A02(i3) + (i2 * 4));
                        if (strA04.isEmpty()) {
                            return;
                        }
                        String strA01 = c5056DRh.A01();
                        String stackTraceString = AnonymousClass002.A1L(i & 8) ? Log.getStackTraceString(new Throwable()) : "";
                        if (strA01 == null) {
                            strA01 = "";
                        }
                        interfaceC5058DRj.logExposure(strA04, j, stackTraceString, strA01);
                    }
                } catch (IndexOutOfBoundsException | NegativeArraySizeException | OutOfMemoryError | BufferUnderflowException e) {
                    objArr = new Object[]{e};
                    str = "Failed to get logging ID for exposure";
                    BzX.A00("MobileConfigContextV2Impl", str, objArr);
                }
            }
        } catch (IndexOutOfBoundsException | BufferUnderflowException e2) {
            objArr = new Object[]{e2};
            str = "Failed to check exposure rate limiter due to corrupted data";
        }
    }

    @Override // X.AbstractC5052DRc
    public final long A05() {
        long j = -1;
        try {
            DRy dRy = this.A02;
            if (dRy == null) {
                return -1L;
            }
            int iA01 = dRy.A01(36);
            if (iA01 == 0) {
                return 0L;
            }
            j = ((DRt) dRy).A01.getLong(iA01 + ((DRt) dRy).A00);
            return j;
        } catch (IndexOutOfBoundsException unused) {
            return j;
        }
    }

    @Override // X.AbstractC5052DRc
    public final long A06(long j, long j2, boolean z) {
        Object[] objArr;
        String str;
        DRy dRy = this.A02;
        if (dRy != null && ((int) ((j >>> 48) & 63)) == 2) {
            int i = (int) (j & 65535);
            try {
                int i2 = dRy.A05;
                if (i2 != 0) {
                    int i3 = ((DRt) dRy).A01.getInt(dRy.A02(i2) + (i * 4));
                    if ((((byte) i3) & 6) != 0) {
                        if (z) {
                            A02(this, i3);
                        } else {
                            A03(this, i3, j);
                        }
                    }
                    if ((i3 & 17) != 0) {
                        return j2;
                    }
                }
            } catch (IndexOutOfBoundsException | BufferUnderflowException e) {
                objArr = new Object[]{e};
                str = "Failed to get long meta from config table";
            }
            try {
                int i4 = dRy.A06;
                if (i4 == 0) {
                    return 0L;
                }
                j2 = ((DRt) dRy).A01.getLong(dRy.A02(i4) + (i * 8));
                return j2;
            } catch (IndexOutOfBoundsException | BufferUnderflowException e2) {
                objArr = new Object[]{e2};
                str = "Failed to get long value from config table";
                BzX.A00("MobileConfigContextV2Impl", str, objArr);
                return j2;
            }
        }
        return j2;
    }

    @Override // X.AbstractC5052DRc
    public final String A08(String str, long j, boolean z) {
        Object[] objArr;
        String str2;
        DRy dRy = this.A02;
        if (dRy != null && ((int) ((j >>> 48) & 63)) == 3) {
            int i = (int) (j & 65535);
            try {
                int i2 = dRy.A07;
                int i3 = i2 != 0 ? ((DRt) dRy).A01.getInt(dRy.A02(i2) + (i * 4)) : 0;
                if ((((byte) i3) & 6) != 0) {
                    if (z) {
                        A02(this, i3);
                    } else {
                        A03(this, i3, j);
                    }
                }
                if (!((i3 & 17) != 0)) {
                    try {
                        int i4 = dRy.A08;
                        String strA04 = i4 != 0 ? dRy.A04(dRy.A02(i4) + (i * 4)) : null;
                        if (strA04 != null) {
                            return strA04;
                        }
                    } catch (IndexOutOfBoundsException | NegativeArraySizeException | OutOfMemoryError | BufferUnderflowException e) {
                        objArr = new Object[]{e};
                        str2 = "Failed to get string value from config table";
                        BzX.A00("MobileConfigContextV2Impl", str2, objArr);
                        return str;
                    }
                }
            } catch (IndexOutOfBoundsException | BufferUnderflowException e2) {
                objArr = new Object[]{e2};
                str2 = "Failed to get string meta from config table";
            }
        }
        return str;
    }

    @Override // X.AbstractC5052DRc
    public final boolean A09() {
        return this.A02 != null;
    }

    @Override // X.AbstractC5052DRc
    public final boolean A0A(long j, boolean z, boolean z2) {
        DRy dRy = this.A02;
        if (dRy != null && ((int) ((j >>> 48) & 63)) == 1) {
            int i = (int) (j & 65535);
            try {
                int i2 = dRy.A01;
                if (i2 == 0) {
                    return false;
                }
                byte b = ((DRt) dRy).A01.get(dRy.A02(i2) + i);
                if ((b & 6) != 0) {
                    int i3 = DSY.A00;
                    try {
                        int i4 = dRy.A00;
                        if (i4 != 0) {
                            i3 = ((DRt) dRy).A01.getInt(dRy.A02(i4) + (i * 4));
                        } else {
                            i3 = 0;
                        }
                    } catch (IndexOutOfBoundsException | BufferUnderflowException e) {
                        BzX.A00("MobileConfigContextV2Impl", "Failed to get boolean meta from config table", e);
                    }
                    if (z2) {
                        A02(this, i3);
                    } else {
                        A03(this, i3, j);
                    }
                }
                if ((b & 17) == 0) {
                    z = true;
                    if ((b >>> 7) == 0) {
                        return false;
                    }
                }
            } catch (IndexOutOfBoundsException | BufferUnderflowException e2) {
                BzX.A00("MobileConfigContextV2Impl", "Failed to get boolean data from config table", e2);
            }
        }
        return z;
    }

    @Override // X.InterfaceC5054DRe
    public final Map<Integer, Integer> getEmergencyPushInfo() {
        DRy dRy = this.A02;
        if (dRy != null) {
            try {
                return dRy.A0A;
            } catch (IndexOutOfBoundsException | BufferUnderflowException e) {
                BzX.A00("MobileConfigContextV2Impl", "Failed to get emergency push info due to corrupted data", e);
            }
        }
        return BV4.A0u();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    @Override // X.AbstractC5052DRc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4993DKp A07(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.A09()
            if (r0 != 0) goto L10
            com.facebook.mobileconfig.factory.MobileConfigValueSource r2 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__NO_DATA_ON_DISK
        L8:
            r0 = -1
        La:
            X.DKp r3 = new X.DKp
            r3.<init>(r2, r0)
            return r3
        L10:
            int r5 = A00(r6, r7)
            int r0 = X.DSY.A00
            if (r5 == r0) goto L5e
            r0 = 17
            if (r5 == r0) goto L5e
            int r0 = X.DSY.A02
            if (r5 != r0) goto L2b
            com.facebook.mobileconfig.factory.MobileConfigValueSource r2 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__MISSING_SERVER_VALUE_INVALID_TYPE
        L22:
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__MISSING_SERVER_VALUE
            if (r2 == r0) goto L8
            long r0 = r6.A05()
            goto La
        L2b:
            int r0 = X.DSY.A01
            if (r5 != r0) goto L32
            com.facebook.mobileconfig.factory.MobileConfigValueSource r2 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__MISSING_SERVER_VALUE_INVALID_SLOT_ID
            goto L22
        L32:
            r0 = r5 & 16
            r4 = 2
            r3 = 0
            r2 = 0
            if (r0 == 0) goto L3a
            r2 = 2
        L3a:
            r1 = 1
            r0 = r5 & 1
            if (r0 == 0) goto L40
            r3 = 1
        L40:
            r2 = r2 | r3
            if (r2 == 0) goto L5b
            if (r2 == r1) goto L58
            if (r2 == r4) goto L55
            r0 = 3
            if (r2 == r0) goto L5e
            java.lang.String r1 = "MobileConfigTableUtil"
            java.lang.String r0 = "should never reach default case in getValueSource"
            X.CFK.A04(r1, r0)
            com.facebook.mobileconfig.factory.MobileConfigValueSource r2 = com.facebook.mobileconfig.factory.MobileConfigValueSource.UNKNOWN
            goto L22
        L55:
            com.facebook.mobileconfig.factory.MobileConfigValueSource r2 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL_EMPTY_UNIT_ID
            goto L22
        L58:
            com.facebook.mobileconfig.factory.MobileConfigValueSource r2 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL
            goto L22
        L5b:
            com.facebook.mobileconfig.factory.MobileConfigValueSource r2 = com.facebook.mobileconfig.factory.MobileConfigValueSource.SERVER
            goto L22
        L5e:
            com.facebook.mobileconfig.factory.MobileConfigValueSource r2 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__MISSING_SERVER_VALUE
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5056DRh.A07(long):X.DKp");
    }

    @Override // X.InterfaceC5054DRe
    public final boolean isAdvancedConsistencyLoggingEnabled(long j) {
        return AnonymousClass002.A1L(A00(this, j) & 64);
    }
}
