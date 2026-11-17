package com.facebook.aura.spacesharing.impl;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SharedSpaceSaveResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final SavedSpaceArtifactJson artifact;

    public final class Companion {
        public final C9hr<SharedSpaceSaveResponseJson> serializer() {
            return SharedSpaceSaveResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SharedSpaceSaveResponseJson copy(SavedSpaceArtifactJson savedSpaceArtifactJson) {
        C7384Etj.A0Y(savedSpaceArtifactJson, 0);
        return new SharedSpaceSaveResponseJson(savedSpaceArtifactJson);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SharedSpaceSaveResponseJson) && C7384Etj.areEqual(this.artifact, ((SharedSpaceSaveResponseJson) obj).artifact));
    }

    public /* synthetic */ SharedSpaceSaveResponseJson(int i, SavedSpaceArtifactJson savedSpaceArtifactJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SharedSpaceSaveResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.artifact = savedSpaceArtifactJson;
    }

    public static /* synthetic */ SharedSpaceSaveResponseJson copy$default(SharedSpaceSaveResponseJson sharedSpaceSaveResponseJson, SavedSpaceArtifactJson savedSpaceArtifactJson, int i, Object obj) {
        if ((i & 1) != 0) {
            savedSpaceArtifactJson = sharedSpaceSaveResponseJson.artifact;
        }
        C7384Etj.A0Y(savedSpaceArtifactJson, 0);
        return new SharedSpaceSaveResponseJson(savedSpaceArtifactJson);
    }

    public final SavedSpaceArtifactJson component1() {
        return this.artifact;
    }

    public final SavedSpaceArtifactJson getArtifact() {
        return this.artifact;
    }

    public int hashCode() {
        return this.artifact.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SharedSpaceSaveResponseJson(SavedSpaceArtifactJson savedSpaceArtifactJson) {
        C7384Etj.A0Y(savedSpaceArtifactJson, 0);
        this.artifact = savedSpaceArtifactJson;
    }
}
