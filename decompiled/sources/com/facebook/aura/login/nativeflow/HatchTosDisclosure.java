package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BO6;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchTosDisclosure extends C06G {
    public final String contentVersion;
    public final BO6<String, HatchTosGroup> groups;
    public final AHD<HatchTosRun> runs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTosDisclosure) {
                HatchTosDisclosure hatchTosDisclosure = (HatchTosDisclosure) obj;
                if (!C7384Etj.areEqual(this.runs, hatchTosDisclosure.runs) || !C7384Etj.areEqual(this.groups, hatchTosDisclosure.groups) || !C7384Etj.areEqual(this.contentVersion, hatchTosDisclosure.contentVersion)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchTosDisclosure copy$default(HatchTosDisclosure hatchTosDisclosure, AHD ahd, BO6 bo6, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = hatchTosDisclosure.runs;
        }
        if ((i & 2) != 0) {
            bo6 = hatchTosDisclosure.groups;
        }
        if ((i & 4) != 0) {
            str = hatchTosDisclosure.contentVersion;
        }
        return hatchTosDisclosure.copy(ahd, bo6, str);
    }

    public final AHD<HatchTosRun> component1() {
        return this.runs;
    }

    public final BO6<String, HatchTosGroup> component2() {
        return this.groups;
    }

    public final String component3() {
        return this.contentVersion;
    }

    public final String getContentVersion() {
        return this.contentVersion;
    }

    public final BO6<String, HatchTosGroup> getGroups() {
        return this.groups;
    }

    public final AHD<HatchTosRun> getRuns() {
        return this.runs;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.contentVersion, AnonymousClass005.A0F(this.groups, AnonymousClass005.A0E(this.runs)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchTosDisclosure(AHD<HatchTosRun> ahd, BO6<String, ? extends HatchTosGroup> bo6, String str) {
        AnonymousClass005.A0x(ahd, bo6, str);
        this.runs = ahd;
        this.groups = bo6;
        this.contentVersion = str;
    }

    public final HatchTosDisclosure copy(AHD<HatchTosRun> ahd, BO6<String, ? extends HatchTosGroup> bo6, String str) {
        AnonymousClass005.A0x(ahd, bo6, str);
        return new HatchTosDisclosure(ahd, bo6, str);
    }

    public String toString() {
        return super.toString();
    }
}
