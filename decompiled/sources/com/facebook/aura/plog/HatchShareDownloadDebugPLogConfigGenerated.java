package com.facebook.aura.plog;

import X.AbstractC7611F5y;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.C06H;
import X.C0KA;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.GD4;
import X.HKr;
import X.HKs;

/* loaded from: classes6.dex */
public final class HatchShareDownloadDebugPLogConfigGenerated implements GD4 {
    public static final Companion Companion = new Companion();
    public static final HatchShareDownloadDebugPLogConfigGenerated INSTANCE = new HatchShareDownloadDebugPLogConfigGenerated("hatch_share_download_debug", 50, true, "ai_products_sharing", true, 2, "plog_hatch_share_download_debug.txt", null);
    public final int bufferSize;
    public final String bugReportFilename;
    public final HKr crashResilience;
    public final boolean forwardToDebugLogs;
    public final String identifier;
    public final boolean isActive;
    public final int minLogLevel;
    public final String oncall;

    /* renamed from: copy-eAM8bfQ$default, reason: not valid java name */
    public static /* synthetic */ HatchShareDownloadDebugPLogConfigGenerated m1860copyeAM8bfQ$default(HatchShareDownloadDebugPLogConfigGenerated hatchShareDownloadDebugPLogConfigGenerated, String str, int i, boolean z, String str2, boolean z2, int i2, String str3, HKr hKr, int i3, Object obj) {
        String str4 = str;
        int i4 = i;
        boolean z3 = z;
        String str5 = str2;
        boolean z4 = z2;
        int i5 = i2;
        String str6 = str3;
        HKr hKr2 = hKr;
        if ((i3 & 1) != 0) {
            str4 = hatchShareDownloadDebugPLogConfigGenerated.identifier;
        }
        if ((i3 & 2) != 0) {
            i4 = hatchShareDownloadDebugPLogConfigGenerated.bufferSize;
        }
        if ((i3 & 4) != 0) {
            z3 = hatchShareDownloadDebugPLogConfigGenerated.isActive;
        }
        if ((i3 & 8) != 0) {
            str5 = hatchShareDownloadDebugPLogConfigGenerated.oncall;
        }
        if ((i3 & 16) != 0) {
            z4 = hatchShareDownloadDebugPLogConfigGenerated.forwardToDebugLogs;
        }
        if ((i3 & 32) != 0) {
            i5 = hatchShareDownloadDebugPLogConfigGenerated.minLogLevel;
        }
        if ((i3 & 64) != 0) {
            str6 = hatchShareDownloadDebugPLogConfigGenerated.bugReportFilename;
        }
        if ((i3 & 128) != 0) {
            hKr2 = null;
        }
        AnonymousClass003.A0w(str4, str5);
        return new HatchShareDownloadDebugPLogConfigGenerated(str4, i4, z3, str5, z4, i5, str6, hKr2);
    }

    @Override // X.GD4
    public GD4 copyWithOverrides(int i, boolean z, boolean z2, int i2, boolean z3) {
        String str = this.identifier;
        String str2 = this.oncall;
        String str3 = this.bugReportFilename;
        AnonymousClass003.A0w(str, str2);
        return new HatchShareDownloadDebugPLogConfigGenerated(str, i, z, str2, z2, i2, str3, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchShareDownloadDebugPLogConfigGenerated) {
                HatchShareDownloadDebugPLogConfigGenerated hatchShareDownloadDebugPLogConfigGenerated = (HatchShareDownloadDebugPLogConfigGenerated) obj;
                if (!C7384Etj.areEqual(this.identifier, hatchShareDownloadDebugPLogConfigGenerated.identifier) || this.bufferSize != hatchShareDownloadDebugPLogConfigGenerated.bufferSize || this.isActive != hatchShareDownloadDebugPLogConfigGenerated.isActive || !C7384Etj.areEqual(this.oncall, hatchShareDownloadDebugPLogConfigGenerated.oncall) || this.forwardToDebugLogs != hatchShareDownloadDebugPLogConfigGenerated.forwardToDebugLogs || this.minLogLevel != hatchShareDownloadDebugPLogConfigGenerated.minLogLevel || !C7384Etj.areEqual(this.bugReportFilename, hatchShareDownloadDebugPLogConfigGenerated.bugReportFilename)) {
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

    public /* synthetic */ HatchShareDownloadDebugPLogConfigGenerated(String str, int i, boolean z, String str2, boolean z2, int i2, String str3, HKr hKr, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? "hatch_share_download_debug" : str, (i3 & 2) != 0 ? 50 : i, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? "ai_products_sharing" : str2, (i3 & 16) != 0 ? true : z2, (i3 & 32) != 0 ? 2 : i2, (i3 & 64) != 0 ? "plog_hatch_share_download_debug.txt" : str3, (i3 & 128) != 0 ? null : hKr);
    }

    public GD4 applyRuntimeOverrides(HKs hKs) {
        throw BV4.A0a("isActive");
    }

    /* renamed from: component1-Dnvc6hM, reason: not valid java name */
    public final String m1861component1Dnvc6hM() {
        return this.identifier;
    }

    public final int component2() {
        return this.bufferSize;
    }

    public final boolean component3() {
        return this.isActive;
    }

    public final String component4() {
        return this.oncall;
    }

    public final boolean component5() {
        return this.forwardToDebugLogs;
    }

    public final int component6() {
        return this.minLogLevel;
    }

    public final String component7() {
        return this.bugReportFilename;
    }

    public final HKr component8() {
        return null;
    }

    @Override // X.GD4
    public int getBufferSize() {
        return this.bufferSize;
    }

    public String getBugReportFilename() {
        return this.bugReportFilename;
    }

    public HKr getCrashResilience() {
        return null;
    }

    @Override // X.GD4
    public boolean getForwardToDebugLogs() {
        return this.forwardToDebugLogs;
    }

    @Override // X.GD4
    /* renamed from: getIdentifier-Dnvc6hM */
    public String mo29getIdentifierDnvc6hM() {
        return this.identifier;
    }

    @Override // X.GD4
    public int getMinLogLevel() {
        return this.minLogLevel;
    }

    public String getOncall() {
        return this.oncall;
    }

    public /* bridge */ Integer getQplSoftErrorMarkerId() {
        return null;
    }

    public /* bridge */ boolean getRetainOnAuthChange() {
        return false;
    }

    public /* bridge */ boolean getSoftErrorEnabled() {
        return true;
    }

    public int hashCode() {
        return (((C0KA.A01(AnonymousClass005.A0I(this.oncall, C0KA.A01((AnonymousClass001.A0G(this.identifier) + this.bufferSize) * 31, this.isActive)), this.forwardToDebugLogs) + this.minLogLevel) * 31) + AnonymousClass006.A0G(this.bugReportFilename)) * 31;
    }

    @Override // X.GD4
    public boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        String str = this.identifier;
        int i = this.bufferSize;
        boolean z = this.isActive;
        String str2 = this.oncall;
        boolean z2 = this.forwardToDebugLogs;
        int i2 = this.minLogLevel;
        String str3 = this.bugReportFilename;
        StringBuilder sbA0x = C3cI.A0x("HatchShareDownloadDebugPLogConfigGenerated(identifier=", str);
        sbA0x.append(", bufferSize=");
        sbA0x.append(i);
        AbstractC7611F5y.A0x(str2, sbA0x, i2, z, z2);
        sbA0x.append(str3);
        return C3cJ.A0L(null, ", crashResilience=", sbA0x);
    }

    /* renamed from: copy-eAM8bfQ, reason: not valid java name */
    public final HatchShareDownloadDebugPLogConfigGenerated m1862copyeAM8bfQ(String str, int i, boolean z, String str2, boolean z2, int i2, String str3, HKr hKr) {
        AnonymousClass003.A0w(str, str2);
        return new HatchShareDownloadDebugPLogConfigGenerated(str, i, z, str2, z2, i2, str3, hKr);
    }

    public HatchShareDownloadDebugPLogConfigGenerated(String str, int i, boolean z, String str2, boolean z2, int i2, String str3, HKr hKr) {
        this.identifier = str;
        this.bufferSize = i;
        this.isActive = z;
        this.oncall = str2;
        this.forwardToDebugLogs = z2;
        this.minLogLevel = i2;
        this.bugReportFilename = str3;
        this.crashResilience = hKr;
    }
}
