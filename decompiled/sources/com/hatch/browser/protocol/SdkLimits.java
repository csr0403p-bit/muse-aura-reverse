package com.hatch.browser.protocol;

import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;

/* loaded from: classes6.dex */
public final class SdkLimits {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int maxOperations;
    public int maxPages;
    public int maxRefs;
    public int maxReportBytes;
    public int maxReports;
    public int maxRequestBytes;
    public int maxTaskPageGroups;
    public int releaseTimeoutMs;

    /* renamed from: copy-dx0s4eY$default, reason: not valid java name */
    public static /* synthetic */ SdkLimits m3738copydx0s4eY$default(SdkLimits sdkLimits, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
        int i10 = i;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        int i15 = i6;
        int i16 = i7;
        int i17 = i8;
        if ((i9 & 1) != 0) {
            i10 = sdkLimits.maxRequestBytes;
        }
        if ((i9 & 2) != 0) {
            i11 = sdkLimits.maxReportBytes;
        }
        if ((i9 & 4) != 0) {
            i12 = sdkLimits.maxOperations;
        }
        if ((i9 & 8) != 0) {
            i13 = sdkLimits.maxPages;
        }
        if ((i9 & 16) != 0) {
            i14 = sdkLimits.maxTaskPageGroups;
        }
        if ((i9 & 32) != 0) {
            i15 = sdkLimits.maxReports;
        }
        if ((i9 & 64) != 0) {
            i16 = sdkLimits.maxRefs;
        }
        if ((i9 & 128) != 0) {
            i17 = sdkLimits.releaseTimeoutMs;
        }
        return new SdkLimits(i10, i11, i12, i13, i14, i15, i16, i17);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SdkLimits) {
                SdkLimits sdkLimits = (SdkLimits) obj;
                if (this.maxRequestBytes != sdkLimits.maxRequestBytes || this.maxReportBytes != sdkLimits.maxReportBytes || this.maxOperations != sdkLimits.maxOperations || this.maxPages != sdkLimits.maxPages || this.maxTaskPageGroups != sdkLimits.maxTaskPageGroups || this.maxReports != sdkLimits.maxReports || this.maxRefs != sdkLimits.maxRefs || this.releaseTimeoutMs != sdkLimits.releaseTimeoutMs) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: component1-pVg5ArA, reason: not valid java name */
    public final int m3739component1pVg5ArA() {
        return this.maxRequestBytes;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name */
    public final int m3740component2pVg5ArA() {
        return this.maxReportBytes;
    }

    /* renamed from: component3-pVg5ArA, reason: not valid java name */
    public final int m3741component3pVg5ArA() {
        return this.maxOperations;
    }

    /* renamed from: component4-pVg5ArA, reason: not valid java name */
    public final int m3742component4pVg5ArA() {
        return this.maxPages;
    }

    /* renamed from: component5-pVg5ArA, reason: not valid java name */
    public final int m3743component5pVg5ArA() {
        return this.maxTaskPageGroups;
    }

    /* renamed from: component6-pVg5ArA, reason: not valid java name */
    public final int m3744component6pVg5ArA() {
        return this.maxReports;
    }

    /* renamed from: component7-pVg5ArA, reason: not valid java name */
    public final int m3745component7pVg5ArA() {
        return this.maxRefs;
    }

    /* renamed from: component8-pVg5ArA, reason: not valid java name */
    public final int m3746component8pVg5ArA() {
        return this.releaseTimeoutMs;
    }

    /* renamed from: copy-dx0s4eY, reason: not valid java name */
    public final SdkLimits m3747copydx0s4eY(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return new SdkLimits(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: getMaxOperations-pVg5ArA, reason: not valid java name */
    public final int m3748getMaxOperationspVg5ArA() {
        return this.maxOperations;
    }

    /* renamed from: getMaxPages-pVg5ArA, reason: not valid java name */
    public final int m3749getMaxPagespVg5ArA() {
        return this.maxPages;
    }

    /* renamed from: getMaxRefs-pVg5ArA, reason: not valid java name */
    public final int m3750getMaxRefspVg5ArA() {
        return this.maxRefs;
    }

    /* renamed from: getMaxReportBytes-pVg5ArA, reason: not valid java name */
    public final int m3751getMaxReportBytespVg5ArA() {
        return this.maxReportBytes;
    }

    /* renamed from: getMaxReports-pVg5ArA, reason: not valid java name */
    public final int m3752getMaxReportspVg5ArA() {
        return this.maxReports;
    }

    /* renamed from: getMaxRequestBytes-pVg5ArA, reason: not valid java name */
    public final int m3753getMaxRequestBytespVg5ArA() {
        return this.maxRequestBytes;
    }

    /* renamed from: getMaxTaskPageGroups-pVg5ArA, reason: not valid java name */
    public final int m3754getMaxTaskPageGroupspVg5ArA() {
        return this.maxTaskPageGroups;
    }

    /* renamed from: getReleaseTimeoutMs-pVg5ArA, reason: not valid java name */
    public final int m3755getReleaseTimeoutMspVg5ArA() {
        return this.releaseTimeoutMs;
    }

    public int hashCode() {
        return (((((((((((((this.maxRequestBytes * 31) + this.maxReportBytes) * 31) + this.maxOperations) * 31) + this.maxPages) * 31) + this.maxTaskPageGroups) * 31) + this.maxReports) * 31) + this.maxRefs) * 31) + this.releaseTimeoutMs;
    }

    /* renamed from: setMaxOperations-WZ4Q5Ns, reason: not valid java name */
    public final void m3756setMaxOperationsWZ4Q5Ns(int i) {
        this.maxOperations = i;
    }

    /* renamed from: setMaxPages-WZ4Q5Ns, reason: not valid java name */
    public final void m3757setMaxPagesWZ4Q5Ns(int i) {
        this.maxPages = i;
    }

    /* renamed from: setMaxRefs-WZ4Q5Ns, reason: not valid java name */
    public final void m3758setMaxRefsWZ4Q5Ns(int i) {
        this.maxRefs = i;
    }

    /* renamed from: setMaxReportBytes-WZ4Q5Ns, reason: not valid java name */
    public final void m3759setMaxReportBytesWZ4Q5Ns(int i) {
        this.maxReportBytes = i;
    }

    /* renamed from: setMaxReports-WZ4Q5Ns, reason: not valid java name */
    public final void m3760setMaxReportsWZ4Q5Ns(int i) {
        this.maxReports = i;
    }

    /* renamed from: setMaxRequestBytes-WZ4Q5Ns, reason: not valid java name */
    public final void m3761setMaxRequestBytesWZ4Q5Ns(int i) {
        this.maxRequestBytes = i;
    }

    /* renamed from: setMaxTaskPageGroups-WZ4Q5Ns, reason: not valid java name */
    public final void m3762setMaxTaskPageGroupsWZ4Q5Ns(int i) {
        this.maxTaskPageGroups = i;
    }

    /* renamed from: setReleaseTimeoutMs-WZ4Q5Ns, reason: not valid java name */
    public final void m3763setReleaseTimeoutMsWZ4Q5Ns(int i) {
        this.releaseTimeoutMs = i;
    }

    public String toString() {
        String strValueOf = String.valueOf(BV4.A03(this.maxRequestBytes));
        String strValueOf2 = String.valueOf(BV4.A03(this.maxReportBytes));
        String strValueOf3 = String.valueOf(BV4.A03(this.maxOperations));
        String strValueOf4 = String.valueOf(BV4.A03(this.maxPages));
        String strValueOf5 = String.valueOf(BV4.A03(this.maxTaskPageGroups));
        String strValueOf6 = String.valueOf(BV4.A03(this.maxReports));
        String strValueOf7 = String.valueOf(BV4.A03(this.maxRefs));
        String strValueOf8 = String.valueOf(BV4.A03(this.releaseTimeoutMs));
        StringBuilder sbA0x = C3cI.A0x("SdkLimits(maxRequestBytes=", strValueOf);
        sbA0x.append(", maxReportBytes=");
        sbA0x.append(strValueOf2);
        sbA0x.append(", maxOperations=");
        sbA0x.append(strValueOf3);
        sbA0x.append(", maxPages=");
        sbA0x.append(strValueOf4);
        sbA0x.append(", maxTaskPageGroups=");
        sbA0x.append(strValueOf5);
        sbA0x.append(", maxReports=");
        sbA0x.append(strValueOf6);
        sbA0x.append(", maxRefs=");
        sbA0x.append(strValueOf7);
        return C3cJ.A0N(", releaseTimeoutMs=", strValueOf8, sbA0x);
    }

    public SdkLimits(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.maxRequestBytes = i;
        this.maxReportBytes = i2;
        this.maxOperations = i3;
        this.maxPages = i4;
        this.maxTaskPageGroups = i5;
        this.maxReports = i6;
        this.maxRefs = i7;
        this.releaseTimeoutMs = i8;
    }

    public /* synthetic */ SdkLimits(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C06H c06h) {
        this(i, i2, i3, i4, i5, i6, i7, i8);
    }
}
