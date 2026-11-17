package com.facebook.aura.spacesharing.impl;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class SavedSpaceCatalogJson extends C06G {
    public static final int $stable = 8;
    public final List<SavedSpaceEdgeJson> edges;
    public final SavedSpacePageJson page_info;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, SavedSpaceCatalogJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<SavedSpaceCatalogJson> serializer() {
            return SavedSpaceCatalogJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedSpaceCatalogJson) {
                SavedSpaceCatalogJson savedSpaceCatalogJson = (SavedSpaceCatalogJson) obj;
                if (!C7384Etj.areEqual(this.edges, savedSpaceCatalogJson.edges) || !C7384Etj.areEqual(this.page_info, savedSpaceCatalogJson.page_info)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SavedSpaceCatalogJson copy$default(SavedSpaceCatalogJson savedSpaceCatalogJson, List list, SavedSpacePageJson savedSpacePageJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = savedSpaceCatalogJson.edges;
        }
        if ((i & 2) != 0) {
            savedSpacePageJson = savedSpaceCatalogJson.page_info;
        }
        AnonymousClass003.A0u(list, savedSpacePageJson);
        return new SavedSpaceCatalogJson(list, savedSpacePageJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spacesharing_impl_impl(SavedSpaceCatalogJson savedSpaceCatalogJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(savedSpaceCatalogJson.edges, C3cH.A15($childSerializers, 0), c9iZ, 0);
        c9j5.AAQ(savedSpaceCatalogJson.page_info, SavedSpacePageJson$$serializer.INSTANCE, c9iZ, 1);
    }

    public final List<SavedSpaceEdgeJson> component1() {
        return this.edges;
    }

    public final SavedSpacePageJson component2() {
        return this.page_info;
    }

    public final List<SavedSpaceEdgeJson> getEdges() {
        return this.edges;
    }

    public final SavedSpacePageJson getPage_info() {
        return this.page_info;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.page_info, AnonymousClass005.A0E(this.edges));
    }

    public SavedSpaceCatalogJson(List<SavedSpaceEdgeJson> list, SavedSpacePageJson savedSpacePageJson) {
        AnonymousClass003.A0u(list, savedSpacePageJson);
        this.edges = list;
        this.page_info = savedSpacePageJson;
    }

    public final SavedSpaceCatalogJson copy(List<SavedSpaceEdgeJson> list, SavedSpacePageJson savedSpacePageJson) {
        AnonymousClass003.A0u(list, savedSpacePageJson);
        return new SavedSpaceCatalogJson(list, savedSpacePageJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SavedSpaceCatalogJson(int i, List list, SavedSpacePageJson savedSpacePageJson, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SavedSpaceCatalogJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.edges = list;
        this.page_info = savedSpacePageJson;
    }
}
