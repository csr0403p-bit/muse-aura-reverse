package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ArtifactPlacementRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String artifact_ref;
    public final String placement;
    public final String space_id;

    public final class Companion {
        public final C9hr<ArtifactPlacementRequestJson> serializer() {
            return ArtifactPlacementRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactPlacementRequestJson artifactPlacementRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(artifactPlacementRequestJson.artifact_ref, c9iZ, 0);
        c9j5.AAV(artifactPlacementRequestJson.space_id, c9iZ, 1);
        c9j5.AAV(artifactPlacementRequestJson.placement, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactPlacementRequestJson) {
                ArtifactPlacementRequestJson artifactPlacementRequestJson = (ArtifactPlacementRequestJson) obj;
                if (!C7384Etj.areEqual(this.artifact_ref, artifactPlacementRequestJson.artifact_ref) || !C7384Etj.areEqual(this.space_id, artifactPlacementRequestJson.space_id) || !C7384Etj.areEqual(this.placement, artifactPlacementRequestJson.placement)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactPlacementRequestJson copy$default(ArtifactPlacementRequestJson artifactPlacementRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactPlacementRequestJson.artifact_ref;
        }
        if ((i & 2) != 0) {
            str2 = artifactPlacementRequestJson.space_id;
        }
        if ((i & 4) != 0) {
            str3 = artifactPlacementRequestJson.placement;
        }
        return artifactPlacementRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.artifact_ref;
    }

    public final String component2() {
        return this.space_id;
    }

    public final String component3() {
        return this.placement;
    }

    public final String getArtifact_ref() {
        return this.artifact_ref;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final String getSpace_id() {
        return this.space_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.placement, AnonymousClass005.A0I(this.space_id, AnonymousClass001.A0G(this.artifact_ref)));
    }

    public ArtifactPlacementRequestJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.artifact_ref = str;
        this.space_id = str2;
        this.placement = str3;
    }

    public final ArtifactPlacementRequestJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ArtifactPlacementRequestJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactPlacementRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ArtifactPlacementRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.artifact_ref = str;
        this.space_id = str2;
        this.placement = str3;
    }
}
