package X;

import android.content.res.Resources;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import java.nio.BufferUnderflowException;

/* renamed from: X.DRc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5052DRc implements DSU {
    public final DS5 A00;
    public final DS4 A01;

    @Override // X.InterfaceC5054DRe
    public final synchronized void addChangeListener(DSh dSh) {
        Bs9 bs9 = DSd.A00;
        if (bs9 == null) {
            bs9 = new Bs9();
            DSd.A00 = bs9;
        }
        synchronized (bs9) {
            throw BV4.A0a("getConfigKey");
        }
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDoubleWithOptions(long j, C4992DKo c4992DKo) {
        return getDoubleWithOptions(j, DSC.A00(j), c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final long getLongWithOptions(long j, C4992DKo c4992DKo) {
        return getLongWithOptions(j, DSC.A01(j), c4992DKo);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer A00(X.C4992DKo r7, long r8) {
        /*
            boolean r0 = X.DS3.A02
            if (r0 == 0) goto L4a
            java.lang.String r1 = X.DS3.A01
            if (r1 == 0) goto L1c
            int r0 = r1.length()
            if (r0 == 0) goto L1c
            java.util.concurrent.ConcurrentMap<java.lang.String, X.DRs> r0 = X.DS3.A00
            java.lang.Object r1 = r0.get(r1)
            X.DRs r1 = (X.DRs) r1
        L16:
            if (r1 == 0) goto L4a
            java.lang.Object r6 = r1.A03
            monitor-enter(r6)
            goto L1e
        L1c:
            r1 = 0
            goto L16
        L1e:
            boolean r0 = r1.A01     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L25
            java.lang.Integer r0 = X.C79.A00     // Catch: java.lang.Throwable -> L47
            goto L45
        L25:
            X.AoO<X.DSc> r0 = r1.A02     // Catch: java.lang.Throwable -> L47
            java.lang.Object r5 = r0.A04(r8)     // Catch: java.lang.Throwable -> L47
            X.DSc r5 = (X.C5060DSc) r5     // Catch: java.lang.Throwable -> L47
            if (r5 != 0) goto L32
            java.lang.Integer r0 = X.C79.A00     // Catch: java.lang.Throwable -> L47
            goto L45
        L32:
            long r3 = r1.A00     // Catch: java.lang.Throwable -> L47
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L43
            long r1 = r5.A00     // Catch: java.lang.Throwable -> L47
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L43
            java.lang.Integer r0 = X.C79.A00     // Catch: java.lang.Throwable -> L47
            goto L45
        L43:
            java.lang.Integer r0 = X.C79.A0C     // Catch: java.lang.Throwable -> L47
        L45:
            monitor-exit(r6)
            goto L4c
        L47:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L4a:
            java.lang.Integer r0 = X.C79.A00
        L4c:
            java.lang.Integer r1 = X.C79.A0C
            if (r0 != r1) goto L5a
            boolean r0 = r7.A02
            if (r0 == 0) goto L59
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__FROM_SILENT_PUSH_FALLBACK
            r7.A01(r0)
        L59:
            return r1
        L5a:
            java.lang.Integer r1 = X.C79.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC5052DRc.A00(X.DKo, long):java.lang.Integer");
    }

    public final int A04() {
        int iA01;
        if (!(this instanceof C5056DRh)) {
            return 0;
        }
        try {
            DRy dRy = ((C5056DRh) this).A02;
            if (dRy == null || (iA01 = dRy.A01(48)) == 0) {
                return 0;
            }
            return ((DRt) dRy).A01.getInt(iA01 + ((DRt) dRy).A00);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public long A05() {
        return 0L;
    }

    public C4993DKp A07(long j) {
        return ((C4997DMn) this).A00;
    }

    public boolean A09() {
        return true;
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBoolean(C7491Exw<Boolean, ? extends Object> c7491Exw) {
        return getBooleanWithOptions(c7491Exw.A00, C4992DKo.A05);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean getBooleanWithOptions(long j, C4992DKo c4992DKo) {
        return getBooleanWithOptions(j, AnonymousClass002.A1M((((j >>> 61) & 1) > 1L ? 1 : (((j >>> 61) & 1) == 1L ? 0 : -1))), c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final double getDouble(C7491Exw<Double, ? extends Object> c7491Exw) {
        return getDoubleWithOptions(c7491Exw.A00, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final long getLong(C7491Exw<Long, ? extends Object> c7491Exw) {
        return getLongWithOptions(c7491Exw.A00, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final String getString(C7491Exw<String, ? extends Object> c7491Exw) {
        return getStringWithOptions(c7491Exw.A00, C4992DKo.A05);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean hasExposure(long j) {
        if (this instanceof C5056DRh) {
            return AnonymousClass002.A1L(((byte) C5056DRh.A00((C5056DRh) this, j)) & 6);
        }
        return false;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final void logExposure(long j) {
        if (this instanceof C5056DRh) {
            C5056DRh c5056DRh = (C5056DRh) this;
            if (c5056DRh.A02 != null) {
                int iA00 = C5056DRh.A00(c5056DRh, j);
                if ((((byte) iA00) & 6) != 0) {
                    C5056DRh.A03(c5056DRh, iA00, j);
                }
            }
        }
    }

    public AbstractC5052DRc(DS5 ds5, DS4 ds4) {
        this.A00 = ds5;
        this.A01 = ds4;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getStringWithOptions(long j, C4992DKo c4992DKo) {
        return getStringWithOptions(j, DSC.A02(j), c4992DKo);
    }

    public long A06(long j, long j2, boolean z) {
        return j2;
    }

    public String A08(String str, long j, boolean z) {
        return str;
    }

    public boolean A0A(long j, boolean z, boolean z2) {
        return z;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean getBoolean(long j, boolean z) {
        return getBooleanWithOptions(j, z, C4992DKo.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r1 != com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL) goto L23;
     */
    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getBooleanWithOptions(long r3, boolean r5, X.C4992DKo r6) {
        /*
            r2 = this;
            boolean r0 = X.CA6.A0B
            if (r0 == 0) goto L1c
            X.DS5 r1 = r2.A00
            if (r1 == 0) goto L1c
            boolean r0 = r1.hasBoolOverrideForParam(r3)
            if (r0 == 0) goto L1c
            boolean r0 = r6.A02
            if (r0 == 0) goto L17
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.OVERRIDE
            r6.A01(r0)
        L17:
            boolean r0 = r1.boolOverrideForParam(r3, r5)
            return r0
        L1c:
            java.lang.Integer r1 = A00(r6, r3)
            java.lang.Integer r0 = X.C79.A0C
            if (r1 == r0) goto L3f
            boolean r0 = r6.A02
            if (r0 == 0) goto L38
            X.DKp r0 = r2.A07(r3)
            r6.A00 = r0
            com.facebook.mobileconfig.factory.MobileConfigValueSource r1 = r0.A01
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.SERVER
            if (r1 == r0) goto L38
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL
            if (r1 != r0) goto L3f
        L38:
            boolean r0 = r6.A00
            boolean r0 = r2.A0A(r3, r5, r0)
            return r0
        L3f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC5052DRc.getBooleanWithOptions(long, boolean, X.DKo):boolean");
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDouble(long j, double d) {
        return getDoubleWithOptions(j, d, C4992DKo.A05);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDoubleWithOptions(long j, double d, C4992DKo c4992DKo) {
        C5056DRh c5056DRh;
        DRy dRy;
        Object[] objArr;
        String str;
        DS5 ds5;
        if (CA6.A0B && (ds5 = this.A00) != null && ds5.hasDoubleOverrideForParam(j)) {
            if (c4992DKo.A02) {
                c4992DKo.A01(MobileConfigValueSource.OVERRIDE);
            }
            return ds5.doubleOverrideForParam(j, d);
        }
        if (A00(c4992DKo, j) == C79.A0C) {
            return d;
        }
        if (c4992DKo.A02) {
            C4993DKp c4993DKpA07 = A07(j);
            c4992DKo.A00 = c4993DKpA07;
            MobileConfigValueSource mobileConfigValueSource = c4993DKpA07.A01;
            if (mobileConfigValueSource != MobileConfigValueSource.SERVER && mobileConfigValueSource != MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL) {
                return d;
            }
        }
        boolean z = ((AbstractC4991DKn) c4992DKo).A00;
        if (!(this instanceof C5056DRh) || (dRy = (c5056DRh = (C5056DRh) this).A02) == null || BV8.A04(j) != 4) {
            return d;
        }
        int i = (int) (j & 65535);
        try {
            int i2 = dRy.A02;
            if (i2 != 0) {
                int i3 = ((DRt) dRy).A01.getInt(dRy.A02(i2) + (i * 4));
                if ((((byte) i3) & 6) != 0) {
                    if (!z) {
                        C5056DRh.A03(c5056DRh, i3, j);
                    } else {
                        C5056DRh.A02(c5056DRh, i3);
                    }
                }
                if ((i3 & 17) != 0) {
                    return d;
                }
            }
            try {
                int i4 = dRy.A03;
                if (i4 != 0) {
                    d = ((DRt) dRy).A01.getDouble(dRy.A02(i4) + (i * 8));
                    return d;
                }
                return 0.0d;
            } catch (IndexOutOfBoundsException | BufferUnderflowException e) {
                objArr = new Object[]{e};
                str = "Failed to get double value from config table";
                BzX.A00("MobileConfigContextV2Impl", str, objArr);
                return d;
            }
        } catch (IndexOutOfBoundsException | BufferUnderflowException e2) {
            objArr = new Object[]{e2};
            str = "Failed to get double meta from config table";
        }
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final long getLong(long j, long j2) {
        return getLongWithOptions(j, j2, C4992DKo.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r1 != com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL) goto L23;
     */
    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long getLongWithOptions(long r3, long r5, X.C4992DKo r7) {
        /*
            r2 = this;
            boolean r0 = X.CA6.A0B
            if (r0 == 0) goto L1c
            X.DS5 r1 = r2.A00
            if (r1 == 0) goto L1c
            boolean r0 = r1.hasIntOverrideForParam(r3)
            if (r0 == 0) goto L1c
            boolean r0 = r7.A02
            if (r0 == 0) goto L17
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.OVERRIDE
            r7.A01(r0)
        L17:
            long r0 = r1.intOverrideForParam(r3, r5)
            return r0
        L1c:
            java.lang.Integer r1 = A00(r7, r3)
            java.lang.Integer r0 = X.C79.A0C
            if (r1 == r0) goto L3f
            boolean r0 = r7.A02
            if (r0 == 0) goto L38
            X.DKp r0 = r2.A07(r3)
            r7.A00 = r0
            com.facebook.mobileconfig.factory.MobileConfigValueSource r1 = r0.A01
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.SERVER
            if (r1 == r0) goto L38
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL
            if (r1 != r0) goto L3f
        L38:
            boolean r7 = r7.A00
            long r0 = r2.A06(r3, r5, r7)
            return r0
        L3f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC5052DRc.getLongWithOptions(long, long, X.DKo):long");
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getString(long j, int i, Resources resources) {
        return getStringWithOptions(j, i, resources, C4992DKo.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r1 != com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL) goto L13;
     */
    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getStringWithOptions(long r3, java.lang.String r5, X.C4992DKo r6) {
        /*
            r2 = this;
            boolean r0 = X.CA6.A0B
            if (r0 == 0) goto L24
            X.DS5 r1 = r2.A00
            if (r1 == 0) goto L24
            boolean r0 = r1.hasStringOverrideForParam(r3)
            if (r0 == 0) goto L24
            boolean r0 = r6.A02
            if (r0 == 0) goto L17
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.OVERRIDE
            r6.A01(r0)
        L17:
            java.lang.String r1 = r1.stringOverrideForParam(r3, r5)
            java.lang.String r0 = "__fbt_null__"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
        L23:
            return r5
        L24:
            java.lang.Integer r1 = A00(r6, r3)
            java.lang.Integer r0 = X.C79.A0C
            if (r1 == r0) goto L23
            boolean r0 = r6.A02
            if (r0 == 0) goto L40
            X.DKp r0 = r2.A07(r3)
            r6.A00 = r0
            com.facebook.mobileconfig.factory.MobileConfigValueSource r1 = r0.A01
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.SERVER
            if (r1 == r0) goto L40
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL
            if (r1 != r0) goto L23
        L40:
            boolean r0 = r6.A00
            java.lang.String r1 = r2.A08(r5, r3, r0)
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC5052DRc.getStringWithOptions(long, java.lang.String, X.DKo):java.lang.String");
    }

    @Override // X.InterfaceC5054DRe
    public final boolean hasExposure(C7491Exw<?, ? extends Object> c7491Exw) {
        return hasExposure(c7491Exw.A00);
    }

    @Override // X.InterfaceC5054DRe
    public final void logExposure(C7491Exw<?, ?> c7491Exw) {
        logExposure(c7491Exw.A00);
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBoolean(C7491Exw<Boolean, ? extends Object> c7491Exw, boolean z) {
        return getBoolean(c7491Exw.A00, z);
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBooleanWithOptions(C7491Exw<Boolean, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        return getBooleanWithOptions(c7491Exw.A00, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final double getDouble(C7491Exw<Double, ? extends Object> c7491Exw, double d) {
        return getDouble(c7491Exw.A00, d);
    }

    @Override // X.InterfaceC5054DRe
    public final double getDoubleWithOptions(C7491Exw<Double, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        return getDoubleWithOptions(c7491Exw.A00, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final long getLong(C7491Exw<Long, ? extends Object> c7491Exw, long j) {
        return getLong(c7491Exw.A00, j);
    }

    @Override // X.InterfaceC5054DRe
    public final long getLongWithOptions(C7491Exw<Long, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        return getLongWithOptions(c7491Exw.A00, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getString(long j, String str) {
        return getStringWithOptions(j, str, C4992DKo.A05);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getStringWithOptions(long j, int i, Resources resources, C4992DKo c4992DKo) {
        String stringWithOptions = getStringWithOptions(j, (String) null, c4992DKo);
        if (stringWithOptions == null) {
            return resources.getString(i);
        }
        return stringWithOptions;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean getBoolean(long j) {
        return getBooleanWithOptions(j, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBooleanWithOptions(C7491Exw<Boolean, ? extends Object> c7491Exw, boolean z, C4992DKo c4992DKo) {
        return getBooleanWithOptions(c7491Exw.A00, z, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDouble(long j) {
        return getDoubleWithOptions(j, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final double getDoubleWithOptions(C7491Exw<Double, ? extends Object> c7491Exw, double d, C4992DKo c4992DKo) {
        return getDoubleWithOptions(c7491Exw.A00, d, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final long getLong(long j) {
        return getLongWithOptions(j, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final long getLongWithOptions(C7491Exw<Long, ? extends Object> c7491Exw, long j, C4992DKo c4992DKo) {
        return getLongWithOptions(c7491Exw.A00, j, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final String getString(C7491Exw<String, ? extends Object> c7491Exw, int i, Resources resources) {
        return getString(c7491Exw.A00, i, resources);
    }

    @Override // X.InterfaceC5054DRe
    public final String getStringWithOptions(C7491Exw<String, ? extends Object> c7491Exw, int i, Resources resources, C4992DKo c4992DKo) {
        return getStringWithOptions(c7491Exw.A00, i, resources, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final String getString(C7491Exw<String, ? extends Object> c7491Exw, String str) {
        return getString(c7491Exw.A00, str);
    }

    @Override // X.InterfaceC5054DRe
    public final String getStringWithOptions(C7491Exw<String, ? extends Object> c7491Exw, String str, C4992DKo c4992DKo) {
        return getStringWithOptions(c7491Exw.A00, str, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getString(long j) {
        return getStringWithOptions(j, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final String getStringWithOptions(C7491Exw<String, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        return getStringWithOptions(c7491Exw.A00, c4992DKo);
    }
}
