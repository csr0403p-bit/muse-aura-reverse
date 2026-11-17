package com.facebook.aura.partners.voice.infra;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class VoicePipelineProfilesResponseJson extends C06G {
    public final boolean modified;
    public final List<VoicePipelineProfileJson> profiles;
    public final String selected_profile_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, VoicePipelineProfilesResponseJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<VoicePipelineProfilesResponseJson> serializer() {
            return VoicePipelineProfilesResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoicePipelineProfilesResponseJson(List<VoicePipelineProfileJson> list, String str, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.profiles = list;
        this.selected_profile_id = str;
        this.modified = z;
    }

    public final VoicePipelineProfilesResponseJson copy(List<VoicePipelineProfileJson> list, String str, boolean z) {
        C7384Etj.A0Y(list, 0);
        return new VoicePipelineProfilesResponseJson(list, str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoicePipelineProfilesResponseJson) {
                VoicePipelineProfilesResponseJson voicePipelineProfilesResponseJson = (VoicePipelineProfilesResponseJson) obj;
                if (!C7384Etj.areEqual(this.profiles, voicePipelineProfilesResponseJson.profiles) || !C7384Etj.areEqual(this.selected_profile_id, voicePipelineProfilesResponseJson.selected_profile_id) || this.modified != voicePipelineProfilesResponseJson.modified) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoicePipelineProfilesResponseJson copy$default(VoicePipelineProfilesResponseJson voicePipelineProfilesResponseJson, List list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = voicePipelineProfilesResponseJson.profiles;
        }
        if ((i & 2) != 0) {
            str = voicePipelineProfilesResponseJson.selected_profile_id;
        }
        if ((i & 4) != 0) {
            z = voicePipelineProfilesResponseJson.modified;
        }
        return voicePipelineProfilesResponseJson.copy(list, str, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(VoicePipelineProfilesResponseJson voicePipelineProfilesResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(voicePipelineProfilesResponseJson.profiles)) {
            c9j5.AAQ(voicePipelineProfilesResponseJson.profiles, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || voicePipelineProfilesResponseJson.selected_profile_id != null) {
            c9j5.AAP(voicePipelineProfilesResponseJson.selected_profile_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || voicePipelineProfilesResponseJson.modified) {
            c9j5.AA7(c9iZ, 2, voicePipelineProfilesResponseJson.modified);
        }
    }

    public final List<VoicePipelineProfileJson> component1() {
        return this.profiles;
    }

    public final String component2() {
        return this.selected_profile_id;
    }

    public final boolean component3() {
        return this.modified;
    }

    public final boolean getModified() {
        return this.modified;
    }

    public final List<VoicePipelineProfileJson> getProfiles() {
        return this.profiles;
    }

    public final String getSelected_profile_id() {
        return this.selected_profile_id;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0E(this.profiles) + AnonymousClass006.A0G(this.selected_profile_id)) * 31, this.modified);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoicePipelineProfilesResponseJson(int i, List list, String str, boolean z, C2hx c2hx) {
        this.profiles = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.selected_profile_id = null;
        } else {
            this.selected_profile_id = str;
        }
        if ((i & 4) == 0) {
            this.modified = false;
        } else {
            this.modified = z;
        }
    }

    public /* synthetic */ VoicePipelineProfilesResponseJson(List list, String str, boolean z, int i, C06H c06h) {
        this(C3cI.A10(list, i), AnonymousClass006.A0s(i, str), AnonymousClass005.A1O(i, z));
    }

    public VoicePipelineProfilesResponseJson() {
        this(C0881AGi.A00, null, false);
    }
}
