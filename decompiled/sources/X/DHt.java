package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.QuickEventImpl;
import com.facebook.quicklog.QuickPerformanceLoggerGKs;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class DHt extends MarkerEditor implements PointEditor {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public CPI A06;
    public String A07;
    public boolean A08;
    public int A09;
    public final DI1 A0A;
    public final QuickEventImpl A0B;
    public final QuickPerformanceLoggerGKs A0C;
    public final DHu A0D;

    public DHt(DI1 di1, QuickEventImpl quickEventImpl, QuickPerformanceLoggerGKs quickPerformanceLoggerGKs, DHu dHu) {
        C7384Etj.A0Y(di1, 3);
        this.A0D = dHu;
        this.A0B = quickEventImpl;
        this.A0A = di1;
        this.A0C = quickPerformanceLoggerGKs;
        this.A09 = 7;
        this.A03 = -1;
        this.A00 = -1;
        this.A04 = -1;
        this.A01 = -1;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final void asBatch(DBT dbt) {
        C7384Etj.A0Y(dbt, 0);
        QuickPerformanceLoggerGKs quickPerformanceLoggerGKs = this.A0C;
        if (quickPerformanceLoggerGKs == null || !quickPerformanceLoggerGKs.shouldOptimiseBatchMutations()) {
            super.asBatch(dbt);
            return;
        }
        QuickEventImpl quickEventImpl = this.A0B;
        DI5 di5 = new DI5(this, dbt);
        DHr dHr = quickEventImpl.A0S;
        dHr.A01();
        try {
            di5.run();
            dHr.A02();
            markerEditingCompleted();
        } catch (Throwable th) {
            dHr.A02();
            throw th;
        }
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor point(String str, String str2, long j) {
        C7384Etj.A0Y(str, 0);
        int iA0e = this.A0D.A0e(this.A0B, str, str2, TimeUnit.MILLISECONDS, this.A09, 0, j, this.A08);
        if (this.A08 && iA0e >= 0) {
            if (this.A04 < 0) {
                this.A04 = iA0e;
            }
            this.A01 = iA0e;
        }
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final PointEditor pointEditor(String str) {
        C7384Etj.A0Y(str, 0);
        this.A07 = str;
        this.A05 = -1L;
        this.A02 = 0;
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor pointWithMetadata(String str, String str2, long j) {
        C7384Etj.A0Y(str, 0);
        int iA0e = this.A0D.A0e(this.A0B, str, str2, TimeUnit.MILLISECONDS, this.A09, 1, j, this.A08);
        if (this.A08 && iA0e >= 0) {
            if (this.A04 < 0) {
                this.A04 = iA0e;
            }
            this.A01 = iA0e;
        }
        return this;
    }

    private final CPI A00() {
        CPI cpi = this.A06;
        if (cpi != null) {
            return cpi;
        }
        CPI cpi2 = new CPI();
        this.A06 = cpi2;
        return cpi2;
    }

    public static void A01(DHt dHt, int i) {
        if (!dHt.A08 || i < 0) {
            return;
        }
        if (dHt.A03 < 0) {
            dHt.A03 = i;
        }
        dHt.A00 = i;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final boolean isSampled() {
        return true;
    }

    @Override // com.facebook.quicklog.MarkerEditor, com.facebook.quicklog.PointEditor
    public final void markerEditingCompleted() {
        if (this.A07 != null) {
            pointEditingCompleted();
        }
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor pointCustomTimestamp(long j) {
        if (this.A02 == 1 && j != -1) {
            throw new IllegalStateException("You can't collect metadata with custom timestamp, as point appeared in the past but metadata is to be collected in the present");
        }
        this.A05 = j;
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final MarkerEditor pointEditingCompleted() {
        int iA05;
        String str = this.A07;
        if (str == null) {
            throw new IllegalStateException("You should not use PointEditor after point was completed");
        }
        CPI cpi = this.A06;
        if (cpi != null) {
            cpi.A03 = true;
        }
        DHu dHu = this.A0D;
        QuickEventImpl quickEventImpl = this.A0B;
        int i = this.A09;
        CPI cpi2 = this.A06;
        long j = this.A05;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int i2 = this.A02;
        boolean z = this.A08;
        DI8.A02("qpl.markerPointEvent", Integer.valueOf(quickEventImpl.mMarkerId));
        try {
            if (DHu.A0c(str)) {
                iA05 = dHu.A07.A05(cpi2, DHu.A07(dHu), quickEventImpl, str, TimeUnit.NANOSECONDS, i, i2, DHu.A01(dHu, timeUnit, j), !(j == -1), z);
                if (iA05 >= 0) {
                    int i3 = quickEventImpl.mMarkerId;
                    if (DHu.A0a(dHu)) {
                        DHu.A0T(dHu, "markerPoint", str, cpi2 == null ? null : cpi2.toString(), i3);
                    }
                }
            } else {
                DI8.A00();
                iA05 = -1;
            }
            if (this.A08 && iA05 >= 0) {
                if (this.A04 < 0) {
                    this.A04 = iA05;
                }
                this.A01 = iA05;
            }
            this.A07 = null;
            this.A06 = null;
            this.A05 = -1L;
            this.A02 = 0;
            return this;
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor pointShouldIncludeMetadata(boolean z) {
        int i;
        if (!z) {
            i = 0;
        } else {
            if (this.A05 != -1) {
                throw new IllegalStateException("You can't collect metadata with custom timestamp, as point appeared in the past but metadata is to be collected in the present");
            }
            i = 1;
        }
        this.A02 = i;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // com.facebook.quicklog.MarkerEditor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.quicklog.MarkerEditor setSurviveUserSwitch(boolean r6) {
        /*
            r5 = this;
            X.DHu r3 = r5.A0D
            com.facebook.quicklog.QuickEventImpl r4 = r5.A0B
            boolean r2 = r5.A08
            int r0 = r4.mMarkerId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "qpl.markerConfigure"
            X.DI8.A02(r0, r1)
            if (r2 != 0) goto L18
            X.DHr r0 = r4.A0S     // Catch: java.lang.Throwable -> L4f
            r0.A01()     // Catch: java.lang.Throwable -> L4f
        L18:
            r4.A0O = r6     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r0 = move-exception
            if (r2 != 0) goto L4e
            X.DHr.A00(r4)     // Catch: java.lang.Throwable -> L4f
            goto L4e
        L22:
            if (r2 != 0) goto L27
            X.DHr.A00(r4)     // Catch: java.lang.Throwable -> L4f
        L27:
            java.lang.String r0 = "qpl.crashResiliency"
            X.DI8.A01(r0)     // Catch: java.lang.Throwable -> L4f
            X.DIA r3 = r3.A0X     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L43
            boolean r0 = r4.A0N     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L39
            boolean r1 = r4.A0O     // Catch: java.lang.Throwable -> L4a
            r0 = 0
            if (r1 == 0) goto L3a
        L39:
            r0 = 1
        L3a:
            int r2 = r4.mMarkerId     // Catch: java.lang.Throwable -> L4a
            int r1 = r4.A02     // Catch: java.lang.Throwable -> L4a
            r0 = r0 ^ 1
            r3.AaR(r2, r1, r0)     // Catch: java.lang.Throwable -> L4a
        L43:
            X.DI8.A00()     // Catch: java.lang.Throwable -> L4f
            X.DI8.A00()
            return r5
        L4a:
            r0 = move-exception
            X.DI8.A00()     // Catch: java.lang.Throwable -> L4f
        L4e:
            throw r0     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            X.DI8.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHt.setSurviveUserSwitch(boolean):com.facebook.quicklog.MarkerEditor");
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor withLevel(int i) {
        this.A09 = i;
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, double d) {
        C7384Etj.A0Y(str, 0);
        if (!AnonymousClass002.A1M(str.length())) {
            A00().A00(str, String.valueOf(d), 6);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, float f) {
        C7384Etj.A0Y(str, 0);
        if (!AnonymousClass002.A1M(str.length())) {
            A00().A00(str, String.valueOf(f), 6);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, int i) {
        C7384Etj.A0Y(str, 0);
        if (!AnonymousClass002.A1M(str.length())) {
            A00().A00(str, String.valueOf(i), 2);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, long j) {
        C7384Etj.A0Y(str, 0);
        if (!AnonymousClass002.A1M(str.length())) {
            A00().A00(str, String.valueOf(j), 3);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if ((!AnonymousClass002.A1M(str.length())) && str2 != null) {
            A00().A00(str, str2, 1);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        if (!AnonymousClass002.A1M(str.length())) {
            A00().A00(str, String.valueOf(z), 8);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, double[] dArr) {
        String strA0p;
        AnonymousClass003.A0u(str, dArr);
        if (!AnonymousClass002.A1M(str.length())) {
            CPI cpiA00 = A00();
            C7384Etj.A0Y(dArr, 0);
            int length = dArr.length;
            if (length == 0) {
                strA0p = "";
            } else {
                StringBuilder sbA0w = C60O.A0w();
                int i = 0;
                do {
                    sbA0w.append(dArr[i]);
                    sbA0w.append(",,,");
                    i++;
                } while (i < length);
                strA0p = BV5.A0p(sbA0w);
            }
            cpiA00.A00(str, strA0p, 7);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, float[] fArr) {
        String strA0p;
        AnonymousClass003.A0u(str, fArr);
        if (!AnonymousClass002.A1M(str.length())) {
            CPI cpiA00 = A00();
            int length = fArr.length;
            if (length == 0) {
                strA0p = "";
            } else {
                StringBuilder sbA0w = C60O.A0w();
                int i = 0;
                do {
                    sbA0w.append(fArr[i]);
                    sbA0w.append(",,,");
                    i++;
                } while (i < length);
                strA0p = BV5.A0p(sbA0w);
            }
            cpiA00.A00(str, strA0p, 7);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, int[] iArr) {
        String strA0p;
        AnonymousClass003.A0u(str, iArr);
        if (!AnonymousClass002.A1M(str.length())) {
            CPI cpiA00 = A00();
            C7384Etj.A0Y(iArr, 0);
            int length = iArr.length;
            if (length == 0) {
                strA0p = "";
            } else {
                StringBuilder sbA0w = C60O.A0w();
                int i = 0;
                do {
                    sbA0w.append(iArr[i]);
                    sbA0w.append(",,,");
                    i++;
                } while (i < length);
                strA0p = BV5.A0p(sbA0w);
            }
            cpiA00.A00(str, strA0p, 5);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, long[] jArr) {
        String strA0p;
        AnonymousClass003.A0u(str, jArr);
        if (!AnonymousClass002.A1M(str.length())) {
            CPI cpiA00 = A00();
            C7384Etj.A0Y(jArr, 0);
            int length = jArr.length;
            if (length == 0) {
                strA0p = "";
            } else {
                StringBuilder sbA0w = C60O.A0w();
                int i = 0;
                do {
                    sbA0w.append(jArr[i]);
                    sbA0w.append(",,,");
                    i++;
                } while (i < length);
                strA0p = BV5.A0p(sbA0w);
            }
            cpiA00.A00(str, strA0p, 10);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, String[] strArr) {
        String strA0p;
        C7384Etj.A0Y(str, 0);
        if (strArr != null && (!AnonymousClass002.A1M(str.length()))) {
            CPI cpiA00 = A00();
            int length = strArr.length;
            if (length == 0) {
                strA0p = "";
            } else {
                StringBuilder sbA0w = C60O.A0w();
                int i = 0;
                do {
                    sbA0w.append(strArr[i]);
                    sbA0w.append(",,,");
                    i++;
                } while (i < length);
                strA0p = BV5.A0p(sbA0w);
            }
            cpiA00.A00(str, strA0p, 4);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, boolean[] zArr) {
        String strA0p;
        AnonymousClass003.A0u(str, zArr);
        if (!AnonymousClass002.A1M(str.length())) {
            CPI cpiA00 = A00();
            C7384Etj.A0Y(zArr, 0);
            int length = zArr.length;
            if (length == 0) {
                strA0p = "";
            } else {
                StringBuilder sbA0w = C60O.A0w();
                int i = 0;
                do {
                    sbA0w.append(zArr[i]);
                    sbA0w.append(",,,");
                    i++;
                } while (i < length);
                strA0p = BV5.A0p(sbA0w);
            }
            cpiA00.A00(str, strA0p, 9);
        }
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, double d) {
        int iA09;
        C7384Etj.A0Y(str, 0);
        DHu dHu = this.A0D;
        QuickEventImpl quickEventImpl = this.A0B;
        boolean z = this.A08;
        DI8.A02("qpl.markerAnnotateEvent(double)", Integer.valueOf(quickEventImpl.mMarkerId));
        try {
            if (DHu.A0c(str)) {
                DI1 di1A06 = DHu.A06(quickEventImpl, dHu, z ? 1 : 0);
                try {
                    iA09 = quickEventImpl.A0R.A09(str, d);
                    if (!z) {
                        di1A06.A01(quickEventImpl, iA09);
                        DHr.A00(quickEventImpl);
                    }
                } catch (Throwable th) {
                    if (!z) {
                        DHr.A00(quickEventImpl);
                    }
                    throw th;
                }
            } else {
                DI8.A00();
                iA09 = -1;
            }
            A01(this, iA09);
            return this;
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, int i) {
        C7384Etj.A0Y(str, 0);
        A01(this, this.A0D.A0d(this.A0B, str, i, this.A08));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, long j) {
        int iA0B;
        C7384Etj.A0Y(str, 0);
        DHu dHu = this.A0D;
        QuickEventImpl quickEventImpl = this.A0B;
        boolean z = this.A08;
        DI8.A02("qpl.markerAnnotateEvent(long)", Integer.valueOf(quickEventImpl.mMarkerId));
        try {
            if (DHu.A0c(str)) {
                DI1 di1A06 = DHu.A06(quickEventImpl, dHu, z ? 1 : 0);
                try {
                    iA0B = quickEventImpl.A0R.A0B(str, j);
                    if (!z) {
                        di1A06.A01(quickEventImpl, iA0B);
                        DHr.A00(quickEventImpl);
                    }
                } catch (Throwable th) {
                    if (!z) {
                        DHr.A00(quickEventImpl);
                    }
                    throw th;
                }
            } else {
                DI8.A00();
                iA0B = -1;
            }
            A01(this, iA0B);
            return this;
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        A01(this, this.A0D.A0f(this.A0B, str, str2, this.A08));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, boolean z) {
        int iA0D;
        C7384Etj.A0Y(str, 0);
        DHu dHu = this.A0D;
        QuickEventImpl quickEventImpl = this.A0B;
        boolean z2 = this.A08;
        DI8.A02("qpl.markerAnnotateEvent(boolean)", Integer.valueOf(quickEventImpl.mMarkerId));
        try {
            if (DHu.A0c(str)) {
                DI1 di1A06 = DHu.A06(quickEventImpl, dHu, z2 ? 1 : 0);
                try {
                    iA0D = quickEventImpl.A0R.A0D(str, z);
                    if (!z2) {
                        di1A06.A01(quickEventImpl, iA0D);
                        DHr.A00(quickEventImpl);
                    }
                } catch (Throwable th) {
                    if (!z2) {
                        DHr.A00(quickEventImpl);
                    }
                    throw th;
                }
            } else {
                DI8.A00();
                iA0D = -1;
            }
            A01(this, iA0D);
            return this;
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, double[] dArr) {
        int iA0E;
        AnonymousClass003.A0u(str, dArr);
        DHu dHu = this.A0D;
        QuickEventImpl quickEventImpl = this.A0B;
        boolean z = this.A08;
        DI8.A02("qpl.markerAnnotateEvent(double[])", Integer.valueOf(quickEventImpl.mMarkerId));
        try {
            if (DHu.A0c(str)) {
                DI1 di1A06 = DHu.A06(quickEventImpl, dHu, z ? 1 : 0);
                try {
                    iA0E = quickEventImpl.A0R.A0E(str, dArr);
                    if (!z) {
                        di1A06.A01(quickEventImpl, iA0E);
                        DHr.A00(quickEventImpl);
                    }
                } catch (Throwable th) {
                    if (!z) {
                        DHr.A00(quickEventImpl);
                    }
                    throw th;
                }
            } else {
                DI8.A00();
                iA0E = -1;
            }
            A01(this, iA0E);
            return this;
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, int[] iArr) {
        int iA0F;
        AnonymousClass003.A0u(str, iArr);
        DHu dHu = this.A0D;
        QuickEventImpl quickEventImpl = this.A0B;
        boolean z = this.A08;
        DI8.A02("qpl.markerAnnotateEvent(int[])", Integer.valueOf(quickEventImpl.mMarkerId));
        try {
            if (DHu.A0c(str)) {
                DI1 di1A06 = DHu.A06(quickEventImpl, dHu, z ? 1 : 0);
                try {
                    iA0F = quickEventImpl.A0R.A0F(str, iArr);
                    if (!z) {
                        di1A06.A01(quickEventImpl, iA0F);
                        DHr.A00(quickEventImpl);
                    }
                } catch (Throwable th) {
                    if (!z) {
                        DHr.A00(quickEventImpl);
                    }
                    throw th;
                }
            } else {
                DI8.A00();
                iA0F = -1;
            }
            A01(this, iA0F);
            return this;
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, long[] jArr) {
        int iA0G;
        AnonymousClass003.A0u(str, jArr);
        DHu dHu = this.A0D;
        QuickEventImpl quickEventImpl = this.A0B;
        boolean z = this.A08;
        DI8.A02("qpl.markerAnnotateEvent(long[])", Integer.valueOf(quickEventImpl.mMarkerId));
        try {
            if (DHu.A0c(str)) {
                DI1 di1A06 = DHu.A06(quickEventImpl, dHu, z ? 1 : 0);
                try {
                    iA0G = quickEventImpl.A0R.A0G(str, jArr);
                    if (!z) {
                        di1A06.A01(quickEventImpl, iA0G);
                        DHr.A00(quickEventImpl);
                    }
                } catch (Throwable th) {
                    if (!z) {
                        DHr.A00(quickEventImpl);
                    }
                    throw th;
                }
            } else {
                DI8.A00();
                iA0G = -1;
            }
            A01(this, iA0G);
            return this;
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, String[] strArr) {
        int iA0I;
        AnonymousClass003.A0u(str, strArr);
        DHu dHu = this.A0D;
        QuickEventImpl quickEventImpl = this.A0B;
        boolean z = this.A08;
        DI8.A02("qpl.markerAnnotateEvent(String[])", Integer.valueOf(quickEventImpl.mMarkerId));
        try {
            if (DHu.A0c(str)) {
                DI1 di1A06 = DHu.A06(quickEventImpl, dHu, z ? 1 : 0);
                try {
                    iA0I = quickEventImpl.A0R.A0I(strArr, str);
                    if (!z) {
                        di1A06.A01(quickEventImpl, iA0I);
                        DHr.A00(quickEventImpl);
                    }
                } catch (Throwable th) {
                    if (!z) {
                        DHr.A00(quickEventImpl);
                    }
                    throw th;
                }
            } else {
                DI8.A00();
                iA0I = -1;
            }
            A01(this, iA0I);
            return this;
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, boolean[] zArr) {
        int iA0H;
        AnonymousClass003.A0u(str, zArr);
        DHu dHu = this.A0D;
        QuickEventImpl quickEventImpl = this.A0B;
        boolean z = this.A08;
        DI8.A02("qpl.markerAnnotateEvent(boolean[])", Integer.valueOf(quickEventImpl.mMarkerId));
        try {
            if (DHu.A0c(str)) {
                DI1 di1A06 = DHu.A06(quickEventImpl, dHu, z ? 1 : 0);
                try {
                    iA0H = quickEventImpl.A0R.A0H(str, zArr);
                    if (!z) {
                        di1A06.A01(quickEventImpl, iA0H);
                        DHr.A00(quickEventImpl);
                    }
                } catch (Throwable th) {
                    if (!z) {
                        DHr.A00(quickEventImpl);
                    }
                    throw th;
                }
            } else {
                DI8.A00();
                iA0H = -1;
            }
            A01(this, iA0H);
            return this;
        } finally {
            DI8.A00();
        }
    }
}
