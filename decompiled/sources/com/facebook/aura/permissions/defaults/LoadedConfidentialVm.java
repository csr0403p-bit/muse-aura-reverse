package com.facebook.aura.permissions.defaults;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class LoadedConfidentialVm extends C06G {
    public final ConfidentialVmSettings settings;
    public final String vmId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoadedConfidentialVm) {
                LoadedConfidentialVm loadedConfidentialVm = (LoadedConfidentialVm) obj;
                if (!C7384Etj.areEqual(this.vmId, loadedConfidentialVm.vmId) || !C7384Etj.areEqual(this.settings, loadedConfidentialVm.settings)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LoadedConfidentialVm copy$default(LoadedConfidentialVm loadedConfidentialVm, String str, ConfidentialVmSettings confidentialVmSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loadedConfidentialVm.vmId;
        }
        if ((i & 2) != 0) {
            confidentialVmSettings = loadedConfidentialVm.settings;
        }
        return new LoadedConfidentialVm(str, confidentialVmSettings);
    }

    public final String component1() {
        return this.vmId;
    }

    public final ConfidentialVmSettings component2() {
        return this.settings;
    }

    public final LoadedConfidentialVm copy(String str, ConfidentialVmSettings confidentialVmSettings) {
        return new LoadedConfidentialVm(str, confidentialVmSettings);
    }

    public final ConfidentialVmSettings getSettings() {
        return this.settings;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.vmId) * 31) + C3cH.A02(this.settings);
    }

    public LoadedConfidentialVm(String str, ConfidentialVmSettings confidentialVmSettings) {
        this.vmId = str;
        this.settings = confidentialVmSettings;
    }

    public String toString() {
        return super.toString();
    }
}
