package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchTosProseVariant extends C06G {
    public final String body;
    public final AHD<HatchTosBodyRun> bodyRuns;
    public final boolean isF3;
    public final String sourceApp;
    public final String title;

    public HatchTosProseVariant(boolean z, String str, String str2, String str3, AHD<HatchTosBodyRun> ahd) {
        AnonymousClass002.A1C(str3, 3, ahd);
        this.isF3 = z;
        this.sourceApp = str;
        this.title = str2;
        this.body = str3;
        this.bodyRuns = ahd;
    }

    public final HatchTosProseVariant copy(boolean z, String str, String str2, String str3, AHD<HatchTosBodyRun> ahd) {
        AnonymousClass002.A1C(str3, 3, ahd);
        return new HatchTosProseVariant(z, str, str2, str3, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTosProseVariant) {
                HatchTosProseVariant hatchTosProseVariant = (HatchTosProseVariant) obj;
                if (this.isF3 != hatchTosProseVariant.isF3 || !C7384Etj.areEqual(this.sourceApp, hatchTosProseVariant.sourceApp) || !C7384Etj.areEqual(this.title, hatchTosProseVariant.title) || !C7384Etj.areEqual(this.body, hatchTosProseVariant.body) || !C7384Etj.areEqual(this.bodyRuns, hatchTosProseVariant.bodyRuns)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchTosProseVariant copy$default(HatchTosProseVariant hatchTosProseVariant, boolean z, String str, String str2, String str3, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchTosProseVariant.isF3;
        }
        if ((i & 2) != 0) {
            str = hatchTosProseVariant.sourceApp;
        }
        if ((i & 4) != 0) {
            str2 = hatchTosProseVariant.title;
        }
        if ((i & 8) != 0) {
            str3 = hatchTosProseVariant.body;
        }
        if ((i & 16) != 0) {
            ahd = hatchTosProseVariant.bodyRuns;
        }
        return hatchTosProseVariant.copy(z, str, str2, str3, ahd);
    }

    public final boolean component1() {
        return this.isF3;
    }

    public final String component2() {
        return this.sourceApp;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.body;
    }

    public final AHD<HatchTosBodyRun> component5() {
        return this.bodyRuns;
    }

    public final String getBody() {
        return this.body;
    }

    public final AHD<HatchTosBodyRun> getBodyRuns() {
        return this.bodyRuns;
    }

    public final String getSourceApp() {
        return this.sourceApp;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.bodyRuns, AnonymousClass005.A0I(this.body, (((C0KA.A02(this.isF3) + AnonymousClass006.A0G(this.sourceApp)) * 31) + AnonymousClass005.A0H(this.title)) * 31));
    }

    public final boolean isF3() {
        return this.isF3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchTosProseVariant(boolean z, String str, String str2, String str3, AHD ahd, int i, C06H c06h) {
        this(z, str, str2, str3, (i & 16) != 0 ? AHI.A01 : ahd);
    }
}
