package com.facebook.aura.partners.voice.api;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class VoicePipelineProfile extends C06G {
    public static final int $stable = 0;
    public final String id;
    public final String label;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoicePipelineProfile) {
                VoicePipelineProfile voicePipelineProfile = (VoicePipelineProfile) obj;
                if (!C7384Etj.areEqual(this.id, voicePipelineProfile.id) || !C7384Etj.areEqual(this.label, voicePipelineProfile.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoicePipelineProfile copy$default(VoicePipelineProfile voicePipelineProfile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voicePipelineProfile.id;
        }
        if ((i & 2) != 0) {
            str2 = voicePipelineProfile.label;
        }
        AnonymousClass003.A0u(str, str2);
        return new VoicePipelineProfile(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.label;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.label, AnonymousClass001.A0G(this.id));
    }

    public VoicePipelineProfile(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.label = str2;
    }

    public final VoicePipelineProfile copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new VoicePipelineProfile(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
