package com.facebook.aura.partners.voice.api;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class VoicePipelineProfileState extends C06G {
    public static final int $stable = 0;
    public final boolean modified;
    public final AHD<VoicePipelineProfile> profiles;
    public final String selectedProfileId;

    public VoicePipelineProfileState(AHD<VoicePipelineProfile> ahd, String str, boolean z) {
        C7384Etj.A0Y(ahd, 0);
        this.profiles = ahd;
        this.selectedProfileId = str;
        this.modified = z;
    }

    public final VoicePipelineProfileState copy(AHD<VoicePipelineProfile> ahd, String str, boolean z) {
        C7384Etj.A0Y(ahd, 0);
        return new VoicePipelineProfileState(ahd, str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoicePipelineProfileState) {
                VoicePipelineProfileState voicePipelineProfileState = (VoicePipelineProfileState) obj;
                if (!C7384Etj.areEqual(this.profiles, voicePipelineProfileState.profiles) || !C7384Etj.areEqual(this.selectedProfileId, voicePipelineProfileState.selectedProfileId) || this.modified != voicePipelineProfileState.modified) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoicePipelineProfileState copy$default(VoicePipelineProfileState voicePipelineProfileState, AHD ahd, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = voicePipelineProfileState.profiles;
        }
        if ((i & 2) != 0) {
            str = voicePipelineProfileState.selectedProfileId;
        }
        if ((i & 4) != 0) {
            z = voicePipelineProfileState.modified;
        }
        return voicePipelineProfileState.copy(ahd, str, z);
    }

    public final AHD<VoicePipelineProfile> component1() {
        return this.profiles;
    }

    public final String component2() {
        return this.selectedProfileId;
    }

    public final boolean component3() {
        return this.modified;
    }

    public final boolean getModified() {
        return this.modified;
    }

    public final AHD<VoicePipelineProfile> getProfiles() {
        return this.profiles;
    }

    public final String getSelectedProfileId() {
        return this.selectedProfileId;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0E(this.profiles) + AnonymousClass006.A0G(this.selectedProfileId)) * 31, this.modified);
    }

    public String toString() {
        return super.toString();
    }
}
