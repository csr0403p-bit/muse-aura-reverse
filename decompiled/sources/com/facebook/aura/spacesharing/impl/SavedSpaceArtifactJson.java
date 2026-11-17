package com.facebook.aura.spacesharing.impl;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SavedSpaceArtifactJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String artifact_ref;
    public final SavedSpaceTargetJson open_target;
    public final String placement;
    public final String source;
    public final String space_id;

    public final class Companion {
        public final C9hr<SavedSpaceArtifactJson> serializer() {
            return SavedSpaceArtifactJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spacesharing_impl_impl(SavedSpaceArtifactJson savedSpaceArtifactJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(savedSpaceArtifactJson.artifact_ref, c9iZ, 0);
        c9j5.AAV(savedSpaceArtifactJson.source, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || savedSpaceArtifactJson.space_id != null) {
            c9j5.AAP(savedSpaceArtifactJson.space_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || savedSpaceArtifactJson.placement != null) {
            c9j5.AAP(savedSpaceArtifactJson.placement, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || savedSpaceArtifactJson.open_target != null) {
            c9j5.AAP(savedSpaceArtifactJson.open_target, SavedSpaceTargetJson$$serializer.INSTANCE, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedSpaceArtifactJson) {
                SavedSpaceArtifactJson savedSpaceArtifactJson = (SavedSpaceArtifactJson) obj;
                if (!C7384Etj.areEqual(this.artifact_ref, savedSpaceArtifactJson.artifact_ref) || !C7384Etj.areEqual(this.source, savedSpaceArtifactJson.source) || !C7384Etj.areEqual(this.space_id, savedSpaceArtifactJson.space_id) || !C7384Etj.areEqual(this.placement, savedSpaceArtifactJson.placement) || !C7384Etj.areEqual(this.open_target, savedSpaceArtifactJson.open_target)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SavedSpaceArtifactJson(int i, String str, String str2, String str3, String str4, SavedSpaceTargetJson savedSpaceTargetJson, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SavedSpaceArtifactJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.artifact_ref = str;
        this.source = str2;
        if ((i & 4) == 0) {
            this.space_id = null;
        } else {
            this.space_id = str3;
        }
        if ((i & 8) == 0) {
            this.placement = null;
        } else {
            this.placement = str4;
        }
        if ((i & 16) == 0) {
            this.open_target = null;
        } else {
            this.open_target = savedSpaceTargetJson;
        }
    }

    public static /* synthetic */ SavedSpaceArtifactJson copy$default(SavedSpaceArtifactJson savedSpaceArtifactJson, String str, String str2, String str3, String str4, SavedSpaceTargetJson savedSpaceTargetJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedSpaceArtifactJson.artifact_ref;
        }
        if ((i & 2) != 0) {
            str2 = savedSpaceArtifactJson.source;
        }
        if ((i & 4) != 0) {
            str3 = savedSpaceArtifactJson.space_id;
        }
        if ((i & 8) != 0) {
            str4 = savedSpaceArtifactJson.placement;
        }
        if ((i & 16) != 0) {
            savedSpaceTargetJson = savedSpaceArtifactJson.open_target;
        }
        return savedSpaceArtifactJson.copy(str, str2, str3, str4, savedSpaceTargetJson);
    }

    public final String component1() {
        return this.artifact_ref;
    }

    public final String component2() {
        return this.source;
    }

    public final String component3() {
        return this.space_id;
    }

    public final String component4() {
        return this.placement;
    }

    public final SavedSpaceTargetJson component5() {
        return this.open_target;
    }

    public final String getArtifact_ref() {
        return this.artifact_ref;
    }

    public final SavedSpaceTargetJson getOpen_target() {
        return this.open_target;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSpace_id() {
        return this.space_id;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.source, AnonymousClass001.A0G(this.artifact_ref)) + AnonymousClass006.A0G(this.space_id)) * 31) + AnonymousClass006.A0G(this.placement)) * 31) + C3cH.A02(this.open_target);
    }

    public final SavedSpaceArtifactJson copy(String str, String str2, String str3, String str4, SavedSpaceTargetJson savedSpaceTargetJson) {
        AnonymousClass003.A0u(str, str2);
        return new SavedSpaceArtifactJson(str, str2, str3, str4, savedSpaceTargetJson);
    }

    public String toString() {
        return super.toString();
    }

    public SavedSpaceArtifactJson(String str, String str2, String str3, String str4, SavedSpaceTargetJson savedSpaceTargetJson) {
        AnonymousClass003.A0u(str, str2);
        this.artifact_ref = str;
        this.source = str2;
        this.space_id = str3;
        this.placement = str4;
        this.open_target = savedSpaceTargetJson;
    }

    public /* synthetic */ SavedSpaceArtifactJson(String str, String str2, String str3, String str4, SavedSpaceTargetJson savedSpaceTargetJson, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : savedSpaceTargetJson);
    }
}
