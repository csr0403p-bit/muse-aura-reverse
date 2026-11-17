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
public final class SavedSpaceEdgeJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final SavedSpaceArtifactJson node;

    public final class Companion {
        public final C9hr<SavedSpaceEdgeJson> serializer() {
            return SavedSpaceEdgeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SavedSpaceEdgeJson copy(SavedSpaceArtifactJson savedSpaceArtifactJson) {
        C7384Etj.A0Y(savedSpaceArtifactJson, 0);
        return new SavedSpaceEdgeJson(savedSpaceArtifactJson);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SavedSpaceEdgeJson) && C7384Etj.areEqual(this.node, ((SavedSpaceEdgeJson) obj).node));
    }

    public /* synthetic */ SavedSpaceEdgeJson(int i, SavedSpaceArtifactJson savedSpaceArtifactJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SavedSpaceEdgeJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.node = savedSpaceArtifactJson;
    }

    public static /* synthetic */ SavedSpaceEdgeJson copy$default(SavedSpaceEdgeJson savedSpaceEdgeJson, SavedSpaceArtifactJson savedSpaceArtifactJson, int i, Object obj) {
        if ((i & 1) != 0) {
            savedSpaceArtifactJson = savedSpaceEdgeJson.node;
        }
        C7384Etj.A0Y(savedSpaceArtifactJson, 0);
        return new SavedSpaceEdgeJson(savedSpaceArtifactJson);
    }

    public final SavedSpaceArtifactJson component1() {
        return this.node;
    }

    public final SavedSpaceArtifactJson getNode() {
        return this.node;
    }

    public int hashCode() {
        return this.node.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SavedSpaceEdgeJson(SavedSpaceArtifactJson savedSpaceArtifactJson) {
        C7384Etj.A0Y(savedSpaceArtifactJson, 0);
        this.node = savedSpaceArtifactJson;
    }
}
