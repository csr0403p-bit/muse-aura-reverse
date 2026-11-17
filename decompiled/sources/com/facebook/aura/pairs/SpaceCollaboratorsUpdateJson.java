package com.facebook.aura.pairs;

import X.AnonymousClass005;
import X.AnonymousClass006;
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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceCollaboratorsUpdateJson extends C06G {
    public static final int $stable = 8;
    public final List<SpaceCollaboratorUpdateJson> collaborators;
    public final JsonElement expected_connection_revision;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, SpaceCollaboratorsUpdateJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<SpaceCollaboratorsUpdateJson> serializer() {
            return SpaceCollaboratorsUpdateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpaceCollaboratorsUpdateJson(List<SpaceCollaboratorUpdateJson> list, JsonElement jsonElement) {
        C7384Etj.A0Y(list, 0);
        this.collaborators = list;
        this.expected_connection_revision = jsonElement;
    }

    public final SpaceCollaboratorsUpdateJson copy(List<SpaceCollaboratorUpdateJson> list, JsonElement jsonElement) {
        C7384Etj.A0Y(list, 0);
        return new SpaceCollaboratorsUpdateJson(list, jsonElement);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceCollaboratorsUpdateJson) {
                SpaceCollaboratorsUpdateJson spaceCollaboratorsUpdateJson = (SpaceCollaboratorsUpdateJson) obj;
                if (!C7384Etj.areEqual(this.collaborators, spaceCollaboratorsUpdateJson.collaborators) || !C7384Etj.areEqual(this.expected_connection_revision, spaceCollaboratorsUpdateJson.expected_connection_revision)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceCollaboratorsUpdateJson copy$default(SpaceCollaboratorsUpdateJson spaceCollaboratorsUpdateJson, List list, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            list = spaceCollaboratorsUpdateJson.collaborators;
        }
        if ((i & 2) != 0) {
            jsonElement = spaceCollaboratorsUpdateJson.expected_connection_revision;
        }
        C7384Etj.A0Y(list, 0);
        return new SpaceCollaboratorsUpdateJson(list, jsonElement);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(SpaceCollaboratorsUpdateJson spaceCollaboratorsUpdateJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(spaceCollaboratorsUpdateJson.collaborators, C3cH.A15($childSerializers, 0), c9iZ, 0);
        c9j5.AAP(spaceCollaboratorsUpdateJson.expected_connection_revision, JsonElementSerializer.A00, c9iZ, 1);
    }

    public final List<SpaceCollaboratorUpdateJson> component1() {
        return this.collaborators;
    }

    public final JsonElement component2() {
        return this.expected_connection_revision;
    }

    public final List<SpaceCollaboratorUpdateJson> getCollaborators() {
        return this.collaborators;
    }

    public final JsonElement getExpected_connection_revision() {
        return this.expected_connection_revision;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.collaborators) + AnonymousClass006.A0D(this.expected_connection_revision);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceCollaboratorsUpdateJson(int i, List list, JsonElement jsonElement, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SpaceCollaboratorsUpdateJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.collaborators = list;
        this.expected_connection_revision = jsonElement;
    }
}
